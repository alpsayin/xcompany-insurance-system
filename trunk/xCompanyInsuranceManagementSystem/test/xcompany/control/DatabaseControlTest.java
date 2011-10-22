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

    public DatabaseControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
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

   
    /**
     * Test of addUser method, of class DatabaseControl.
     */
    @Test
    public void testAddUser() throws Exception {
        System.out.println("addUser");
        User user = new RegistrationHandler("regHandName", "regHandSurname", "regHand1", "modified@gmail.com", "12345",
                "address1");
        boolean expResult = false;
        boolean result = DatabaseControl.addUser(user);
        assertEquals(expResult, result);
        assertEquals(user, DatabaseControl.getUser(user.getUsername()));
        
    }

    /**
     * Test of writeAllClaims method, of class DatabaseControl.
     */
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



    /**
     * Test of writeAllGarages method, of class DatabaseControl.
     */
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



    /**
     * Test of getUser method, of class DatabaseControl.
     */
    @Test
    public void testGetUser() throws Exception {
        System.out.println("getUser");
        User customer1 = new Customer("mert", "karadogan", "gmertk", "gmertk@gmail.com", "12345",
                    "Hanstavagen 49 Stockholm Sweden", 1);
        String userName = customer1.getUsername();
        User expResult = customer1;
        User result = DatabaseControl.getUser(userName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getClaimsOfHandler method, of class DatabaseControl.
   
    @Test
    public void testGetClaimsOfHandler() throws Exception {

        System.out.println("getClaimsOfHandler");
       
        fail("The test case is a prototype.");
    }
  */
    /**
     * Test of getClaimsOfFinancer method, of class DatabaseControl.
    
    @Test
    public void testGetClaimsOfFinancer() throws Exception {
        System.out.println("getClaimsOfFinancer");
        Financer handler = null;
        ClaimList expResult = null;
        ClaimList result = DatabaseControl.getClaimsOfFinancer(handler);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 */


    /**
     * Test of getClaimsByStatus method, of class DatabaseControl.
     */
    @Test
    public void testGetClaimsByStatus() throws Exception {
        System.out.println("getClaimsByStatus");
        ClaimStatus status = ClaimStatus.WaitingForms;
        ClaimList expResult = DatabaseControl.getAllClaims();
        ClaimList result = DatabaseControl.getClaimsByStatus(status);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateClaimId method, of class DatabaseControl.
     */
    @Test
    public void testGenerateClaimId() throws Exception {
        System.out.println("generateClaimId");
        int expResult = 0;
        int result = DatabaseControl.generateClaimId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateUserId method, of class DatabaseControl.
     */
    @Test
    public void testGenerateUserId() throws Exception {
        System.out.println("generateUserId");
        int expResult = 0;
        int result = DatabaseControl.generateUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}