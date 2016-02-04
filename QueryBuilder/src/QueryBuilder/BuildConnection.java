package QueryBuilder;
import java.sql.*;
import javax.swing.*;

public class BuildConnection extends javax.swing.JFrame {
        Connection con = null;
    public BuildConnection() {
        initComponents();
        setBounds(350,100,600,500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Check Connection");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 360, 160, 23);

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 400, 90, 23);

        jPanel2.setLayout(null);

        jLabel2.setText("Username:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 40, 70, 14);

        jLabel3.setText("Password:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 90, 80, 14);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(150, 40, 107, 20);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(150, 90, 107, 20);

        jTabbedPane1.addTab("Oracle Driver", jPanel2);

        jPanel1.setLayout(null);

        jLabel4.setText("DSN name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 30, 70, 14);

        jLabel5.setText("Username:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 80, 70, 14);

        jLabel6.setText("Password:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 130, 80, 14);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(140, 30, 113, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(140, 80, 113, 20);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(140, 130, 113, 20);

        jTabbedPane1.addTab("Jdbc-Odbc Bridge", jPanel1);

        jPanel4.setLayout(null);

        jLabel7.setText("Username:");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(30, 50, 80, 14);

        jLabel8.setText("Password:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 100, 80, 14);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField4);
        jTextField4.setBounds(140, 50, 108, 20);

        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        jPanel4.add(jPasswordField3);
        jPasswordField3.setBounds(140, 100, 108, 20);

        jTabbedPane1.addTab("MySQL Driver", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(120, 140, 340, 202);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("CHOOSE DRIVER");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(210, 100, 210, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("QUERY BUILDER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 265, 44);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        con=null;
        int x=jTabbedPane1.getSelectedIndex();
        if(x==0)
        {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            String s=new String(jPasswordField1.getPassword());
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", jTextField1.getText(), s);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
        if(x==1)
        {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String s=new String(jPasswordField2.getPassword());
            con=DriverManager.getConnection("jdbc:odbc:"+jTextField2.getText(), jTextField3.getText(), s);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
        if(x==2)
        {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String s=new String(jPasswordField3.getPassword());
            con=DriverManager.getConnection("jdbc:mysql://localhost/tanuj", jTextField4.getText(), s);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
        if(con==null)
        {
            JOptionPane.showMessageDialog(this, "Connection cannot be established. Please try again.");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Connection established successfully.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(con==null)
    {
        JOptionPane.showMessageDialog(this, "Connection cannot be established. Please try again.");
    }
    else
    {
        setVisible(false);
        new Options(con).setVisible(true);

    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new BuildConnection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
