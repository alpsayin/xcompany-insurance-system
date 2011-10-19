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
                getFields().put("Email", "Please enter your email address here");
                getFields().put("Accident Address", "Please enter the accident place here");
                getFields().put("Witness Name", "Please enter witness name here if there is");
                getFields().put("Witness Surname", "Please enter witness surname here if there is");
                getFields().put("License Plate", "Please enter license plate here");
                getFields().put("Vehicle Model", "Please enter vehicle model here");
                getFields().put("Damage Description", "Please enter damage description here");

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
                getFields().put("Accident Address", "Please enter the accident place here");
                getFields().put("Witness Name", "Please enter witness name here if there is");
                getFields().put("Witness Surname", "Please enter witness surname here if there is");
                getFields().put("License Plate", "Please enter license plate of your car here");
                getFields().put("Vehicle Model", "Please enter vehicle model here");
                getFields().put("Damage Description", "Please enter damage description here");
                getFields().put("Name2", "Please enter name of the other driver here");
                getFields().put("Surname2", "Please enter surname of the other driver here");
                getFields().put("Email2", "Please enter the email address of the other driver here");
                getFields().put("License Plate2", "Please enter license plate of the other car here");
                getFields().put("Vehicle Model2", "Please enter vehicle model of the other car here");
                getFields().put("Damage Description2", "Please enter damage description of the other car here");
            }
        };
        return cf;
    }
}
