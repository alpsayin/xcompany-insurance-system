package xcompany.control;
//  @ File Name : AccountControl.java
//  @ Date : 11.10.2011

import xcompany.structures.User;





public class AccountControl 
{
    public boolean add(User user)
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public boolean modify() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }

    public boolean delete() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }

    public boolean resetPassword() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public boolean changePassword() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public User login(String username, String password)
    {
        DatabaseControl db = new DatabaseControl();
        User user = db.getUser(username);

        if(user == null)
            return null;
        else if(user.getPassword().equals(password))
            return user;

        return null;

    }
}
