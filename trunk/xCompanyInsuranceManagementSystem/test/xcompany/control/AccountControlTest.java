/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xcompany.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import xcompany.structures.Customer;
import static org.junit.Assert.*;
import xcompany.structures.User;

/**
 *
 * @author Mert
 */
public class AccountControlTest {

    public AccountControlTest() {
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
     * Test of add method, of class AccountControl.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        User user = null;
        AccountControl instance = new AccountControl();
        boolean expResult = false;
        boolean result = instance.add(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modify method, of class AccountControl.
     */
    @Test
    public void testModify() {
        System.out.println("modify");
        AccountControl instance = new AccountControl();
        boolean expResult = false;
        boolean result = instance.modify();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccountControl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        AccountControl instance = new AccountControl();
        boolean expResult = false;
        boolean result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetPassword method, of class AccountControl.
     */
    @Test
    public void testResetPassword() {
        System.out.println("resetPassword");
        AccountControl instance = new AccountControl();
        boolean expResult = false;
        boolean result = instance.resetPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePassword method, of class AccountControl.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        AccountControl instance = new AccountControl();
        boolean expResult = false;
        boolean result = instance.changePassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class AccountControl.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String name = "mert", surname = "karadogan", username = "gmertk",
               email = "gmertk@gmail.com", password = "12345",
               address = "Hanstavagen 49 Stockholm Sweden";
        int id = 1;

        AccountControl instance = new AccountControl();
        User user = instance.login(username, password);

        assertEquals(name, user.getName());
        assertEquals(surname, user.getSurname());
        assertEquals(username, user.getUsername());
        assertEquals(email, user.getEmail());
        assertEquals(password, user.getPassword());
        assertEquals(address, user.getAddress());
        assertEquals(id, user.getId());

        password = "wrongPass";
        user = instance.login(username,password);
        assertNull(user);

        username = "notExistingUser";
        user = instance.login(username,password);
        assertNull(user);
        
        
    }

}