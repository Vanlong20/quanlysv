/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asmjava3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab2.QuanLySV;
import lab3.Sinhvien;

/**
 *
 * @author pc
 */
public class QLDiem extends javax.swing.JFrame {
    DefaultTableModel model;
    ArrayList<Grade> list = new ArrayList<Grade>();
    int current = 0;
    int index =-1;
    String username = "sa";
    String pass = "123";
    String Url = "jdbc:sqlserver://localhost:1433;databaseName=asm_java3";
    
    
    public QLDiem() {
        initComponents();
        setLocationRelativeTo(null);
        load_data();
        display(current);
        dulieulenbang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txttimkie = new javax.swing.JTextField();
        btntim = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmasv = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txttienganh = new javax.swing.JTextField();
        txttin = new javax.swing.JTextField();
        txtgdtc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTB = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdiem = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Quản Lý Điểm Sinh Viên ");

        jLabel2.setText("Tìm kiếm ");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Mã SV ");

        btntim.setIcon(new javax.swing.ImageIcon("D:\\java3\\lam\\Icon\\Icon\\Search.png")); // NOI18N
        btntim.setText("Search ");
        btntim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttimkie, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btntim, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttimkie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntim))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Họ tên Sv ");

        jLabel5.setText("Ma SV");

        jLabel6.setText("Tiếng Anh ");

        jLabel7.setText("Tin học ");

        jLabel8.setText("Giáo dục TC");

        txthoten.setEnabled(false);

        txttin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttinActionPerformed(evt);
            }
        });

        jLabel9.setText("Điểm TB ");

        txtTB.setForeground(new java.awt.Color(204, 0, 204));
        txtTB.setText("0:0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30)
                        .addComponent(txttin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txttienganh))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txthoten))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtgdtc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)
                        .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttienganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txttin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(28, 28, 28)
                        .addComponent(txtTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtgdtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        btnsave.setIcon(new javax.swing.ImageIcon("D:\\java3\\lam\\Icon\\Icon\\Save.png")); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\java3\\lam\\Icon\\Icon\\User.png")); // NOI18N
        jButton3.setText("New");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("D:\\java3\\lam\\Icon\\Icon\\Numbered list.png")); // NOI18N
        jButton4.setText("Update ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("D:\\java3\\lam\\Icon\\Icon\\Delete.png")); // NOI18N
        jButton5.setText("Delete ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("<<");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText(">>");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText(">");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        tbdiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma Sv", "Ho ten", "Tieng Anh", "Tin hoc", "GDTC", "Diem TB"
            }
        ));
        tbdiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdiem);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Sinh vien có điểm cao nhất");

        btnexit.setText("thoat");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnsave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(23, 23, 23)
                        .addComponent(btnsave)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttinActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
