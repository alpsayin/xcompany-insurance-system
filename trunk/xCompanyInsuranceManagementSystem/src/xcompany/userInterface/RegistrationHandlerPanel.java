/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RegistrationHandlerPanel.java
 *
 * Created on 22.Eki.2011, 23:08:37
 */

package xcompany.userInterface;

import java.awt.BorderLayout;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import xcompany.control.*;
import xcompany.structures.*;
import xcompany.lists.*;
import xcompany.structures.Claim.ClaimStatus;
import xcompany.structures.Claim.ClaimType;
import xcompany.structures.form.*;

/**
 *
 * @author Mert
 */
public class RegistrationHandlerPanel extends javax.swing.JPanel {

    ClaimList reportedClaimList;
    ClaimList waitingClaimList;
    ClaimControl cc = new ClaimControl();
    User user;
    /** Creates new form RegistrationHandlerPanel */
    public RegistrationHandlerPanel(User user) throws IOException, ClassNotFoundException {
        reportedClaimList = DatabaseControl.getClaimsByStatus(ClaimStatus.Reported);
        waitingClaimList = DatabaseControl.getClaimsByStatus(ClaimStatus.SentBack);
        
        this.user = user;
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

        buttonGroupClaimCategory = new javax.swing.ButtonGroup();
        panelTop = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScroll = new javax.swing.JScrollPane();
        tableReportedClaims = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelCustomerNameSurname = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radioButtonSimple = new javax.swing.JRadioButton();
        radioButtonComplex = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelDescription = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableWaiting = new javax.swing.JTable();
        panelWaitingDetails = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(600, 0));

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        tableReportedClaims.setModel(new MyTableModel(reportedClaimList));
        tableReportedClaims.getSelectionModel().addListSelectionListener(new RowListener());
        jScroll.setViewportView(tableReportedClaims);

        jLabel1.setText("Customer:");

        jLabel2.setText("Date:");

        jLabel3.setText("Description:");

        jLabel4.setText("Choose Type:");

        buttonGroupClaimCategory.add(radioButtonSimple);
        radioButtonSimple.setSelected(true);
        radioButtonSimple.setText("Simple");

        buttonGroupClaimCategory.add(radioButtonComplex);
        radioButtonComplex.setText("Complex");

        jButton1.setText("Send Form");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelDescription.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelDescription.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(labelDescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDate)
                            .addComponent(labelCustomerNameSurname)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioButtonSimple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioButtonComplex))
                    .addComponent(jButton1))
                .addGap(296, 296, 296))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labelCustomerNameSurname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDate)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioButtonSimple)
                    .addComponent(radioButtonComplex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addComponent(jScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reported Claims", jPanel1);

        tableWaiting.setModel(new MyTableModel(waitingClaimList));
        tableWaiting.getSelectionModel().addListSelectionListener(new RowListener2());
        jScrollPane3.setViewportView(tableWaiting);

        javax.swing.GroupLayout panelWaitingDetailsLayout = new javax.swing.GroupLayout(panelWaitingDetails);
        panelWaitingDetails.setLayout(panelWaitingDetailsLayout);
        panelWaitingDetailsLayout.setHorizontalGroup(
            panelWaitingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        panelWaitingDetailsLayout.setVerticalGroup(
            panelWaitingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelWaitingDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelWaitingDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Claims Waiting Forms", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ClaimType claimType;
            Form form;
            if (radioButtonComplex.isSelected()) {
                claimType = ClaimType.ComplexClaim;
                form = FormFactory.createComplexFormInstance();
            } else  {
                claimType = ClaimType.SimpleClaim;
                form = FormFactory.createSimpleFormInstance();
            }

            ClaimList claimList = DatabaseControl.getAllClaims();
            int id = getClaimAtSelectedRow(reportedClaimList, tableReportedClaims).getId();


            claimList.get(id).setForm(form);
            claimList.get(id).setType(claimType);
            claimList.get(id).setStatus(ClaimStatus.WaitingForms);
            DatabaseControl.writeAllClaims(claimList);

            reportedClaimList.getClaimList().remove(id);
            tableReportedClaims.setModel(new MyTableModel(reportedClaimList));

        } catch (IOException ex) {
            Logger.getLogger(RegistrationHandlerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationHandlerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        




    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupClaimCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScroll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelCustomerNameSurname;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JPanel panelTop;
    private javax.swing.JPanel panelWaitingDetails;
    private javax.swing.JRadioButton radioButtonComplex;
    private javax.swing.JRadioButton radioButtonSimple;
    private javax.swing.JTable tableReportedClaims;
    private javax.swing.JTable tableWaiting;
    // End of variables declaration//GEN-END:variables


    
    private class RowListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {
        
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
          
            if (event.getValueIsAdjusting()) {
                return;
            }
          
            Claim c = getClaimAtSelectedRow(reportedClaimList, tableReportedClaims);
            labelCustomerNameSurname.setText(c.getOwner().getName() + " " + c.getOwner().getSurname());
            labelDate.setText(sdf.format(c.getDateOfCrash().getTime()));
            labelDescription.setText(c.getDescription());
            
            System.out.println("Row selected");
        }
   }

    private class RowListener2 implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {
        
       if (event.getValueIsAdjusting()) {
                return;
            }
            else{

                Claim c = getClaimAtSelectedRow(waitingClaimList,tableWaiting );
                //selectedClaim = c;
                FormPanel fp = new FormPanel(user, c,true);
                panelWaitingDetails.setLayout(new BorderLayout());
                panelWaitingDetails.removeAll();
                panelWaitingDetails.add(fp);
                panelWaitingDetails.revalidate();
                validate();

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
