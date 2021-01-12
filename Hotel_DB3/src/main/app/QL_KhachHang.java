/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.dmdmm
 */
package main.app;

import DAO.IDAO_KhachHang;
import entities.KhachHang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Connect.Check_Validate;

/**
 *
 * @author dell
 */
public class QL_KhachHang extends javax.swing.JInternalFrame {

    /**
     * Creates new form QL_KhachHang
     */
    private boolean edit = false;
    private final IDAO_KhachHang iDAO_KhachHang;
    private Check_Validate check;

    public QL_KhachHang() {
        initComponents();
        iDAO_KhachHang = new IDAO_KhachHang();
        loadKhachHang();
        tbl_QuanLyKhachHang.getSelectionModel().addListSelectionListener((lse) -> {
            detail();
        });
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_25px.png"))); // NOI18N
        btn_Sua.setText("Thêm mới");
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_MaKhachHang = new javax.swing.JTextField();
        txt_TenKhachHang = new javax.swing.JTextField();
        txt_DienThoai = new javax.swing.JTextField();
        txt_CMND = new javax.swing.JTextField();
        txt_SoLuot = new javax.swing.JTextField();
        check_DangThue = new javax.swing.JRadioButton();
        check_ChuaThue = new javax.swing.JRadioButton();
        btn_Sua = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_GhiChu = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_QuanLyKhachHang = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Quản Lý Khách Hàng");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Mã khách hàng :");

        jLabel2.setText("Tên khách hàng :");

        jLabel3.setText("Điện thoại :");

        jLabel4.setText("CMND :");

        jLabel5.setText("Ghi chú :");

        jLabel6.setText("Số lượt :");

        jLabel7.setText("Trạng thái :");

        txt_MaKhachHang.setEditable(false);

