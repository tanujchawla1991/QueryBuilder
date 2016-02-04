package QueryBuilder;
import java.sql.*;
import javax.swing.*;

public class DropTable extends javax.swing.JDialog {
        Connection con;
        Object h;
        public DropTable(java.awt.Frame parent, boolean modal,Connection cn,Object k) {
        super(parent, modal);
        initComponents();
        con=cn;
        h=k;
        jComboBox1.removeAllItems();
        try
        {
        DatabaseMetaData d1=con.getMetaData();
        ResultSet rs=d1.getTables(null,null,null,new String[] {"TABLE"});
        while(rs.next())
        {
            jComboBox1.addItem(rs.getString("Table_Name"));
        }
        }
        catch(Exception e){}
        jComboBox1.setSelectedItem(h);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Select Table:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 70, 77, 14);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(110, 70, 150, 20);

        jButton1.setText("Drop Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 120, 120, 23);

        jButton2.setText("Show Query");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 120, 120, 23);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 160, 90, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("DROP TABLE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 10, 190, 44);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jComboBox1.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Select table before proceeding further.");
            return;
        }
        int ch=JOptionPane.showConfirmDialog(this,"Are you sure you want to delete table "+jComboBox1.getSelectedItem().toString()+" ???","Confirmation",JOptionPane.YES_NO_OPTION);
        if(ch==JOptionPane.NO_OPTION)
        return;
        h= jComboBox1.getSelectedItem();
        try
        {
        Statement st=con.createStatement();
        ResultSet rs2=st.executeQuery("drop table "+h.toString());
        JOptionPane.showMessageDialog(this,h.toString()+" table dropped successfully.");
        }
        catch(Exception e){JOptionPane.showMessageDialog(this,e.toString());}
        jComboBox1.removeAllItems();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        jComboBox1.removeAllItems();
        try
        {
        DatabaseMetaData d1=con.getMetaData();
        ResultSet rs=d1.getTables(null,null,null,new String[] {"TABLE"});
        while(rs.next())
        {
            jComboBox1.addItem(rs.getString("Table_Name"));
        }
        }
        catch(Exception e){}
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox1.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Query cannot be generated, select table before proceeding further.");
            return;
        }
        String q="drop table "+jComboBox1.getSelectedItem().toString()+";";
        JOptionPane.showMessageDialog(this,q);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
