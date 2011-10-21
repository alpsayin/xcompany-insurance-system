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
import xcompany.lists.UserList;
import static org.junit.Assert.*;
import xcompany.structures.*;

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
    public void testAdd() throws Exception {
        System.out.println("add");
        User user = new Customer("elmira", "Khodabandeloo ", "elmira-k", "elmira@gmail.com", "12345",
                "KTH Stockholm Sweden");

        User existingUser = new Customer("mert", "karadogan ", "gmertk", "gmertk@gmail.com", "12345",
                "KTH Stockholm Sweden");

        AccountControl instance = new AccountControl();
        //instance.add(user);
        //assertEquals(user, DatabaseControl.getUser(user.getUsername()) );
        
        boolean result = instance.add(existingUser);
        assertEquals(false, result);
        
    }

    /**
     * Test of modify method, of class AccountControl.
     */
    @Test
    public void testModify() throws Exception {
        System.out.println("modify");
        String username = "";
        User user = null;
        AccountControl instance = new AccountControl();
        boolean expResult = false;
        boolean result = instance.modify(username, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccountControl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        String username = "";
        AccountControl instance = new AccountControl();
        boolean expResult = false;
        boolean result = instance.delete(username);
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
    public void testChangePassword() throws Exception {
        System.out.println("changePassword");
        String username = "";
        String oldPassword = "";
        String newPassword = "";
        AccountControl instance = new AccountControl();
        boolean expResult = false;
        boolean result = instance.changePassword(username, oldPassword, newPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class AccountControl.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        String username = "";
        String password = "";
        AccountControl instance = new AccountControl();
        User expResult = null;
        User result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}