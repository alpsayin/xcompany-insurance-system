package xcompany.structures;

//  @ File Name : Claim.java

import java.io.Serializable;
import xcompany.structures.form.Form;
import java.util.Calendar;
import xcompany.control.DatabaseControl;
import xcompany.lists.EmailList;

//  @ Date : 11.10.2011




public class Claim implements Serializable
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
    private EmailList emailsList;
    public Claim(Customer owner, String description, Calendar dateOfCrash)
    {
        this.owner = owner;
        this.description = description;
        this.dateOfCrash = dateOfCrash;
        this.id = generateId();
        this.status = ClaimStatus.Reported;
        this.emailsList = new EmailList();
        this.financer = null;
        this.claimHandler = null;
        this.garage = null;
        
    }
    public Claim(Customer owner, String description, Calendar dateOfCrash, int id)
    {
        this.owner = owner;
        this.description = description;
        this.dateOfCrash = dateOfCrash;
        this.id = id;
        this.status = ClaimStatus.Reported;
        this.emailsList = new EmailList();
        this.financer = null;
        this.claimHandler = null;
        this.garage = null;

    }
    public static int generateId()
    {
        try
        {
            int id = DatabaseControl.generateClaimId();
            return id;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }
        return -1;
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
    public EmailList getEmailsList()
    {
        return emailsList;
    }
    public void setEmailsList(EmailList emailsList)
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
        Reported, WaitingForms, SentBack, Registered, Assigned, Rejected, ApprovedPendingPayment, ApprovedPaymentInProcess, ApprovedPaymentComplete
    }
}
