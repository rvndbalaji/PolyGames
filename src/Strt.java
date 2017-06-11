
import java.lang.reflect.Array;
import java.util.Arrays;


public class Strt extends javax.swing.JFrame {

  
    public Strt() 
    {
        initComponents();
        try
        {
           String un = System.getProperty("user.name");                
           String[] parts = un.split(" ");
           String uname = parts[0];           
           name.setText("Welcome "+uname);
        }
        catch(Exception ex)
        {           
           name.setText("Welcome");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        tit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setBackground(new java.awt.Color(144, 202, 249));
        a.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint-48.png"))); // NOI18N
        a.setText("ColorFix");
        a.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a.setIconTextGap(0);
        a.setOpaque(true);
        a.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 110));

        b.setBackground(new java.awt.Color(176, 190, 197));
        b.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b.setEnabled(false);
        b.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b.setIconTextGap(6);
        b.setInheritsPopupMenu(false);
        b.setOpaque(true);
        b.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 120, 110));

        c.setBackground(new java.awt.Color(176, 190, 197));
        c.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c.setEnabled(false);
        c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c.setOpaque(true);
        c.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 120, 110));

        d.setBackground(new java.awt.Color(176, 190, 197));
        d.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        d.setEnabled(false);
        d.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        d.setIconTextGap(0);
        d.setOpaque(true);
        d.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, 110));

        e.setBackground(new java.awt.Color(176, 190, 197));
        e.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        e.setEnabled(false);
        e.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        e.setIconTextGap(0);
        e.setOpaque(true);
        e.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, 110));

        f.setBackground(new java.awt.Color(176, 190, 197));
        f.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        f.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        f.setEnabled(false);
        f.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        f.setIconTextGap(0);
        f.setOpaque(true);
        f.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, 110));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Let the games begin...");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 170, 30));

        title1.setBackground(new java.awt.Color(226, 124, 62));
        title1.setFont(new java.awt.Font("Segoe Print", 1, 27)); // NOI18N
        title1.setForeground(java.awt.Color.white);
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1427310252_joypad.png"))); // NOI18N
        title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title1.setOpaque(true);
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 110, 65));

        tit.setBackground(new java.awt.Color(76, 175, 80));
        tit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tit.setForeground(java.awt.Color.white);
        tit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tit.setOpaque(true);
        getContentPane().add(tit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 840, 6));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aravind Balaji   ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 110, 30));

        title.setBackground(new java.awt.Color(226, 124, 62));
        title.setFont(new java.awt.Font("Segoe Print", 1, 27)); // NOI18N
        title.setForeground(java.awt.Color.white);
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title.setOpaque(true);
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 840, 30));

        title2.setBackground(new java.awt.Color(226, 124, 62));
        title2.setFont(new java.awt.Font("Segoe Print", 1, 27)); // NOI18N
        title2.setForeground(java.awt.Color.white);
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("      PolyGames");
        title2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title2.setOpaque(true);
        getContentPane().add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 65));

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Welcome");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 840, 30));

        back.setBackground(java.awt.Color.white);
        back.setForeground(java.awt.Color.white);
        back.setOpaque(true);
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 840, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked

       
    }//GEN-LAST:event_bMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
      

    }//GEN-LAST:event_cMouseClicked

    private void dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseClicked

    }//GEN-LAST:event_dMouseClicked

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked
     ColorFix cf = new ColorFix();
       cf.setVisible(true);
        
    }//GEN-LAST:event_aMouseClicked

    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Strt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel back;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JLabel e;
    private javax.swing.JLabel f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel name;
    public javax.swing.JLabel tit;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
