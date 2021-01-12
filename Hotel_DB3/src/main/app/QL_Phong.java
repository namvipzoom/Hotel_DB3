/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.app;

import DAO.IDAO_Phong;
import DAO.IDAO_DanhMuc;
import entities.DanhMuc;
import entities.Phong;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import Connect.Check_Validate;

/**
 *
 * @author dell
 */
public final class QL_Phong extends javax.swing.JInternalFrame {

    private final IDAO_Phong dao;
    private final IDAO_DanhMuc dao_Dm;
    private boolean edit = false;
    private Check_Validate check;

    /**
     * Creates new form QL_Phong
     */
    public QL_Phong() {
        dao = new IDAO_Phong();
        dao_Dm = new IDAO_DanhMuc();
        initComponents();
        tbl_QuanLyPhong.getSelectionModel().addListSelectionListener((ListSelectionEvent lse) -> {
            detail();
        });
        combobox();
        loadPhong();
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_25px.png"))); // NOI18N
        btn_Sua.setText("Thêm mới");
    }

    public void combobox() {
        List<DanhMuc> data = new ArrayList<>(dao_Dm.getAllData());
        data.forEach((dm) -> {
            list_LoaiPhong.addItem(dm);
        });
    }

    public void detail() {
        int selectRow = tbl_QuanLyPhong.getSelectedRow();
        if (selectRow >= 0) {
            int id = (int) tbl_QuanLyPhong.getValueAt(selectRow, 0);
            Phong p = dao.findDataById(id);
            txt_MaPhong.setText(p.getMaPhong() + "");
            txt_TenPhong.setText(p.getTenPhong());
            DefaultComboBoxModel cbb = (DefaultComboBoxModel) list_LoaiPhong.getModel();
            for (int i = 0; i < cbb.getSize(); i++) {
                if (((DanhMuc) cbb.getElementAt(i)).getMaDanhMuc() == p.getLoaiPhong()) {
                    list_LoaiPhong.setSelectedItem(cbb.getElementAt(i));
                }
            }
            txtGhiChu.setText(p.getGhiChu());
            txt_SoGiuong.setText(p.getSoGiuong() + "");
            check_ConTrong.setSelected(true);
            if (p.getTrangThai() == false) {
                check_DaHet.setSelected(true);
            }
            edit = true;
        }
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update_25px.png"))); // NOI18N
        btn_Sua.setText("Cập nhật");
    }

    public void loadPhong() {
        List<Phong> data = new ArrayList<>(dao.getAllData());
        DefaultTableModel model = (DefaultTableModel) tbl_QuanLyPhong.getModel();
        model.setRowCount(0);
        data.forEach((p) -> {
            model.addRow(new Object[]{p.getMaPhong(), p.getTenPhong(), p.getTenDanhMuc(), p.getSoGiuong(), p.getGhiChu(), p.getTrangThai() ? "Còn trống" : "Đã đặt"});
        });
        tbl_QuanLyPhong.setModel(model);
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
        txt_MaPhong = new javax.swing.JTextField();
        txt_TenPhong = new javax.swing.JTextField();
        list_LoaiPhong = new javax.swing.JComboBox<DanhMuc>();
        check_ConTrong = new javax.swing.JRadioButton();
        check_DaHet = new javax.swing.JRadioButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txt_SoGiuong = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_QuanLyPhong = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Quản Lý Phòng");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Mã phòng :");

        jLabel2.setText("Tên phòng :");

        jLabel3.setText("Loại phòng :");

        jLabel4.setText("Ghi chú :");

        jLabel5.setText("Trạng thái :");

        txt_MaPhong.setEditable(false);

