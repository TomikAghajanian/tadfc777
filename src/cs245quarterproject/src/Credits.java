/**
 * *************************************************************
 * file: Credits.java 
 * author: Diaz Disciples (Group name)
 * class: Computer Programming
 * Graphical User Interfaces - CS245
 * purpose: Defines the Credits screen
 * **************************************************************
 *
 */
package cs245quarterproject.src;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 */
public class Credits extends javax.swing.JPanel {
    public Credits() {
        initComponents();
        back.setToolTipText("back to main menu");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        creditText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("Back");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setPreferredSize(new java.awt.Dimension(85, 25));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 110, 40));

        creditText.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        creditText.setForeground(new java.awt.Color(204, 0, 51));
        creditText.setText("CREDITS");
        add(creditText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel1.setText("<html>Tomik Aghajanian,<br><br>Christian Munoz,<br><br>Emanuel Juarez,<br><br>David Chang,<br><br>Fabian Flores,</html>");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, 200, 270));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel2.setText("<html>#011353849<br><br>#010817014<br><br>#009631258<br><br>#009074689<br><br>#010913838</html>");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 107, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        ///Remove current JPanel and add new one
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().removeAll();
        frame.repaint();
        
        Menu main = new Menu();
        frame.add(main);
        frame.setVisible(true);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel creditText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
