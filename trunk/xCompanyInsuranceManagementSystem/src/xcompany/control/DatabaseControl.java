package xcompany.control;

//  @ File Name : DatabaseControl.java

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import xcompany.structures.*;
import xcompany.lists.*;


//  @ Date : 11.10.2011




public abstract class DatabaseControl 
{

    private static final String usersFile = "AllUsers.bin";
    private static final String claimsFile = "AllClaims.bin";
    private static final String garagesFile = "AllGarages.bin";
    

    /*
     *Because we dont have sign up (for now), we can use this function to create some users just once.
     *
     */
    public static void main(String args[]) 
    {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(usersFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            UserList userList = new UserList();
            User customer1 = new Customer("mert", "karadogan", "gmertk", "gmertk@gmail.com", "12345",
                    "Hanstavagen 49 Stockholm Sweden", 1);
            User customer2 = new Customer("alp", "sayin", "alpsayin", "alp@gmail.com", "12345",
                    "Akalla Stockholm Sweden", 2);
            userList.getUserList().put(customer1.getUsername(), customer1);
            userList.getUserList().put(customer2.getUsername(), customer2);

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

    public static synchronized boolean addUser(User user) throws IOException, ClassNotFoundException{
        UserList userList = DatabaseControl.getAllUsers();
        if(userList == null){
            userList = new UserList();
        }

        if( !(userList.getUserList().containsKey(user.getUsername())) ){
            userList.getUserList().put(user.getUsername(), user);
            writeAllUsers(userList);
            return true;
        }
        else{
            System.err.println("Username already exists");
            return false;
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
    
    public static synchronized ClaimList getUserClaims(String username) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = getAllClaims();
        ClaimList returnList = new ClaimList();
        
        for(Claim c : claimList.getClaimList().values())
            if(username.equals(c.getOwner().getUsername()))
                returnList.getClaimList().put(c.getId(), c);
        
        return returnList;
    }
    public static synchronized ClaimList getClaimsOfHandler(String  username) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = getAllClaims();
        ClaimList returnList = new ClaimList();
        
        for(Claim c : claimList.getClaimList().values())
            if(username.equals(c.getClaimHandler().getUsername()))
                returnList.getClaimList().put(c.getId(), c);
        
        return returnList;
    }
    public static synchronized ClaimList getClaimsOfFinancer(String username) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = getAllClaims();
        ClaimList returnList = new ClaimList();
        
        for(Claim c : claimList.getClaimList().values())
            if(username.equals(c.getFinancer().getUsername()))
                returnList.getClaimList().put(c.getId(), c);
        
        return returnList;
    }
    public static synchronized ClaimList getClaimsByStatus(Claim.ClaimStatus status) throws IOException, ClassNotFoundException
    {
        ClaimList claimList = getAllClaims();
        ClaimList returnList = new ClaimList();
        
        for(Claim c : claimList.getClaimList().values())
            if(c.getStatus() == status)
                returnList.add(c);
        
        return returnList;
    }
    public static synchronized int generateClaimId() throws ClassNotFoundException, IOException
    {
        int max = -1;
        ClaimList claimList = getAllClaims();
        for(Claim c : claimList.getClaimList().values())
            if(c.getId() >= max)
                max = c.getId();
        return max+1;
    }
    public static synchronized int generateUserId() throws ClassNotFoundException, IOException
    {
        int max = -1;
        UserList userList = getAllUsers();
        if(userList == null){
            return 1;
        }
        for(User u : userList.getUserList().values())
            if(u.getId() >= max)
                max = u.getId();
        return max+1;
    }
}
