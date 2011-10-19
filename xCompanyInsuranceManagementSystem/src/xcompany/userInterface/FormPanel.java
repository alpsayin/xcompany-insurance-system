/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.userInterface;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import xcompany.structures.form.Form;
import xcompany.structures.form.FormFactory;

/**
 *
 * @author Alp Sayin
 */
public class FormPanel extends JPanel
{
    ArrayList<JLabel> fields;
    ArrayList<JTextArea> values; 
    JButton sendButton;
    public FormPanel(Form form)
    {
        sendButton = new JButton("");
        fields = new ArrayList<JLabel>();
        values = new ArrayList<JTextArea>();
        for(String field : form.getFields().keySet())
        {
            JLabel fieldLabel = new JLabel(field);
            JTextArea valueField = new JTextArea(form.getFields().get(field));
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
    public static void main(String args[])
    {
        JFrame f = new JFrame();
        Form form = FormFactory.createComplexFormInstance();
        f.add(new FormPanel(form));
        f.setVisible(true);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
