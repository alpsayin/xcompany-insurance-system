package xcompany.structures;

//  @ File Name : User.java
//  @ Date : 11.10.2011




public class User 
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
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public void sendEmail(Email m)
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public boolean checkPassword(String password)
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    @Override public boolean equals(Object o)
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    @Override public String toString()
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public static int generateId()
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
    public static String generatePassword()
    {
        throw new UnsupportedOperationException("not yet implemented!");
    }
}
