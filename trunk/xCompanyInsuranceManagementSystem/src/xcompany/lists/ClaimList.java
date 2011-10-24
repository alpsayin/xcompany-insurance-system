/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.lists;

import java.io.Serializable;
import xcompany.structures.Claim;
import java.util.HashMap;

/**
 *
 * @author Alp Sayin
 */
public class ClaimList implements Serializable
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
