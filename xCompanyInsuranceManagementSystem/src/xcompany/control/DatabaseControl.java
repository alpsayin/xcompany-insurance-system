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
import java.util.ArrayList;
import java.util.HashMap;
import xcompany.lists.ClaimList;
import xcompany.lists.GarageList;
import xcompany.lists.UserList;


//  @ Date : 11.10.2011




public class DatabaseControl 
{

    private static final String usersFile = "AllUsers.bin";

    /*
     ^Because we dont have sign up (for now), we can use this function to create some users just once.
     *
     */
    public boolean createSomeUsers() {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(usersFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            HashMap<String, User> userList = new HashMap<String, User>();
            User customer1 = new Customer("mert", "karadogan", "gmertk", "gmertk@gmail.com", "12345",
                    "Hanstavagen 49 Stockholm Sweden", 1);
            User customer2 = new Customer("alp", "sayin", "alpsayin", "alp@gmail.com", "12345",
                    "Akalla Stockholm Sweden", 2);
            userList.put(customer1.getUsername(), customer1);
            userList.put(customer2.getUsername(), customer2);

            objectOutputStream.writeObject(userList);

            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        return true;
    }

    private ClaimList getAllClaims() 
    {
        ClaimList claimList = new ClaimList();

        return claimList;
    }

    private UserList getAllUsers() throws IOException, ClassNotFoundException
    {
        UserList userList = new UserList();

        FileInputStream fileInputStream = new FileInputStream(usersFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        userList = (UserList) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();
        
        return userList;

    }

    private GarageList getAllGarages()
    {
        GarageList garageList = new GarageList();

        return garageList;
    }


    public User getUser(String userName) throws IOException, ClassNotFoundException
    {
        return getAllUsers().getUserList().get(userName);
    }


    public ClaimList getUserClaims(Object User) 
    {
        ClaimList claimList = new ClaimList();

        return claimList;
    }

}
