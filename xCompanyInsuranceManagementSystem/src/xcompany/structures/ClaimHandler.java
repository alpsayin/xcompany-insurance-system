package xcompany.structures;

//  @ File Name : ClaimHandler.java

import java.util.ArrayList;
import xcompany.control.ClaimControl;
import xcompany.lists.ClaimList;
import xcompany.structures.Claim.ClaimStatus;

//  @ Date : 11.10.2011




public class ClaimHandler extends User 
{
    private HandlerType rank;
    //private ArrayList<Claim> takenClaims;

    public ClaimHandler(String name, String surname, String username, String email,
            String password, String address, HandlerType rank)
    {
        super(name, surname, username, email, password, address);
        this.rank = rank;
    }

    public ClaimHandler(String name, String surname, String username, String email,
            String password, String address, HandlerType rank,int i)
    {
        super(name, surname, username, email, password, address,i);
        this.rank = rank;

    }
  
    
    public HandlerType getRank()
    {
        return rank;
    }

    public void setRank(HandlerType rank)
    {
        this.rank = rank;
    }
    /*
    public ArrayList<Claim> getTakenClaims()
    {
        return takenClaims;
    }
    public void setTakenClaims(ArrayList<Claim> takenClaims)
    {
        this.takenClaims = takenClaims;
    }
     *
     */
    public enum HandlerType
    {
        HighRanked, LowRanked
    }
}
