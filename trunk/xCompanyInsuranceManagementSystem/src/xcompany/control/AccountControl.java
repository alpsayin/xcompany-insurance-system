package xcompany.control;
//  @ File Name : AccountControl.java
//  @ Date : 11.10.2011

import java.io.IOException;
import xcompany.lists.UserList;
import xcompany.structures.User;





public class AccountControl 
{
    public boolean add(User user)
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public boolean modify(String username, User user) throws IOException, ClassNotFoundException
    {
        UserList userList = DatabaseControl.getAllUsers();
        if(userList != null){
            User u = userList.get(username);
            if(u != null){
                u.setAddress(user.getAddress());
                u.setEmail(user.getEmail());
                u.setName(user.getName());
                u.setPassword(user.getPassword());
                u.setSurname(user.getPassword());

                userList.getUserList().put(u.getUsername(), u);
                DatabaseControl.writeAllUsers(userList);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String username) throws IOException, ClassNotFoundException
    {
        UserList userList = DatabaseControl.getAllUsers();
        if(userList.getUserList().containsKey(username)){
            userList.getUserList().remove(username);
            DatabaseControl.writeAllUsers(userList);
            return true;
        }
        return false;
    }

    public boolean resetPassword() 
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public boolean changePassword(String username, String oldPassword, String newPassword) throws IOException, ClassNotFoundException
    {
        UserList userList = DatabaseControl.getAllUsers();
        User user = userList.get(username);

        if( (user != null) && (user.checkPassword(oldPassword))){
            user.setPassword(newPassword);
            DatabaseControl.writeAllUsers(userList);
            return true;
        }
        return false;

    }
    public User login(String username, String password) throws IOException, ClassNotFoundException
    {
        User user = DatabaseControl.getUser(username);
        if((user != null) && (user.checkPassword(password)))
            return user;
        
        return null;

    }
}
