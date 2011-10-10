/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serializabletrial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alp Sayin
 */
public class SerializableMethods
{

    /**
     * @param args the command line arguments
     */
    public static void write() throws Exception
    {
        FileOutputStream clfos = new FileOutputStream("claims.bin");
        FileOutputStream cfos = new FileOutputStream("customers.bin");
        ObjectOutputStream cloos = new ObjectOutputStream(clfos);
        ObjectOutputStream coos = new ObjectOutputStream(cfos);
        Customer c = new Customer("alp");
        Claim cl = new Claim("description");
        c.addClaim(cl);
        coos.writeObject(c);
        cloos.writeObject(cl);
        coos.close();
        cloos.close();
    }
    public static void read() throws Exception
    {
        FileInputStream clfis = new FileInputStream("claims.bin");
        FileInputStream cfis = new FileInputStream("customers.bin");
        ObjectInputStream clois = new ObjectInputStream(clfis);
        ObjectInputStream cois = new ObjectInputStream(cfis);
        Object co = cois.readObject();
        System.out.println(co.getClass().getCanonicalName());
        Customer c;
        if(co.getClass().equals(Customer.class))
            c = (Customer)co;
        else
            throw new ClassCastException("Customer cast exception");

        Claim cl;
        Object clo = clois.readObject();
        if(clo.getClass().equals(Claim.class))
            cl = (Claim)clo;
        else
            throw new ClassCastException("Claim cast exception");
        System.out.println(c.getClaimslist());
        System.out.println(cl.getItsCustomer());
        clois.close();
        cois.close();
    }
}
