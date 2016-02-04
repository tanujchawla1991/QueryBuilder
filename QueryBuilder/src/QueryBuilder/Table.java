package QueryBuilder;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Table extends javax.swing.JDialog {
Connection con;
    public Table(java.awt.Frame parent, boolean modal, Connection cn) {
        super(parent, modal);
        initComponents();
        con=cn;
        try
        {
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(Options.q);
        DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
        ResultSetMetaData rd=rs.getMetaData();
        int count=rd.getColumnCount();
        String s[]=new String[count];
        for(int i=0;i<count;i++)
        {
            s[i]=rd.getColumnName(i+1);
            tm.addColumn(s[i]);
        }
        int c=0;
        while(rs.next())
        {
            tm.addRow(s);
            for(int i=0;i<count;i++)
            {
                tm.setValueAt(rs.getString(s[i]), c, i);
            }
            c++;
        }
        jTable1.setModel(tm);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
            return;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECTED TABLE");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
