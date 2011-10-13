package xcompany.structures;

//  @ File Name : Claim.java

import xcompany.structures.form.Form;
import java.util.ArrayList;
import java.util.Calendar;

//  @ Date : 11.10.2011




public class Claim 
{
    private Customer owner;
    private String description;
    private int id;
    private ClaimHandler claimHandler;
    private ClaimStatus status;
    private ClaimType type;
    private Form form;
    private double damage;
    private Calendar dateOfCrash;
    private Garage garage;
    private Financer financer;
    private ArrayList<Email> emailsList;
    public Claim()
    {
        
    }
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
    public ClaimStatus getStatus()
    {
        return status;
    }
    public void setStatus(ClaimStatus status)
    {
        this.status = status;
    }
    public ClaimType getType()
    {
        return type;
    }
    public void setType(ClaimType type)
    {
        this.type = type;
    }
    public enum ClaimType
    {
        SimpleClaim, ComplexClaim
    }
    public enum ClaimStatus
    {
        Reported, WaitingForms, Registered, Assigned, Rejected, ApprovedPendingPayment, ApprovedPaymentInProcess, ApprovedPaymentComplete
    }
}
