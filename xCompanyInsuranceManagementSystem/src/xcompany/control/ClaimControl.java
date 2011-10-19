package xcompany.control;

//  @ File Name : ClaimControl.java

import java.io.IOException;
import xcompany.lists.ClaimList;
import xcompany.lists.UserList;
import xcompany.structures.Claim;
import xcompany.structures.Claim.ClaimStatus;
import xcompany.structures.ClaimHandler;
import xcompany.structures.Financer;
import xcompany.structures.Customer;
import xcompany.structures.Email;

//  @ Date : 11.10.2011




public class ClaimControl 
{
    public boolean add(Claim c) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();

        claimList.add(c);
        return true;
    }
    public boolean changeStatus(int id, ClaimStatus status) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        Claim claim = claimList.get(id);
        if(claim != null){
            claim.setStatus(status);
            return true;
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
        c.getEmailsList().add(e);

        return false;
    }
    private boolean notifyGarage(Claim c)
    {
        Email e = new Email();
        e.setFrom(c.getClaimHandler().getEmail());
        e.setTo(c.getGarage().getEmail());
        e.setSubject("Repair Order");
        e.setText("Repairs for claim from "+c.getOwner().getName()+" "+c.getOwner().getSurname()+" regarding the damages dated "+c.getDateOfCrash()+" should be started.");
        e.send();
        c.getEmailsList().add(e);
        return true;
    }
    public boolean assignClaimHandler(Claim c, ClaimHandler ch) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        claimList.get(c.getId()).setClaimHandler(ch);
        return true;
    }
    public boolean assignFinancer(Claim c, Financer f) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        claimList.get(c.getId()).setFinancer(f);
        return true;
    }
    public boolean checkInsurance(Claim c) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        return claimList.get(c.getId()).getOwner().getInsurance().checkConstraints(c);
    }
    
    private boolean checkValidation() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
}
