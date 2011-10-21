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
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserClaims method, of class DatabaseControl.
     */
    @Test
    public void testGetUserClaims() {
        System.out.println("getUserClaims");
        
        fail("The test case is a prototype.");
    }

}