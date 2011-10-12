package xcompanyims;

//  @ File Name : ClaimHandler.java

import java.util.ArrayList;

//  @ Date : 11.10.2011




public class ClaimHandler extends User 
{
    private Object rank;
    private ArrayList<Claim> takenClaims;
    public void approve(Claim claim, boolean approvement)
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }

    public static ClaimList getAvailableClaims() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public Object getRank()
    {
        return rank;
    }
    public void setRank(Object rank)
    {
        this.rank = rank;
    }
    public ArrayList<Claim> getTakenClaims()
    {
        return takenClaims;
    }
    public void setTakenClaims(ArrayList<Claim> takenClaims)
    {
        this.takenClaims = takenClaims;
    }
}
