package xcompanyims;

//  @ File Name : Claim.java

import java.util.ArrayList;
import java.util.Calendar;

//  @ Date : 11.10.2011




public class Claim 
{
    private Customer owner;
    private String description;
    private int id;
    private ClaimHandler claimHandler;
    private String status;
    private String type;
    private Form form;
    private double damage;
    private Calendar dateOfCrash;
    private Garage garage;
    private Financer financer;
    private ArrayList<Email> emailsList;
    public int generateId() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public void emailGarage() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public void notifyUser() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public Customer getOwner()
    {
        return owner;
    }
    public void setOwner(Customer owner)
    {
        this.owner = owner;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public ClaimHandler getClaimHandler()
    {
        return claimHandler;
    }
    public void setClaimHandler(ClaimHandler claimHandler)
    {
        this.claimHandler = claimHandler;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public Form getForm()
    {
        return form;
    }
    public void setForm(Form form)
    {
        this.form = form;
    }
    public double getDamage()
    {
        return damage;
    }
    public void setDamage(double damage)
    {
        this.damage = damage;
    }
    public Calendar getDateOfCrash()
    {
        return dateOfCrash;
    }
    public void setDateOfCrash(Calendar dateOfCrash)
    {
        this.dateOfCrash = dateOfCrash;
    }
    public Garage getGarage()
    {
        return garage;
    }
    public void setGarage(Garage garage)
    {
        this.garage = garage;
    }
    public Financer getFinancer()
    {
        return financer;
    }
    public void setFinancer(Financer financer)
    {
        this.financer = financer;
    }
    public ArrayList<Email> getEmailsList()
    {
        return emailsList;
    }
    public void setEmailsList(ArrayList<Email> emailsList)
    {
        this.emailsList = emailsList;
    }
}
