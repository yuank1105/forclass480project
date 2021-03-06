
package sapplet;

import java.util.ArrayList;
import helper.User;
import java.applet.Applet;
import java.applet.AppletStub;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login extends javax.swing.JApplet implements AppletStub{
ArrayList<helper.User> users=new ArrayList<>();//for user list
    /**
     * Initializes the applet Login
     */
    @Override
    public void init() {
         setSize(1100,550);
        
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("Sign up");

        setPreferredSize(new java.awt.Dimension(300, 300));

        jPanel1.setLayout(null);

        jLabel4.setText("User Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(207, 93, 80, 14);

        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(207, 151, 80, 14);

        jLabel3.setFont(new java.awt.Font("Gungsuh", 1, 14)); // NOI18N
        jLabel3.setText("Login");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(319, 46, 42, 17);

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel1.add(userName);
        userName.setBounds(207, 113, 252, 20);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setText("SOA for High Dimentional Private Data ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 10, 496, 29);
        jPanel1.add(password);
        password.setBounds(207, 183, 252, 20);

        loginButton.setText("Submit");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton);
        loginButton.setBounds(268, 251, 100, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
   ObjectInputStream istream=null;
        try {
        //test user with id and pwd
       istream=new ObjectInputStream(new FileInputStream("user.txt"));//user file read
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        users=(ArrayList<helper.User>) istream.readObject();
    } catch (IOException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
        helper.User login_user=null;
        String uid=userName.getText();
        String pwd=password.getText();
        for(helper.User user:users){
            if(user.verify(uid, pwd)){//validate user
                login_user=user;
                break;
            }
        }
        if(login_user!=null){
            System.out.println("Welcome "+login_user.fname+" "+login_user.lname);
             jPanel1.setVisible(false);
        Thread t1=new Thread(new Runnable() {
    @Override
    public void run() {
       try {
        
        Class applet2 = Class.forName("sapplet.Vote");
        Applet appletToLoad = (Applet)applet2.newInstance();
        appletToLoad.setStub(Login.this);
        
        add(appletToLoad);
        appletToLoad.init();
        appletToLoad.start();
        validate();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
});
    t1.start();
        }else{
            System.out.println("user not found");
        } 
    }//GEN-LAST:event_loginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField password;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables

    @Override
    public void appletResize(int width, int height) {
        resize( width, height );
         }
}
