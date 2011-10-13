package xcompany.structures;

//  @ File Name : RegistrationHandler.java

import xcompany.lists.ClaimList;

//  @ Date : 11.10.2011




public class RegistrationHandler extends User 
{
    public ClaimList claimList;
    public RegistrationHandler(String name, String surname, String username, String email)
    {
        super(name, surname, username, email);
    }
    public void assignClaimClassification(Claim c) 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public void approveForm(Claim c) 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
}
