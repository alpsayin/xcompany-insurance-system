package xcompany.control;

//  @ File Name : ClaimControl.java

import java.io.IOException;
import xcompany.lists.ClaimList;
import xcompany.structures.Claim;
import xcompany.structures.Claim.ClaimStatus;
import xcompany.structures.ClaimHandler;
import xcompany.structures.Financer;
import xcompany.structures.Customer;
import xcompany.structures.Email;
import xcompany.structures.Garage;
import xcompany.structures.Insurance;

//  @ Date : 11.10.2011




public class ClaimControl 
{
    public boolean add(Claim c) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        if(claimList == null){
            claimList = new ClaimList();
        }
            
        claimList.add(c);
        DatabaseControl.writeAllClaims(claimList);

        return true;
    }
    public boolean changeStatus(int id, ClaimStatus status) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        if(claimList != null){
            if(claimList.get(id) != null){
                claimList.get(id).setStatus(status);
                DatabaseControl.writeAllClaims(claimList);
                return true;
            }
        }
        return false;
    }
    public boolean notifyCustomer(Claim c, String message) throws IOException, ClassNotFoundException
    {
        Email e = new Email();
        e.setFrom(c.getClaimHandler().getEmail());
        e.setTo(c.getOwner().getEmail());
        e.setSubject("Claim Decision");
        e.setText("Decision for your claim dated "+ c.getDateOfCrash()+" described as \""+ 
                c.getDescription()+"\" is "+c.getStatus() + ". And the claim handler's message is: " + message );
        e.send();
        //c.getEmailsList().add(e);
        ClaimList claimList = DatabaseControl.getAllClaims();
        if(claimList != null){
            if(claimList.get(c.getId()) != null){
                claimList.get(c.getId()).getEmailsList().add(e);
                DatabaseControl.writeAllClaims(claimList);
                return true;
            }
        }
        return false;
    }
    private boolean notifyGarage(Claim c) throws IOException, ClassNotFoundException
    {
        Email e = new Email();
        e.setFrom(c.getClaimHandler().getEmail());
        e.setTo(c.getGarage().getEmail());
        e.setSubject("Repair Order");
        e.setText("Repairs for claim from "+c.getOwner().getName()+" "+c.getOwner().getSurname()+" regarding the damages dated "+c.getDateOfCrash()+" should be started.");
        e.send();
        
        //c.getEmailsList().add(e);
        ClaimList claimList = DatabaseControl.getAllClaims();
        if(claimList != null){
            if(claimList.get(c.getId()) != null){
                claimList.get(c.getId()).getEmailsList().add(e);
                DatabaseControl.writeAllClaims(claimList);
                return true;
            }
        }
        return false;
    }
    public boolean assignClaimHandler(Claim c, ClaimHandler ch) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        if(claimList != null){
            if(claimList.get(c.getId()) != null){
                claimList.get(c.getId()).setClaimHandler(ch);
                claimList.get(c.getId()).setStatus(ClaimStatus.Assigned);
                DatabaseControl.writeAllClaims(claimList);
                return true;
             }
        }
        return false;
    }
    public boolean assignFinancer(Claim c, Financer f) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        if(claimList != null){
            if(claimList.get(c.getId()) != null){
                claimList.get(c.getId()).setFinancer(f);
                claimList.get(c.getId()).setStatus(ClaimStatus.ApprovedPendingPayment);
                DatabaseControl.writeAllClaims(claimList);
                return true;
             }
        }
        return false;
        
        
    }
     public boolean assignGarage(Claim c, Garage g) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        if(claimList != null){
            if(claimList.get(c.getId()) != null){
                claimList.get(c.getId()).setGarage(g);
                DatabaseControl.writeAllClaims(claimList);
                return true;
             }
        }
        return false;


    }
    public boolean checkInsurance(Claim c) throws IOException, ClassNotFoundException
    {        
        Insurance ins = c.getOwner().getInsurance();
        if(c.getDamage() > ins.getMaxAmount())
            return false;
        
        if(c.getDateOfCrash().after(ins.getExpiryDate()))
            return false;
        
        Customer customer = c.getOwner();
        int numOfApprovedClaims = 0;
        for(Claim oldClaim : customer.getHistory())
            if(oldClaim.getStatus() == Claim.ClaimStatus.ApprovedPendingPayment
                    || oldClaim.getStatus() == Claim.ClaimStatus.ApprovedPaymentInProcess
                    || oldClaim.getStatus() == Claim.ClaimStatus.ApprovedPaymentComplete)
                numOfApprovedClaims++;
        
        if(numOfApprovedClaims >= ins.getMaxNumRepairs())
            return false;
            
        return true;
    }
   
    public void approve(ClaimHandler claimHandler, Claim claim, boolean approvement, String message) throws Exception
    {
        ClaimControl cc = new ClaimControl();
        if(claimHandler.equals(claim.getClaimHandler()))
        {
            ClaimList claimList = DatabaseControl.getAllClaims();
            if(claimList != null){
                if(claimList.get(claim.getId()) != null){
                    if(approvement){
                        claimList.get(claim.getId()).setStatus(ClaimStatus.ApprovedPendingPayment);
                        DatabaseControl.writeAllClaims(claimList);
                        cc.notifyGarage(claim);
                    }
                    else{
                        claimList.get(claim.getId()).setStatus(ClaimStatus.Rejected);
                        DatabaseControl.writeAllClaims(claimList);
                    }
                }
            }
            cc.notifyCustomer(claim, message);
        }
        else
        {
            throw new Exception("Handler of this claim is not this handler");
        }
    }
}
