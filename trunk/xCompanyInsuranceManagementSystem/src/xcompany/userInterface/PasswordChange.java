/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PasswordChange.java
 *
 * Created on Oct 23, 2011, 10:23:12 AM
 */

package xcompany.userInterface;

/**
 *
 * @author Emertat
 */
public class PasswordChange extends javax.swing.JPanel {

    /** Creates new form PasswordChange */
    public PasswordChange() {
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

        jPanelMandatoryChangePass = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldCurrentPassM = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldNewPassM = new javax.swing.JPasswordField();
        jButtonChangePassMandatory = new javax.swing.JButton();
        jPanelVoluntaryChangePass = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldCurrentPassV = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldNewPassV = new javax.swing.JPasswordField();
        jPasswordFieldConfirmNewPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButtonChangePassVoluntary = new javax.swing.JButton();

        jTextField1.setText("Mandatory password Chaneg");

        jLabel2.setText("Current Password");

        jPasswordFieldCurrentPassM.setText("jPasswordField1");

        jLabel3.setText("New Password");

        jPasswordFieldNewPassM.setText("jPasswordField1");

        jButtonChangePassMandatory.setText("Change Password");
        jButtonChangePassMandatory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePassMandatoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMandatoryChangePassLayout = new javax.swing.GroupLayout(jPanelMandatoryChangePass);
        jPanelMandatoryChangePass.setLayout(jPanelMandatoryChangePassLayout);
        jPanelMandatoryChangePassLayout.setHorizontalGroup(
            jPanelMandatoryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMandatoryChangePassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(jPanelMandatoryChangePassLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelMandatoryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanelMandatoryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldNewPassM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldCurrentPassM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
            .addGroup(jPanelMandatoryChangePassLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jButtonChangePassMandatory)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanelMandatoryChangePassLayout.setVerticalGroup(
            jPanelMandatoryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMandatoryChangePassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanelMandatoryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldCurrentPassM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanelMandatoryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldNewPassM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButtonChangePassMandatory)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jLabel1.setText("Voluntary Password Change");

        jLabel4.setText("Current Password");

        jPasswordFieldCurrentPassV.setText("jPasswordField1");

        jLabel5.setText("New Password");

        jPasswordFieldNewPassV.setText("jPasswordField1");

        jPasswordFieldConfirmNewPass.setText("jPasswordField1");

        jLabel6.setText("Confirm New Password");

        jButtonChangePassVoluntary.setText("Change Password");

        javax.swing.GroupLayout jPanelVoluntaryChangePassLayout = new javax.swing.GroupLayout(jPanelVoluntaryChangePass);
        jPanelVoluntaryChangePass.setLayout(jPanelVoluntaryChangePassLayout);
        jPanelVoluntaryChangePassLayout.setHorizontalGroup(
            jPanelVoluntaryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVoluntaryChangePassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVoluntaryChangePassLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelVoluntaryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelVoluntaryChangePassLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldConfirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelVoluntaryChangePassLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldNewPassV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelVoluntaryChangePassLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldCurrentPassV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102))
            .addGroup(jPanelVoluntaryChangePassLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jButtonChangePassVoluntary)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanelVoluntaryChangePassLayout.setVerticalGroup(
            jPanelVoluntaryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVoluntaryChangePassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVoluntaryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordFieldCurrentPassV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVoluntaryChangePassLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)))
                .addGap(34, 34, 34)
                .addGroup(jPanelVoluntaryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordFieldNewPassV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanelVoluntaryChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldConfirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addComponent(jButtonChangePassVoluntary)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanelMandatoryChangePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelVoluntaryChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMandatoryChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelVoluntaryChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangePassMandatoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePassMandatoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonChangePassMandatoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangePassMandatory;
    private javax.swing.JButton jButtonChangePassVoluntary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelMandatoryChangePass;
    private javax.swing.JPanel jPanelVoluntaryChangePass;
    private javax.swing.JPasswordField jPasswordFieldConfirmNewPass;
    private javax.swing.JPasswordField jPasswordFieldCurrentPassM;
    private javax.swing.JPasswordField jPasswordFieldCurrentPassV;
    private javax.swing.JPasswordField jPasswordFieldNewPassM;
    private javax.swing.JPasswordField jPasswordFieldNewPassV;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