        txt_DienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DienThoaiActionPerformed(evt);
            }
        });

        txt_CMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CMNDActionPerformed(evt);
            }
        });

        txt_SoLuot.setText("1");
        txt_SoLuot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoLuotActionPerformed(evt);
            }
        });

        buttonGroup1.add(check_DangThue);
        check_DangThue.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_DangThue.setForeground(new java.awt.Color(255, 0, 0));
        check_DangThue.setText("Đang thuê");

        buttonGroup1.add(check_ChuaThue);
        check_ChuaThue.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_ChuaThue.setForeground(new java.awt.Color(0, 0, 255));
        check_ChuaThue.setSelected(true);
        check_ChuaThue.setText("Chưa thuê");

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
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        txt_GhiChu.setColumns(20);
        txt_GhiChu.setRows(5);
        jScrollPane2.setViewportView(txt_GhiChu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Clear)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(check_ChuaThue)
                                .addGap(18, 18, 18)
                                .addComponent(check_DangThue))
                            .addComponent(txt_MaKhachHang)
                            .addComponent(txt_TenKhachHang)
                            .addComponent(txt_DienThoai)
                            .addComponent(txt_CMND, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(txt_SoLuot)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_TimKiem))))
                    .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_MaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_TenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_DienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_SoLuot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(check_DangThue)
                    .addComponent(check_ChuaThue))
                .addGap(37, 37, 37)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Clear)
                    .addComponent(btn_TimKiem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_QuanLyKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Điện thoại", "CMND", "Ghi chú", "Số lượt", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_QuanLyKhachHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DienThoaiActionPerformed

    private void txt_CMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CMNDActionPerformed

    private void txt_SoLuotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoLuotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoLuotActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        KhachHang khachHang = new KhachHang();
        String tb = "";
        if (txt_TenKhachHang.getText().length() == 0) {
            tb += "Tên khách hàng không được để trống \n";
        }
        if (!check.isNumeric(txt_DienThoai.getText())) {
            tb += "Số điện thoại phải là số \n";
        }
        if (!check.isPhone(txt_DienThoai.getText())) {
            tb+="Số điện thoại phải bắt đầu bằng số 0 và có 10 số \n";
        }
        if (!check.isNumeric(txt_CMND.getText())) {
            tb += "Số chứng minh nhân dân phải là số \n";
        }
        if (!check.isNumeric(txt_SoLuot.getText())) {
            tb += "Số lượt phải là số \n";
        }
        if (txt_TenKhachHang.getText().length() > 0 && check.isNumeric(txt_DienThoai.getText()) && check.isPhone(txt_DienThoai.getText()) && check.isNumeric(txt_CMND.getText()) && check.isNumeric(txt_SoLuot.getText())) {
            khachHang.setTenKhachHang(txt_TenKhachHang.getText());
            khachHang.setDienThoai(txt_DienThoai.getText());
            khachHang.setCMND(txt_CMND.getText());
            khachHang.setGhiChu(txt_GhiChu.getText());
            khachHang.setSoLuot(Integer.parseInt(txt_SoLuot.getText()));
            khachHang.setTrangThai(check_ChuaThue.isSelected());
            if (edit == true) {
                khachHang.setMaKhachHang(Integer.parseInt(txt_MaKhachHang.getText()));
                iDAO_KhachHang.updateData(khachHang);
                edit = false;
            } else {
                iDAO_KhachHang.insertData(khachHang);
                edit = false;
            }
            clear();
        }else{
            JOptionPane.showMessageDialog(this, tb, "Thông Báo",JOptionPane.WARNING_MESSAGE);
        }

        loadKhachHang();
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        clear();
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int selectedRow = tbl_QuanLyKhachHang.getSelectedRow();
        int idDeleted = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa không?", "Xác nhận xóa!", JOptionPane.OK_CANCEL_OPTION);
        if (idDeleted == JOptionPane.OK_OPTION) {
            KhachHang khachHang = new KhachHang();
            idDeleted = (int) tbl_QuanLyKhachHang.getValueAt(selectedRow, 0);
            iDAO_KhachHang.deleteData(idDeleted);
            loadKhachHang();
            clear();
        }

    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String stringTimKiem = JOptionPane.showInputDialog(this, "Nhập vào SĐT hoặc CMND để tìm kiếm: ", "Tìm kiếm...", JOptionPane.QUESTION_MESSAGE);
        List<KhachHang> listKhachHang = iDAO_KhachHang.findDataByCMND_SDT(stringTimKiem);
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_QuanLyKhachHang.getModel();
        defaultTableModel.setRowCount(0);
        listKhachHang.forEach((khach) -> {
            defaultTableModel.addRow(new Object[]{khach.getMaKhachHang(), khach.getTenKhachHang(), khach.getDienThoai(), khach.getCMND(), khach.getGhiChu(), khach.getSoLuot(), khach.getTrangThai() ? "Chưa thuê" : "Đang thuê"});
            txt_MaKhachHang.setText("" + khach.getMaKhachHang());
            txt_TenKhachHang.setText(khach.getTenKhachHang());
            txt_DienThoai.setText(khach.getDienThoai() + "");
            txt_SoLuot.setText(khach.getSoLuot() + "");
            txt_GhiChu.setText(khach.getGhiChu());
            check_ChuaThue.setSelected(true);
            txt_CMND.setText(khach.getCMND());
            if (khach.getTrangThai() == false) {
                check_DangThue.setSelected(true);
            }
        });
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void loadKhachHang() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_QuanLyKhachHang.getModel();
        List<KhachHang> listKhachHang = new ArrayList<>(iDAO_KhachHang.getAllData());
        defaultTableModel.setRowCount(0);
        listKhachHang.forEach((khach) -> {
            defaultTableModel.addRow(new Object[]{khach.getMaKhachHang(), khach.getTenKhachHang(), khach.getDienThoai(), khach.getCMND(), khach.getGhiChu(), khach.getSoLuot(), khach.getTrangThai() ? "Chưa thuê" : "Đang thuê"});
        });

    }

    private void clear() {
        txt_MaKhachHang.setText(null);
        txt_DienThoai.setText(null);
        txt_SoLuot.setText("1");
        txt_CMND.setText(null);
        txt_GhiChu.setText(null);
        txt_MaKhachHang.setText(null);
        txt_TenKhachHang.setText(null);
        check_ChuaThue.setSelected(true);
        check_DangThue.setSelected(false);
        edit = false;
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_25px.png"))); // NOI18N
        btn_Sua.setText("Thêm mới");
    }

    private void detail() {
        int SelectedRow = tbl_QuanLyKhachHang.getSelectedRow();
        if (SelectedRow >= 0) {
            int id = (int) tbl_QuanLyKhachHang.getValueAt(SelectedRow, 0);
            KhachHang khachHang = iDAO_KhachHang.findDataById(id);
            txt_MaKhachHang.setText("" + khachHang.getMaKhachHang());
            txt_TenKhachHang.setText(khachHang.getTenKhachHang());
            txt_DienThoai.setText(khachHang.getDienThoai() + "");
            txt_SoLuot.setText(khachHang.getSoLuot() + "");
            txt_GhiChu.setText(khachHang.getGhiChu());
            check_ChuaThue.setSelected(true);
            txt_CMND.setText(khachHang.getCMND());
            if (khachHang.getTrangThai() == false) {
                check_DangThue.setSelected(true);
            }
            edit = true;
        }
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update_25px.png"))); // NOI18N
        btn_Sua.setText("Cập nhật");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton check_ChuaThue;
    private javax.swing.JRadioButton check_DangThue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_QuanLyKhachHang;
    private javax.swing.JTextField txt_CMND;
    private javax.swing.JTextField txt_DienThoai;
    private javax.swing.JTextArea txt_GhiChu;
    private javax.swing.JTextField txt_MaKhachHang;
    private javax.swing.JTextField txt_SoLuot;
    private javax.swing.JTextField txt_TenKhachHang;
    // End of variables declaration//GEN-END:variables
}
