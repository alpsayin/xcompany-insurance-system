/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CustomerHomePanel.java
 *
 * Created on 18.Eki.2011, 03:08:3
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        }
 */

package xcompany.userInterface;

import java.awt.BorderLayout;
import java.util.Locale;
import java.io.IOException;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import xcompany.control.ClaimControl;
import xcompany.control.DatabaseControl;
import xcompany.structures.*;
import xcompany.lists.*;
import xcompany.structures.Claim.ClaimStatus;
/**
 *
 * @author Mert
 */
public class CustomerHomePanel extends javax.swing.JPanel {

    User user;
    ClaimControl cc = new ClaimControl();
    
    EmailList emailList;
    
    ClaimList claimListCurrent;
    
    Claim selectedClaim;
    
    GarageList garageList;
    
    CustomerHomePanel me;
    /** Creates new form CustomerHomePanel */
    public CustomerHomePanel(User user) throws IOException, ClassNotFoundException {
        this.user = user;
        
        claimListCurrent = DatabaseControl.getUserClaims(user.getUsername());
        
        garageList = DatabaseControl.getAllGarages();
        
        emailList = new EmailList();
        
        TopPanel topPanel = new TopPanel(user.getName()+" "+user.getSurname(), user.getUsername(), "Customer");
        
        initComponents();
        
        panelTop.setLayout(new BorderLayout());
        panelTop.removeAll();
        panelTop.add(topPanel);
        panelTop.revalidate();
        validate();
        
        me = this;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2Description = new javax.swing.JLabel();
        jScrollPane1Description = new javax.swing.JScrollPane();
        textAreaDesc = new javax.swing.JTextArea();
        jLabel2DateofCrash = new javax.swing.JLabel();
        jButton1SubmitClaim = new javax.swing.JButton();
        calendarCrash = new com.toedter.calendar.JCalendar(Locale.US);
        jLabel4 = new javax.swing.JLabel();
        damageField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        garageComboBox = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCurrentClaims = new javax.swing.JTable()
        {
            @Override public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        panelCurrentClaimDetails = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable(){
            @Override public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        jScrollPane3 = new javax.swing.JScrollPane();
        claimInfoTable = new javax.swing.JTable(){
            @Override public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        }
        ;
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        emailTable = new javax.swing.JTable(){
            @Override public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        jLabel1 = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textTextArea = new javax.swing.JTextArea();
        panelTop = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(600, 450));

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(600, 0));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 0));

        jLabel2Description.setText("Description:");

        textAreaDesc.setColumns(20);
        textAreaDesc.setRows(5);
        jScrollPane1Description.setViewportView(textAreaDesc);

        jLabel2DateofCrash.setText("Date of Crash:");

