/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginGUI.java
 *
 * Created on Aug 2, 2014, 8:33:54 AM
 */
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Adithya
 */
public class LoginGUI extends javax.swing.JFrame {

    /** Creates new form LoginGUI */
    public LoginGUI() {
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

        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        useridTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setText("User ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        useridTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(useridTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 136, -1));
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 136, -1));

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 88, 34));

        SignUpButton.setBackground(new java.awt.Color(255, 255, 255));
        SignUpButton.setText("Sign Up");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 116, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banner-online.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 690, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MMM.JPG"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 220, 230));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/books.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/asdfg.JPG"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 220, 230));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banner-online (1).jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 690, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        // TODO add your handling code here:
        new SignUpGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        String userid, password;
        userid = useridTextField.getText();
        password = PasswordField.getText();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
            Statement st = con.createStatement();
            String SQL = "SELECT * FROM SIGNUP "
                    + "WHERE USERID ='" + userid + "'";
            ResultSet rs = st.executeQuery(SQL);

            if (rs.next()) {
                String uid = rs.getString("USERID"), pswd = rs.getString("PASSWORD");
                if (userid.equals(uid)) {
                    String useid = "customers";
                    if (password.equals(pswd)) {
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Password!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "UserID incorrect!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No UserID found Please SIGNUP!");
            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERROR! " + e.getMessage());
            System.exit(0);
        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void useridTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    Class.forName("java.sql.DriverManager");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                new LoginGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField useridTextField;
    // End of variables declaration//GEN-END:variables
}