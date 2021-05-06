
package employee1;
import java.sql.*;
import javax.swing.JOptionPane;

public class Add extends javax.swing.JFrame {

   
    public Add() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        malebtn = new javax.swing.JRadioButton();
        femalebtn = new javax.swing.JRadioButton();
        GENDER = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        addressfield = new javax.swing.JTextField();
        lnamefield = new javax.swing.JTextField();
        mnamefield = new javax.swing.JTextField();
        fnamefield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));
        jPanel1.setLayout(null);

        addbtn.setText("ADD");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });
        jPanel1.add(addbtn);
        addbtn.setBounds(320, 310, 100, 40);

        cancelbtn.setText("CANCEL");
        cancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbtnMouseClicked(evt);
            }
        });
        jPanel1.add(cancelbtn);
        cancelbtn.setBounds(470, 310, 90, 40);

        malebtn.setText("male");
        malebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malebtnActionPerformed(evt);
            }
        });
        jPanel1.add(malebtn);
        malebtn.setBounds(380, 250, 100, 23);

        femalebtn.setText("female");
        femalebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femalebtnActionPerformed(evt);
            }
        });
        jPanel1.add(femalebtn);
        femalebtn.setBounds(240, 250, 100, 23);

        GENDER.setText("GENDER");
        jPanel1.add(GENDER);
        GENDER.setBounds(80, 250, 90, 30);

        jLabel6.setBackground(new java.awt.Color(255, 204, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 51));
        jLabel6.setText("WELCOME  PEOPLE ------ CREATE");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 0, 389, 53);
        jPanel1.add(emailfield);
        emailfield.setBounds(240, 200, 252, 20);
        jPanel1.add(addressfield);
        addressfield.setBounds(240, 160, 252, 20);
        jPanel1.add(lnamefield);
        lnamefield.setBounds(240, 120, 252, 20);
        jPanel1.add(mnamefield);
        mnamefield.setBounds(240, 90, 252, 20);
        jPanel1.add(fnamefield);
        fnamefield.setBounds(240, 50, 252, 20);

        jLabel1.setText("FIRST NAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 50, 110, 14);

        jLabel2.setText("MIDDLE NAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 80, 130, 14);

        jLabel3.setText("LAST NAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 110, 100, 14);

        jLabel4.setText("ADDRESS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 150, 70, 14);

        jLabel5.setText("EMAIL ADDRESS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 200, 120, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 940, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   String gender;
    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        String fname = fnamefield.getText();
        String mname = mnamefield.getText();
        String lname = lnamefield.getText();
        String address = addressfield.getText();
        String email = emailfield.getText();
        
        
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); //load the driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", ""); //establishes the connection
            Statement stmt = (Statement) con.createStatement(); //get the connection stream(connection port)
            String query = "INSERT INTO `employee_data`(`id`, `firstName`, `middleName`, `lastName`, `address`, `emailAddress`, `gender`) VALUES (NULL,'"+fname+"','"+mname+"','"+lname+"','"+address+"','"+email+"','"+gender+"')";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Successfully Added");
            new Retrieve().setVisible(true);
            this.setVisible(false);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        
        }
    }//GEN-LAST:event_addbtnMouseClicked

    private void femalebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femalebtnActionPerformed
        gender = "Female";
    }//GEN-LAST:event_femalebtnActionPerformed

    private void malebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malebtnActionPerformed
        gender = "Male";
    }//GEN-LAST:event_malebtnActionPerformed

    private void cancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseClicked
       new Retrieve ().setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_cancelbtnMouseClicked

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GENDER;
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField addressfield;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTextField emailfield;
    private javax.swing.JRadioButton femalebtn;
    private javax.swing.JTextField fnamefield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lnamefield;
    private javax.swing.JRadioButton malebtn;
    private javax.swing.JTextField mnamefield;
    // End of variables declaration//GEN-END:variables
}
