/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.lists;

import java.util.ArrayList;
import xcompany.structures.User;

/**
 *
 * @author Alp Sayin
 */
public class UserList
{
    private ArrayList<User> userList;
    public UserList()
    {
        userList = new ArrayList<User>();
    }
    public ArrayList<User> getUserList()
    {
        return userList;
    }
}
