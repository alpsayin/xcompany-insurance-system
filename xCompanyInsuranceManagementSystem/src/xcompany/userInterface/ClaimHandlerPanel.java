/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClaimHandlerPanel.java
 *
 * Created on 22.Eki.2011, 17:53:29
 */

package xcompany.userInterface;

import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import xcompany.control.DatabaseControl;
import xcompany.lists.ClaimList;
import xcompany.structures.Claim;
import xcompany.structures.User;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import xcompany.control.ClaimControl;
import xcompany.structures.Claim.ClaimStatus;
import xcompany.structures.ClaimHandler;
/**
 *
 * @author Mert
 */
public class ClaimHandlerPanel extends javax.swing.JPanel {

    User user = null;
    ClaimControl cc = new ClaimControl();
    
    ClaimList claimListAvailableToHandle;
    FormPanel formPanel;
    
    /** Creates new form ClaimHandlerPanel */
    public ClaimHandlerPanel(User user) throws IOException, ClassNotFoundException {
        claimListAvailableToHandle = DatabaseControl.getClaimsByStatus(ClaimStatus.Registered);


        initComponents();

        this.user = user;

        

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAvailableClaims = new javax.swing.JTable();
        buttonTakeClaim = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(600, 450));
        setPreferredSize(new java.awt.Dimension(600, 450));

        tableAvailableClaims.setModel(new MyTableModel(claimListAvailableToHandle));
        tableAvailableClaims.getSelectionModel().addListSelectionListener(new RowListener());
        tableAvailableClaims.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableAvailableClaims);

        buttonTakeClaim.setText("Take Claim");
        buttonTakeClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTakeClaimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addComponent(buttonTakeClaim, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTakeClaim)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Available Claims", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTakeClaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTakeClaimActionPerformed
        int row = tableAvailableClaims.getSelectedRow();
        if(row != -1){
            try {
                int id = Integer.parseInt(tableAvailableClaims.getValueAt(row, 0).toString());
                Claim c = claimListAvailableToHandle.get(id);
                boolean result = cc.assignClaimHandler(c, (ClaimHandler)user);
                if (result){
                    System.out.println("Claim is assigned");
                    claimListAvailableToHandle.getClaimList().remove(id);
                    tableAvailableClaims.setModel(new MyTableModel(claimListAvailableToHandle));
                    
                }
            } catch (Exception ex) {
                Logger.getLogger(ClaimHandlerPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
        }
        else{
            
        }
    }//GEN-LAST:event_buttonTakeClaimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonTakeClaim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableAvailableClaims;
    // End of variables declaration//GEN-END:variables


    private Claim getClaimAtSelectedRow(){
        int row = tableAvailableClaims.getSelectedRow();
        int id = Integer.parseInt(tableAvailableClaims.getValueAt(row, 0).toString());
        return claimListAvailableToHandle.get(id);
    }

    private class RowListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()) {
                return;
            }


//          formPanel = new FormPanel(user, getClaimAtSelectedRow());
//          add(formPanel);
            System.out.println("Row selected");
        }
    }
    class MyTableModel extends AbstractTableModel{

        String columnNames[] = {"Id", "Customer", "Description"};
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
                    result = c.getOwner().getName() + " " + c.getOwner().getSurname();
                    break;
                case 2:
                    result = c.getDescription();
                    break;
                default:
                    result = null;
            }
            return result;
        }
        
       

    }
}
