/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serializabletrial;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alp Sayin
 */
public class SerializableMethodsTest
{
    
    public SerializableMethodsTest()
    {
    }
    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }
    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }
    @Before
    public void setUp()
    {
    }
    @After
    public void tearDown()
    {
    }
    /**
     * Test of write and read method, of class SerializableMethods.
     */
    @Test
    public void testWriteRead() throws Exception
    {
        System.out.println("write");
        SerializableMethods.write();
        System.out.println("read");
        SerializableMethods.read();
    }
}
