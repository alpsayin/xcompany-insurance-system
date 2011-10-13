package xcompany.structures;

//  @ File Name : ClaimHandler.java

import java.util.ArrayList;
import xcompany.lists.ClaimList;

//  @ Date : 11.10.2011




public class ClaimHandler extends User 
{
    private ClaimType rank;
    private ArrayList<Claim> takenClaims;
    public ClaimHandler(String name, String surname, String username, String email)
    {
        super(name, surname, username, email);
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public void approve(Claim claim, boolean approvement)
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public static ClaimList getAvailableClaims() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public ClaimType getRank()
    {
        return rank;
    }
    public void setRank(ClaimType rank)
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
    public enum ClaimType
    {
        HighRanked, LowRanked
    }
}
