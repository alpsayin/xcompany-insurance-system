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
import xcompany.structures.Garage;
import static org.junit.Assert.*;

/**
 *
 * @author Mert
 */
public class GarageListTest {

    public GarageListTest() {
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

        ArrayList<Garage> garageList = new ArrayList<Garage>();
        Garage garage1 = new Garage("garage","email");
        garageList.add(garage1);

        GarageList instance = new GarageList();
        instance.setGarageList(garageList);

        assertEquals(instance.getGarageList().get(0).toString(), garage1.toString());
    }
}