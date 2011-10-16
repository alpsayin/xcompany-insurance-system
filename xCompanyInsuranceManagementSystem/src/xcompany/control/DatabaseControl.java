package xcompany.control;

//  @ File Name : DatabaseControl.java

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import xcompany.structures.User;
import xcompany.structures.Customer;
import xcompany.structures.Garage;
import xcompany.structures.Claim;
import java.util.ArrayList;
import java.util.HashMap;


//  @ Date : 11.10.2011




public class DatabaseControl {

    String usersFile = "AllUsers.bin";

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

    private ArrayList<Claim> getAllClaims() {
            ArrayList<Claim> claimList = new ArrayList<Claim>();

            return claimList;
    }

    private HashMap<String, User> getAllUsers(){
        HashMap<String, User> userList = null;

        try{
            FileInputStream fileInputStream = new FileInputStream(usersFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            userList = (HashMap<String, User>) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();
            
        }
        catch(Exception e){
            System.err.println(e.toString());
        }

        return userList;

    }

    private ArrayList<Garage> getAllGarages() {
        ArrayList<Garage> garageList = new ArrayList<Garage>();

        return garageList;
    }


    public User getUser(String userName){
        
        HashMap<String, User> userList = getAllUsers();
        User user = userList.get(userName);

        return user;
    }


    public ArrayList<Claim> getUserClaims(Object User) {
        ArrayList<Claim> claimList = new ArrayList<Claim>();

        return claimList;
    }

}
