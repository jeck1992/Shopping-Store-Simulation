

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ShoppingGUI.java
 *
 * Created on Aug 25, 2014, 9:51:26 AM
 */
/**
 *
 * @author Adithya
 */
public class ShoppingGUI extends javax.swing.JFrame {

    /** Creates new form ShoppingGUI */
    public ShoppingGUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BooksRadioButton = new javax.swing.JRadioButton();
        ClothingRadioButton = new javax.swing.JRadioButton();
        WatchRadioButton = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(BooksRadioButton);
        BooksRadioButton.setOpaque(false);
        BooksRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BooksRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 310, 230));

        buttonGroup1.add(ClothingRadioButton);
        ClothingRadioButton.setOpaque(false);
        ClothingRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClothingRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ClothingRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 370, 230));

        buttonGroup1.add(WatchRadioButton);
        WatchRadioButton.setOpaque(false);
        WatchRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WatchRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(WatchRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 270, 230));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("search for more items:?");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 206, 170, 20));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to your shopping arena!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose your area you want to shop!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shoppingGuiBook.png"))); // NOI18N
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 246, -1, 227));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/es_interior_1.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 246, 530, 227));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/622x350.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 246, 620, 230));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/xxzz.JPG"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, 110));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banner-online.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 780, 120));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/black.JPG"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 970, 360));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/black.JPG"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 970, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 970, 587));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BooksRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksRadioButtonActionPerformed
        // TODO add your handling code here:
        new BooksGUI().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_BooksRadioButtonActionPerformed

    private void ClothingRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClothingRadioButtonActionPerformed
        // TODO add your handling code here:
        new ClothingGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ClothingRadioButtonActionPerformed

    private void WatchRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WatchRadioButtonActionPerformed
        // TODO add your handling code here:
        new WatchGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_WatchRadioButtonActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new BooksGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new WatchGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new NewItemsGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ShoppingGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BooksRadioButton;
    private javax.swing.JRadioButton ClothingRadioButton;
    private javax.swing.JRadioButton WatchRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
