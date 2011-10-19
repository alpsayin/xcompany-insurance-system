/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.lists;

import java.util.HashMap;
import xcompany.structures.User;

/**
 *
 * @author Alp Sayin
 */
public class UserList
{
    private HashMap<String,User> userList;
    public UserList()
    {
        userList = new HashMap<String,User>();
    }
    public HashMap<String,User> getUserList()
    {
        return userList;
    }
}
