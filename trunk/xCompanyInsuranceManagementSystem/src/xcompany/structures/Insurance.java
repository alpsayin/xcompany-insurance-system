package xcompany.structures;


import java.util.Calendar;

//  @ File Name : Insurance.java
//  @ Date : 11.10.2011




public class Insurance {
    private double maxAmount;
    private int maxNumRepairs;
    private Calendar expiryDate;
    public boolean checkConstraints(Claim c) 
    {
        throw new UnsupportedOperationException("not yet implemented!");
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
