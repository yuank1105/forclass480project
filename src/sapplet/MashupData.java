
package sapplet;

import helper.User;
import helper.Voter;
import java.applet.Applet;
import java.applet.AppletStub;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MashupData extends javax.swing.JApplet implements AppletStub{
    int count=0;
       ArrayList<User> Readusers=new ArrayList<>();//read users
       ArrayList<Voter> ReadVoters=new ArrayList<>();//read voters
       DefaultTableModel userModel,voterModel;
    /**
     * Initializes the applet MashupData
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
            java.util.logging.Logger.getLogger(MashupData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MashupData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MashupData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MashupData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        showMashup = new javax.swing.JButton();
        backToad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MashupTable = new javax.swing.JTable();

        jPanel1.setLayout(null);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(624, 58, 80, 23);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setText("SOA for High Dimentional Private Data ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(107, 11, 496, 29);

        showMashup.setText("Mashup Data");
        showMashup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMashupActionPerformed(evt);
            }
        });
        jPanel1.add(showMashup);
        showMashup.setBounds(511, 58, 110, 23);

        backToad.setText("Back");
        backToad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToadActionPerformed(evt);
            }
        });
        jPanel1.add(backToad);
        backToad.setBounds(446, 58, 55, 23);

        MashupTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "First Name", "Last Name", "Gender", "Age", "User name", "Contact No.", "Password", "Zip Code"
            }
        ));
        jScrollPane1.setViewportView(MashupTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 117, 700, 244);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showMashupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMashupActionPerformed
      userModel=(DefaultTableModel)MashupTable.getModel();
      if(count<1){
      ObjectInputStream istream = null;
      // Reading Users.
       try {
           istream = new ObjectInputStream(new FileInputStream("user.txt"));//user object file
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
       
       // Reading voters.
       try {
           istream = new ObjectInputStream(new FileInputStream("voters.txt"));//voters object file
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
       
        for(int i=0;i<Readusers.size();i++){
//            for(int j=0;j<ReadVoters.size();i++){
//            if(Readusers.get(j).SSN.equals(ReadVoters.get(i).SSN)){
            String UserName=Readusers.get(i).username.replaceAll("[^\\d.]", "*");
            String zip=checkVoter(Readusers.get(i).SSN);//check zip from voters
            userModel.addRow(new Object[]{replaceLastThree(Readusers.get(i).SSN),Readusers.get(i).fname,Readusers.get(i).lname,Readusers.get(i).gender,Readusers.get(i).age,UserName,Readusers.get(i).phone,replaceLastFour(Readusers.get(i).password),zip});
//            }
//            }
         
        }
        count++;
      }
    }//GEN-LAST:event_showMashupActionPerformed

    private void backToadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToadActionPerformed
        // TODO add your handling code here:
         jPanel1.setVisible(false);
        Thread t1=new Thread(new Runnable() {
    @Override
    public void run() {
       try {
        
        Class applet2 = Class.forName("sapplet.Admin");//new applet
        Applet appletToLoad = (Applet)applet2.newInstance();
        appletToLoad.setStub(MashupData.this);
        
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
    }//GEN-LAST:event_backToadActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
         jPanel1.setVisible(false);
        Thread t1=new Thread(new Runnable() {
    @Override
    public void run() {
       try {
        
        Class applet2 = Class.forName("sapplet.Home");
        Applet appletToLoad = (Applet)applet2.newInstance();
        appletToLoad.setStub(MashupData.this);
        
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
    private javax.swing.JTable MashupTable;
    private javax.swing.JButton backToad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton showMashup;
    // End of variables declaration//GEN-END:variables

public  String replaceLastFour(String s) {//replace four characters
    int length = s.length();
    //Check whether or not the string contains at least four characters; if not, this method is useless
    if (length < 4) return "Error: The provided string is not greater than four characters long.";
    return s.substring(0, length - 4) + "****";
}
public  String replaceLastThree(String s) {
    int length = s.length();
    //Check whether or not the string contains at least four characters; if not, this method is useless
    if (length < 4) return "Error: The provided string is not greater than four characters long.";
    return s.substring(0, length - 3) + "****";
}

    @Override
    public void appletResize(int width, int height) {
         }
    String checkVoter(String ssn){//check voter and return zip
        String zip="*******";
        for(Voter voter:ReadVoters){
           if(voter.SSN.equals(ssn)){//check using ssn
               zip=voter.Zipcode;
           } 
        }
        return zip;
    }
}