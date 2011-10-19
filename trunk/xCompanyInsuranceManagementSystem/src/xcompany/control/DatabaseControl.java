package xcompany.control;

//  @ File Name : DatabaseControl.java

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import xcompany.structures.User;
import xcompany.structures.Customer;
import xcompany.structures.Claim;
import java.util.HashMap;
import xcompany.lists.ClaimList;
import xcompany.lists.GarageList;
import xcompany.lists.UserList;
import xcompany.structures.ClaimHandler;
import xcompany.structures.Financer;


//  @ Date : 11.10.2011




public abstract class DatabaseControl 
{

    private static final String usersFile = "AllUsers.bin";
    private static final String claimsFile = "AllClaims.bin";
    private static final String garagesFile = "AllGarages.bin";
    

    /*
     ^Because we dont have sign up (for now), we can use this function to create some users just once.
     *
     */
    public static void main(String args[]) 
    {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(usersFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            HashMap<String, User> userList = new HashMap<String, User>();
            User customer1 = new Customer("mert", "karadogan", "gmertk", "gmertk@gmail.com", "12345",
                    "Hanstavagen 49 Stockholm Sweden");
            User customer2 = new Customer("alp", "sayin", "alpsayin", "alp@gmail.com", "12345",
                    "Akalla Stockholm Sweden");
            userList.put(customer1.getUsername(), customer1);
            userList.put(customer2.getUsername(), customer2);

            objectOutputStream.writeObject(userList);

            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }
    public static synchronized void writeAllClaims(ClaimList claimList) throws IOException
    {
        FileOutputStream fileOutputStream = new FileOutputStream(claimsFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        
        objectOutputStream.writeObject(claimList);
        
        objectOutputStream.close();
    }
    public static synchronized void writeAllUsers(UserList userList) throws IOException
    {
        FileOutputStream fileOutputStream = new FileOutputStream(usersFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        
        objectOutputStream.writeObject(userList);
        
        objectOutputStream.close();
    }
    public static synchronized void writeAllGarages(GarageList garageList) throws IOException
    {
        FileOutputStream fileOutputStream = new FileOutputStream(garagesFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        
        objectOutputStream.writeObject(garageList);
        
        objectOutputStream.close();
    }
    public static synchronized ClaimList getAllClaims() throws IOException, ClassNotFoundException
    {
        ClaimList claimList = null;
        
        FileInputStream fileInputStream = new FileInputStream(claimsFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        
        claimList = (ClaimList) objectInputStream.readObject();
        
        objectInputStream.close();
        
        return claimList;
    }

    public static synchronized UserList getAllUsers() throws IOException, ClassNotFoundException
    {
        UserList userList = null;

        FileInputStream fileInputStream = new FileInputStream(usersFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        userList = (UserList) objectInputStream.readObject();

        objectInputStream.close();
        
        return userList;
    }

    public static synchronized GarageList getAllGarages() throws IOException, ClassNotFoundException
    {
        GarageList garagesList = null;

        FileInputStream fileInputStream = new FileInputStream(garagesFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        garagesList = (GarageList) objectInputStream.readObject();

        objectInputStream.close();
        
        return garagesList;
    }

    public static synchronized User getUser(String userName) throws IOException, ClassNotFoundException
    {
        return getAllUsers().get(userName);
    }
    
    public static synchronized ClaimList getUserClaims(User user) throws IOException, ClassNotFoundException 
    {
        ClaimList claimList = getAllClaims();
        ClaimList returnList = new ClaimList();
        
        for(Claim c : claimList.getClaimList())
            if(user.equals(c.getOwner()))
                returnList.getClaimList().add(c);
        
        return returnList;
    }
    public static synchronized ClaimList getClaimsOfHandler(ClaimHandler handler) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = getAllClaims();
        ClaimList returnList = new ClaimList();
        
        for(Claim c : claimList.getClaimList())
            if(handler.equals(c.getClaimHandler()))
                returnList.getClaimList().add(c);
        
        return returnList;
    }
    public static synchronized ClaimList getClaimsOfFinancer(Financer handler) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = getAllClaims();
        ClaimList returnList = new ClaimList();
        
        for(Claim c : claimList.getClaimList())
            if(handler.equals(c.getFinancer()))
                returnList.getClaimList().add(c);
        
        return returnList;
    }
    public static synchronized ClaimList getClaimsByStatus(Claim.ClaimStatus status) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = getAllClaims();
        ClaimList returnList = new ClaimList();
        
        for(Claim c : claimList.getClaimList())
            if(c.getStatus() == status)
                returnList.add(c);
        
        return returnList;
    }
}
