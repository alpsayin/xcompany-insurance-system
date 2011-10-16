/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xcompany.control;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import xcompany.structures.User;

/**
 *
 * @author Mert
 */
public class DatabaseControlTest {

    DatabaseControl db;
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
        db = new DatabaseControl();
        db.createSomeUsers();
    }

    @After
    public void tearDown() {
        db = null;
    }


    /**
     * Test of getUser method, of class DatabaseControl.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        
        String name = "mert", surname = "karadogan", username = "gmertk",
                email = "gmertk@gmail.com", password = "12345",
                address = "Hanstavagen 49 Stockholm Sweden";
        int id = 1;

        User user = db.getUser(username);

       
        assertEquals(name, user.getName());
        assertEquals(surname, user.getSurname());
        assertEquals(username, user.getUsername());
        assertEquals(email, user.getEmail());
        assertEquals(password, user.getPassword());
        assertEquals(address, user.getAddress());
        assertEquals(id, user.getId());

    }

    /**
     * Test of getUserClaims method, of class DatabaseControl.
     */
    @Test
    public void testGetUserClaims() {
        System.out.println("getUserClaims");
        Object User = null;
        DatabaseControl instance = new DatabaseControl();
        ArrayList expResult = null;
        ArrayList result = instance.getUserClaims(User);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}