navNext();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
       save();
       loadDatatoAray();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tbdiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdiemMouseClicked
        // TODO add your handling code here:
        int r = tbdiem.getSelectedRow();
        if(r <0){
            return;
        }
       
        txthoten.setText(tbdiem.getValueAt(r, 1).toString());
        txtmasv.setText(tbdiem.getValueAt(r, 0).toString());
        txttin.setText(tbdiem.getValueAt(r,2).toString());
        txttienganh.setText(tbdiem.getValueAt(r, 3).toString());
        txtgdtc.setText(tbdiem.getValueAt(r, 4).toString());
      
       
    }//GEN-LAST:event_tbdiemMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        xoa();
        loadDatatoAray();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        moi();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        uppdate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btntimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimActionPerformed
        // TODO add your handling code here:
        timki();
    }//GEN-LAST:event_btntimActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this,"bạn có muốn thoát kông", "thoát", JOptionPane.YES_NO_OPTION);
        if(chon == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        navFirst();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
navPre();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
navLast();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(QLDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btntim;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdiem;
    private javax.swing.JTextField txtTB;
    private javax.swing.JTextField txtgdtc;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txttienganh;
    private javax.swing.JTextField txttimkie;
    private javax.swing.JTextField txttin;
    // End of variables declaration//GEN-END:variables
// cho dữ liệu từ grande lên tbdiem
    public void load_data(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection connect = null;
            connect =DriverManager.getConnection(Url, username, pass);
           
                System.out.println("Connect Successfully");
                PreparedStatement ps = connect.prepareStatement("select Student.masv, hoten, tiengAnh,tinHoc,GDTC, (tinHoc+tiengAnh+GDTC)/3 as 'DiemTb'" +
                "from Student,Grade " +
                "where Student.masv = Grade.masv");
                ResultSet rs = ps.executeQuery();

                list.clear();
//xử lý dữ liệu
                while(rs.next()){
                    Grade gr = new Grade();
                    gr.setMasv(rs.getString("masv"));
                    gr.setHoten(rs.getString("hoten"));
                    gr.setTiengAnh(rs.getInt("tinHoc"));
                    gr.setTinHoc(rs.getInt("tiengAnh"));
                    gr.setGDTC(rs.getInt("GDTC"));

                    list.add(gr);

                }
                // hieenr thi leen tb
               model = (DefaultTableModel) tbdiem.getModel();
                model.setRowCount(0);
                for (Grade gr : list) {
                   Object[] row = new Object[]{gr.getMasv(),gr.getHoten(),gr.getTiengAnh(),gr.getTinHoc(),gr.getGDTC(),gr.getDiemTB()};
                   model.addRow(row);
                }

          
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void save(){
//       

            try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection connect = null;
         connect=DriverManager.getConnection(Url, username, pass);
         String sql = "insert into Grade values(?,?,?,?)";
         PreparedStatement st = connect.prepareStatement(sql);
         st.setString(1, txtmasv.getText());
         st.setInt(2, Integer.parseInt(txttin.getText()));
         st.setInt(3, Integer.parseInt(txttienganh.getText()));
         st.setInt(4, Integer.parseInt(txtgdtc.getText()));
            //thi hành
            int kq = st.executeUpdate();
            if(kq==1)
            {
                JOptionPane.showMessageDialog(this,"thêm thành công");
            }
            st.close();
            connect.close();    
         
     } catch (Exception e) {
         e.printStackTrace();
     }
     
    }
    
    
    public void loadDatatoAray() {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connect = null;
            connect = DriverManager.getConnection(Url, username, pass);
            Statement st = connect.createStatement();
            String sql = "Select *From Grade";
            ResultSet rs = st.executeQuery(sql);
            list.clear();
             while(rs.next()){
                    Grade gr = new Grade();
                    gr.setMasv(rs.getString("masv"));
                    gr.setHoten(rs.getString("hoten"));
                    gr.setTiengAnh(rs.getInt("tiengAnh"));
                    gr.setTinHoc(rs.getInt("tinHoc"));
                    gr.setGDTC(rs.getInt("GDTC"));
                    gr.getDiemTB();
                list.add(gr);
               

            }
            dulieulenbang();
            connect.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   public void display(int i){
       Grade gr = list.get(i);
       txtmasv.setText(gr.masv);
       txthoten.setText(gr.hoten);
      txttin.setText(String.valueOf(gr.tinHoc));
      txttienganh.setText(String.valueOf(gr.tiengAnh));
      txtgdtc.setText(String.valueOf(gr.tiengAnh));
      txtTB.setText(String.valueOf(gr.getDiemTB()));
   }
   public  void moi(){
       txttimkie.setText("");
       txtmasv.setText("");
       txtTB.setText("");
       txtgdtc.setText("");
       txttienganh.setText("");
       txthoten.setText("");
       txttin.setText("");
   }
   public void uppdate(){
//       try {
//           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//           Connection conect =DriverManager.getConnection(Url, username, pass);
//           String sql = "update Grade set tiengAnh=?,tinHoc=?,GDTC=? where masv=?";
//           PreparedStatement ps = conect.prepareStatement(sql);
////           st.setString(1,txtma.getText());
////           st.setString(1,txtmasv.getText());
////           
////           st.setInt(2,Integer.parseInt(txttienganh.getText()));
////           st.setInt(3,Integer.parseInt(txttin.getText()));
////           st.setInt(4,Integer.parseInt(txtgdtc.getText()));
////           st.executeUpdate();
// ps.setString(4, txtmasv.getText());
//            ps.setInt(1, Integer.parseInt(txttienganh.getText()));
//            ps.setInt(2, Integer.parseInt(txttin.getText()));
//            ps.setInt(3, Integer.parseInt(txtgdtc.getText()));
//           
//            int kq = ps.executeUpdate();
//            if(kq==1){
//                JOptionPane.showMessageDialog(this,"sửa thành công");
//            }
//           conect.close();
//           loadDatatoAray();
//           
//           
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
 int selectedRow = tbdiem.getSelectedRow();

        if (selectedRow >= 0) {
            Grade updatedStudent = list.get(selectedRow);

            int updatedTiengAnh = Integer.parseInt(txttienganh.getText().trim());
            int updatedTinHoc = Integer.parseInt(txttin.getText().trim());
            int updatedGDTC = Integer.parseInt(txtgdtc.getText().trim());

            String updateQuery = "UPDATE Gread SET tiengAnh = ?, tinHoc = ?, GDTC = ? WHERE masv = ?";

            try (Connection connection = DriverManager.getConnection(Url, username, pass);
               PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

                preparedStatement.setInt(1, updatedTiengAnh);
                preparedStatement.setInt(2, updatedTinHoc);
                preparedStatement.setInt(3, updatedGDTC);
                preparedStatement.setString(4, txtmasv.getText());

                preparedStatement.executeUpdate();

               loadDatatoAray();
             dulieulenbang();

                JOptionPane.showMessageDialog(this, "Cập nhật sinh viên thành công!");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật sinh viên trong cơ sở dữ liệu");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sinh viên cần cập nhật!");
        }
   }
 public void xoa(){
            try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection connect = null;
         connect=DriverManager.getConnection(Url, username, pass);
         String sql = "delete from Grade where masv = ?";
         PreparedStatement st = connect.prepareStatement(sql);
         st.setString(1, txtmasv.getText());
        
            //thi hành
            int kq = st.executeUpdate();
            if(kq==1)
            {
                JOptionPane.showMessageDialog(this,"Xóa thành công");
            }
            st.close();
            connect.close();    
         
     } catch (Exception e) {
         e.printStackTrace();
     }
     
    }
 public void timki(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection connect = null;
            connect =DriverManager.getConnection(Url, username, pass);
           
                System.out.println("Connect Successfully");
                PreparedStatement ps = connect.prepareStatement("select Student.masv, hoten, tiengAnh,tinHoc,GDTC, (tinHoc+tiengAnh+GDTC)/3 as 'DiemTb'" +
                "from Student,Grade " +
                "where Student.masv = Grade.masv AND Student.masv = ?" );
                
                // truyền tham số
                ps.setString(1, txttimkie.getText());
                ResultSet rs = ps.executeQuery();

                list.clear();
//xử lý dữ liệu
                while(rs.next()){
                    Grade gr = new Grade();
                    gr.setMasv(rs.getString("masv"));
                    gr.setHoten(rs.getString("hoten"));
                    gr.setTiengAnh(rs.getInt("tinHoc"));
                    gr.setTinHoc(rs.getInt("tiengAnh"));
                    gr.setGDTC(rs.getInt("GDTC"));

                    list.add(gr);

                }
                // hieenr thi leen tb
               model = (DefaultTableModel) tbdiem.getModel();
                model.setRowCount(0);
                for (Grade gr : list) {
                   Object[] row = new Object[]{gr.getMasv(),gr.getHoten(),gr.getTiengAnh(),gr.getTinHoc(),gr.getGDTC(),gr.getDiemTB()};
                   model.addRow(row);
                }

          
            
        } catch (Exception e) {
            e.printStackTrace();
        }
 }
   
  private void navFirst() {
        index = 0;
        updateInfoNav();
    }

    private void navPre() {
        if (index > 0) {
            index--;
        } else {
            navLast();
        }
        updateInfoNav();
    }

    private void navNext() {
        if (index < list.size() - 3) {
            index++;
        } else {
            navFirst();
        }
        updateInfoNav();
    }

    private void navLast() {
        index = Math.max(0, list.size() - 3);
        updateInfoNav();
    }

    private void updateInfoNav() {
        tbdiem.setRowSelectionInterval(index, index);
        display(index);
    } 
    
     public void dulieulenbang(){
       model=(DefaultTableModel) tbdiem.getModel();
        model.setRowCount(0);
        for (Grade sv : list) {
            Object row[] = new Object[]{sv.getMasv(),sv.getHoten(),sv.getTiengAnh(),sv.getTinHoc(),sv.getGDTC(),sv.getDiemTB()};
            model.addRow(row);
        }
        tbdiem.setModel(model);
}
}