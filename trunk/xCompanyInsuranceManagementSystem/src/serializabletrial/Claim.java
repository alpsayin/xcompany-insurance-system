/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serializabletrial;

import java.io.Serializable;

/**
 *
 * @author Alp Sayin
 */
public class Claim implements Serializable
{
    private Customer itsCustomer;
    private String desc;
    public Claim(String desc)
    {
        this.desc = desc;
    }
    public Customer getItsCustomer()
    {
        return itsCustomer;
    }
    public void setItsCustomer(Customer itsCustomer)
    {
        this.itsCustomer = itsCustomer;
    }
    public String getDesc()
    {
        return desc;
    }
    public void setDesc(String desc)
    {
        this.desc = desc;
    }
    @Override public String toString()
    {
        return desc;
    }
}
