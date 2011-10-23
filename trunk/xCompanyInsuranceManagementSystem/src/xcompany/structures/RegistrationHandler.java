package xcompany.structures;

//  @ File Name : RegistrationHandler.java

import xcompany.lists.ClaimList;
import xcompany.structures.Claim.ClaimStatus;
import xcompany.structures.Claim.ClaimType;

//  @ Date : 11.10.2011




public class RegistrationHandler extends User 
{
    public ClaimList claimList;
    
    public RegistrationHandler(String name, String surname, String username, String email,
            String password, String address)
    {
        super(name, surname, username, email, password, address);
    }

    public RegistrationHandler(String name, String surname, String username, String email,
            String password, String address,int i)
    {
        super(name, surname, username, email, password, address,i);
    }

    public void assignClaimClassification(Claim c, ClaimType type) throws Exception
    {
        if(c.getStatus()==ClaimStatus.Reported)
            c.setType(type);
        else
            throw new Exception("Status of this claim is not eligible for this operation");
    }
    public void approveForm(Claim c) throws Exception
    {
        if(c.getStatus()==ClaimStatus.WaitingForms)
            c.setStatus(ClaimStatus.Reported);
        else
            throw new Exception("Status of this claim is not eligible for this operation");
    }
}
