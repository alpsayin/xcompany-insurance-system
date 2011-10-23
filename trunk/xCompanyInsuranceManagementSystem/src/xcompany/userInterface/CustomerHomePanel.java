/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CustomerHomePanel.java
 *
 * Created on 18.Eki.2011, 03:08:34
 */

package xcompany.userInterface;

import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.util.Locale;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
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
    
    ClaimList claimListCurrent;
    
    Claim selectedClaim;
    /** Creates new form CustomerHomePanel */
    public CustomerHomePanel(User user) throws IOException, ClassNotFoundException {
        this.user = user;
        
        claimListCurrent = DatabaseControl.getUserClaims(user.getUsername());
        
        
        TopPanel topPanel = new TopPanel(user.getName()+" "+user.getSurname(), user.getUsername(), "Customer");
        
        initComponents();
        
        panelTop.setLayout(new BorderLayout());
        panelTop.removeAll();
        panelTop.add(topPanel);
        panelTop.revalidate();
        validate();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCurrentClaims = new javax.swing.JTable();
        panelCurrentClaimDetails = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2Description)
                    .addComponent(jScrollPane1Description, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2DateofCrash)
                    .addComponent(calendarCrash, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1SubmitClaim)
                .addGap(114, 114, 114))
        );

        jTabbedPane1.addTab("Create a Claim", jPanel1);

        tableCurrentClaims.setModel(new MyTableModel(claimListCurrent));
        tableCurrentClaims.getSelectionModel().addListSelectionListener(new RowListener());
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Claim History", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Messages", jPanel4);

        panelTop.setPreferredSize(new java.awt.Dimension(631, 56));

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
                    .addComponent(panelTop, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SubmitClaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SubmitClaimActionPerformed
        try {
            Claim c = new Claim((Customer) user, textAreaDesc.getText(), calendarCrash.getCalendar());
            cc.add(c);
            


        } catch (IOException ex) {
            Logger.getLogger(CustomerHomePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerHomePanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1SubmitClaimActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar calendarCrash;
    private javax.swing.JButton jButton1SubmitClaim;
    private javax.swing.JLabel jLabel2DateofCrash;
    private javax.swing.JLabel jLabel2Description;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1Description;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelCurrentClaimDetails;
    private javax.swing.JPanel panelTop;
    private javax.swing.JTable tableCurrentClaims;
    private javax.swing.JTextArea textAreaDesc;
    // End of variables declaration//GEN-END:variables


    private class RowListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {


            if (event.getValueIsAdjusting()) {
                return;
            }
            else{
                
                Claim c = getClaimAtSelectedRow(claimListCurrent, tableCurrentClaims);
                if(c.getStatus().equals(ClaimStatus.WaitingForms)){
                    FormPanel fp = new FormPanel(user, c,true);
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

    class MyTableModel extends AbstractTableModel{

        String columnNames[] = {"Id", "Description", "Status"};
        ClaimList claimList;

        public MyTableModel(ClaimList claimList) {
            super();
            this.claimList = claimList;

        }

        @Override
        public int getRowCount() {
            return claimList.getClaimList().keySet().size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return columnNames[columnIndex];
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Object[] idArray = claimList.getClaimList().keySet().toArray();
            Claim c = claimList.getClaimList().get(Integer.parseInt(idArray[rowIndex].toString()));
            Object result;
            switch (columnIndex) {
                case 0:
                    result = c.getId();
                    break;

                case 1:
                    result = c.getDescription();
                    break;
                case 2:
                    result = c.getStatus().toString();
                    break;
                default:
                    result = null;
            }
            return result;
        }



    }


}
