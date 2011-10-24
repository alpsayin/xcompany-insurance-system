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

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import xcompany.control.DatabaseControl;
import xcompany.lists.ClaimList;
import xcompany.structures.Claim;
import xcompany.structures.User;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
    ClaimList claimListTaken;
    
    ClaimHandlerPanel me;
    /** Creates new form ClaimHandlerPanel */
    public ClaimHandlerPanel(User user) throws IOException, ClassNotFoundException {

        this.user = user;

        claimListAvailableToHandle = DatabaseControl.getClaimsByStatus(ClaimStatus.Registered);
        claimListTaken = DatabaseControl.getClaimsOfHandler(user.getUsername());

        initComponents();

        topPanel.setLayout(new BorderLayout());
        topPanel.add(new TopPanel(user.getName()+ " " + user.getSurname(), user.getUsername(), "Claim Handler"));
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAvailableClaims = new javax.swing.JTable(){
            @Override public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        }
        ;
        buttonTakeClaim = new javax.swing.JButton();
        panelCurrentClaimDetails = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelTakenClaims = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTaken = new javax.swing.JTable(){
            @Override public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        panelDetails = new javax.swing.JPanel();
        adviceLabel = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(600, 450));
        setPreferredSize(new java.awt.Dimension(600, 450));

        tableAvailableClaims.setModel(getAvailableClaimsTableModel());
        tableAvailableClaims.getSelectionModel().addListSelectionListener(new AvailableRowListener());
        tableAvailableClaims.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableAvailableClaims.getTableHeader().setReorderingAllowed(false);
        tableAvailableClaims.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableAvailableClaims);

        buttonTakeClaim.setText("Take Claim");
        buttonTakeClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTakeClaimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurrentClaimDetailsLayout = new javax.swing.GroupLayout(panelCurrentClaimDetails);
        panelCurrentClaimDetails.setLayout(panelCurrentClaimDetailsLayout);
        panelCurrentClaimDetailsLayout.setHorizontalGroup(
            panelCurrentClaimDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        panelCurrentClaimDetailsLayout.setVerticalGroup(
            panelCurrentClaimDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCurrentClaimDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonTakeClaim, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTakeClaim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCurrentClaimDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Available Claims", jPanel1);

        tableTaken.setModel(getTakenClaimsTableModel());
        tableTaken.getSelectionModel().addListSelectionListener(new TakenRowListener());
        tableTaken.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableTaken.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableTaken);

        javax.swing.GroupLayout panelDetailsLayout = new javax.swing.GroupLayout(panelDetails);
        panelDetails.setLayout(panelDetailsLayout);
        panelDetailsLayout.setHorizontalGroup(
            panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        panelDetailsLayout.setVerticalGroup(
            panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        adviceLabel.setText("Advice");

        javax.swing.GroupLayout panelTakenClaimsLayout = new javax.swing.GroupLayout(panelTakenClaims);
        panelTakenClaims.setLayout(panelTakenClaimsLayout);
        panelTakenClaimsLayout.setHorizontalGroup(
            panelTakenClaimsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTakenClaimsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTakenClaimsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addComponent(adviceLabel))
                .addContainerGap())
        );
        panelTakenClaimsLayout.setVerticalGroup(
            panelTakenClaimsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTakenClaimsLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adviceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTakenClaims, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTakenClaims, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Taken Claims", jPanel2);

        topPanel.setPreferredSize(new java.awt.Dimension(600, 56));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(topPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    getAvailableClaimsTableModel();
                    getTakenClaimsTableModel();
                }
            } catch (Exception ex) {
                Logger.getLogger(ClaimHandlerPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
        }
        else{
            
        }
    }//GEN-LAST:event_buttonTakeClaimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adviceLabel;
    private javax.swing.JButton buttonTakeClaim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelCurrentClaimDetails;
    private javax.swing.JPanel panelDetails;
    private javax.swing.JPanel panelTakenClaims;
    private javax.swing.JTable tableAvailableClaims;
    private javax.swing.JTable tableTaken;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables

    public TableModel getAvailableClaimsTableModel()
    {
        updateAvailableClaims();
        String columnNames[] = {"Id", "Customer", "Description"};
        DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
        for(Claim c :  claimListAvailableToHandle.getClaimList().values())
        {
            Vector<String> v = new Vector<String>();
            v.add(""+c.getId());
            v.add(c.getOwner().getName()+" "+c.getOwner().getSurname());
            v.add(c.getDescription());
            dtm.addRow(v);
        }
        tableAvailableClaims.setModel(dtm);
        return dtm;
    }
    public TableModel getTakenClaimsTableModel()
    {
        updateTakenClaims();
        String columnNames[] = {"Id", "Customer", "Description"};
        DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
        for(Claim c : claimListTaken.getClaimList().values())
        {
            Vector<String> v = new Vector<String>();
            v.add(""+c.getId());
            v.add(c.getOwner().getName()+" "+c.getOwner().getSurname());
            v.add(c.getDescription());
            dtm.addRow(v);
        }
        tableTaken.setModel(dtm);
        return dtm;
    }

    private Claim getClaimAtSelectedRow(ClaimList c, JTable jt){
        int row = jt.getSelectedRow();
        int id = Integer.parseInt(jt.getValueAt(row, 0).toString());
        return c.get(id);
    }
    private void updateAvailableClaims()
    {
        try
        {
            claimListAvailableToHandle = DatabaseControl.getClaimsByStatus(ClaimStatus.Registered);
        }
        catch (IOException ex)
        {
            Logger.getLogger(ClaimHandlerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(ClaimHandlerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void updateTakenClaims()
    {
        try
        {
            claimListTaken = DatabaseControl.getClaimsOfHandler(user.getUsername());
        }
        catch (IOException ex)
        {
            Logger.getLogger(ClaimHandlerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(ClaimHandlerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private class TakenRowListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {

       if (event.getValueIsAdjusting()) {
                return;
            }
            else{
                int row = event.getFirstIndex();
                if (row<0 || row>=claimListTaken.getClaimList().size()){
                    return;
                }
                Claim c = getClaimAtSelectedRow(claimListTaken,tableTaken );
                //selectedClaim = c;
                
                adviceLabel.setText(cc.getAdvice(c));
                FormPanel fp = new FormPanel(user, c, c.getStatus()==ClaimStatus.Assigned, me);
                panelDetails.setLayout(new BorderLayout());
                panelDetails.removeAll();
                panelDetails.add(fp);
                panelDetails.revalidate();
                validate();

                System.out.println("Row selected");
            }
        }
    }
    private class AvailableRowListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()) {
                return;
            }
            int row = event.getFirstIndex();
            if (row<0 || row>=claimListAvailableToHandle.getClaimList().size()){
                return;
            }
            Claim c = getClaimAtSelectedRow(claimListAvailableToHandle, tableAvailableClaims);
            
            FormPanel fp = new FormPanel(user, c,false, null);
            panelCurrentClaimDetails.setLayout(new BorderLayout());
            panelCurrentClaimDetails.removeAll();
            panelCurrentClaimDetails.add(fp);
            panelCurrentClaimDetails.revalidate();
            validate();

            System.out.println("Row selected");
        }
    }
}