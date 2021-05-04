/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision3;

/**
 *
 * @author coema
 */
public class Movie extends javax.swing.JFrame {

    /**
     * Creates new form Movie
     */
    public Movie() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lineBorder1 = (javax.swing.border.LineBorder)javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0));
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        popupMenu2 = new java.awt.PopupMenu();
        popupMenu3 = new java.awt.PopupMenu();
        popupMenu4 = new java.awt.PopupMenu();
        popupMenu5 = new java.awt.PopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        horrorbutton = new javax.swing.JRadioButton();
        comedybutton = new javax.swing.JRadioButton();
        fantasybutton = new javax.swing.JRadioButton();
        dramabutton = new javax.swing.JRadioButton();
        kidsbutton = new javax.swing.JRadioButton();
        actionbutton = new javax.swing.JRadioButton();
        resetButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        image2 = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton5.setText("jToggleButton5");

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        jToggleButton6.setText("jToggleButton6");

        jToggleButton3.setText("jToggleButton3");

        jToggleButton7.setText("jToggleButton7");

        jToggleButton4.setText("jToggleButton4");

        jToggleButton8.setText("jToggleButton8");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        popupMenu2.setLabel("popupMenu2");

        popupMenu3.setLabel("popupMenu3");

        popupMenu4.setLabel("popupMenu4");

        popupMenu5.setLabel("popupMenu5");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        horrorbutton.setBackground(new java.awt.Color(255, 0, 0));
        horrorbutton.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        horrorbutton.setForeground(new java.awt.Color(255, 255, 0));
        horrorbutton.setText("Horror");
        horrorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horrorbuttonActionPerformed(evt);
            }
        });

        comedybutton.setBackground(new java.awt.Color(255, 0, 0));
        comedybutton.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        comedybutton.setForeground(new java.awt.Color(255, 255, 0));
        comedybutton.setText("Comedy");
        comedybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comedybuttonActionPerformed(evt);
            }
        });

        fantasybutton.setBackground(new java.awt.Color(255, 0, 0));
        fantasybutton.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        fantasybutton.setForeground(new java.awt.Color(255, 255, 0));
        fantasybutton.setText("Sci-fi/Fantasy");
        fantasybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantasybuttonActionPerformed(evt);
            }
        });

        dramabutton.setBackground(new java.awt.Color(255, 0, 0));
        dramabutton.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        dramabutton.setForeground(new java.awt.Color(255, 255, 0));
        dramabutton.setText("Drama");
        dramabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dramabuttonActionPerformed(evt);
            }
        });

        kidsbutton.setBackground(new java.awt.Color(255, 0, 0));
        kidsbutton.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        kidsbutton.setForeground(new java.awt.Color(255, 255, 0));
        kidsbutton.setText("Kids");
        kidsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidsbuttonActionPerformed(evt);
            }
        });

        actionbutton.setBackground(new java.awt.Color(255, 0, 0));
        actionbutton.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        actionbutton.setForeground(new java.awt.Color(255, 255, 0));
        actionbutton.setText("Action");
        actionbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionbuttonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(255, 255, 51));
        resetButton.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 0, 0));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Capture8.JPG"))); // NOI18N
        image2.setText("jLabel8");

        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Capture3.JPG"))); // NOI18N
        image1.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("                      Categories ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(actionbutton)
                .addGap(18, 18, 18)
                .addComponent(comedybutton)
                .addGap(18, 18, 18)
                .addComponent(dramabutton)
                .addGap(18, 18, 18)
                .addComponent(horrorbutton)
                .addGap(18, 18, 18)
                .addComponent(kidsbutton)
                .addGap(18, 18, 18)
                .addComponent(fantasybutton)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jButton1)
                        .addGap(100, 100, 100)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(resetButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actionbutton)
                    .addComponent(fantasybutton)
                    .addComponent(dramabutton)
                    .addComponent(kidsbutton)
                    .addComponent(horrorbutton)
                    .addComponent(comedybutton))
                .addGap(18, 18, 18)
                .addComponent(resetButton)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(image2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(126, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 886, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //Button action to go to Checkout window
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
          //  m.setSize(600, 600);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BUTTON TO CANCEL THE RENT MOVIE PAGE
        
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void horrorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horrorbuttonActionPerformed
        if (horrorbutton.isSelected())
            dramabutton.setSelected(false);   // variable false, doing the select box
             comedybutton.setSelected(false);
            kidsbutton.setSelected(false);
            actionbutton.setSelected(false);
            fantasybutton.setSelected(false);
            
    }//GEN-LAST:event_horrorbuttonActionPerformed

    private void actionbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionbuttonActionPerformed
        
        if (actionbutton.isSelected())
            dramabutton.setSelected(false);
            comedybutton.setSelected(false);
            horrorbutton.setSelected(false);
            kidsbutton.setSelected(false);
            fantasybutton.setSelected(false);
                
     if (actionbutton.isSelected())
          System.out.print(image1);
             
             
    }//GEN-LAST:event_actionbuttonActionPerformed

    private void comedybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comedybuttonActionPerformed
       
        
            if (comedybutton.isSelected())
            dramabutton.setSelected(false);
            actionbutton.setSelected(false);
            horrorbutton.setSelected(false);
            kidsbutton.setSelected(false);
            fantasybutton.setSelected(false);
        
        
    }//GEN-LAST:event_comedybuttonActionPerformed

    private void fantasybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantasybuttonActionPerformed
       
        if (fantasybutton.isSelected())
            dramabutton.setSelected(false);
            actionbutton.setSelected(false);
            horrorbutton.setSelected(false);
            kidsbutton.setSelected(false);
            comedybutton.setSelected(false);
    }//GEN-LAST:event_fantasybuttonActionPerformed

    private void dramabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dramabuttonActionPerformed
       
        if (dramabutton.isSelected())
            comedybutton.setSelected(false);
            actionbutton.setSelected(false);
            horrorbutton.setSelected(false);
            kidsbutton.setSelected(false);
            fantasybutton.setSelected(false);
    }//GEN-LAST:event_dramabuttonActionPerformed

    private void kidsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidsbuttonActionPerformed
        
        if (kidsbutton.isSelected())
            dramabutton.setSelected(false);
            actionbutton.setSelected(false);
            horrorbutton.setSelected(false);
            comedybutton.setSelected(false);
            fantasybutton.setSelected(false);
            
            
            if (kidsbutton.isSelected())
                System.out.println("hello");
    }//GEN-LAST:event_kidsbuttonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
       
            kidsbutton.setSelected(false);
            dramabutton.setSelected(false);
            actionbutton.setSelected(false);
            horrorbutton.setSelected(false);
            comedybutton.setSelected(false);
            fantasybutton.setSelected(false);
    }//GEN-LAST:event_resetButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton actionbutton;
    private javax.swing.JRadioButton comedybutton;
    private javax.swing.JRadioButton dramabutton;
    private javax.swing.JRadioButton fantasybutton;
    private javax.swing.JRadioButton horrorbutton;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JRadioButton kidsbutton;
    private javax.swing.border.LineBorder lineBorder1;
    private java.awt.PopupMenu popupMenu2;
    private java.awt.PopupMenu popupMenu3;
    private java.awt.PopupMenu popupMenu4;
    private java.awt.PopupMenu popupMenu5;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}

