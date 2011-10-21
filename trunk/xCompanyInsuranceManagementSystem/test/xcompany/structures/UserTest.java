/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xcompany.structures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mert
 */
public class UserTest {

    User user;
    public UserTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        user = new User("mert", "karadogan", "gmertk", "gmertk@gmail.com", "12345",
                "Hanstavagen 49 Stockholm Sweden");

    }

    @After
    public void tearDown() {
        user = null;
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testUserCreation() {
        System.out.println("userCreation");

        String name = "mert", surname = "karadogan", username = "gmertk",
                email = "gmertk@gmail.com", password = "12345",
                address = "Hanstavagen 49 Stockholm Sweden";
        
        assertEquals(name, user.getName());
        assertEquals(surname, user.getSurname());
        assertEquals(username, user.getUsername());
        assertEquals(email, user.getEmail());
        assertEquals(password, user.getPassword());
        assertEquals(address, user.getAddress());

    }


    /**
     * Test of resetPassword method, of class User.
     */
    @Test
    public void testResetPassword() {
        System.out.println("resetPassword");
        String username = "";
        String email = "";
        User instance = null;
        boolean expResult = false;
        boolean result = instance.resetPassword(username, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendEmail method, of class User.
     */
    @Test
    public void testSendEmail() {
        System.out.println("sendEmail");
        Email m = null;
        User instance = null;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassword method, of class User.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "";
        User instance = null;
        boolean expResult = false;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        User instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateId method, of class User.
     */
    @Test
    public void testGenerateId() {
        System.out.println("generateId");
        int expResult = 0;
        int result = User.generateId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generatePassword method, of class User.
     */
    @Test
    public void testGeneratePassword() {
        System.out.println("generatePassword");
        String expResult = "";
        String result = User.generatePassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}