/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.dmmdm
 */
package main.app;

import DAO.IDAO_DanhMuc;
import entities.DanhMuc;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Connect.Check_Validate;

/**
 *
 * @author dell
 */
public final class QL_DanhMucPhong extends javax.swing.JInternalFrame {

//    /**
//     * CALLBACK
//     *
//     */
//    CallBack back;
//    interface CallBack {
//        public void doAction();
//    }
//
//    public QL_DanhMucPhong(CallBack back) {
//        initComponents();
//        this.back = back;
//    }
    private final IDAO_DanhMuc dao;
    private boolean edit = false;
    private Check_Validate check;

    /**
     * Creates new form QL_DanhMucPhong
     *
     */
    public QL_DanhMucPhong() {
        initComponents();
        dao = new IDAO_DanhMuc();
        tbl_QuanLyDanhMucPhong.getSelectionModel().addListSelectionListener((ListSelectionEvent lse) -> {
            selectedRow();
        });
        loadDanhMuc();
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_25px.png"))); // NOI18N
        btn_Sua.setText("Thêm mới");
    }

    public void loadDanhMuc() {
        List<DanhMuc> data = new ArrayList<>(dao.getAllData());
        DefaultTableModel model = (DefaultTableModel) tbl_QuanLyDanhMucPhong.getModel();
        model.setRowCount(0);
        data.forEach((dm) -> {
            model.addRow(new Object[]{dm.getMaDanhMuc(), dm.getTenDanhMuc(), dm.getGiaPhong(), dm.getGhiChu(), dm.getTrangThai() ? "Hoạt Động" : "Không hoạt động"});
        });
        tbl_QuanLyDanhMucPhong.setModel(model);

        QL_Phong phong = new QL_Phong();
        if (phong.isShowing()) {
            phong.setVisible(false);
        }
    }

    public void selectedRow() {
        int selectRow = tbl_QuanLyDanhMucPhong.getSelectedRow();
        if (selectRow >= 0) {
            int id = (int) tbl_QuanLyDanhMucPhong.getValueAt(selectRow, 0);
            DanhMuc dm = dao.findDataById(id);
            txtMaDanhMuc.setText(dm.getMaDanhMuc() + "");
            txt_TenDanhMuc.setText(dm.getTenDanhMuc());
            txt_GiaPhong.setText(dm.getGiaPhong() + "");
            check_HoatDong.setSelected(true);
            if (dm.getTrangThai() == false) {
                check_KhongHoatDong.setSelected(true);
            }
            txtGhiChu.setText(dm.getGhiChu());
            edit = true;
        }
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update_25px.png"))); // NOI18N
        btn_Sua.setText("Cập nhật");
    }

    public void Clear() {
        txtMaDanhMuc.setText(null);
        txt_GiaPhong.setText("0");
        txt_TenDanhMuc.setText(null);
        check_HoatDong.setSelected(true);
        txtGhiChu.setText(null);
        check_KhongHoatDong.setSelected(false);
        edit = false;
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
        txtMaDanhMuc = new javax.swing.JTextField();
        txt_TenDanhMuc = new javax.swing.JTextField();
        txt_GiaPhong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        check_HoatDong = new javax.swing.JRadioButton();
        check_KhongHoatDong = new javax.swing.JRadioButton();
        btn_Sua = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_QuanLyDanhMucPhong = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Quản Lý Danh Mục Phòng");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Mã danh mục :");

        jLabel2.setText("Tên danh mục :");

        jLabel3.setText("Giá phòng :");

        jLabel4.setText("Ghi chú :");

        jLabel5.setText("Trạng thái :");

        txtMaDanhMuc.setEditable(false);

        txt_GiaPhong.setText("0");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        buttonGroup1.add(check_HoatDong);
        check_HoatDong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_HoatDong.setForeground(new java.awt.Color(0, 0, 255));
        check_HoatDong.setSelected(true);
        check_HoatDong.setText("Hoạt động");

        buttonGroup1.add(check_KhongHoatDong);
        check_KhongHoatDong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_KhongHoatDong.setForeground(new java.awt.Color(255, 0, 0));
        check_KhongHoatDong.setText("Không hoạt động");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_GiaPhong)
                            .addComponent(txt_TenDanhMuc)
                            .addComponent(jScrollPane1)
                            .addComponent(txtMaDanhMuc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_HoatDong)
                            .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_KhongHoatDong)
                            .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_Sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_TenDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_GiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_HoatDong)
                        .addComponent(check_KhongHoatDong)))
                .addGap(18, 18, 18)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Clear)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_TimKiem))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tbl_QuanLyDanhMucPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã danh mục", "Tên danh mục", "Giá phòng", "Ghi chú", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_QuanLyDanhMucPhong);
        if (tbl_QuanLyDanhMucPhong.getColumnModel().getColumnCount() > 0) {
            tbl_QuanLyDanhMucPhong.getColumnModel().getColumn(0).setPreferredWidth(35);
            tbl_QuanLyDanhMucPhong.getColumnModel().getColumn(1).setPreferredWidth(130);
            tbl_QuanLyDanhMucPhong.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        Clear();
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        DanhMuc dm = new DanhMuc();
        String tb = "";
        if (!check.isNumeric(txt_GiaPhong.getText())) {
            tb += "Giá không phải là số \n";
        }
        if (txt_TenDanhMuc.getText().length() == 0) {
            tb += "Tên danh mục không được để trống";
        }

        if (check.isNumeric(txt_GiaPhong.getText()) && txt_TenDanhMuc.getText().length() > 0) {
            dm.setTenDanhMuc(txt_TenDanhMuc.getText());
            dm.setGiaPhong(Float.parseFloat(txt_GiaPhong.getText()));
            dm.setGhiChu(txtGhiChu.getText());
            dm.setTrangThai(check_HoatDong.isSelected());
            if (edit == true) {
                dm.setMaDanhMuc(Integer.parseInt(txtMaDanhMuc.getText()));
                dao.updateData(dm);
                edit = false;
            } else {
                dao.insertData(dm);
                edit = false;
            }
            loadDanhMuc();
            Clear();
        } else {
            JOptionPane.showMessageDialog(this, tb, "Thông báo", JOptionPane.WARNING_MESSAGE);
        }

        
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int id = Integer.parseInt(txtMaDanhMuc.getText());
        int check = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa không?", "Xác nhận xóa!", JOptionPane.OK_CANCEL_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            dao.deleteData(id);
        }
        loadDanhMuc();
        Clear();

    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        // TODO add your handling code here:

        String timkiem = JOptionPane.showInputDialog(this, "Nhập mã danh mục", "Tìm kiếm");
        List<DanhMuc> data = new ArrayList<>(dao.findDataByName(timkiem));
        DefaultTableModel model = (DefaultTableModel) tbl_QuanLyDanhMucPhong.getModel();
        model.setRowCount(0);
        data.forEach((dm) -> {
            model.addRow(new Object[]{dm.getMaDanhMuc(), dm.getTenDanhMuc(), dm.getGiaPhong(), dm.getGhiChu(), dm.getTrangThai() ? "Hoạt Động" : "Không hoạt động"});
        });
        tbl_QuanLyDanhMucPhong.setModel(model);

    }//GEN-LAST:event_btn_TimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton check_HoatDong;
    private javax.swing.JRadioButton check_KhongHoatDong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_QuanLyDanhMucPhong;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtMaDanhMuc;
    private javax.swing.JTextField txt_GiaPhong;
    private javax.swing.JTextField txt_TenDanhMuc;
    // End of variables declaration//GEN-END:variables

}
