/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xcompany.control;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import xcompany.lists.ClaimList;
import xcompany.lists.GarageList;
import xcompany.lists.UserList;
import xcompany.structures.*;
import xcompany.structures.Claim.ClaimStatus;

/**
 *
 * @author Mert
 */
public class DatabaseControlTest {
    static Financer fin, fin2;
    public DatabaseControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
            UserList userList = new UserList();
            fin = new Financer("Pinar", "Adimci", "fin", "adimci@gmail.com", "1234",10);
            userList.getUserList().put(fin.getUsername(), fin);

            fin2 = new Financer("Emre", "Demiralp", "fin2", "demir@gmail.com", "1234",11);
            userList.getUserList().put(fin2.getUsername(), fin2);
            
            DatabaseControl.writeAllUsers(userList);

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

   
  
    @Test
    public void testAddUser() throws Exception {
        System.out.println("addUser");
        User user = new RegistrationHandler("regHandName", "regHandSurname", "regHand1", "modified@gmail.com", "12345",
                "address1", 999);
        boolean expResult = true;
        boolean result = DatabaseControl.addUser(user);
        assertEquals(expResult, result);
        assertEquals(user, DatabaseControl.getUser(user.getUsername()));
        
    }

 
    @Test
    public void testAllClaims() throws Exception {
        System.out.println("testAllClaims");
        ClaimList claimList = new ClaimList();
        Claim c = null;
        int numberOfClaims = 5;
        User user1 = DatabaseControl.getUser("gmertk");
        User user2 = DatabaseControl.getUser("alpsayin");


        for(int i = 0; i < numberOfClaims; i++){
             c = new Claim((Customer)user1, "User1CrashDescription"+i, Calendar.getInstance());
             c.setClaimHandler(new ClaimHandler("claimHandName", "claimHandSurname","claimHand1","claimHand@gmail.com","12345", "address", ClaimHandler.HandlerType.HighRanked));
             claimList.add(c);
             DatabaseControl.writeAllClaims(claimList);
        }

        for(int i = 0; i < numberOfClaims; i++){
             Claim c1 = new Claim((Customer)user2, "User2CrashDescription"+i, Calendar.getInstance());
             claimList.add(c1);
             DatabaseControl.writeAllClaims(claimList);

        }

      

        DatabaseControl.writeAllClaims(claimList);
/*
        ClaimList cl = DatabaseControl.getAllClaims();
        for(Claim claim : cl.getClaimList().values()){
                assertEquals(claim, claimList.get(claim.getId()));
        }
 *
 */
    }




    @Test
    public void testAllGarages() throws Exception {
        System.out.println("writeAllGarages");
        GarageList garageList = new GarageList();
        Garage g = null;
        int numberOfGarages = 5;
        for(int i=1; i<numberOfGarages; i++){
            g = new Garage("garage"+i, "garageEmail" + i);
            garageList.getGarageList().add(g);
        }
        DatabaseControl.writeAllGarages(garageList);
        for(int i = 0; i < garageList.getGarageList().size(); i++){
            assertEquals(garageList.getGarageList().get(i).getName(), DatabaseControl.getAllGarages().getGarageList().get(i).getName());
        }

        
    }

    @Test
    public void testGetUser() throws Exception {
        System.out.println("getUser");
        
        
        User expResult = fin2;
        User result = DatabaseControl.getUser(fin2.getUsername());
        assertEquals(expResult, result);
        
    }





}