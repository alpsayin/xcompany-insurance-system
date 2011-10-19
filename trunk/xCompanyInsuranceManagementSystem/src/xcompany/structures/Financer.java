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
    public void takeClaim(Claim claim)
    {
        claim.setFinancer(this);
    }
    public void markAsPaymentInProcess(Claim claim) throws Exception
    {
        if(claim.getFinancer().equals(this))
            claim.setStatus(Claim.ClaimStatus.ApprovedPaymentInProcess);
        else
            throw new Exception("Claim not owned by this financer");
    }
    public void markAsPaymentCompleted(Claim claim) throws Exception
    {
        if(claim.getFinancer().equals(this))
            claim.setStatus(Claim.ClaimStatus.ApprovedPaymentComplete);
        else
            throw new Exception("Claim not owned by this financer");
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