/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.userInterface;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import xcompany.control.DatabaseControl;
import xcompany.lists.ClaimList;
import xcompany.structures.Claim;
import xcompany.structures.Customer;
import xcompany.structures.RegistrationHandler;
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
    JButton sendBackButton;
    JPanel panelButton = new JPanel();
    Claim claim;
    User user;
    boolean editable;
    public FormPanel(User u, Claim c, boolean showButtons)
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
            sendBackButton = new JButton("Reject");
            sendBackButton.addActionListener(this);
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
        panelButton.add(sendButton);
        if(!(user instanceof Customer))
            panelButton.add(sendBackButton);
        if(showButtons)
            this.add("South", panelButton);
    }
    @Override public void actionPerformed(ActionEvent e)
    {
        try {
            ClaimList cl = DatabaseControl.getAllClaims();
            if (user instanceof Customer) {
                for (int i = 0; i < fields.size(); i++) {
                    JLabel field = fields.get(i);
                    JTextArea area = values.get(i);
                    claim.getForm().getFields().put(field.getText(), area.getText());
                }
              
                cl.getClaimList().get(claim.getId()).setForm(claim.getForm());
                cl.getClaimList().get(claim.getId()).setStatus(Claim.ClaimStatus.SentBack);
                DatabaseControl.writeAllClaims(cl);
            }
            else if (user instanceof RegistrationHandler) {

                if (e.getActionCommand().equals("Approve")) {
                    cl.getClaimList().get(claim.getId()).setStatus(Claim.ClaimStatus.Registered);
                    DatabaseControl.writeAllClaims(cl);
                }
                else {
                    cl.getClaimList().get(claim.getId()).setStatus(Claim.ClaimStatus.WaitingForms);
                    DatabaseControl.writeAllClaims(cl);

                }
            }
            else{

                if (e.getActionCommand().equals("Approve")) {
                    cl.getClaimList().get(claim.getId()).setStatus(Claim.ClaimStatus.ApprovedPendingPayment);
                    DatabaseControl.writeAllClaims(cl);
                }
                else {
                    cl.getClaimList().get(claim.getId()).setStatus(Claim.ClaimStatus.Rejected);
                    DatabaseControl.writeAllClaims(cl);

                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FormPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
