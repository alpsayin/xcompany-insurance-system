/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serializabletrial;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alp Sayin
 */
public class Customer implements Serializable
{
    private ArrayList<Claim> claimslist;
    private String name;
    public Customer(String name)
    {
        this.name = name;
        this.claimslist = new ArrayList<Claim>();
    }
    public void addClaim(Claim c)
    {
        c.setItsCustomer(this);
        this.getClaimslist().add(c);
    }
    public ArrayList<Claim> getClaimslist()
    {
        return claimslist;
    }
    public void setClaimslist(ArrayList<Claim> claimslist)
    {
        this.claimslist = claimslist;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    @Override public String toString()
    {
        return name;
    }
}
