/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.userInterface;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import xcompany.structures.Claim;
import xcompany.structures.Customer;
import xcompany.structures.User;
import xcompany.structures.form.Form;
import xcompany.structures.form.FormFactory;

/**
 *
 * @author Alp Sayin
 */
public class FormPanel extends JPanel implements ActionListener
{
    ArrayList<JLabel> fields;
    ArrayList<JTextArea> values; 
    JButton sendButton;
    Claim claim;
    User user;
    boolean editable;
    public FormPanel(User u, Claim c)
    {
        this.claim = c;
        this.user = u;
        if(user instanceof Customer)
        {
            sendButton = new JButton("Send");
            editable = true;
        }
        else
        {
            sendButton = new JButton("Approve");
            editable = false;
        }
        
        Form form = c.getForm();
        sendButton.addActionListener(this);
        fields = new ArrayList<JLabel>();
        values = new ArrayList<JTextArea>();
        for(String field : form.getFields().keySet())
        {
            JLabel fieldLabel = new JLabel(field);
            JTextArea valueField = new JTextArea(form.getFields().get(field));
            valueField.setEditable(editable);
            fields.add(fieldLabel);
            values.add(valueField);
        }
        this.setLayout(new BorderLayout());
        this.add("North", new JLabel("Claim Forms"));
        JPanel fieldsPanel = new JPanel(new GridLayout(fields.size(), 2));
        for(int i=0; i<fields.size(); i++)
        {
            fieldsPanel.add(fields.get(i));
            fieldsPanel.add(values.get(i));
        }
        this.add("Center",fieldsPanel);
        this.add("South", sendButton);
    }
    @Override public void actionPerformed(ActionEvent e)
    {
        if(user instanceof Customer)
        {
            for(int i=0; i<fields.size(); i++)
            {
                JLabel field = fields.get(i);
                JTextArea area = values.get(i);
                claim.getForm().getFields().put(field.getText(), area.getText());
            }
        }
        else
        {
            //TODO write some stuff here
        }
    }
}
