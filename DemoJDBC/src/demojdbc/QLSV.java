/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Phuoc Vinh
 */
public class QLSV extends javax.swing.JFrame {
    
    DefaultTableModel model = new DefaultTableModel();
            

 
    public QLSV() {
        initComponents();
        loadData();
        loadcbb();
    }
   
    public void loadcbb()
    {
        ArrayList<String> list = new ArrayList<>();
        try{
            String sql = "SELECT * FROM SinhVien";
            Connect a = new Connect();
            Connection conn = a.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                String khoa = rs.getString("Khoa");
                cbbKhoa.addItem(khoa);
                list.add(khoa);
                
            }
            
//            for(int i = 0; i<list.size();i++)
//            {
//                String khoa = list.get(i).toString();
//                khoa.Com
//            }
            
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }

    public void loadData()
    {
        try{
            jTable1.removeAll();
            String[] arr = {"Ma sv","Ho ten", "Gioi tinh", "Dia chi", "Khoa"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            Connect a = new Connect();
            Connection conn = a.getConnection();
            String query = "Select * from SinhVien";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Vector vector = new Vector();
                vector.add(rs.getString("MaSinhVien"));
                vector.add(rs.getString("TenSinhVien"));
                vector.add(rs.getString("GioiTinh"));
                vector.add(rs.getString("DiaChi"));
                vector.add(rs.getString("Khoa"));
                model.addRow(vector);
                
            }
            jTable1.setModel(model);
            
        }catch(Exception ex)
        {
            System.out.println(ex.toString());
            
        }
        
        
            
//        try{
//            Connect a = new Connect();
//            Connection conn = a.getConnection();
//            int number;
//            Vector row,column = null;
//            Statement st = conn.createStatement();
//           
//            ResultSet rs = st.executeQuery("SELECT * FROM SinhVien");
//             
//            ResultSetMetaData metadata = rs.getMetaData();
//            number = metadata.getColumnCount();
//             System.out.println(number);
//            for(int i = 1 ;i <= number ; i++)
//            {
//                column.add(metadata.getColumnName(i));
//               
//                
//            }
//            
//            model.setColumnIdentifiers(column);
//             
//            while(rs.next())
//            {
//                row = new Vector();
//                for(int i = 0;i<= number; i ++)
//                {
//                    row.addElement(rs.getString(i));
//                   
//                }
//                model.addRow(row);
//                jTable1.setModel(model);
//            }
//            
//            
//        }catch(Exception ex)
//        {
//            System.out.println(ex.toString());
//        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbtnNam = new javax.swing.JRadioButton();
        cbbKhoa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtMaSinhVien = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbtnNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtKhoa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÍ SINH VIÊN");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Mã sinh viên");

        buttonGroup1.add(rbtnNam);
        rbtnNam.setText("Nam");

        cbbKhoa.setName("cbbKhoa"); // NOI18N

        jLabel4.setText("Khoa");

        jLabel5.setText("Giới tính");

        buttonGroup1.add(rbtnNu);
        rbtnNu.setText("Nữ");

        jLabel6.setText("Địa chỉ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cbbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(266, 266, 266))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaSinhVien)
                    .addComponent(txtHoTen)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnNam)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnNu))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(rbtnNu)
                    .addComponent(rbtnNam)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        
            try
            {
                String gioitinh = "";
                if(rbtnNam.isSelected())
                {
                    gioitinh = "Nam";
                }
                else
                {
                    gioitinh = "Nữ";
                }
                Connect a = new Connect();
                Connection conn = a.getConnection();
                String query = "Insert into SinhVien(MaSinhVien, TenSinhVien, GioiTinh, DiaChi, Khoa)" +"Values(?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, txtMaSinhVien.getText());
                ps.setString(2, txtHoTen.getText());
                ps.setString(3, gioitinh);
                ps.setString(4, txtDiaChi.getText());
                ps.setString(5, txtKhoa.getText());
                
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Thêm thành công!");
                loadData();
            }
            catch(Exception ex)
            {
                System.out.println(ex.toString());
            }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try
        {
        int position = jTable1.getSelectedRow();
        String masv = jTable1.getModel().getValueAt(position,0).toString();
        Connect a = new Connect();
                Connection conn = a.getConnection();
                String query = "Delete FROM SinhVien WHERE MaSinhVien = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, masv);                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
                loadData();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int position = jTable1.getSelectedRow();
        txtMaSinhVien.setText(jTable1.getModel().getValueAt(position,0).toString()); 
        txtHoTen.setText(jTable1.getModel().getValueAt(position,1).toString());
        if(jTable1.getModel().getValueAt(position,2).toString().trim().equals("Nam"))
        {
            rbtnNam.setSelected(true);
        }
        else
        {
            rbtnNu.setSelected(true);
        }
        txtDiaChi.setText(jTable1.getModel().getValueAt(position,3).toString());
        txtKhoa.setText(jTable1.getModel().getValueAt(position,4).toString()); 
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        
         try
            {
               
                Connect a = new Connect();
                Connection conn = a.getConnection();
                String masinhvien = txtMaSinhVien.getText();
                String hoten = txtHoTen.getText();
                String gioitinh = "";
                if(rbtnNam.isSelected())
                {
                    gioitinh = "Nam";
                }
                else
                {
                    gioitinh = "Nữ";
                }
                String diachi = txtDiaChi.getText();
                String khoa = txtKhoa.getText();
                
                int position = jTable1.getSelectedRow();
                String masv = jTable1.getModel().getValueAt(position,0).toString();
                String query = "Update SinhVien set MaSinhVien = '"+masinhvien+"', TenSinhVien = '"+hoten+"', GioiTinh = '"+gioitinh+"', DiaChi = '"+diachi+"', Khoa = '"+khoa+"' WHERE MaSinhVien = '"+masv+"'";
                PreparedStatement ps = conn.prepareStatement(query);
//                ps.setString(1, txtMaSinhVien.getText());
//                ps.setString(2, txtHoTen.getText());
//                ps.setString(3, gioitinh);
//                ps.setString(4, txtDiaChi.getText());
//                ps.setString(5, txtKhoa.getText());
                
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Sửa thành công!");
                loadData();
            }
            catch(Exception ex)
            {
                System.out.println(ex.toString());
            }
        
        
    }//GEN-LAST:event_btnSuaActionPerformed

    
    public static void main(String args[]) {
                                          
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtnNam;
    private javax.swing.JRadioButton rbtnNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtMaSinhVien;
    // End of variables declaration//GEN-END:variables
}
