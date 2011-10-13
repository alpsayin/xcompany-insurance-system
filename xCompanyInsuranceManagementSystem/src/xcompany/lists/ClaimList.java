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
    public ArrayList<Claim> getClaimList()
    {
        return claimList;
    }
}
