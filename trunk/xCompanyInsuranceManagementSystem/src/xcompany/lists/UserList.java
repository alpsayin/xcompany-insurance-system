/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.lists;

import java.io.Serializable;
import java.util.HashMap;
import xcompany.structures.User;

/**
 *
 * @author Alp Sayin
 */
public class UserList implements Serializable
{
    private HashMap<String,User> userList;
    public UserList()
    {
        userList = new HashMap<String,User>();
    }
    public User get(String username)
    {
        return getUserList().get(username);
    }
    public User getUserById(int id)
    {
        for(User u : getUserList().values())
            if(u.getId() == id)
                return u;
        return null;
    }
    public HashMap<String,User> getUserList()
    {
        return userList;
    }
}
