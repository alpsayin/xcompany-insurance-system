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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import xcompany.control.ClaimControl;
import xcompany.control.DatabaseControl;
import xcompany.lists.ClaimList;
import xcompany.structures.Claim;
import xcompany.structures.Customer;
import xcompany.structures.Email;
import xcompany.structures.RegistrationHandler;
import xcompany.structures.User;
import xcompany.structures.form.Form;

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
    JPanel parent;
    ClaimControl cc;
    public FormPanel(User u, Claim c, boolean showButtons, JPanel chp)
    {
        this.parent = chp;
        this.claim = c;
        this.user = u;
        this.cc= new ClaimControl();
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
                CustomerHomePanel chp = ((CustomerHomePanel)parent);
                for (int i = 0; i < fields.size(); i++) {
                    JLabel field = fields.get(i);
                    JTextArea area = values.get(i);
                    claim.getForm().getFields().put(field.getText(), area.getText());
                }
              
                cl.getClaimList().get(claim.getId()).setForm(claim.getForm());
                cl.getClaimList().get(claim.getId()).setStatus(Claim.ClaimStatus.SentBack);
                DatabaseControl.writeAllClaims(cl);
                sendButton.setEnabled(false);
                chp.getCurrentClaimsTableModel();
                JOptionPane.showMessageDialog(this, "Forms sent", "Forms sent", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (user instanceof RegistrationHandler) 
            {
                RegistrationHandlerPanel rhp = (RegistrationHandlerPanel)parent;
                if (e.getActionCommand().equals("Approve")) {
                    cl.getClaimList().get(claim.getId()).setStatus(Claim.ClaimStatus.Registered);
                    DatabaseControl.writeAllClaims(cl);
                    rhp.waitingClaimList.getClaimList().remove(claim.getId());
                }
                else 
                {
                    cl.getClaimList().get(claim.getId()).setStatus(Claim.ClaimStatus.WaitingForms);
                    DatabaseControl.writeAllClaims(cl);
                    rhp.waitingClaimList.getClaimList().remove(claim.getId());

                }
                JOptionPane.showMessageDialog(this, "Forms sent", "Forms sent", JOptionPane.INFORMATION_MESSAGE);
                sendButton.setEnabled(false);
                sendBackButton.setEnabled(false);
                rhp.getReportedClaimsTableModel();
                rhp.getClaimsWaitingFormsTableModel();
            }
            else //ClaimHandler
            {
                ClaimHandlerPanel chp = (ClaimHandlerPanel)parent;
                if (e.getActionCommand().equals("Approve")) {
                    cl.getClaimList().get(claim.getId()).setStatus(Claim.ClaimStatus.ApprovedPendingPayment);
                    
                    Email mail = new Email();
                    mail.setFrom(claim.getClaimHandler().getEmail());
                    mail.setTo(claim.getGarage().getEmail()+", "+claim.getOwner().getEmail());
                    mail.setSubject("Repair Order");
                    mail.setText("Repairs for claim from "+claim.getOwner().getName()+" "+claim.getOwner().getSurname()+" regarding the damages dated "+ claim.getDateOfCrash().get(Calendar.DATE)+"/"+claim.getDateOfCrash().get(Calendar.MONTH)+"/"+claim.getDateOfCrash().get(Calendar.YEAR) +" should be started.");
                    mail.send();
                    cl.getClaimList().get(claim.getId()).getEmailsList().add(mail);
                    
                    DatabaseControl.writeAllClaims(cl);
                    
//                   cc.notifyGarage(claim);
                }
                else {
                    cl.getClaimList().get(claim.getId()).setStatus(Claim.ClaimStatus.Rejected);
                    DatabaseControl.writeAllClaims(cl);
                }
                sendButton.setEnabled(false);
                sendBackButton.setEnabled(false);
                chp.getAvailableClaimsTableModel();
                chp.getTakenClaimsTableModel();
                
                
                LetterPane lp = new LetterPane(claim);
                JDialog dialog = lp.createDialog(this, "Enter customized letter");
                dialog.setVisible(true);
                Object o = lp.getValue();
                while(!o.equals("Send"))
                {
                    dialog.setVisible(true);
                    o = lp.getValue();
                }
                String subject = "Decision of your claim dated "+claim.getDateOfCrash().get(Calendar.DATE)+"/"+claim.getDateOfCrash().get(Calendar.MONTH)+"/"+claim.getDateOfCrash().get(Calendar.YEAR);
                Email email = new Email(claim.getClaimHandler().getEmail(), claim.getOwner().getEmail(), subject, lp.getText());
                cl.getClaimList().get(claim.getId()).getEmailsList().add(email);
                DatabaseControl.writeAllClaims(cl);
                System.out.println(lp.getText());
            }
        }
        catch (IOException ex) 
        {
            Logger.getLogger(FormPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(FormPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private class LetterPane extends JOptionPane
    {
        Claim claim;
        JTextArea textArea;
        String send;
        Object[] myOptions = new Object[2];
        public LetterPane(Claim c)
        {
            super("Enter customized decision letter", JOptionPane.QUESTION_MESSAGE);
            this.claim = c;
            textArea = new JTextArea(10, 20);
            send = "Send";
            myOptions[0] = textArea;
            myOptions[1] = send;
            super.setOptions(myOptions);
            //super.setWantsInput(true);
        }
        private String getText()
        {
            return textArea.getText();
        }
    }
}
