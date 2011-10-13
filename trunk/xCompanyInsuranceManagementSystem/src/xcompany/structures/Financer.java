package xcompany.structures;

//  @ File Name : Financer.java

import xcompany.lists.ClaimList;

//  @ Date : 11.10.2011




public class Financer extends User 
{
    private ClaimList takenClaims;
    public Financer(String name, String surname, String username, String email)
    {
        super(name,surname,username,email);
        takenClaims = new ClaimList();
    }
    public void markAsPaymentInProcess(Object Claim) 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }

    public void markAsPaymentCompleted(Object Claim) 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public ClaimList getTakenClaims()
    {
        return takenClaims;
    }
    public void setTakenClaims(ClaimList takenClaims)
    {
        this.takenClaims = takenClaims;
    }
}
