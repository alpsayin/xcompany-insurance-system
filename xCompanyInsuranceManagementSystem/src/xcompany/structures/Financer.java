package xcompany.structures;

//  @ File Name : Financer.java




public class Financer extends User 
{
    //private ClaimList takenClaims;
    public Financer(String name, String surname, String username, String email, String password)
    {
        super(name,surname,username,email,password,"AddressFooData");
        //takenClaims = new ClaimList();
    }

    public Financer(String name, String surname, String username, String email, String password, int i) {
        super(name,surname,username,email,password,"AddressFooData",i);
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
    /*
    public ClaimList getTakenClaims()
    {
        return takenClaims;
    }
    public void setTakenClaims(ClaimList takenClaims)
    {
        this.takenClaims = takenClaims;
    }
     *
     */
}
