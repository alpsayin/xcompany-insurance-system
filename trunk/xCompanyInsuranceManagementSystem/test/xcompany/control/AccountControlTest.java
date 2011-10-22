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
        User user = new ClaimHandler("Mark", "Canon", "ch", "email@gmail.com", "12345",
                "address1", ClaimHandler.HandlerType.LowRanked);
        AccountControl instance = new AccountControl();
        boolean result = instance.add(user);
        assertEquals(true, result);
        assertEquals(user, DatabaseControl.getUser(user.getUsername()) );
        
        
        //assertEquals(true, instance.delete(user.getUsername()));
        
    }

    @Test
    public void testAddExistingUser() throws Exception {
        System.out.println("addExisting");
        User user = new Customer("name1", "surname1", "username1", "modified@gmail.com", "12345",
                "address1");
        AccountControl instance = new AccountControl();
        instance.add(user);
        assertEquals(user, DatabaseControl.getUser(user.getUsername()) );
        
        boolean result = instance.add(user);
        assertEquals(false, result);
        
        assertEquals(true, instance.delete(user.getUsername()));


    }

    /**
     * Test of modify method, of class AccountControl.
     */
    @Test
    public void testModify() throws Exception {
        System.out.println("modify");
        
        User user = new Customer("name1", "surname1", "username1", "modified@gmail.com", "12345",
                "address1");
        String username = user.getUsername();

        AccountControl instance = new AccountControl();
        instance.add(user);
        assertEquals(user, DatabaseControl.getUser(username));
        
        boolean expResult = true;
        User userModified = new Customer("name1modified", "surname1modified", "username1", "modified@gmail.com", "12345",
                "address1");
        boolean result = instance.modify(username, userModified);
        assertEquals(expResult, result);
        assertEquals(userModified, DatabaseControl.getUser(user.getUsername()) );
        
        
        assertEquals(true, instance.delete(username));
    }

    /**
     * Test of delete method, of class AccountControl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        User user = new Customer("name1", "surname1", "username1", "modified@gmail.com", "12345",
                "address1");
        String username = user.getUsername();
        AccountControl instance = new AccountControl();
        instance.add(user);
        assertEquals(user, DatabaseControl.getUser(username));

        boolean expResult = true;
        boolean result = instance.delete(username);
        assertEquals(expResult, result);

        assertEquals(null, DatabaseControl.getUser(username) );

    }


    /**
     * Test of changePassword method, of class AccountControl.
     */
    @Test
    public void testChangePassword() throws Exception {
        System.out.println("changePassword");
        
        User user = new Customer("name1", "surname1", "username1", "modified@gmail.com", "12345",
                "address1");
        String username = user.getUsername();
        String oldPassword = user.getPassword();
        String newPassword = "new12345";

        AccountControl instance = new AccountControl();
        instance.add(user);
        assertEquals(user, DatabaseControl.getUser(username));

        boolean expResult = true;
        boolean result = instance.changePassword(username, oldPassword, newPassword);
        assertEquals(expResult, result);
        assertEquals(newPassword, DatabaseControl.getUser(username).getPassword());

        
        assertEquals(true, instance.delete(username));
    }

    /**
     * Test of login method, of class AccountControl.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");

        User user = new Customer("name1", "surname1", "username1", "modified@gmail.com", "12345",
                "address1");
        String username = user.getUsername();

        AccountControl instance = new AccountControl();
        instance.add(user);
        assertEquals(user, DatabaseControl.getUser(username));

        boolean expResult = true;
        User loginedUser = instance.login(username, user.getPassword());
        assertEquals(loginedUser, user);

        assertEquals(true, instance.delete(username));
    }

}