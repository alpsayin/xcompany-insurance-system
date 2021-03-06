/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NotifyFinancer.java
 *
 * Created on Oct 23, 2011, 2:41:44 AM
 */

package xcompany.userInterface;

/**
 *
 * @author Emertat
 */
public class NotifyFinancer extends javax.swing.JPanel {

    /** Creates new form NotifyFinancer */
    public NotifyFinancer() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabelCustomerName = new javax.swing.JLabel();
        jLabelCustomerSurname = new javax.swing.JLabel();
        jLabelCustomerID = new javax.swing.JLabel();
        jLabelCustomerAddress = new javax.swing.JLabel();
        jLabelGarageName = new javax.swing.JLabel();
        jLabelAmount = new javax.swing.JLabel();
        jTextFieldCustomerName = new javax.swing.JTextField();
        jTextFieldCustomerSurname = new javax.swing.JTextField();
        jTextFieldCustomerID = new javax.swing.JTextField();
        jTextFieldCustomerAddress = new javax.swing.JTextField();
        jTextFieldAmount = new javax.swing.JTextField();
        jComboBoxGarageName = new javax.swing.JComboBox();
        jButtonSubmitToFinancer = new javax.swing.JButton();

        jLabelCustomerName.setText("Customer Name");

        jLabelCustomerSurname.setText("Customer Surname");

        jLabelCustomerID.setText("Customer ID");

        jLabelCustomerAddress.setText("Customer Address");

        jLabelGarageName.setText("Garage Name");

        jLabelAmount.setText("Amount");

        jTextFieldCustomerSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerSurnameActionPerformed(evt);
            }
        });

        jComboBoxGarageName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jComboBoxGarageName, org.jdesktop.beansbinding.ObjectProperty.create(), jComboBoxGarageName, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);

        jButtonSubmitToFinancer.setText("Submit");
        jButtonSubmitToFinancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitToFinancerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCustomerName)
                            .addComponent(jLabelCustomerSurname)
                            .addComponent(jLabelCustomerID)
                            .addComponent(jLabelCustomerAddress)
                            .addComponent(jLabelGarageName)
                            .addComponent(jLabelAmount))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldCustomerAddress)
                                .addComponent(jTextFieldCustomerID)
                                .addComponent(jTextFieldCustomerSurname)
                                .addComponent(jTextFieldCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(jComboBoxGarageName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButtonSubmitToFinancer)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCustomerName)
                    .addComponent(jTextFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCustomerSurname)
                    .addComponent(jTextFieldCustomerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCustomerID)
                    .addComponent(jTextFieldCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCustomerAddress)
                    .addComponent(jTextFieldCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGarageName)
                    .addComponent(jComboBoxGarageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAmount))
                .addGap(29, 29, 29)
                .addComponent(jButtonSubmitToFinancer)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCustomerSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerSurnameActionPerformed

    private void jButtonSubmitToFinancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitToFinancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSubmitToFinancerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmitToFinancer;
    private javax.swing.JComboBox jComboBoxGarageName;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelCustomerAddress;
    private javax.swing.JLabel jLabelCustomerID;
    private javax.swing.JLabel jLabelCustomerName;
    private javax.swing.JLabel jLabelCustomerSurname;
    private javax.swing.JLabel jLabelGarageName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldCustomerAddress;
    private javax.swing.JTextField jTextFieldCustomerID;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldCustomerSurname;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
