package xcompany.control;

//  @ File Name : DatabaseControl.java

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
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
            Calendar calendar = Calendar.getInstance();

            Customer customer1 = new Customer("Mert", "Karadogan", "cust", "gmertk@gmail.com", "1234",
                    "Grufsgatan 12 Stockholm Sweden", 1);
            calendar.set(2015, 12, 01);
            customer1.setInsurance(new Insurance(10000, 5, calendar ));
            userList.getUserList().put(customer1.getUsername(), customer1);

            Customer customer2 = new Customer("Jacob", "Stain", "cust2", "jacob@gmail.com", "1234",
                    "Uppsala Sweden",2);
            calendar.set(2010, 12, 01);
            customer2.setInsurance(new Insurance(10000, 5, calendar ));
            userList.getUserList().put(customer2.getUsername(), customer2);

            Customer customer3 = new Customer("Lina", "Ann", "cust3", "lina@gmail.com", "1234",
                    "KTH Stockholm Sweden",3);
            calendar.set(2014, 12, 01);
            customer3.setInsurance(new Insurance(10000, 5, calendar ));
            userList.getUserList().put(customer3.getUsername(), customer3);

            RegistrationHandler rh1 = new RegistrationHandler("Alp", "Sayin", "rh", "alp@gmail.com", "1234",
                                                                "Akalla Stockholm Sweden",4);
            userList.getUserList().put(rh1.getUsername(), rh1);

            RegistrationHandler rh2 = new RegistrationHandler("Orcun", "Doganci", "rh2", "orcun@gmail.com", "1234",
                                                                    "Ankara Turkey",5);
            userList.getUserList().put(rh2.getUsername(), rh2);

            ClaimHandler ch = new ClaimHandler("Rachel", "Green", "ch", "orcun@gmail.com", "1234",
                                                "Arizona USA", ClaimHandler.HandlerType.HighRanked,6);
            userList.getUserList().put(ch.getUsername(), ch);

            ClaimHandler ch2 = new ClaimHandler("Chandler", "Bing", "ch2", "chandler@gmail.com", "1234",
                                                "Stockholm Sweden", ClaimHandler.HandlerType.LowRanked,7);
            userList.getUserList().put(ch2.getUsername(), ch2);

            ClaimHandler ch3 = new ClaimHandler("Phoebe", "Buffay", "ch3", "phoebe@gmail.com", "1234",
                                                "Arizona USA", ClaimHandler.HandlerType.HighRanked,8);
            userList.getUserList().put(ch3.getUsername(), ch3);

            ClaimHandler ch4 = new ClaimHandler("Yigit", "Karadogan", "ch4", "chandler@gmail.com", "1234",
                                                "Stockholm Sweden", ClaimHandler.HandlerType.LowRanked,9);
            userList.getUserList().put(ch4.getUsername(), ch4);

            Financer fin = new Financer("Pinar", "Adimci", "fin", "adimci@gmail.com", "1234",10);
            userList.getUserList().put(fin.getUsername(), fin);

            Financer fin2 = new Financer("Emre", "Demiralp", "fin2", "demir@gmail.com", "1234",11);
            userList.getUserList().put(fin2.getUsername(), fin2);


            objectOutputStream.writeObject(userList);
            UserList ul = new UserList();
            ul = DatabaseControl.getAllUsers();
            objectOutputStream.close();

            FileOutputStream fos = new FileOutputStream(claimsFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ClaimList cl = new ClaimList();

            Claim c = new Claim(customer1, "DescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescription" +
                    "DescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescription" +
                    "DescriptionDescriptionDescription", Calendar.getInstance(), 1);
            c.setClaimHandler(ch);
            
            cl.add(c);
            oos.writeObject(cl);
            oos.close();


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
        {
            if(c.getClaimHandler() != null)
                if(username.equals(c.getClaimHandler().getUsername()))
                    returnList.getClaimList().put(c.getId(), c);
        }
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
     
        for(User u : userList.getUserList().values())
            if(u.getId() >= max)
                max = u.getId();
        return max+1;
    }
}
