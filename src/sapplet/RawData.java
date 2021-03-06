
package sapplet;

import helper.User;
import helper.Voter;
import java.applet.Applet;
import java.applet.AppletStub;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Simant
 */
public class RawData extends javax.swing.JApplet implements AppletStub{
    int count=0;//to work for once
   ArrayList<User> Readusers=new ArrayList<>();//user and voter list
   ArrayList<Voter> ReadVoters=new ArrayList<>();
     DefaultTableModel userModel,voterModel;
    /**
     * Initializes the applet RawData
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
            java.util.logging.Logger.getLogger(RawData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RawData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RawData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RawData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        VoterTable = new javax.swing.JTable();
        backToAdmin = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setText("SOA for High Dimentional Private Data ");

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "First Name", "Last Name", "Gender", "Age", "User name.", "Phone No.", "Password", "Address"
            }
        ));
        jScrollPane1.setViewportView(UserTable);

        jButton2.setText("Raw Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        VoterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "First Name", "Last Name", "Age", "Gender", "Zip code"
            }
        ));
        jScrollPane2.setViewportView(VoterTable);

        backToAdmin.setText("Back");
        backToAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToAdminActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(184, 184, 184)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(791, 791, 791)
                            .addComponent(backToAdmin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(logout)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backToAdmin)
                            .addComponent(jButton2)
                            .addComponent(logout))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    userModel=(DefaultTableModel)UserTable.getModel();
    voterModel=(DefaultTableModel)VoterTable.getModel();
    
    
    while(count<1){   
        
        ObjectInputStream istream = null;
       try {
           istream = new ObjectInputStream(new FileInputStream("user.txt"));//read users
       } catch (FileNotFoundException ex) {
           Logger.getLogger(RawData.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(RawData.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           Readusers=(ArrayList<User>) istream.readObject();
       } catch (IOException ex) {
           Logger.getLogger(RawData.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(RawData.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       for(int i=0;i<Readusers.size();i++){//enter user list
       userModel.addRow(new Object[]{Readusers.get(i).SSN,Readusers.get(i).fname,Readusers.get(i).lname,Readusers.get(i).gender,Readusers.get(i).age,Readusers.get(i).username,Readusers.get(i).phone,Readusers.get(i).password,Readusers.get(i).address});
       }
       
       try {
           istream = new ObjectInputStream(new FileInputStream("voters.txt"));//read voter
       } catch (FileNotFoundException ex) {
           Logger.getLogger(RawData.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(RawData.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           ReadVoters=(ArrayList<Voter>) istream.readObject();
       } catch (IOException ex) {
           Logger.getLogger(RawData.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(RawData.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       for(int i=0;i<ReadVoters.size();i++){
           //enter voter list
       voterModel.addRow(new Object[]{ReadVoters.get(i).SSN,ReadVoters.get(i).fname,ReadVoters.get(i).lname,ReadVoters.get(i).age,ReadVoters.get(i).gender,ReadVoters.get(i).Zipcode});
       }
       
       count++;
       
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backToAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToAdminActionPerformed
        // TODO add your handling code here:
         jPanel1.setVisible(false);
        Thread t1=new Thread(new Runnable() {
    @Override
    public void run() {
       try {
        
        Class applet2 = Class.forName("sapplet.Admin");//new applet
        Applet appletToLoad = (Applet)applet2.newInstance();
        appletToLoad.setStub(RawData.this);
        
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
    }//GEN-LAST:event_backToAdminActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
         jPanel1.setVisible(false);
        Thread t1=new Thread(new Runnable() {
    @Override
    public void run() {
       try {
        
        Class applet2 = Class.forName("sapplet.Home");
        Applet appletToLoad = (Applet)applet2.newInstance();
        appletToLoad.setStub(RawData.this);
        
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
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UserTable;
    private javax.swing.JTable VoterTable;
    private javax.swing.JButton backToAdmin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables

    @Override
    public void appletResize(int width, int height) {
         }
}
