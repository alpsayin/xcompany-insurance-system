package xcompany.control;

//  @ File Name : ClaimControl.java

import java.io.IOException;
import xcompany.lists.ClaimList;
import xcompany.structures.Claim;
import xcompany.structures.Claim.ClaimStatus;
import xcompany.structures.ClaimHandler;
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
    public boolean notifyCustomer(int id) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        Claim claim = claimList.get(id);
        if(claim != null){
            claim.notifyUser();
            return true;
        }
        return false;
    }
    private boolean notifyGarage() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public boolean assignClaimHandler(Claim c, ClaimHandler ch) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = DatabaseControl.getAllClaims();
        claimList.get(c.getId()).setClaimHandler(ch);
        
    }
    public boolean assignFinancer() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public boolean checkInsurance() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    private boolean checkValidation() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
}
