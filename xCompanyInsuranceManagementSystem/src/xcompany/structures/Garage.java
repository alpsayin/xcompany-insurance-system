package xcompany.structures;

//  @ File Name : Garage.java

import java.io.Serializable;

//  @ Date : 11.10.2011




public class Garage implements Serializable
{
    private String name;
    private String address;
    private String email;
    public Garage(String name, String email)
    {
        this.name = name;
        this.email = email;
        this.address = "N/A";
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
}
