
import javax.swing.JOptionPane;
/*

THE CORRECT USERNAME IS : Group3
THE CORRECT PASSWORD IS : svci
*/


public class LoginSystem extends javax.swing.JFrame {
 
   
    public LoginSystem() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLogin = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        jPass = new javax.swing.JPasswordField();
        jShow = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN FORM");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");

        jUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        jLogin.setBackground(new java.awt.Color(0, 0, 0));
        jLogin.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLogin.setText("LOGIN");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });

        jExit.setBackground(new java.awt.Color(0, 0, 0));
        jExit.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jExit.setForeground(new java.awt.Color(255, 255, 255));
        jExit.setText("EXIT");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        jPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });

        jShow.setBackground(new java.awt.Color(0, 0, 0));
        jShow.setForeground(new java.awt.Color(255, 255, 255));
        jShow.setText("Show Password");
        jShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jShow)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jUser)
                                .addComponent(jPass, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jShow)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogin)
                    .addComponent(jExit))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 410, 380));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\3f178067ddd20aa47ca3112943036340.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 410));

        setSize(new java.awt.Dimension(757, 421));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        
        if (jUser.getText(). equals("")){
            JOptionPane.showMessageDialog(null,"Please put a Username!");
        }
        else if (jPass.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please put a Password!");
        }
        else if (jUser.getText().contains("Group3")&& jPass.getText().contains("svci")){
            JOptionPane.showMessageDialog(null,"Login Successful!");
             Welcome reg = new Welcome ();
        reg.setVisible(true);
        this.setVisible(false);
        }
        else {
             JOptionPane.showMessageDialog(null,"Wrong username or password!!","Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLoginActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
       
    }//GEN-LAST:event_jPassActionPerformed

    private void jShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowActionPerformed
          if (jShow.isSelected()){
            jPass.setEchoChar((char)0);
        }
        else {
            jPass.setEchoChar('*');
        }
    }//GEN-LAST:event_jShowActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JCheckBox jShow;
    private javax.swing.JTextField jUser;
    // End of variables declaration//GEN-END:variables
}
