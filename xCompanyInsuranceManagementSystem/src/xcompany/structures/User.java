package xcompany.structures;

//  @ File Name : User.java
//  @ Date : 11.10.2011
import java.io.Serializable;
import xcompany.control.DatabaseControl;



public class User implements Serializable
{
    private String name;
    private String surname;
    private String username;
    private String email;
    private String password;
    private String address;
    private int id;
    public User(String name, String surname, String username, String email)
    {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
    }
    public User(String name, String surname, String username, String email,
            String password, String address)
    {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.password = generatePassword();
        this.address = address;
        this.id = generateId();
    }
    public User(String name, String surname, String username, String email,
            String password, String address, int id)
    {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.password = generatePassword();
        this.address = address;
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public boolean resetPassword(String username, String email)
    {
        if(this.getUsername().equals(username))
            if(this.getEmail().equals(email))
            {
                this.setPassword(generatePassword());
                Email e = new Email();
                e.setFrom("password@xCompany.com");
                e.setTo(this.getEmail());
                e.setSubject("Password Reset");
                e.setText("Your new password is \""+getPassword()+"\"");
                return true;
            }
        return false;
    }
    public boolean checkPassword(String password)
    {
        return this.getPassword().equals(password);
    }
    @Override public boolean equals(Object o)
    {
        if(o == null)
            return false;
        if(o instanceof User){
            User user = (User) o;
            return  (this.username.equals(user.username));
        }
        return false;

    }
    @Override public String toString()
    {
       
        String newLine = "\n";

        return "Id: " + id + newLine
            + "Name: " + name + newLine
            + "Surname: " + surname + newLine
            + "Username: " + username + newLine
            + "Email: " + email + newLine
            + "Password: " + password + newLine
            + "Address: " + address ;
           
       
    }
    public static int generateId()
    {
        try
        {
            int id = DatabaseControl.generateUserId();
            return id;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public static String generatePassword()
    {
        return "1234";
    }
}
