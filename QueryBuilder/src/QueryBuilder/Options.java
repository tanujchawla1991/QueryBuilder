package QueryBuilder;
import java.sql.*;
import javax.swing.*;

public class Options extends javax.swing.JFrame {
        Connection con;
        Object h;
        int i,j;
        static String x="";
        static String y="";
        static String o="";
        static String r="";
        static String q="";
        static String t="";
        static String w="";
        String g="";
        String k="";
        String u="";
        Statement st;
        PreparedStatement ps;
        public Options(Connection cn) {
        initComponents();
        setBounds(350,100,600,500);
        con=cn;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        list2 = new java.awt.List();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Select Table:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 77, 17);

        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(110, 40, 215, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("TABLE FIELDS :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 90, 96, 17);

        list1.setMultipleMode(true);
        getContentPane().add(list1);
        list1.setBounds(20, 120, 171, 190);

        jButton1.setText("Add To List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 160, 100, 23);

        jButton2.setText("Remove From List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 200, 140, 23);

        list2.setMultipleMode(true);
        getContentPane().add(list2);
        list2.setBounds(380, 120, 171, 190);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("SELECTED FIELDS :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 90, 123, 17);

        jButton4.setText("Execute Query");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(150, 390, 130, 23);

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(440, 390, 130, 23);

        jButton6.setText("SQL Command");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(300, 390, 130, 23);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select records", "insert record", "delete records", "update records" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(150, 350, 130, 20);

        jButton8.setText("Reset");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(230, 240, 100, 23);

        jButton9.setText("Drop Table");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(410, 50, 100, 23);

        jButton10.setText("Create New Table");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(380, 10, 160, 23);

        jLabel4.setText("Select Statement :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 330, 110, 14);

        jButton3.setText("Add Condition");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 350, 130, 23);

        jButton7.setText("Show Query");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 390, 130, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        h=jComboBox1.getSelectedItem();
        list1.removeAll();
        list2.removeAll();
        try
        {
        st=con.createStatement();
        ResultSet rs1=st.executeQuery("select * from "+h.toString());
        ResultSetMetaData rd=rs1.getMetaData();
        int count=rd.getColumnCount();
        i=1;
        while(i<=count)
        {
            list1.add(rd.getColumnName(i));
            i++;
        }
        list1.add("ALL (*)");
        }
        catch(SQLException e){}
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s[]=list1.getSelectedItems();
        i=0;
        try
        {
        while(true)
        {
            if(s[i].equals("ALL (*)"))
            {
                list2.removeAll();
                int m=list1.getItemCount();
                s=list1.getItems();
                int n=0;
                while(n<m-1)
                {
                    list2.add(s[n]);
                    n++;
                }
                break;
            }
            list2.add(s[i]);
            i++;
        }
        }
        catch(Exception e){}
        int e[]=list1.getSelectedIndexes();
        int b=0;
        while(b<e.length)
        {
        list1.deselect(e[b]);
        b++;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s[]=list2.getSelectedItems();
        i=0;
        while(s[i]!=null)
        {
            list2.remove(s[i]);
            i++;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedIndex()==0)
            {
                if(list2.getItemCount()==0)
                {
                    JOptionPane.showMessageDialog(this, "Select at least one field.");
                    jComboBox2.setSelectedIndex(-1);
                    return;
                }
                i=0;
                try
                {
                    while(true)
                    {
                        if(i<(list2.getItemCount()-1))
                        k=k+list2.getItem(i)+",";
                        else
                        k=k+list2.getItem(i);
                        i++;
                    }
                }
                catch(Exception e){}
                g="select "+k+" from "+jComboBox1.getSelectedItem().toString();
            }
       if(jComboBox2.getSelectedIndex()==1)
            {
                String z=jComboBox1.getSelectedItem().toString();
                Insert i1=new Insert(this,true,con,z);
                i1.setBounds(400,250,500,250);
                i1.setVisible(true);
                return;
            }
       if(jComboBox2.getSelectedIndex()==2)
            {
                u="delete from "+jComboBox1.getSelectedItem().toString();
            }
       if(jComboBox2.getSelectedIndex()==3)
            {
                String z=jComboBox1.getSelectedItem().toString();
                Update u1=new Update(this,true,con,z);
                u1.setBounds(400,250,500,250);
                u1.setVisible(true);
                return;
            }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        jComboBox2.setSelectedIndex(-1);

        jComboBox1.removeAllItems();
        list1.removeAll();
        list2.removeAll();
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        list1.removeAll();
        list2.removeAll();
        h=jComboBox1.getSelectedItem();
        DropTable d1=new DropTable(this,true,con,h);
        d1.setBounds(500,200,300,250);
        d1.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        CreateTable c1=new CreateTable(this,true,con);
        c1.setBounds(275,125,750,450);
        c1.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.out.println("1."+q+"...2."+k+"...3."+g+"...4."+x+"...5."+y);
        jComboBox2.setSelectedIndex(-1);
        list1.removeAll();
        list2.removeAll();
        Options.x="";
        Options.y="";
        Options.o="";
        Options.r="";
        Options.q="";
        Options.t="";
        Options.w="";
        g="";
        k="";
        u="";
        System.out.println("1."+q+"...2."+k+"...3."+g+"...4."+x+"...5."+y);
        jComboBox1.removeAllItems();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeVisible
    if(jComboBox1.getSelectedIndex()==-1)
            {
                JOptionPane.showMessageDialog(this, "Select table before proceeding further.");
                return;
            }
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeVisible

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jComboBox1.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Select table before proceeding further.");
            return;
        }
        if(jComboBox2.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Select statement before proceeding further.");
            return;
        }
        String s[]=list1.getItems();
        if(s==null)
        {
            JOptionPane.showMessageDialog(this, "The selected table is empty.");
            return;
        }
        if(jComboBox2.getSelectedIndex()==0||jComboBox2.getSelectedIndex()==2||jComboBox2.getSelectedIndex()==3)
        {
            if(jComboBox2.getSelectedIndex()==2)
                i=-1;
            if(jComboBox2.getSelectedIndex()==3)
                j=-1;
            Condition c1=new Condition(this,true,con,s,i,j);
            c1.setBounds(450,150,400,425);
            c1.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "This statement does not support conditions.");
            return;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(jComboBox1.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Query could not be generated due to insufficient parameters.");
            return;
        }
        if(jComboBox2.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Query could not be generated due to insufficient parameters.");
            return;
        }
        q=g+y+x;
        if(jComboBox2.getSelectedIndex()==0)
        {
            if(q.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Query could not be generated due to insufficient parameters.");
                return;
            }
            JOptionPane.showMessageDialog(this, q+";");
        }
        if(jComboBox2.getSelectedIndex()==1)
        {
            if(o.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Query could not be generated due to insufficient parameters.");
                return;
            }
            JOptionPane.showMessageDialog(this, o+";");
        }
        r=u+y;
        if(jComboBox2.getSelectedIndex()==2)
        {
            if(r.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Query could not be generated due to insufficient parameters.");
                return;
            }
            JOptionPane.showMessageDialog(this, r+";");
        }
        t=w+y;
        if(jComboBox2.getSelectedIndex()==3)
        {
            if(t.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Query could not be generated due to insufficient parameters.");
                return;
            }
            JOptionPane.showMessageDialog(this, t+";");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SqlQuery s1=new SqlQuery(this,true,con);
        s1.setBounds(425,200,450,250);
        s1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        q=g+y+x;
        r=u+y;
        t=w+y;
        if(jComboBox2.getSelectedIndex()==0&&q.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Query could not be generated due to insufficient parameters.");
            return;
        }
        if(jComboBox2.getSelectedIndex()==1&&o.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Query could not be generated due to insufficient parameters.");
            return;
        }
        if(jComboBox2.getSelectedIndex()==2&&r.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Query could not be generated due to insufficient parameters. You must add some condition to delete a row.");
            return;
        }
        if(jComboBox2.getSelectedIndex()==3&&t.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Query could not be generated due to insufficient parameters. You must add some condition to delete a row.");
            return;
        }
        if(jComboBox2.getSelectedIndex()==0)
        {
            Table t1=new Table(this,true,con);
            t1.setBounds(400,150,500,400);
            t1.setVisible(true);
        }
        if(jComboBox2.getSelectedIndex()==1)
        {
            try
            {
                st.execute(o);
                JOptionPane.showMessageDialog(this,"Table "+jComboBox1.getSelectedItem().toString()+" has been modified.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.toString());
            }
        }
        if(jComboBox2.getSelectedIndex()==2)
        {
            try
            {
                st.execute(r);
                JOptionPane.showMessageDialog(this,"Table "+jComboBox1.getSelectedItem().toString()+" has been modified.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.toString());
            }
        }
        if(jComboBox2.getSelectedIndex()==3)
        {
            try
            {
                st.execute(t);
                JOptionPane.showMessageDialog(this,"Table "+jComboBox1.getSelectedItem().toString()+" has been modified.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.toString());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.List list1;
    private java.awt.List list2;
    // End of variables declaration//GEN-END:variables

}
