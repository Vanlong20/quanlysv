/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asmjava3;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab3.Sinhvien;

/**
 *
 * @author pc
 */
public class QLSV extends javax.swing.JFrame {
    ArrayList<SinhVien> listm = new ArrayList<>();
    int current = 0;
    int index = -1;
    DefaultTableModel modelsv;
    String user = "sa";
    String pass = "123";
    String Url ="jdbc:sqlserver://localhost:1433;databaseName=asm_java3";
     Statement st;
                 
    public QLSV() {
        initComponents();
        setLocationRelativeTo(null);
        dulieuArray();
        dulieulenbang();
        display(current);
      
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtdt = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbsinhvien = new javax.swing.JTable();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        lbhinhanh = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Quản Lý Sinh Viên  ");

        jLabel2.setText("Ma SV");

        jLabel3.setText("Họ Tên ");

        jLabel4.setText("Email ");

        jLabel5.setText("Số DT");

        jLabel6.setText("Giới tính ");

        jLabel7.setText("Địa chỉ");

        txthoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthotenActionPerformed(evt);
            }
        });

        txtdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtActionPerformed(evt);
            }
        });

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        jScrollPane1.setViewportView(txtdiachi);

        btnnew.setIcon(new javax.swing.ImageIcon("D:\\java3\\java3sl\\JavaApplication37\\src\\Iconm\\User.png")); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnsave.setIcon(new javax.swing.ImageIcon("D:\\java3\\java3sl\\JavaApplication37\\src\\Iconm\\Save.png")); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setIcon(new javax.swing.ImageIcon("D:\\java3\\java3sl\\JavaApplication37\\src\\Iconm\\Delete.png")); // NOI18N
        btndelete.setText("Delate");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setIcon(new javax.swing.ImageIcon("D:\\java3\\java3sl\\JavaApplication37\\src\\Iconm\\Open letter.png")); // NOI18N
        btnupdate.setText("Update ");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        tbsinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ Tên", "Email", "Số ĐT", "Giới Tính", "Địa chỉ", "Hình"
            }
        ));
        tbsinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsinhvienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbsinhvien);

        buttonGroup1.add(rdNam);
        rdNam.setSelected(true);
        rdNam.setText("Nam");

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");

        lbhinhanh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbhinhanh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbhinhanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbhinhanhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtma, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(txthoten)
                        .addComponent(txtemail)
                        .addComponent(txtdt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdNam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btnnew, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbhinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(lbhinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdNam)
                                .addComponent(rdNu))
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnew)
                            .addComponent(btnsave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndelete)
                            .addComponent(btnupdate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txthotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthotenActionPerformed

    private void txtdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtActionPerformed

    private void lbhinhanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbhinhanhMouseClicked
        try {
            // TODO add your handling code here:
            JFileChooser jfc = new JFileChooser("D:\\java3\\java3sl\\JavaApplication37\\src\\Iconm");
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            Image img = ImageIO.read(file);
            lbhinhanh.setText("");
            int W = lbhinhanh.getWidth();
            int h = lbhinhanh.getHeight();
            lbhinhanh.setIcon(new ImageIcon(img.getScaledInstance(W, h, 0)));
        } catch (IOException ex) {
            System.out.println("Error:"+ ex.toString());
        }
    }//GEN-LAST:event_lbhinhanhMouseClicked

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
        txtma.setText("");
        txthoten.setText("");
        txtdiachi.setText("");
        txtdt.setText("");
        txtemail.setText("");
        rdNam.isSelected();
        lbhinhanh.setText("Hinh anh");
        lbhinhanh.setIcon(null);
        
        
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if(validateFrom()){
            
            luu();
        }else{
            JOptionPane.showMessageDialog(this,"Chưa nhập dầy đủ thông tin");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tbsinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsinhvienMouseClicked
        // TODO add your handling code here:
//        int r = tbsinhvien.getSelectedRow();
//        SinhVien sv = listm.get(r);
//        if(r <0){
//            return;
//        }
//        txtma.setText(tbsinhvien.getValueAt(r, 0).toString());
//        txthoten.setText(tbsinhvien.getValueAt(r, 1).toString());
//        txtemail.setText(tbsinhvien.getValueAt(r, 2).toString());
//        txtdt.setText(tbsinhvien.getValueAt(r,3).toString());
//        //
//         if(sv.isGioitinh()){
//           rdNam.setSelected(true);
//           
//       }else{
//           rdNu.setSelected(true);
//           
//       }
//           
//        
//        txtdiachi.setText(tbsinhvien.getValueAt(r, 5).toString());
current = tbsinhvien.getSelectedRow();
showDetails();
    }//GEN-LAST:event_tbsinhvienMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        xoa();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        uppdate();
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbhinhanh;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbsinhvien;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txtdt;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtma;
    // End of variables declaration//GEN-END:variables
