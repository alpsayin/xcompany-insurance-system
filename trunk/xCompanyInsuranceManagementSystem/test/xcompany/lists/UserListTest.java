/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xcompany.lists;

import java.io.IOException;
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
public class UserListTest {

    public UserListTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws IOException, ClassNotFoundException {

    }

    @After
    public void tearDown() {

    }


    @Test
    public void testGet() {
        System.out.println("get");
        
        UserList instance = new UserList();
        User user = new Customer("Mert", "Karadogan", "gmertk", "gmertk@gmail.com", "1234",
                    "Grufsgatan 12 Stockholm Sweden", 1);
        instance.getUserList().put("gmertk", user);
        User expResult = user;
        User result = instance.get(user.getUsername());

        assertEquals(expResult, result);
        assertEquals(expResult, instance.getUserById(user.getId()));
    }

  

}