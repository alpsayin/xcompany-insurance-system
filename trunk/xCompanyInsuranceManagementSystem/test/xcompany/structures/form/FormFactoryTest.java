/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.structures.form;

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
public class FormFactoryTest
{
    
    public FormFactoryTest()
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
     * Test of createSimpleFormInstance method, of class FormFactory.
     */
    @Test
    public void testCreateSimpleFormInstance()
    {
        System.out.println("createSimpleFormInstance");
        SimpleForm result = FormFactory.createSimpleFormInstance();
        System.out.println(result);
    }
    /**
     * Test of createComplexFormInstance method, of class FormFactory.
     */
    @Test
    public void testCreateComplexFormInstance()
    {
        System.out.println("createComplexFormInstance");
        ComplexForm result = FormFactory.createComplexFormInstance();
        System.out.println(result);
    }
}
