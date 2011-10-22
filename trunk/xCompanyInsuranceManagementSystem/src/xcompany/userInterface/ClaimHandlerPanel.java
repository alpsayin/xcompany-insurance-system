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

import java.io.IOException;
import javax.swing.JTable;
import xcompany.control.DatabaseControl;
import xcompany.lists.ClaimList;
import xcompany.structures.Claim;
import xcompany.structures.User;

/**
 *
 * @author Mert
 */
public class ClaimHandlerPanel extends javax.swing.JPanel {

    User user = null;
    /** Creates new form ClaimHandlerPanel */
    public ClaimHandlerPanel(User user) throws IOException, ClassNotFoundException {
        initComponents();
        this.user = user;
        updateTableAvailableClaims();
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

        setMinimumSize(new java.awt.Dimension(600, 450));
        setPreferredSize(new java.awt.Dimension(600, 450));

        tableAvailableClaims.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Customer", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAvailableClaims.setColumnSelectionAllowed(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableAvailableClaims;
    // End of variables declaration//GEN-END:variables

    private void updateTableAvailableClaims() throws IOException, ClassNotFoundException{
        ClaimList claimList = DatabaseControl.getAllClaims();
        Object [][] tableData = new Object[claimList.getClaimList().keySet().size()][3];
        String columnNames[] = {"Id", "Customer", "Description"};
        int index = 0;
        for(int key : claimList.getClaimList().keySet()){
            Claim c = claimList.get(key);
            tableData[index][0] = c.getId();
            tableData[index][1] = c.getOwner().getName() + " " + c.getOwner().getSurname();
            tableData[index][2] = c.getDescription();
            index++;
        }
        tableAvailableClaims = new JTable(tableData,columnNames);
    }


}