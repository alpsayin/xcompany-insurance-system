package xcompany.structures;

//  @ File Name : Customer.java

import java.util.ArrayList;

//  @ Date : 11.10.2011




public class Customer extends User 
{
    private Insurance insurance;
    private ArrayList<Claim> history;

    public Customer(String name, String surname, String username, String email)
    {
        super(name, surname, username, email);
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
    public ArrayList<Claim> getHistory()
    {
        return history;
    }
    public void setHistory(ArrayList<Claim> history)
    {
        this.history = history;
    }
}
