/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Manucho
 */
public class teo5 extends javax.swing.JFrame {
     //VARIABLES
     int tot= 0, totd=0; 
     double fac = 1;
     double fact= 1;
     long numer = tot;
     double totaldefi;
    
    public teo5() {
        initComponents();
         this.setLocationRelativeTo(null);
        this.setTitle("CALCULADORA PROBABILISTICA");
        this.setResizable(false);
        tranparenciaTextos();
        transparencia();
    }

       public void transparencia(){
    jButton1.setOpaque(false);
    jButton1.setContentAreaFilled(false);
    jButton1.setBorderPainted(false);
    
    jButton2.setOpaque(false);
    jButton2.setContentAreaFilled(false);
    jButton2.setBorderPainted(false);
    
     jButton3.setOpaque(false);
    jButton3.setContentAreaFilled(false);
    jButton3.setBorderPainted(false);
   
    }
    
    public void tranparenciaTextos(){
      
    jTextField2.setBackground(new java.awt.Color(0,0,0,0));
    jTextField3.setBackground(new java.awt.Color(0,0,0,0));
    jTextField4.setBackground(new java.awt.Color(0,0,0,0));
    jTextField5.setBackground(new java.awt.Color(0,0,0,0));
    jTextField6.setBackground(new java.awt.Color(0,0,0,0));
    
   
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Quicksilver", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 60, 40));

        jTextField3.setFont(new java.awt.Font("Quicksilver", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 140, 40));

        jTextField4.setFont(new java.awt.Font("Quicksilver", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        jTextField4.setOpaque(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 200, 40));

        jTextField5.setFont(new java.awt.Font("Quicksilver", 1, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(null);
        jTextField5.setOpaque(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 210, 40));

        jTextField6.setFont(new java.awt.Font("Quicksilver", 1, 24)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setBorder(null);
        jTextField6.setOpaque(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 210, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosN/box.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosN/box.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosN/remenu.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 64, 64));

        jLabel5.setFont(new java.awt.Font("Quicksand Medium", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("=");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 30, 70));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosN/un-resultado-positivo-de-la-prueba-de-la-escuela.png"))); // NOI18N
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosN/un-resultado-positivo-de-la-prueba-de-la-escuela.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosN/un-resultado-positivo-de-la-prueba-de-la-escuela (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 64, 64));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosN/borrar (2).png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosN/bp.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 64, 64));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teoremasF/T5-01.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addn();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //jTextField2.setText("");
        
        //jTextField3.setText("");
        //jTextField4.setText("");
        //jTextField5.setText("");
        //jTextField6.setText("");
        
        teo5 t5 = new teo5();
        t5.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Teoremas2 teoo2 = new Teoremas2();
     teoo2.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(teo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teo5().setVisible(true);
            }
        });
    }
    
     public void addn(){
     String muestra;
        
     //AGREGANDOLE TEXTO 
    jTextField4.setText(jTextField4.getText()+ jTextField2.getText()+"! "); 
    //CONVIRTIENDO STRING A INT
    tot = Integer.parseInt(jTextField2.getText());
    
    //METODO FACTORIAL
    //facto();
    double fac = 1;
    long numer = tot;
    for (double i = numer; i > 0; i--) {
            fac = fac *i;
        }//VERIFICANDO 
        System.out.println("abajo");
        System.out.println(fac);
        
         fact = fac * fact;
        System.out.println(fact);
   
    
    //SUMANDO VALORES
    totd = totd + tot;
    
    //VERIFICANDO
        System.out.println(totd);
    //BORRANDO CAJA DE TEXTO
    jTextField2.setText("");
        
    
    //SETEANDO UN TEXTO 
    muestra = String.valueOf(totd);
    jTextField3.setText(muestra + "!");
    
    
    //
     
    long fac2 = 1;
    long numer2 = totd;
    
        for (long i = numer2; i > 0; i--) {
            fac2 = fac2 *i;
        }//VERIFICANDO 
        System.out.println("arriba");
        System.out.println(fac2);
        
        //RESPUESTA 
        double Respuesta = (fac2/fact);
        System.out.println("LA RESPUESTA " + Respuesta);
        
        //CONVIRTIENDO DATO NUMERICO A TEXTO
        String RespuestaDefi;
        RespuestaDefi = String.valueOf(Respuesta);
        
        //MOSTRANDO RESULTADO
        jTextField5.setText(RespuestaDefi);
        jTextField6.setText(RespuestaDefi);
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
