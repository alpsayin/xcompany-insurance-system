/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xcompany.lists;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import xcompany.structures.Email;

/**
 *
 * @author Mert
 */
public class EmailListTest {

    public EmailListTest() {
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
    public void testSetGetEmailList() {
        System.out.println("setGetEmailList");

        ArrayList<Email> emailList = new ArrayList<Email>();
        Email email1 = new Email("from1","to1","subject1","text1");
        emailList.add(email1);

        EmailList instance = new EmailList();
        instance.setEmailList(emailList);

        assertEquals(instance.getEmailList().get(0).toString(), email1.toString());
    }

}