package QueryBuilder;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CreateTable extends javax.swing.JDialog {
        Connection con;
        PreparedStatement ps;
        DefaultTableModel tm;
        int a=0;
        public CreateTable(java.awt.Frame parent, boolean modal,Connection cn) {
        super(parent, modal);
        initComponents();
        con=cn;
        tm=(DefaultTableModel)jTable1.getModel();
    }
    boolean CheckName(String s)
    {
        int i=0;
        boolean b;
        try
        {
        while(true)
        {
            char c=s.charAt(i);
            if(i==0)
            {
            b=Character.isLetter(c);
            if(b==false)
            return false;
            }
            else
            {
            b=Character.isLetterOrDigit(c);
            if(b==false&&c!='_')
            return false;
            }
            i++;
        }
        }
        catch(Exception e)
        {
            return true;
        }
    }
    void Reset()
    {
        try
        {
        while(true)
        {
        tm.removeRow(a);
        }
        }
        catch(Exception e){}
        jComboBox1.removeAllItems();
        jTextField1.setEditable(true);
        jTextField3.setEditable(true);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        if(jCheckBox1.isSelected())
        jCheckBox1.doClick();
        if(jCheckBox2.isSelected())
        jCheckBox2.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Enter Table Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 70, 103, 14);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(370, 70, 138, 20);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 110, 105, 20);

        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
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
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(130, 150, 105, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 190, 45, 20);

        jCheckBox1.setText("Primary Key");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(20, 230, 100, 23);

        jCheckBox2.setText("Not Null");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(20, 260, 111, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Width :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 190, 50, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("Column Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 95, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("Select Type :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 150, 80, 17);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Column Name", "Type", "Width", "Primary Key", "Not Null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 130, 450, 190);

        jButton1.setText("Add Column");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 310, 150, 23);

        jButton2.setText("Create Table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 340, 120, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setText("Table Details :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 110, 110, 17);

        jButton3.setText("Show Query");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 340, 120, 23);

        jButton4.setText("Remove Column");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(40, 350, 150, 23);

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(630, 340, 80, 23);

        jButton6.setText("Reset");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(260, 340, 80, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("CREATE NEW TABLE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 10, 320, 44);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setEditable(false);
        String pk,q;
        ResultSet rs=null;
        q="create table "+jTextField1.getText()+"(";
        int i=0;
        try
        {
        ps=con.prepareStatement("select * from "+jTextField1.getText());
        rs=ps.executeQuery();
        }
        catch(Exception e){System.out.println(e);}
        if(rs!=null)
        {
        JOptionPane.showMessageDialog(this, "Table name already exists.");
        jTextField1.setEditable(true);
        return;
        }
        try
        {
        pk=jTable1.getValueAt(i,0).toString();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Table cannot be created without any column.");
            jTextField1.setEditable(true);
            return;
        }
        try
        {
        while(pk!=null)
        {
        if(i>0)
            q=q+",";
        q=q+jTable1.getValueAt(i,0).toString();
        q=q+" "+jTable1.getValueAt(i,1).toString();
        if(jTable1.getValueAt(i,2).toString().isEmpty()==false)
        q=q+"("+jTable1.getValueAt(i,2).toString()+")";
        pk=jTable1.getValueAt(i,3).toString();
        if(pk.equals("Yes"))
        q=q+" primary key";
        else
        {
        pk=jTable1.getValueAt(i,4).toString();
        if(pk.equals("Yes"))
        q=q+" not null";
        }
        i++;
        pk=jTable1.getValueAt(i,0).toString();
        }
        }
        catch(Exception e){q=q+")";}
        int ch=JOptionPane.showConfirmDialog(this,"Are you sure you want to create table "+jTextField1.getText()+" ???","Confirmation",JOptionPane.YES_NO_OPTION);
        if(ch==JOptionPane.NO_OPTION)
        return;
        try
        {
        ps=con.prepareStatement(q);
        ps.execute();
        }
        catch(Exception e){System.out.println(e);}
        try
        {
        ps=con.prepareStatement("select * from "+jTextField1.getText());
        rs=ps.executeQuery();
        }
        catch(Exception e){System.out.println(e);}
        if(rs==null)
        {
        JOptionPane.showMessageDialog(this, "Sorry, table "+jTextField1.getText()+" cannot be created. Please try again.");
        jTextField1.setEditable(true);
        return;
        }
        JOptionPane.showMessageDialog(this,"Table "+jTextField1.getText()+" created successfully.");
        Reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter table name before proceeding further.");
            return;
        }
        if(jComboBox1.getSelectedIndex()==0&&jTextField3.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(this, "Size of a varchar data type is a must.");
            return;
        }
        int i=0;
        int k=0;
        if(jCheckBox1.isSelected())
        {
        try
        {
        String pk=jTable1.getValueAt(i,3).toString();
        while(pk!=null)
        {
        if( pk.equals("Yes"))
        {
        k=1;
        break;
        }
        i++;
        pk=jTable1.getValueAt(i,3).toString();
        }
        }
        catch(Exception e){}
        if(k==1)
        {
            JOptionPane.showMessageDialog(this, "There cannot be more than 1 primary key in a table.");
            return;
        }
        }
        try
        {
        Object o[]=new Object[5];
        o[0]=jTextField2.getText();
        o[1]=jComboBox1.getSelectedItem().toString();
        o[2]=jTextField3.getText();
        if(jCheckBox1.isSelected())
        o[3] = "Yes";
        else
        o[3]="No";
        if(jCheckBox2.isSelected()||jCheckBox1.isSelected())
        o[4]="Yes";
        else
        o[4]="No";
        tm.addRow(o);
        jTable1.setModel(tm);
        }
        catch(Exception e){}
        jTextField2.setText("");
        jTextField3.setText("");
        if(jCheckBox1.isSelected())
        jCheckBox1.doClick();
        if(jCheckBox2.isSelected())
        jCheckBox2.doClick();
        jTextField1.setEditable(false);
        jTextField3.setEditable(true);
        jComboBox1.removeAllItems();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        jComboBox1.removeAllItems();
        jComboBox1.addItem("varchar");
        jComboBox1.addItem("int");
        jComboBox1.addItem("float");
        jComboBox1.addItem("date");
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String pk,q;
        q="create table "+jTextField1.getText()+"(";
        int i=0;
        try
        {
        pk=jTable1.getValueAt(i,0).toString();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Query cannot be generated without any column.");
            return;
        }
        try
        {
        while(pk!=null)
        {
        if(i>0)
            q=q+",";
        q=q+jTable1.getValueAt(i,0).toString();
        q=q+" "+jTable1.getValueAt(i,1).toString();
        if(jTable1.getValueAt(i,2).toString().isEmpty()==false)
        q=q+"("+jTable1.getValueAt(i,2).toString()+")";
        pk=jTable1.getValueAt(i,3).toString();
        if(pk.equals("Yes"))
        q=q+" primary key";
        else
        {
        pk=jTable1.getValueAt(i,4).toString();
        if(pk.equals("Yes"))
        q=q+" not null";
        }
        i++;
        pk=jTable1.getValueAt(i,0).toString();
        }
        }
        catch(Exception e){q=q+");";}
        JOptionPane.showMessageDialog(this,q);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        boolean b=CheckName(jTextField2.getText());
        if(b==false)
        JOptionPane.showMessageDialog(this,"Column name can have only alphabets, digits or _ and it must start with an alphabet only.");
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        boolean b=CheckName(jTextField1.getText());
        if(b==false)
        JOptionPane.showMessageDialog(this,"Table name can have only alphabets, digits or _ and it must start with an alphabet only.");
    }//GEN-LAST:event_jTextField1FocusLost

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Reset();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int i=jTable1.getSelectedRow();
        tm.removeRow(i);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained

    }//GEN-LAST:event_jTextField3FocusGained

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        
    }//GEN-LAST:event_jComboBox1FocusLost

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(jComboBox1.getSelectedIndex()==1||jComboBox1.getSelectedIndex()==2||jComboBox1.getSelectedIndex()==3)
        {
            jTextField3.setEditable(false);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}