public  boolean validateFrom(){
    if(txtma.getText().isEmpty() || txthoten.getText().isEmpty() || 
            txtemail.getText().isEmpty() || txtdiachi.getText().isEmpty() 
            || txtdt.getText().isEmpty()){
        return false;
    }
    return true;
}
//public SinhVien getModel(){
//    SinhVien sv = new SinhVien();
//    sv.setMaSV(txtma.getText());
//    sv.setTenSV(txthoten.getText());
//    boolean gt = false;
//    if(rdNam.isSelected()){
//        gt =  true;
//    }
//    
//    sv.setGioitinh(gt);
//    sv.setDiachi(txtdiachi.getText());
//    sv.setHinhanh("");
//  return sv;
//}
// tạo dữ liệu cho bảng
public void dulieuArray(){
    try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connect =(Connection) DriverManager.getConnection(Url,user,pass);
            if(connect != null){
                
                Statement st =  connect.createStatement();
                String sql ="Select * from Student";
                ResultSet rs  =(ResultSet) st.executeQuery(sql);
                listm.clear();
                while(rs.next()){
                    String ma = rs.getString("masv");
                    String hoten = rs.getString("hoten");
                    String email = rs.getString("email");
                    String sodt = rs.getString("soDT");
                    boolean gt= rs.getBoolean("Gioitinh");
                    String diachi = rs.getString("diachi");
                    String hinh = rs.getString("hinh");
                   
                    SinhVien sv = new SinhVien(ma, hoten, email, sodt,gt, diachi,hinh);
                    listm.add(sv);
                }
                connect.close();
                
            }
            else{
                System.out.println("Kết nối không thành công");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
}
public void dulieulenbang(){
       modelsv=(DefaultTableModel) tbsinhvien.getModel();
        modelsv.setRowCount(0);
        for (SinhVien sv : listm) {
            Object row[] = new Object[]{sv.getMaSV(),sv.getTenSV(),sv.getEmail(),sv.getSoDT(),sv.isGioitinh(),sv.getDiachi(),sv.getHinhanh()};
            modelsv.addRow(row);
        }
        tbsinhvien.setModel(modelsv);
}
public void display(int i){
    SinhVien sv = listm.get(i);
        txtma.setText(sv.getMaSV());
        txthoten.setText(sv.getTenSV());
        txtemail.setText(sv.getEmail());
        txtdt.setText(sv.getSoDT());
        
        boolean gt = sv.isGioitinh();
        if (gt == true) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(false);
        }
        txtdiachi.setText(sv.getDiachi());
       
}
 public void uppdate(){
     if(txtma.getText().equals("")){
         JOptionPane.showMessageDialog(this,"Mã sinh viên không được bỏ chống");
         txtma.requestFocus();
         return;
     }
       try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection conect =DriverManager.getConnection(Url, user, pass);
           String sql = "update Student set hoten=?, email=?,soDT=?,Gioitinh=?,diachi=? where masv=?";
           PreparedStatement st = conect.prepareStatement(sql);
           
           
           st.setString(1,txthoten.getText().trim());
           st.setString(2, txtemail.getText().trim());
           
           st.setString(3, txtdt.getText().trim());
           boolean gt =true;
           if(rdNam.isSelected()){
               gt=true;
           }if(rdNu.isSelected()){
               gt=false;
           }
           st.setBoolean(4, gt);
           st.setString(5, txtdiachi.getText().trim());
      
           
             st.setString(6,txtma.getText());
             
           st.executeUpdate();
           JOptionPane.showMessageDialog(this,"cập nhật thành công");
           conect.close();
           dulieuArray();
           dulieulenbang();
          
           
           
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
 public void luu(){
     try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection connect = null;
         connect=DriverManager.getConnection(Url, user, pass);
         String sql = "insert into Student values(?,?,?,?,?,?,?)";
         PreparedStatement st = connect.prepareStatement(sql);
         st.setString(1, txtma.getText());
         st.setString(2, txthoten.getText());
         st.setString(3, txtemail.getText());
         st.setString(4, txtdt.getText());
         boolean gt;
            if (rdNam.isSelected()) {
                gt = true;
            } else {
                gt = false;
            }
            st.setBoolean(5, gt);
         st.setString(6, txtdiachi.getText());
         st.setString(7, lbhinhanh.getText());
         st.executeUpdate();
         JOptionPane.showMessageDialog(this,"thêm thành công");
         connect.close();
         dulieuArray();
         dulieulenbang();
         
         
         
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
 public void xoa(){
     if(txtma.getText().equals("")){
         JOptionPane.showMessageDialog(this,"Nhập mã sv");
         txtma.requestFocus();
         return;
     }
     try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection connect = null;
         connect=DriverManager.getConnection(Url, user, pass);
         String sql = "Delete from Student where Masv =?";
          PreparedStatement st = connect.prepareStatement(sql);
          st.setString(1, txtma.getText());
            st.execute();
            JOptionPane.showMessageDialog(this, "xóa thành công");
            connect.close();
           dulieuArray();
           dulieulenbang();
            display(current);
            current = 0;
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
 public void showDetails(){
     txtma.setText(tbsinhvien.getValueAt(current, 0).toString());
     txthoten.setText(tbsinhvien.getValueAt(current, 1).toString());
     txtemail.setText(tbsinhvien.getValueAt(current, 2).toString());
     txtdt.setText(tbsinhvien.getValueAt(current, 3).toString());
     Boolean gt =Boolean.parseBoolean(tbsinhvien.getValueAt(current, 4).toString());
        if(gt==true){
           rdNam.setSelected(true);
           
       }else{
           rdNu.setSelected(true);
           
       }
     txtdiachi.setText(tbsinhvien.getValueAt(current, 5).toString());
//     Updatehinh(tbsinhvien.getValueAt(current, 6).toString());
    lbhinhanh.setIcon(new ImageIcon(tbsinhvien.getValueAt(current, 6).toString()));
 }
 public void Updatehinh(String image){
     ImageIcon image1= new ImageIcon("D:/java3/java3sl/JavaApplication37/src/Iconm/"+image);
     //                               D:\java3\java3sl\JavaApplication37\src\Iconm
     Image im = image1.getImage();
     ImageIcon icon = new ImageIcon(im.getScaledInstance(lbhinhanh.getWidth(), lbhinhanh.getHeight(), im.SCALE_SMOOTH));
     lbhinhanh.setIcon(icon);
 }

   
}
