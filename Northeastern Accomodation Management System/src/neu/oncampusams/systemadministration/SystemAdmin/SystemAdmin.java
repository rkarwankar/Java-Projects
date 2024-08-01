/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package neu.oncampusams.systemadministration.SystemAdmin;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import neu.oncampusams.campusadministration.CampusAdmin.*;
import neu.oncampusams.databaseConnection.JDBCConnection;



/**
 *
 * @author Yamini Manral
 */
public class SystemAdmin extends javax.swing.JFrame {

    String emailID;

    /**
     * Creates new form Warden1
     */
    public SystemAdmin() {
        initComponents();
    }

    public SystemAdmin(String eid) {
        initComponents();
        emailID = eid; //passing the value of emailid
    }
    CampusAdminInfoDirectory caiDir = new CampusAdminInfoDirectory();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        viewAdmins = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        searchField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        viewStudents = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblEmailId2 = new javax.swing.JLabel();
        lblPrsnlEmail2 = new javax.swing.JLabel();
        lblPhone2 = new javax.swing.JLabel();
        lblNewPass4 = new javax.swing.JLabel();
        lblNewPass5 = new javax.swing.JLabel();
        oneBhk = new javax.swing.JTextField();
        twoBhk = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Shared = new javax.swing.JTextField();
        stuRes = new javax.swing.JTextField();
        lblNewPass6 = new javax.swing.JLabel();
        bCampus = new javax.swing.JTextField();
        addDetails2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System Administrator Portal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/neulogo1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 160));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Location:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 90, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Northeastern University");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 270, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("On-Campus Accommodation");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 270, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmail.setText("email");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 270, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Welcome!");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 270, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Management System");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 160));

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewAdmins.setBackground(new java.awt.Color(0, 0, 0));
        viewAdmins.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewAdmins.setForeground(new java.awt.Color(255, 255, 255));
        viewAdmins.setText("View");
        viewAdmins.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdminsActionPerformed(evt);
            }
        });
        jPanel2.add(viewAdmins, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 80, 40));

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "email", "campus", "role"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 660, 160));

        searchField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchField1.setText("Search");
        searchField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchField1ActionPerformed(evt);
            }
        });
        searchField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchField1KeyReleased(evt);
            }
        });
        jPanel2.add(searchField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 140, 40));

        jTabbedPane1.addTab("View Admins", new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/admin.png")), jPanel2); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchField.setText("Search");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel3.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 100, 140, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "email", "campus"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, 320));

        viewStudents.setBackground(new java.awt.Color(0, 0, 0));
        viewStudents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewStudents.setForeground(new java.awt.Color(255, 255, 255));
        viewStudents.setText("View");
        viewStudents.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentsActionPerformed(evt);
            }
        });
        jPanel3.add(viewStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 80, 40));

        jTabbedPane1.addTab("View Students", new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/student.png")), jPanel3); // NOI18N

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmailId2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEmailId2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmailId2.setText("1BHK Available");
        jPanel4.add(lblEmailId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 170, 30));

        lblPrsnlEmail2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPrsnlEmail2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPrsnlEmail2.setText("2BHK Available");
        jPanel4.add(lblPrsnlEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 170, 30));

        lblPhone2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPhone2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPhone2.setText("Shared Available");
        jPanel4.add(lblPhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 170, 30));

        lblNewPass4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNewPass4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNewPass4.setText("Student residing");
        jPanel4.add(lblNewPass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 170, 30));

        lblNewPass5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNewPass5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNewPass5.setText("Building name");
        jPanel4.add(lblNewPass5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 210, 30));

        oneBhk.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        oneBhk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBhkActionPerformed(evt);
            }
        });
        jPanel4.add(oneBhk, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 230, 30));

        twoBhk.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        twoBhk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBhkActionPerformed(evt);
            }
        });
        jPanel4.add(twoBhk, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 230, 30));

        Name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel4.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 230, 30));

        Shared.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Shared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SharedActionPerformed(evt);
            }
        });
        jPanel4.add(Shared, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 230, 30));

        stuRes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        stuRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuResActionPerformed(evt);
            }
        });
        jPanel4.add(stuRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 230, 30));

        lblNewPass6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNewPass6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNewPass6.setText("Building campus");
        jPanel4.add(lblNewPass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 210, 30));

        bCampus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCampusActionPerformed(evt);
            }
        });
        jPanel4.add(bCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 230, 30));

        addDetails2.setBackground(new java.awt.Color(255, 0, 0));
        addDetails2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addDetails2.setForeground(new java.awt.Color(255, 255, 255));
        addDetails2.setText("Add building");
        addDetails2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDetails2ActionPerformed(evt);
            }
        });
        jPanel4.add(addDetails2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 140, 50));

        jTabbedPane1.addTab("Add Buildings", new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/office-building.png")), jPanel4); // NOI18N

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1060, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        
        int a = JOptionPane.showConfirmDialog(null, "Do you really wanna logout?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:

        String query1 = searchField.getText();
        filterSearch1(query1);

    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchField1ActionPerformed

    private void searchField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchField1KeyReleased
        // TODO add your handling code here:
        String query2 = searchField1.getText();
        filterSearch2(query2);

    }//GEN-LAST:event_searchField1KeyReleased

    private void viewStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentsActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String name;
        String email;
        String campus;
        model.setRowCount(0);
        try {
            Connection connection = JDBCConnection.Connect();
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select CONCAT(fName, ' ', lName), emailId, campus from oncampusamsdb.studenttable");

            //push column values to the table fields
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            while (rs.next()) {
                name = rs.getString(1);
                email = rs.getString(2);
                campus = rs.getString(3);
                String[] row = {name, email, campus};
                model.addRow(row);
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_viewStudentsActionPerformed

    private void viewAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdminsActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String name;
        String email;
        String campus;
        String role;
        model.setRowCount(0);
        try {
            Connection connection = JDBCConnection.Connect();
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM oncampusamsdb.viewAdmin;");

            //push column values to the table fieldss
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            while (rs.next()) {
                name = rs.getString(1);
                email = rs.getString(2);
                campus = rs.getString(3);
                role = rs.getString(4);
                String[] row = {name, email, campus, role};
                model.addRow(row);
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_viewAdminsActionPerformed

    private void oneBhkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBhkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneBhkActionPerformed

    private void twoBhkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBhkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoBhkActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void SharedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SharedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SharedActionPerformed

    private void stuResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stuResActionPerformed

    private void bCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCampusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCampusActionPerformed

    private void addDetails2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDetails2ActionPerformed
        //for new building addition
        String name = Name.getText();
        String campus = bCampus.getText();
        String onebhk = oneBhk.getText();
        String twobhk = twoBhk.getText();
        String shared = Shared.getText();
        String residing = stuRes.getText();

        CampusAdminInfo building = new CampusAdminInfo();

        building.setBuilding_name(name);
        building.setCampus(campus);
        building.setOnebhk(onebhk);
        building.setTwobhk(twobhk);
        building.setShared(shared);
        building.setResiding(residing);

        caiDir.addBuilding(building); //calling using object of CAI Directory
        JOptionPane.showMessageDialog(this, "Building created successfully");
        //                gymId.setText("");
        Name.setText("");
        bCampus.setText("");
        oneBhk.setText("");
        twoBhk.setText("");
        Shared.setText("");
        stuRes.setText("");
    }//GEN-LAST:event_addDetails2ActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdmin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Shared;
    private javax.swing.JButton addDetails2;
    private javax.swing.JTextField bCampus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailId2;
    private javax.swing.JLabel lblNewPass4;
    private javax.swing.JLabel lblNewPass5;
    private javax.swing.JLabel lblNewPass6;
    private javax.swing.JLabel lblPhone2;
    private javax.swing.JLabel lblPrsnlEmail2;
    private javax.swing.JButton logout;
    private javax.swing.JTextField oneBhk;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField searchField1;
    private javax.swing.JTextField stuRes;
    private javax.swing.JTextField twoBhk;
    private javax.swing.JButton viewAdmins;
    private javax.swing.JButton viewStudents;
    // End of variables declaration//GEN-END:variables

    public void SetEmailID() {
        lblEmail.setText(emailID);
    }

    private void filterSearch1(String query) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(query));
    }

    private void filterSearch2(String query) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<>(model);
        jTable2.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(query));
    }
}