        list_LoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_LoaiPhongActionPerformed(evt);
            }
        });

        buttonGroup1.add(check_ConTrong);
        check_ConTrong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_ConTrong.setForeground(new java.awt.Color(0, 0, 255));
        check_ConTrong.setSelected(true);
        check_ConTrong.setText("Còn trống");

        buttonGroup1.add(check_DaHet);
        check_DaHet.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_DaHet.setForeground(new java.awt.Color(255, 0, 0));
        check_DaHet.setText("Đã đặt");
        check_DaHet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_DaHetActionPerformed(evt);
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

        btn_Sua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Sua.setForeground(new java.awt.Color(0, 102, 102));
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update_25px.png"))); // NOI18N
        btn_Sua.setText("Cập nhật");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/broom_25px.png"))); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane3.setViewportView(txtGhiChu);

        jLabel6.setText("Số Giường :");

        txt_SoGiuong.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addGap(269, 269, 269))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(25, 25, 25))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(list_LoaiPhong, 0, 223, Short.MAX_VALUE)
                                                .addComponent(txt_TenPhong)
                                                .addComponent(txt_MaPhong))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(check_ConTrong)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(check_DaHet))
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                                .addComponent(txt_SoGiuong, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_TimKiem))
                            .addComponent(btn_Sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_MaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_TenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(list_LoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_SoGiuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_ConTrong)
                    .addComponent(jLabel5)
                    .addComponent(check_DaHet))
                .addGap(35, 35, 35)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Clear)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_TimKiem))
                .addGap(30, 30, 30))
        );

        tbl_QuanLyPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Tên phòng", "Loại phòng", "Số giường", "Ghi chú", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_QuanLyPhong);
        if (tbl_QuanLyPhong.getColumnModel().getColumnCount() > 0) {
            tbl_QuanLyPhong.getColumnModel().getColumn(0).setPreferredWidth(35);
            tbl_QuanLyPhong.getColumnModel().getColumn(3).setPreferredWidth(25);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int id = Integer.parseInt(txt_MaPhong.getText());
        int check = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa không?", "Xác nhận xóa!", JOptionPane.OK_CANCEL_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            dao.deleteData(id);
        }
        loadPhong();
        clear();

    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        clear();
    }//GEN-LAST:event_btn_ClearActionPerformed
    public void clear() {
        txtGhiChu.setText(null);
        txt_MaPhong.setText(null);
        txt_SoGiuong.setText("1");
        txt_TenPhong.setText(null);
        check_ConTrong.setSelected(true);
        check_DaHet.setSelected(false);
        list_LoaiPhong.setSelectedIndex(0);
        edit = false;
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_25px.png"))); // NOI18N
        btn_Sua.setText("Thêm mới");
    }
    private void check_DaHetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_DaHetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_DaHetActionPerformed

    private void list_LoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_LoaiPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_LoaiPhongActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // TODO add your handling code here:

        String tb = "";

        if (txt_TenPhong.getText().length() == 0) {
            tb += "Tên phòng không được để trống \n";
        }
        if (!check.isNumeric(txt_SoGiuong.getText())) {
            tb += "Số giường phải là số";
        }
        if (txt_TenPhong.getText().length() > 0 && check.isNumeric(txt_SoGiuong.getText())) {
            Phong p = new Phong();
            DanhMuc dm = (DanhMuc) list_LoaiPhong.getSelectedItem();
            p.setTenPhong(txt_TenPhong.getText());
            p.setLoaiPhong(dm.getMaDanhMuc());
            p.setSoGiuong(Integer.parseInt(txt_SoGiuong.getText()));
            p.setGhiChu(txtGhiChu.getText());
            p.setTrangThai(check_ConTrong.isSelected());
            if (edit == true) {
                p.setMaPhong(Integer.parseInt(txt_MaPhong.getText()));
                dao.updateData(p);
                edit = false;
            } else {
                dao.insertData(p);
                edit = false;
            }
             loadPhong();
            clear();
        } else {
            JOptionPane.showMessageDialog(this, tb, "Warning", JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        // TODO add your handling code here:
        String timkiem = JOptionPane.showInputDialog(this, "Nhập tên phòng", "Tìm kiếm");
        List<Phong> data = new ArrayList<>(dao.findDataByName(timkiem));
        DefaultTableModel model = (DefaultTableModel) tbl_QuanLyPhong.getModel();
        model.setRowCount(0);
        data.forEach((p) -> {
            model.addRow(new Object[]{p.getMaPhong(), p.getTenPhong(), p.getTenDanhMuc(), p.getSoGiuong(), p.getGhiChu(), p.getTrangThai() ? "Còn trống" : "Đã đặt"});
        });
        tbl_QuanLyPhong.setModel(model);
    }//GEN-LAST:event_btn_TimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton check_ConTrong;
    private javax.swing.JRadioButton check_DaHet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<DanhMuc> list_LoaiPhong;
    private javax.swing.JTable tbl_QuanLyPhong;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txt_MaPhong;
    private javax.swing.JTextField txt_SoGiuong;
    private javax.swing.JTextField txt_TenPhong;
    // End of variables declaration//GEN-END:variables
}
