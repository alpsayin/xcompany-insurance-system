/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.lists;

import xcompany.structures.Claim;
import java.util.ArrayList;

/**
 *
 * @author Alp Sayin
 */
public class ClaimList
{
    private ArrayList<Claim> claimList;
    public ClaimList()
    {
        claimList = new ArrayList<Claim>();
    }
    public Claim get(int index)
    {
        return getClaimList().get(index);
    }
    public ArrayList<Claim> getClaimList()
    {
        return claimList;
    }
    public void add(Claim c)
    {
        getClaimList().add(c);
    }
}
