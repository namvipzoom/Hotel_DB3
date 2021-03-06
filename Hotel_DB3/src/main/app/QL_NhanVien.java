/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.app;

import DAO.IDAO_NhanVien;
import entities.NhanVien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import Connect.Check_Validate;

/**
 *
 * @author dell
 */
public class QL_NhanVien extends javax.swing.JInternalFrame {

    private final IDAO_NhanVien iDAO_NhanVien;
    private boolean edit = false;
    private Check_Validate check;

    /**
     * Creates new form QL_NhanVien
     */
    public QL_NhanVien() {
        initComponents();
        iDAO_NhanVien = new IDAO_NhanVien();
        load_NhanVien();
        tbl_QuanLyNhanVien.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            detail_NhanVien();
        });
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_25px.png"))); // NOI18N
        btn_Sua.setText("Thêm mới");
    }

    private void load_NhanVien() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_QuanLyNhanVien.getModel();
        List<NhanVien> listNhanVien = new ArrayList<>(iDAO_NhanVien.getAllData());
        defaultTableModel.setRowCount(0);
        listNhanVien.stream().forEach((nv) -> {
            defaultTableModel.addRow(new Object[]{nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getDienThoai(), nv.getGioiTinh() ? "Nam" : "Nữ", nv.getGhiChu(), nv.getTrangThai() ? "Đang làm việc" : "Đã nghỉ"});
        });
        
    }

    private void clear() {
        txt_MaNhanVien.setText(null);
        txt_GhiChu.setText(null);
        txt_DienThoai.setText(null);
        txt_TenNhanVien.setText(null);
        check_DaNghi.setSelected(false);
        check_DangLamViec.setSelected(true);
        check_Nam.setSelected(true);
        check_Nu.setSelected(false);
        edit = false;
        txt_MaNhanVien.setEditable(true);
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_25px.png"))); // NOI18N
        btn_Sua.setText("Thêm mới");
    }

    private void detail_NhanVien() {
        int selectedRow = tbl_QuanLyNhanVien.getSelectedRow();
        if (selectedRow >= 0) {
            String id = (String) tbl_QuanLyNhanVien.getValueAt(selectedRow, 0);
            NhanVien nhanVien = iDAO_NhanVien.findDataById(id);
            txt_MaNhanVien.setText(nhanVien.getMaNhanVien());
            txt_MaNhanVien.setEditable(false);
            txt_TenNhanVien.setText(nhanVien.getTenNhanVien());
            txt_DienThoai.setText(nhanVien.getDienThoai());
            txt_GhiChu.setText(nhanVien.getGhiChu());
            check_DangLamViec.setSelected(true);
            check_Nam.setSelected(true);
            if (nhanVien.getGioiTinh() == false) {
                check_Nu.setSelected(true);
            }
            if (nhanVien.getTrangThai() == false) {
                check_DaNghi.setSelected(true);
            }
            edit = true;
        }
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update_25px.png"))); // NOI18N
        btn_Sua.setText("Cập nhật");
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_MaNhanVien = new javax.swing.JTextField();
        txt_TenNhanVien = new javax.swing.JTextField();
        txt_DienThoai = new javax.swing.JTextField();
        check_Nam = new javax.swing.JRadioButton();
        check_Nu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_GhiChu = new javax.swing.JTextArea();
        check_DangLamViec = new javax.swing.JRadioButton();
        check_DaNghi = new javax.swing.JRadioButton();
        btn_Sua = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_QuanLyNhanVien = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Quản Lý Nhân Viên");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Mã nhân viên :");

        jLabel2.setText("Tên nhân viên :");

        jLabel3.setText("Điện thoại :");

        jLabel4.setText("Giới tính :");

        jLabel5.setText("Ghi chú :");

        jLabel6.setText("Trạng thái :");

        buttonGroup1.add(check_Nam);
        check_Nam.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_Nam.setSelected(true);
        check_Nam.setText("Nam");
        check_Nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_NamActionPerformed(evt);
            }
        });

        buttonGroup1.add(check_Nu);
        check_Nu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_Nu.setText("Nữ");

        txt_GhiChu.setColumns(20);
        txt_GhiChu.setRows(5);
        jScrollPane1.setViewportView(txt_GhiChu);

        buttonGroup2.add(check_DangLamViec);
        check_DangLamViec.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_DangLamViec.setForeground(new java.awt.Color(0, 0, 255));
        check_DangLamViec.setSelected(true);
        check_DangLamViec.setText("Đang làm việc");

        buttonGroup2.add(check_DaNghi);
        check_DaNghi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_DaNghi.setForeground(new java.awt.Color(255, 0, 0));
        check_DaNghi.setText("Đã nghỉ");
        check_DaNghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_DaNghiActionPerformed(evt);
            }
        });

        btn_Sua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Sua.setForeground(new java.awt.Color(0, 102, 102));
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update_25px.png"))); // NOI18N
        btn_Sua.setText("Cập nhật");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_25px.png"))); // NOI18N
        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete_25px.png"))); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/broom_25px.png"))); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.setPreferredSize(new java.awt.Dimension(95, 33));
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(txt_DienThoai)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(check_DangLamViec)
                                            .addGap(18, 18, 18)
                                            .addComponent(check_DaNghi))
                                        .addComponent(txt_MaNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_TenNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(check_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(check_Nu)
                                .addGap(59, 59, 59))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_TimKiem))
                            .addComponent(btn_Sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_TenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_DienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(check_Nu)
                            .addComponent(check_Nam))
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_DangLamViec)
                    .addComponent(jLabel6)
                    .addComponent(check_DaNghi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TimKiem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_QuanLyNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Điện thoại", "Giới tính", "Ghi chú", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_QuanLyNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check_NamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_NamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_NamActionPerformed

    private void check_DaNghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_DaNghiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_DaNghiActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        NhanVien nhanVien = new NhanVien();
        String tb = "";
        if (txt_MaNhanVien.getText().length() == 0) {
            tb+= "Mã nhân viên không được để trống \n";
        }
        if (!check.checkNV(txt_MaNhanVien.getText())) {
            tb+="Mã nhân viên sai định dạng VD: NV123 \n";
        }
         if (txt_TenNhanVien.getText().length() == 0) {
            tb+= "Tên nhân viên không được để trống \n";
        }
        if (!check.isNumeric(txt_DienThoai.getText())) {
            tb += "Số điện thoại phải là số \n";
        }
        if (!check.isPhone(txt_DienThoai.getText())) {
            tb+="Số điện thoại phải bắt đầu bằng số 0 và có 10 số";
        }
        if (txt_MaNhanVien.getText().length() >0 && check.checkNV(txt_MaNhanVien.getText())&& check.isNumeric(txt_DienThoai.getText()) && check.isPhone(txt_DienThoai.getText())) {
            nhanVien.setDienThoai(txt_DienThoai.getText());
            nhanVien.setGhiChu(txt_GhiChu.getText());
            nhanVien.setMaNhanVien(txt_MaNhanVien.getText());
            nhanVien.setTenNhanVien(txt_TenNhanVien.getText());
            nhanVien.setGioiTinh(check_Nam.isSelected());
            nhanVien.setTrangThai(check_DangLamViec.isSelected());
            if (edit == true) {
                iDAO_NhanVien.updateData(nhanVien);
                edit = false;
               
            } else {
                iDAO_NhanVien.insertData(nhanVien);
                edit = false;
                
            }
            load_NhanVien();
        clear(); 
        } else {
            JOptionPane.showMessageDialog(this, tb, "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        clear();
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed

        int idDelete = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa không?", "Xác nhận xóa", JOptionPane.OK_CANCEL_OPTION);
        if (idDelete == JOptionPane.OK_OPTION) {
            String id = txt_MaNhanVien.getText();
            iDAO_NhanVien.deleteData(id);
            load_NhanVien();
            clear();
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String stringTimKiem = JOptionPane.showInputDialog(this, "Nhập vào tên nhân viên để tìm kiếm", "Tìm kiếm", JOptionPane.QUESTION_MESSAGE);
        List<NhanVien> listNhanVien = iDAO_NhanVien.findDataByName(stringTimKiem);
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_QuanLyNhanVien.getModel();
        defaultTableModel.setRowCount(0);
        listNhanVien.stream().forEach((nv) -> {
            defaultTableModel.addRow(new Object[]{nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getDienThoai(), nv.getGioiTinh() ? "Nam" : "Nữ", nv.getGhiChu(), nv.getTrangThai() ? "Đang làm việc" : "Đã nghỉ"});
        });
    }//GEN-LAST:event_btn_TimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton check_DaNghi;
    private javax.swing.JRadioButton check_DangLamViec;
    private javax.swing.JRadioButton check_Nam;
    private javax.swing.JRadioButton check_Nu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_QuanLyNhanVien;
    private javax.swing.JTextField txt_DienThoai;
    private javax.swing.JTextArea txt_GhiChu;
    private javax.swing.JTextField txt_MaNhanVien;
    private javax.swing.JTextField txt_TenNhanVien;
    // End of variables declaration//GEN-END:variables

}
