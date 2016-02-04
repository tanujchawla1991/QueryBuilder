package QueryBuilder;
import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.*;

public class Insert extends javax.swing.JDialog {

    Connection con;
    String s,n;
    int i;
    JLabel l[],l1[],l2[];
    JTextField t[];
    int count;

public Insert(java.awt.Frame parent, boolean modal, Connection cn, String h) {
        super(parent, modal);
        initComponents();
        con=cn;
        jPanel1.setBounds(0,0,800,1000);
        s=h;
        try
        {
        Statement st=con.createStatement();
        ResultSet rs1=st.executeQuery("select * from "+s);
        ResultSetMetaData rd=rs1.getMetaData();
        count=rd.getColumnCount();
        if(count>=5)
        jPanel1.setLayout(new java.awt.GridLayout(count,5,20,20));
        else
        jPanel1.setLayout(new java.awt.GridLayout(count,5,40,40));
        l=new JLabel[count];
        l2=new JLabel[count];
        l1=new JLabel[count];
        t=new JTextField[count];
        jLabel1.setText("INSERT INTO "+s);
        getContentPane().add(jLabel1,BorderLayout.NORTH);
        for(i=1;i<=count;i++)
        {
            if(rd.isNullable(i)==ResultSetMetaData.columnNoNulls)
                l2[i-1]=new JLabel("Not Null");
            else
                l2[i-1]=new JLabel("Nullable");
            l[i-1]=new JLabel(rd.getColumnName(i));
            jPanel1.add(l[i-1]);
            l1[i-1]=new JLabel("("+rd.getColumnTypeName(i)+")");
            jPanel1.add(l1[i-1]);
            jPanel1.add(l2[i-1]);
            t[i-1]=new JTextField();
            jPanel1.add(t[i-1]);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for(i=1;i<=count;i++)
        {
            if(i==1)
            {
                n="insert into "+s+" values(";
            }
            if(i==count)
            {
                n=n+"'"+t[i-1].getText()+"'";
                break;
            }
            n=n+"'"+t[i-1].getText()+"',";
        }
        n=n+")";
        Options.o=n;
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}