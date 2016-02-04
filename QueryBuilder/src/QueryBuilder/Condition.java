package QueryBuilder;
import java.sql.*;
import javax.swing.*;

public class Condition extends javax.swing.JDialog {
Connection con;
int a,b;
String s[],t,u=" where ",v="";
    public Condition(java.awt.Frame parent, boolean modal, Connection cn,String h[],int m,int n) {
        super(parent, modal);
        initComponents();
        con=cn;
        s=h;
        a=m;
        b=n;
        Options.y="";
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        jCheckBox1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14));
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
        jComboBox1.setBounds(160, 70, 200, 20);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "less than <", "greater than >", "less than or equal to <=", "greater than or equal to >=", "equal to =", "not equal to <>", "is null", "in", "between", "like ( %t )", "like ( t% )", "like ( %t% )" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.setToolTipText("");
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox2FocusLost(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(160, 120, 198, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Select Field :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 70, 100, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Select Operation :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 120, 120, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Value :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 190, 60, 17);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 190, 200, 20);

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 340, 90, 23);

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 300, 80, 23);

        jButton3.setText("Order By");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 300, 90, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel4.setText("ADD CONDITION");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 10, 230, 29);

        jButton4.setText("Add Condition");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(120, 300, 130, 23);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("AND");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(130, 250, 60, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("OR");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(200, 250, 60, 23);

        jCheckBox1.setText("not");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(160, 160, 81, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("NONE");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(160, 220, 53, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(a==-1)
        {
            JOptionPane.showMessageDialog(this, "Order By cannot be applied to a delete statement.");
            return;
        }
        if(b==-1)
        {
            JOptionPane.showMessageDialog(this, "Order By cannot be applied to a update statement.");
            return;
        }
        OrderBy o1=new OrderBy(null,true,con,s);
        o1.setBounds(500,200,350,300);
        o1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jComboBox1.removeAllItems();
        jTextField1.setText("");
        if(jCheckBox1.isSelected())
        jCheckBox1.doClick();
        jRadioButton1.setSelected(true);
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jCheckBox1.setVisible(false);
        Options.y="";
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        jComboBox1.removeAllItems();
        int i=0;
        int j=s.length;
        while(i<(j-1))
        {
            jComboBox1.addItem(s[i]);
            i++;
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

    private void jComboBox2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeVisible

    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeVisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jRadioButton1.isSelected()==true)
        {
            v=" and ";
        }
        if(jRadioButton2.isSelected()==true)
        {
            v=" or ";
        }
        if(jComboBox2.getSelectedIndex()==0)
        {
            t="<";
            u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" "+jTextField1.getText();
        }
        if(jComboBox2.getSelectedIndex()==1)
        {
            t=">";
            u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" "+jTextField1.getText();
        }
        if(jComboBox2.getSelectedIndex()==2)
        {
            t="<=";
            u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" "+jTextField1.getText();
        }
        if(jComboBox2.getSelectedIndex()==3)
        {
            t=">=";
            u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" "+jTextField1.getText();
        }
        if(jComboBox2.getSelectedIndex()==4)
        {
            t="=";
            u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" '"+jTextField1.getText()+"'";
        }
        if(jComboBox2.getSelectedIndex()==5)
        {
            t="<>";
            u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" '"+jTextField1.getText()+"'";
        }
        if(jComboBox2.getSelectedIndex()==6)
        {
            t="is";
            if(jCheckBox1.isSelected()==true)
                u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" not null";
            else
                u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" null";
        }
        if(jComboBox2.getSelectedIndex()==7)
        {
            t="in";
            if(jCheckBox1.isSelected()==true)
                u=u+v+jComboBox1.getSelectedItem().toString()+" not "+t+" ("+jTextField1.getText()+")";
            else
                u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" ("+jTextField1.getText()+")";
        }
        if(jComboBox2.getSelectedIndex()==8)
        {
            t="between";
            if(jCheckBox1.isSelected()==true)
                u=u+v+jComboBox1.getSelectedItem().toString()+" not "+t+" "+jTextField1.getText();
            else
                u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" "+jTextField1.getText();
        }
        if(jComboBox2.getSelectedIndex()==9)
        {
            t="like";
            if(jCheckBox1.isSelected()==true)
                u=u+v+jComboBox1.getSelectedItem().toString()+" not "+t+" '%"+jTextField1.getText()+"'";
            else
                u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" '%"+jTextField1.getText()+"'";
        }
        if(jComboBox2.getSelectedIndex()==10)
        {
            t="like";
            if(jCheckBox1.isSelected()==true)
                u=u+v+jComboBox1.getSelectedItem().toString()+" not "+t+" '"+jTextField1.getText()+"%'";
            else
                u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" '"+jTextField1.getText()+"%'";
        }
        if(jComboBox2.getSelectedIndex()==11)
        {
            t="like";
            if(jCheckBox1.isSelected()==true)
                u=u+v+jComboBox1.getSelectedItem().toString()+" not "+t+" '%"+jTextField1.getText()+"%'";
            else
                u=u+v+jComboBox1.getSelectedItem().toString()+" "+t+" '%"+jTextField1.getText()+"%'";
        }
        Options.y=u;
        jRadioButton1.setVisible(true);
        jRadioButton1.setSelected(true);
        jRadioButton2.setVisible(true);
        jComboBox1.removeAllItems();
        jTextField1.setText("");
        if(jCheckBox1.isSelected())
        jCheckBox1.doClick();
        jCheckBox1.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedIndex()==6||jComboBox2.getSelectedIndex()==7||jComboBox2.getSelectedIndex()==8||jComboBox2.getSelectedIndex()==9||jComboBox2.getSelectedIndex()==10||jComboBox2.getSelectedIndex()==11)
            jCheckBox1.setVisible(true);
        else
            jCheckBox1.setVisible(false);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost

    }//GEN-LAST:event_jTextField1FocusLost

    private void jComboBox2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusLost
        if(jComboBox2.getSelectedIndex()==0||jComboBox2.getSelectedIndex()==1||jComboBox2.getSelectedIndex()==2||jComboBox2.getSelectedIndex()==3)
        {
            JOptionPane.showMessageDialog(this, "Insert value of numeric type(i.e. integers) or date type(i.e. dd-mmm-yyyy) only.");
            return;
        }
        if(jComboBox2.getSelectedIndex()==6)
        {
            jTextField1.setEditable(false);
        }
        if(jComboBox2.getSelectedIndex()==7)
        {
            JOptionPane.showMessageDialog(this, "Insert various values seperated by 'comma' symbols(,).");
            return;
        }
        if(jComboBox2.getSelectedIndex()==8)
        {
            JOptionPane.showMessageDialog(this, "Insert the two values seperated by 'and' symbol(and).");
            return;
        }
    }//GEN-LAST:event_jComboBox2FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
