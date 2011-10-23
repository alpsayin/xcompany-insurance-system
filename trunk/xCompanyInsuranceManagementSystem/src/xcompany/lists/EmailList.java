/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.lists;

import java.io.Serializable;
import java.util.ArrayList;
import xcompany.structures.Email;

/**
 *
 * @author Alp Sayin
 */
public class EmailList implements Serializable
{
    private ArrayList<Email> emailList;
    public EmailList()
    {
        emailList = new ArrayList<Email>();
    }
    public ArrayList<Email> getEmailList()
    {
        return emailList;
    }
    public void setEmailList(ArrayList<Email> emailList)
    {
        this.emailList = emailList;
    }
}
