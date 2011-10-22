/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xcompany.control;

import java.util.ArrayList;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import xcompany.structures.Claim;
import xcompany.structures.Claim.ClaimStatus;
import xcompany.structures.ClaimHandler;
import xcompany.structures.Customer;
import xcompany.structures.Email;
import xcompany.structures.Financer;
import xcompany.structures.Garage;
import xcompany.structures.User;

/**
 *
 * @author Mert
 */
public class ClaimControlTest {

    public ClaimControlTest() {
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
     * Test of add method, of class ClaimControl.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        User customer = DatabaseControl.getUser("gmertk");
        Claim c = new Claim((Customer)customer, "newAddedClaim",Calendar.getInstance());
        
        ClaimControl instance = new ClaimControl();
        boolean expResult = false;
        boolean result = instance.add(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeStatus method, of class ClaimControl.
     */
    @Test
    public void testChangeStatus() throws Exception {
        System.out.println("changeStatus");
        int id = 10;
        ClaimStatus status = ClaimStatus.Registered;
        ClaimControl instance = new ClaimControl();
        boolean expResult = true;
        boolean result = instance.changeStatus(id, status);
        assertEquals(expResult, result);
        assertEquals(DatabaseControl.getAllClaims().get(id).getStatus(), status);
    }

    /**
     * Test of notifyCustomer method, of class ClaimControl.
     */
    @Test
    public void testNotifyCustomer() throws Exception {
        System.out.println("notifyCustomer");
        int id = 10;
        Claim c = DatabaseControl.getAllClaims().get(id);
        String message = "email";
        ClaimControl instance = new ClaimControl();
        boolean expResult = false;
        boolean result = instance.notifyCustomer(c, message);
        ArrayList<Email> elist = DatabaseControl.getAllClaims().get(id).getEmailsList();

        assertEquals(expResult, result);
        assertEquals(elist.get(elist.size()-1).getText(), message  );
    }

    /**
     * Test of assignClaimHandler method, of class ClaimControl.
     */
    @Test
    public void testAssignClaimHandler() throws Exception {
        System.out.println("assignClaimHandler");
        Claim c = null;
        ClaimHandler ch = null;
        ClaimControl instance = new ClaimControl();
        boolean expResult = false;
        boolean result = instance.assignClaimHandler(c, ch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignFinancer method, of class ClaimControl.
     */
    @Test
    public void testAssignFinancer() throws Exception {
        System.out.println("assignFinancer");
        Claim c = null;
        Financer f = null;
        ClaimControl instance = new ClaimControl();
        boolean expResult = false;
        boolean result = instance.assignFinancer(c, f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignGarage method, of class ClaimControl.
     */
    @Test
    public void testAssignGarage() throws Exception {
        System.out.println("assignGarage");
        Claim c = null;
        Garage g = null;
        ClaimControl instance = new ClaimControl();
        boolean expResult = false;
        boolean result = instance.assignGarage(c, g);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInsurance method, of class ClaimControl.
     */
    @Test
    public void testCheckInsurance() throws Exception {
        System.out.println("checkInsurance");
        Claim c = null;
        ClaimControl instance = new ClaimControl();
        boolean expResult = false;
        boolean result = instance.checkInsurance(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of approve method, of class ClaimControl.
     */
    @Test
    public void testApprove() throws Exception {
        System.out.println("approve");
        ClaimHandler claimHandler = null;
        Claim claim = null;
        boolean approvement = false;
        String message = "";
        ClaimControl instance = new ClaimControl();
        instance.approve(claimHandler, claim, approvement, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}