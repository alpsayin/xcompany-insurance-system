/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TopPanel.java
 *
 * Created on 22.Eki.2011, 17:23:52
 */

package xcompany.userInterface;

/**
 *
 * @author Mert
 */
public class TopPanel extends javax.swing.JPanel {

    /** Creates new form TopPanel */
    public TopPanel(String username, String name, String type) {
        initComponents();
        labelNameSurname.setText(name);
        labelUsername.setText(username);
        labelUserType.setText(type);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUsername = new javax.swing.JLabel();
        labelNameSurname = new javax.swing.JLabel();
        labelUserType = new javax.swing.JLabel();
        buttonLogout = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(198, 212, 225));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(68, 116, 157), 1, true));
        setForeground(new java.awt.Color(235, 231, 224));
        setMinimumSize(new java.awt.Dimension(600, 0));
        setPreferredSize(new java.awt.Dimension(600, 78));

        labelUsername.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelUsername.setForeground(new java.awt.Color(51, 51, 51));
        labelUsername.setText("jLabel1");

        labelNameSurname.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelNameSurname.setForeground(new java.awt.Color(51, 51, 51));
        labelNameSurname.setText("jLabel1");

        labelUserType.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        labelUserType.setForeground(new java.awt.Color(51, 51, 51));
        labelUserType.setText("jLabel1");

        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNameSurname)
                    .addComponent(labelUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUserType)
                .addGap(341, 341, 341)
                .addComponent(buttonEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLogout)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNameSurname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUsername)
                            .addComponent(labelUserType)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonLogout)
                        .addComponent(buttonEdit)))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JLabel labelNameSurname;
    private javax.swing.JLabel labelUserType;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration//GEN-END:variables

}
