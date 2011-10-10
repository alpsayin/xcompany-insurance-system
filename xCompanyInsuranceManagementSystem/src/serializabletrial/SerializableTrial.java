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
public class SerializableTrial
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        if(args.length==0)
            System.exit(-1);
        if(args[0].equals("write"))
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
        else if(args[0].equals("read"))
        {
            FileInputStream clfis = new FileInputStream("claims.bin");
            FileInputStream cfis = new FileInputStream("customers.bin");
            ObjectInputStream clois = new ObjectInputStream(clfis);
            ObjectInputStream cois = new ObjectInputStream(cfis);
            Customer c = (Customer)cois.readObject();
            Claim cl = (Claim)clois.readObject();
            System.out.println(c.getClaimslist());
            System.out.println(cl.getItsCustomer());
            clois.close();
            cois.close();
        }
    }
}
