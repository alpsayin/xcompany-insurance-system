/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.structures.form;

/**
 *
 * @author Alp Sayin
 */
public class FormFactory
{
    public static SimpleForm createSimpleFormInstance()
    {
        SimpleForm sf = new SimpleForm() 
        {
            @Override public void initializeFields()
            {
                getFields().put("Name", "Please enter your name here");
                getFields().put("Surname", "Please enter your surname here");
            }
        };
        return sf;
    }
    public static ComplexForm createComplexFormInstance()
    {
        ComplexForm cf = new ComplexForm() 
        {
            @Override public void initializeFields()
            {
                getFields().put("Name", "Please enter your name here");
                getFields().put("Surname", "Please enter your surname here");
                getFields().put("Email", "Please enter your email address here");
            }
        };
        return cf;
    }
}