        jButton1SubmitClaim.setText("Submit");
        jButton1SubmitClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SubmitClaimActionPerformed(evt);
            }
        });

        jLabel4.setText("Cost of Damage:");

        jLabel5.setText("Garage");

        garageComboBox.setModel(getGarageComboBoxModel());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1SubmitClaim)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2Description)
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane1Description, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2DateofCrash, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(calendarCrash, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(garageComboBox, 0, 192, Short.MAX_VALUE)
                    .addComponent(damageField, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(damageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(garageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2Description)
                            .addComponent(jScrollPane1Description, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2DateofCrash)
                            .addComponent(calendarCrash, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1SubmitClaim)))
                .addGap(114, 114, 114))
        );

        jTabbedPane1.addTab("Create a Claim", jPanel1);

        tableCurrentClaims.setModel(getCurrentClaimsTableModel());
        tableCurrentClaims.getSelectionModel().addListSelectionListener(new FormRowListener());
        tableCurrentClaims.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableCurrentClaims.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableCurrentClaims);

        javax.swing.GroupLayout panelCurrentClaimDetailsLayout = new javax.swing.GroupLayout(panelCurrentClaimDetails);
        panelCurrentClaimDetails.setLayout(panelCurrentClaimDetailsLayout);
        panelCurrentClaimDetailsLayout.setHorizontalGroup(
            panelCurrentClaimDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        panelCurrentClaimDetailsLayout.setVerticalGroup(
            panelCurrentClaimDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCurrentClaimDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCurrentClaimDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Send Form", jPanel2);

        historyTable.setModel(getCurrentClaimsTableModel());
        historyTable.getSelectionModel().addListSelectionListener(new HistoryRowListener());
        historyTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        historyTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(historyTable);

        claimInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        historyTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(claimInfoTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Claim History", jPanel3);

        emailTable.setModel(getEmailsTableModel());
        emailTable.getSelectionModel().addListSelectionListener(new EmailsRowListener());
        emailTable.getTableHeader().setReorderingAllowed(false);
        emailTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(emailTable);

        jLabel1.setText("From:");

        jLabel2.setText("To:");

        jLabel3.setText("Subject:");

        textTextArea.setColumns(20);
        textTextArea.setLineWrap(true);
        textTextArea.setRows(5);
        jScrollPane5.setViewportView(textTextArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subjectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                            .addComponent(toLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(fromLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(subjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Messages", jPanel4);

        panelTop.setPreferredSize(new java.awt.Dimension(631, 56));

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTop, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SubmitClaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SubmitClaimActionPerformed
        try {
            double damage = -1;
            try
            {
                damage = Double.parseDouble(damageField.getText());
                if(damage <= 0)
                    throw new Exception();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Please enter a real damage", "Incorrect Damage", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Claim c = new Claim((Customer) user, textAreaDesc.getText(), calendarCrash.getCalendar());
            Garage g = garageList.getGarageList().get(garageComboBox.getSelectedIndex());
            c.setGarage(g);
            
            c.setDamage(damage);
            if(cc.checkInsurance(c)){
                cc.add(c);
            }
            else{
                JOptionPane.showMessageDialog(this, "Please renew your insurance from our agencies", "Insurance Expired or Exceeded", JOptionPane.ERROR_MESSAGE);
            }
            
            
            claimListCurrent.add(c);
            getCurrentClaimsTableModel();

            textAreaDesc.setText("");
            JOptionPane.showMessageDialog(this, "Submitted", "Submitted new claim", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(CustomerHomePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerHomePanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1SubmitClaimActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar calendarCrash;
    private javax.swing.JTable claimInfoTable;
    private javax.swing.JTextField damageField;
    private javax.swing.JTable emailTable;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JComboBox garageComboBox;
    private javax.swing.JTable historyTable;
    private javax.swing.JButton jButton1SubmitClaim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2DateofCrash;
    private javax.swing.JLabel jLabel2Description;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane1Description;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelCurrentClaimDetails;
    private javax.swing.JPanel panelTop;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTable tableCurrentClaims;
    private javax.swing.JTextArea textAreaDesc;
    private javax.swing.JTextArea textTextArea;
    private javax.swing.JLabel toLabel;
    // End of variables declaration//GEN-END:variables
    public TableModel getCurrentClaimsTableModel()
    {
        updateClaimList();
        String columnNames[] = {"Id", "Description", "Status"};
        DefaultTableModel dtm = new DefaultTableModel(columnNames,0);
        for(Claim c : claimListCurrent.getClaimList().values())
        {
            Vector<String> row = new Vector<String>();
            row.add(""+c.getId());
            row.add(c.getDescription());
            row.add(c.getStatus().toString());
            dtm.addRow(row);
        }
        tableCurrentClaims.setModel(dtm);
        historyTable.setModel(dtm);
        return dtm;
    }
    private TableModel getEmailsTableModel()
    {
        String columnNames[] = {"From", "To", "Subject"};
        DefaultTableModel dtm = new DefaultTableModel(columnNames,0);
        for(Claim c : claimListCurrent.getClaimList().values())
        {
            for(Email e : c.getEmailsList().getEmailList())
            {
                emailList.add(e);
                Vector<String> row = new Vector<String>();
                row.add(e.getFrom());
                row.add(e.getTo());
                row.add(e.getSubject());
                dtm.addRow(row);
            }
        }
        emailTable.setModel(dtm);
        return dtm;
    }
    private void updateClaimList()
    {
        try
        {
            claimListCurrent = DatabaseControl.getUserClaims(user.getUsername());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private ComboBoxModel getGarageComboBoxModel()
    {
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        for(Garage g : garageList.getGarageList())
        {
            dcbm.addElement(g.getName());
        }
        garageComboBox.setModel(dcbm);
        return dcbm;
    }
    private class EmailsRowListener implements ListSelectionListener
    {
        @Override
        public void valueChanged(ListSelectionEvent e)
        {
            if(e.getValueIsAdjusting())
                return;
            
            int row = emailTable.getSelectedRow();
            if(row<0 || row>=emailList.getEmailList().size())
                return;
            textTextArea.setEditable(true);
            Email email = emailList.getEmailList().get(row);
            fromLabel.setText(email.getFrom());
            toLabel.setText(email.getTo());
            subjectLabel.setText(email.getSubject());
            textTextArea.setText(email.getText());
            textTextArea.setEditable(false);
        }
    }
    private class HistoryRowListener implements ListSelectionListener
    {
        @Override
        public void valueChanged(ListSelectionEvent e)
        {
            if(e.getValueIsAdjusting())
                return;
            Claim c = getClaimAtSelectedRow(claimListCurrent, historyTable);
            String[] cols = {"Info", "Value" };
            DefaultTableModel dtm = new DefaultTableModel(cols, 0);
            Vector<String> row = new Vector<String>();
            row.add("Id");
            row.add(c.getId()+"");
            dtm.addRow(row);
            row = new Vector<String>();
            row.add("Date");
            row.add(c.getDateOfCrash().get(Calendar.DATE)+"/"+c.getDateOfCrash().get(Calendar.MONTH)+"/"+c.getDateOfCrash().get(Calendar.YEAR));
            dtm.addRow(row);
            row = new Vector<String>();
            row.add("Damage");
            row.add(c.getDamage()+"");
            dtm.addRow(row);
            row = new Vector<String>();
            row.add("Status");
            row.add(c.getStatus().toString());
            dtm.addRow(row);
            row = new Vector<String>();
            row.add("Garage");
            if(c.getGarage()!=null)
                row.add(c.getGarage().toString());
            else
                row.add("N/A");
            dtm.addRow(row);
            row = new Vector<String>();
            row.add("Claim Handler");
            if(c.getClaimHandler()!=null)
                row.add(c.getClaimHandler().getName()+" "+c.getClaimHandler().getSurname());
            else
                row.add("N/A");
            dtm.addRow(row);
            row = new Vector<String>();
            row.add("Financial Handler");
            if(c.getFinancer()!=null)
                row.add(c.getFinancer().getName()+" "+c.getFinancer().getSurname());
            else
                row.add("N/A");
            dtm.addRow(row);
            row = new Vector<String>();
            claimInfoTable.setModel(dtm);
        }
    
    }

    private class FormRowListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {


            if (event.getValueIsAdjusting()) {
                return;
            }
            else{
                
                if(event.getLastIndex()>=claimListCurrent.getClaimList().size() || event.getFirstIndex()<0)
                    return;
                Claim c = getClaimAtSelectedRow(claimListCurrent, tableCurrentClaims);
                if(c.getStatus().equals(ClaimStatus.WaitingForms)){
                    FormPanel fp = new FormPanel(user, c,true, me);
                    panelCurrentClaimDetails.setLayout(new BorderLayout());
                    panelCurrentClaimDetails.removeAll();
                    panelCurrentClaimDetails.add(fp);
                    panelCurrentClaimDetails.revalidate();
                    validate();
                }
                else{
                  /*
                    SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
                    panelCurrentClaimDetails.setLayout(new BorderLayout());
                    panelCurrentClaimDetails.removeAll();
                    panelCurrentClaimDetails.add(new JLabel("Date"));
                    panelCurrentClaimDetails.add(new JLabel(sdf.format(c.getDateOfCrash().getTime())));
                    panelCurrentClaimDetails.add(new JLabel("Description"));
                    panelCurrentClaimDetails.add(new JLabel(c.getDescription()));

                    panelCurrentClaimDetails.revalidate();
                    validate();
                  */
                      panelCurrentClaimDetails.removeAll();
                    
                    panelCurrentClaimDetails.revalidate();
                    validate();
                }
                System.out.println("Row selected");
            }
        }
    }
    private Claim getClaimAtSelectedRow(ClaimList c, JTable jt){
        int row = jt.getSelectedRow();
        int id = Integer.parseInt(jt.getValueAt(row, 0).toString());
        return c.get(id);
    }


}
