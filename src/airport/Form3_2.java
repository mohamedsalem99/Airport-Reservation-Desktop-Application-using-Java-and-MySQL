/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

//import static airport.Form2.txt_id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Form3_2 extends javax.swing.JFrame {

    /**
     * Creates new form form3
     */
    Connection con;
    public Form3_2() {
        initComponents();
        this.setLocationRelativeTo(null);
        buttonGroup1.add(rbtn_one);
        buttonGroup1.add(rbtn_return);
        buttonGroup1.add(rbtn_multi);
        buttonGroup2.add(rbtn_first);
        buttonGroup2.add(rbtn_local);
        buttonGroup2.add(rbtn_bus);
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport","root","root");
        } catch (SQLException ex) {
            Logger.getLogger(Form3_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        ret_date.setEnabled(false);
    }
    String d="";
public Form3_2(String x) {
        initComponents();
        this.setLocationRelativeTo(null);
        buttonGroup1.add(rbtn_one);
        buttonGroup1.add(rbtn_return);
        buttonGroup1.add(rbtn_multi);
        buttonGroup2.add(rbtn_first);
        buttonGroup2.add(rbtn_local);
        buttonGroup2.add(rbtn_bus);
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport","root","root");
        } catch (SQLException ex) {
            Logger.getLogger(Form3_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        d=x;
        ret_date.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rbtn_one = new javax.swing.JRadioButton();
        rbtn_return = new javax.swing.JRadioButton();
        rbtn_multi = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comb_to = new javax.swing.JComboBox<>();
        comb_from = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Dep_date = new com.toedter.calendar.JDateChooser();
        ret_date = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txt_lug = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rbtn_first = new javax.swing.JRadioButton();
        rbtn_bus = new javax.swing.JRadioButton();
        rbtn_local = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Price:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 450, 90, 30);

        rbtn_one.setText("OneWay");
        rbtn_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_oneActionPerformed(evt);
            }
        });
        jPanel1.add(rbtn_one);
        rbtn_one.setBounds(240, 40, 90, 25);

        rbtn_return.setText("ReturnTrip");
        rbtn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_returnActionPerformed(evt);
            }
        });
        jPanel1.add(rbtn_return);
        rbtn_return.setBounds(240, 80, 89, 25);

        rbtn_multi.setText("MultiCities");
        rbtn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_multiActionPerformed(evt);
            }
        });
        jPanel1.add(rbtn_multi);
        rbtn_multi.setBounds(240, 120, 90, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("From:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 190, 80, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("To:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 260, 29, 30);

        comb_to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algiers-Algeria", "Buenos_Aires-Argentina", "Canberra-Australia", "Manama-Bahrain", "Brussels-Belgium", "Sarajevo-Bosnia&Herzegovina", "Brasilia-Brazil", "Yaound??-Cameroon", "Ottawa-Canada", "Santiago-Chile", "Beijing-China", "Zagreb-Croatia", "Copenhagen-Denmark", "Nicosia-Cyprus", "Paris-France", "Berlin-Germany", "Athens-Greece", "Delhi-India", "Tehran-Iran", "Baghdad-Iraq", "Rome-Italy", "Tokyo-Japan", "Mexico_City-Mexico", "Rabat-Morocco", "Amsterdam-Netherlands", "Oslo-Norway", "Manila-Philippines", "Riyadh-SaudiArabia", "Madrid-Spain", "Khartoum-Sudan", "Stockholm-Sweden", "Damascus-Syria", "Tunis-Tunisia", "Ankara-Turkey", "Kyiv-Ukraine", "Abu_Dhabi-UnitedArabEmirates", "London-UnitedKingdom", "Sanaa-Yemen" }));
        jPanel1.add(comb_to);
        comb_to.setBounds(170, 260, 300, 30);

        comb_from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cairo_Egypt" }));
        jPanel1.add(comb_from);
        comb_from.setBounds(170, 190, 300, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Depature:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(540, 240, 100, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Return:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(550, 310, 90, 60);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(850, 450, 150, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 450, 150, 40);
        jPanel1.add(Dep_date);
        Dep_date.setBounds(670, 250, 340, 22);
        jPanel1.add(ret_date);
        ret_date.setBounds(670, 330, 340, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Class of the trip:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 40, 190, 30);

        txt_lug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lugActionPerformed(evt);
            }
        });
        jPanel1.add(txt_lug);
        txt_lug.setBounds(180, 360, 200, 30);

        txt_price.setEnabled(false);
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        jPanel1.add(txt_price);
        txt_price.setBounds(510, 430, 180, 60);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Find Your Trip:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 40, 190, 30);

        rbtn_first.setText("First class");
        jPanel1.add(rbtn_first);
        rbtn_first.setBounds(780, 40, 85, 25);

        rbtn_bus.setText("Business calss");
        jPanel1.add(rbtn_bus);
        rbtn_bus.setBounds(780, 80, 120, 25);

        rbtn_local.setText("local class");
        jPanel1.add(rbtn_local);
        rbtn_local.setBounds(780, 120, 87, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("luggage:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 360, 90, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airport/flight1320x742.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 1365, 742);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
            
            int id=0;
            try {
            PreparedStatement st=con.prepareStatement("select pass_id from passenger order by pass_id desc limit 1");
                    ResultSet rs=st.executeQuery();
                    while(rs.next())
                    {
                      id = rs.getInt("pass_id");  
                    }
           
                if(d.equals(""))
                {
                    
                    
                   //JOptionPane.showMessageDialog(this, id);
             PreparedStatement stmt = con.prepareStatement("insert into ticket(t_your_trip,t_from,t_to,t_depature,t_class,t_lugg,t_price,t_pass_id) values(?,?,?,?,?,?,?,?)");
            
            String ss="";
            if(rbtn_one.isSelected())
                ss="One way";
            else if(rbtn_return.isSelected())
                ss="Return";
            else if(rbtn_multi.isSelected())
                ss="Multi Cities";
            String from=(String)comb_from.getSelectedItem();
            String to=(String)comb_to.getSelectedItem();
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
         
            String dep_d=df.format(Dep_date.getDate());
            
            stmt.setString(1,ss);
            stmt.setString(2,"Cairo_Egypt");
            stmt.setString(3, to);
            stmt.setString(4,dep_d);
            
            
            String s1="";
            if(rbtn_first.isSelected())
                s1="First class";
            else if(rbtn_local.isSelected())
                s1="local class";
            else if(rbtn_bus.isSelected())
                s1="Business calss";
            stmt.setString(5, s1);
            
            stmt.setInt(6,Integer.parseInt(txt_lug.getText()));
            
            //???? ?????? ???????? ?????????????? ??????????
            
            
            stmt.setInt(7, 56468);
            stmt.setInt(8, id);
            //JOptionPane.showMessageDialog(this,d);
            //stmt.setInt(6,Integer.parseInt(txt_id.getText()));
            if(rbtn_return.isSelected())
            {
                stmt=con.prepareStatement("update ticket set t_return=? where t_pass_id=?");
                String ret_d=df.format(ret_date.getDate());
                stmt.setString(1, ret_d);
                stmt.setInt(2, id);
            }
            stmt.executeUpdate();
            
            
            JOptionPane.showConfirmDialog(this, "data inserted");
        
            Form4 frm=new Form4(from,to);
            Form5 f=new Form5(id,s1);
            this.setVisible(false);
            frm.setVisible(true);
                }
                else
                {
                    
           
                     PreparedStatement stmt=con.prepareStatement("update ticket set t_your_trip=?,ticket.t_from=?,t_to=? ,t_depature=?,t_class=?,t_lugg=?,t_price=? where t_pass_id=?");
                    
                    String ss="";
            if(rbtn_one.isSelected())
                ss="One way";
            else if(rbtn_return.isSelected())
                ss="Return";
            else 
                ss="Multi Cities";
            String from=(String)comb_from.getSelectedItem();
            String to=(String)comb_to.getSelectedItem();
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
         
            String dep_d=df.format(Dep_date.getDate());
            
            stmt.setString(1,ss);
            stmt.setString(2,"Cairo_Egypt");
            stmt.setString(3, to);
            stmt.setString(4,dep_d);
            
            
            String s1="";
            if(rbtn_first.isSelected())
                s1="First class";
            else if(rbtn_local.isSelected())
                s1="local class";
            else if(rbtn_bus.isSelected())
                s1="Business calss";
            stmt.setString(5, s1);
            stmt.setInt(6,Integer.parseInt(txt_lug.getText()));
            stmt.setInt(7, 56468);
            
            
            stmt.setString(8, d);
            if(rbtn_return.isSelected())
            {
                stmt=con.prepareStatement("update ticket set t_return=? where t_pass_id=?");
                String ret_d=df.format(ret_date.getDate());
                stmt.setString(1, ret_d);
                stmt.setInt(2, id);
            }
            stmt.executeUpdate();
            
            
            
            JOptionPane.showConfirmDialog(this, "data updated");
            Form4 frm=new Form4(from,to);
            Form5 f=new Form5(d,s1);
            this.setVisible(false);
            frm.setVisible(true);
                }
        } catch (SQLException ex) {
            Logger.getLogger(Form3_2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbtn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_returnActionPerformed
        // TODO add your handling code here:
        ret_date.setEnabled(true);
    }//GEN-LAST:event_rbtn_returnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void rbtn_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_oneActionPerformed
        // TODO add your handling code here:
        ret_date.setEnabled(false);
    }//GEN-LAST:event_rbtn_oneActionPerformed

    private void rbtn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_multiActionPerformed
        // TODO add your handling code here:
        ret_date.setEnabled(false);
    }//GEN-LAST:event_rbtn_multiActionPerformed

    private void txt_lugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lugActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Form3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form3_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.toedter.calendar.JDateChooser Dep_date;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comb_from;
    private javax.swing.JComboBox<String> comb_to;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton rbtn_bus;
    public static javax.swing.JRadioButton rbtn_first;
    public static javax.swing.JRadioButton rbtn_local;
    private javax.swing.JRadioButton rbtn_multi;
    private javax.swing.JRadioButton rbtn_one;
    private javax.swing.JRadioButton rbtn_return;
    private com.toedter.calendar.JDateChooser ret_date;
    private javax.swing.JTextField txt_lug;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables
}
