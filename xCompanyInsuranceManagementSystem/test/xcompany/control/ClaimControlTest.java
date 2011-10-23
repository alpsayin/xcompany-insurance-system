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
import xcompany.lists.ClaimList;
import xcompany.lists.EmailList;
import xcompany.lists.UserList;
import static org.junit.Assert.*;
import xcompany.structures.Claim;
import xcompany.structures.Claim.ClaimStatus;
import xcompany.structures.ClaimHandler;
import xcompany.structures.Customer;
import xcompany.structures.Email;
import xcompany.structures.Financer;
import xcompany.structures.Garage;
import xcompany.structures.Insurance;
import xcompany.structures.User;

/**
 *
 * @author Mert
 */
public class ClaimControlTest {

    static Customer c1, c2;
    static ClaimHandler ch;
    static Financer f;
    static Claim claim;

    public ClaimControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
            UserList userList = new UserList();
            Calendar calendar = Calendar.getInstance();

            c1 = new Customer("Pinar", "Adimci", "fin", "adimci@gmail.com", "1234","address",10);
            userList.getUserList().put(c1.getUsername(), c1);
            calendar.set(2015, 12, 01);
            c1.setInsurance(new Insurance(10000, 5, calendar));

            c2 = new Customer("Emre", "Demiralp", "fin2", "demir@gmail.com", "1234","address",11);
            userList.getUserList().put(c2.getUsername(), c2);

            ch = new ClaimHandler("Phoebe", "Buffay", "ch3", "phoebe@gmail.com", "1234",
                                                "Arizona USA", ClaimHandler.HandlerType.HighRanked,8);
            
            f = new Financer("Pinar", "Adimci", "fin", "adimci@gmail.com", "1234",20);
            userList.getUserList().put(f.getUsername(), f);

            userList.getUserList().put(ch.getUsername(), ch);

            DatabaseControl.writeAllUsers(userList);


            ClaimList cl = new ClaimList();
             claim = new Claim((Customer)c1, "newAddedClaim",Calendar.getInstance(),999);
             claim.setClaimHandler(ch);
             claim.setGarage(new Garage("name","email"));

             EmailList el = new EmailList();
             ArrayList<Email> al =new ArrayList<Email>();
             al.add(new Email());
             el.setEmailList(al);

             claim.setEmailsList(el);
             cl.add(claim);
             DatabaseControl.writeAllClaims(cl);

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
    public void testAddNewClaim() throws Exception {
        System.out.println("add");
        
        Claim c = new Claim((Customer)c1, "newAddedClaim",Calendar.getInstance(),999);
        
        ClaimControl instance = new ClaimControl();
        boolean expResult = true;
        boolean result = instance.add(c);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testChangeStatus() throws Exception {
        System.out.println("changeStatus");

        int id = 999;
        ClaimStatus status = ClaimStatus.Registered;
        ClaimControl instance = new ClaimControl();

        boolean expResult = true;
        boolean result = instance.changeStatus(id, status);
        assertEquals(expResult, result);
        assertEquals(DatabaseControl.getAllClaims().get(id).getStatus(), status);
    }


    @Test
    public void testAssignments() throws Exception {
        System.out.println("assignClaimHandler");
        Claim c = new Claim((Customer)c1, "newAddedClaim",Calendar.getInstance(),999);
        
        ClaimControl instance = new ClaimControl();

        boolean expResult = true;
        boolean result = instance.assignClaimHandler(c, ch);
        boolean result2 = instance.assignFinancer(c, f);
        boolean result3 = instance.assignGarage(c, new Garage("name", "email"));

        assertEquals(expResult, result);
        assertEquals(expResult, result2);
        assertEquals(expResult, result3);
        
    }


    @Test
    public void testCheckInsurance() throws Exception {
        System.out.println("checkInsurance");
        Claim c = new Claim((Customer)c1, "newAddedClaim",Calendar.getInstance(),999);
        ClaimControl instance = new ClaimControl();

        boolean expResult = true;
        boolean result = instance.checkInsurance(c);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testApprove() throws Exception {
        System.out.println("approve");
        boolean approvement = true;
        String message = "Message";
        ClaimControl instance = new ClaimControl();
        instance.approve(ch, claim, approvement, message);
        assertEquals(DatabaseControl.getAllClaims().get(claim.getId()).getStatus(), ClaimStatus.ApprovedPendingPayment);
        
    }

}