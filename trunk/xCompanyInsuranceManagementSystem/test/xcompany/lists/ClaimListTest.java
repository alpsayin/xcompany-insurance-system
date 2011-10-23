/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xcompany.lists;


import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import xcompany.structures.Claim;
import xcompany.structures.Customer;

/**
 *
 * @author Mert
 */
public class ClaimListTest {

    public ClaimListTest() {
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


    @Test
    public void testAddGetClaim() {
        System.out.println("addGetClaim");
        Calendar now = Calendar.getInstance();
        Customer owner = new Customer("Mert", "Karadogan", "cust", "gmertk@gmail.com", "1234",
                    "Grufsgatan 12 Stockholm Sweden", 999);
        Claim c = new Claim(owner, "Description", now);
        ClaimList instance = new ClaimList();
        instance.add(c);
        
        assertEquals(true, instance.getClaimList().containsKey(c.getId()));
        assertEquals(c.getDescription(), instance.get(c.getId()).getDescription() );
        assertEquals(c.getOwner(), instance.get(c.getId()).getOwner() );

    }

}