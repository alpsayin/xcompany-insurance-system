package xcompany.structures;

//  @ File Name : Customer.java

import java.io.IOException;
import java.util.ArrayList;
import xcompany.control.DatabaseControl;
import xcompany.lists.ClaimList;

//  @ Date : 11.10.2011




public class Customer extends User 
{
    private Insurance insurance;
    //private ArrayList<Claim> history;

    public Customer(String name, String surname, String username, String email,
            String password, String address)
    {
        super(name, surname, username, email, password, address);
    }


    public Customer(String name, String surname, String username, String email,
            String password, String address, int id)
    {
        super(name, surname, username, email, password, address, id);
    }

    public void report(Object Claim) 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public Insurance getInsurance()
    {
        return insurance;
    }
    public void setInsurance(Insurance insurance)
    {
        this.insurance = insurance;
    }
    /*
    public ArrayList<Claim> getHistory()
    {
        return history;
    }
    public void setHistory(ArrayList<Claim> history)
    {
        this.history = history;
    }
     * 
     */
    public ArrayList<Claim> getHistory() throws IOException, ClassNotFoundException
    {
        ArrayList<Claim> history = new ArrayList<Claim>();
        ClaimList cl = DatabaseControl.getAllClaims();

        for(Claim c:cl.getClaimList().values()){
            if(c.getOwner().getUsername().equals(this.getUsername())){
                history.add(c);
            }
        }

        return history;
    }
}
