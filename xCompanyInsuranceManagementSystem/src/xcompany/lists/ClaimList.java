/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.lists;

import xcompany.structures.Claim;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Alp Sayin
 */
public class ClaimList
{
    private HashMap<Integer, Claim> claimList;
    public ClaimList()
    {
        claimList = new HashMap<Integer, Claim>();
    }
    public Claim get(int id)
    {
        return getClaimList().get(id);
    }
    public HashMap<Integer, Claim> getClaimList()
    {
        return claimList;
    }
    public void add(Claim c)
    {
        getClaimList().put(c.getId(), c);
    }

}
