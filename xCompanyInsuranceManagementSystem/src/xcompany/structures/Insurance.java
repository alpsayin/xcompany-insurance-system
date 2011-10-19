package xcompany.structures;


import java.util.Calendar;

//  @ File Name : Insurance.java
//  @ Date : 11.10.2011




public class Insurance {
    private double maxAmount;
    private int maxNumRepairs;
    private Calendar expiryDate;
    public Insurance(double maxAmount, int maxNumRepairs, Calendar expiryDate)
    {
        this.maxAmount = maxAmount;
        this.maxNumRepairs = maxNumRepairs;
        this.expiryDate = expiryDate;
    }
    public boolean checkConstraints(Claim c) 
    {
        if(c.getDamage() > this.getMaxAmount())
            return false;
        
        if(c.getDateOfCrash().after(this.getExpiryDate()))
            return false;
        
        Customer customer = c.getOwner();
        int numOfApprovedClaims = 0;
        for(Claim oldClaim : customer.getHistory())
            if(oldClaim.getStatus() == Claim.ClaimStatus.ApprovedPendingPayment
                    || oldClaim.getStatus() == Claim.ClaimStatus.ApprovedPaymentInProcess
                    || oldClaim.getStatus() == Claim.ClaimStatus.ApprovedPaymentComplete)
                numOfApprovedClaims++;
        
        if(numOfApprovedClaims >= getMaxNumRepairs())
            return false;
            
        return true;
    }
    public double getMaxAmount()
    {
        return maxAmount;
    }
    public void setMaxAmount(double maxAmount)
    {
        this.maxAmount = maxAmount;
    }
    public int getMaxNumRepairs()
    {
        return maxNumRepairs;
    }
    public void setMaxNumRepairs(int maxNumRepairs)
    {
        this.maxNumRepairs = maxNumRepairs;
    }
    public Calendar getExpiryDate()
    {
        return expiryDate;
    }
    public void setExpiryDate(Calendar expiryDate)
    {
        this.expiryDate = expiryDate;
    }
}
