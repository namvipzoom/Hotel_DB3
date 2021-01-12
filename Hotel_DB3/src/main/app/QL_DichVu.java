/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.app;

import DAO.IDAO_DichVu;
import entities.DichVu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Connect.Check_Validate;

/**
 *
 * @author dell
 */
public class QL_DichVu extends javax.swing.JInternalFrame {

    private final IDAO_DichVu iDAO_DichVu;
    private boolean edit = false;
    private Check_Validate check;

    /**
     * Creates new form QL_DichVu
     */
    public QL_DichVu() {
        initComponents();
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_25px.png"))); // NOI18N
        btn_Sua.setText("Thêm mới");
        iDAO_DichVu = new IDAO_DichVu();
        loadDichVu();
        tbl_QuanLyDichVu.getSelectionModel().addListSelectionListener((lse) -> {
            detail();
        });

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
        txt_MaDichVu = new javax.swing.JTextField();
        txt_TenDichVu = new javax.swing.JTextField();
        txt_GiaDichVu = new javax.swing.JTextField();
        check_PhucVu = new javax.swing.JRadioButton();
        check_KhongPhucVu = new javax.swing.JRadioButton();
        btn_Sua = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_QuanLyDichVu = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Quản Lý Dịch Vụ");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Mã dịch vụ :");

        jLabel2.setText("Tên dịch vụ :");

        jLabel3.setText("Giá dịch vụ :");

        jLabel4.setText("Trạng thái :");

        txt_MaDichVu.setEditable(false);

        txt_GiaDichVu.setText("0");

        buttonGroup1.add(check_PhucVu);
        check_PhucVu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_PhucVu.setForeground(new java.awt.Color(0, 0, 204));
        check_PhucVu.setSelected(true);
        check_PhucVu.setText("Phục vụ");

        buttonGroup1.add(check_KhongPhucVu);
        check_KhongPhucVu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check_KhongPhucVu.setForeground(new java.awt.Color(255, 0, 0));
        check_KhongPhucVu.setText("Không phục vụ");
        check_KhongPhucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_KhongPhucVuActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_TimKiem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(check_PhucVu)
                                .addGap(18, 18, 18)
                                .addComponent(check_KhongPhucVu))
                            .addComponent(txt_MaDichVu)
                            .addComponent(txt_TenDichVu)
                            .addComponent(txt_GiaDichVu)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_MaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_TenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_GiaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(check_PhucVu)
                    .addComponent(check_KhongPhucVu))
                .addGap(38, 38, 38)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Clear)
                    .addComponent(btn_TimKiem))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tbl_QuanLyDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Giá dịch vụ", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_QuanLyDichVu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int idDeleted = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa không?", "Xác nhận xóa!", JOptionPane.OK_CANCEL_OPTION);
        if (idDeleted == JOptionPane.OK_OPTION) {
            DichVu dichVu = new DichVu();
            int idDichVu = Integer.parseInt(txt_MaDichVu.getText());
            iDAO_DichVu.deleteData(idDichVu);
            clear();
            loadDichVu();
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        clear();
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        DichVu dichVu = new DichVu();
        String tb = "";
        if (txt_TenDichVu.getText().length() == 0) {
            tb += "Tên dịch vụ không đc để trống \n";
        }
        if (!check.isNumeric(txt_GiaDichVu.getText())) {
            tb += "Giá phải là số";
        }
       
        if (check.isNumeric(txt_GiaDichVu.getText()) && txt_TenDichVu.getText().length() > 0) {
            dichVu.setTenDichVu(txt_TenDichVu.getText());
            dichVu.setGiaDichVu(Float.parseFloat(txt_GiaDichVu.getText()));
            dichVu.setTrangThai(check_PhucVu.isSelected());
            if (edit == true) {
                dichVu.setMaDichVu(Integer.parseInt(txt_MaDichVu.getText()));
                iDAO_DichVu.updateData(dichVu);
                edit = false;
            } else {
                iDAO_DichVu.insertData(dichVu);
                edit = false;
            }
            loadDichVu();
            clear();
        }else{
            JOptionPane.showMessageDialog(this, tb, "Thông Báo",JOptionPane.WARNING_MESSAGE);
        }

        
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String tenDichVuTim = JOptionPane.showInputDialog(null, "Nhập vào tên dịch vụ hoặc mã tìm kiếm:", "Tìm kiếm...", JOptionPane.INFORMATION_MESSAGE);
        List<DichVu> listDichVu = iDAO_DichVu.findDataByName(tenDichVuTim);
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_QuanLyDichVu.getModel();
        defaultTableModel.setRowCount(0);
        listDichVu.forEach((dichVu) -> {
            defaultTableModel.addRow(new Object[]{dichVu.getMaDichVu(), dichVu.getTenDichVu(), dichVu.getGiaDichVu(), dichVu.getTrangThai() ? "Phục vụ" : "Không phục vụ"});
        });
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void check_KhongPhucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_KhongPhucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_KhongPhucVuActionPerformed

    private void loadDichVu() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_QuanLyDichVu.getModel();
        List<DichVu> listDichVu = iDAO_DichVu.getAllData();
        defaultTableModel.setRowCount(0);
        listDichVu.forEach((dichVu) -> {
            defaultTableModel.addRow(new Object[]{dichVu.getMaDichVu(), dichVu.getTenDichVu(), dichVu.getGiaDichVu(), dichVu.getTrangThai() ? "Phục vụ" : "Không phục vụ"});
        });
    }

    private void clear() {
        txt_GiaDichVu.setText("0");
        txt_MaDichVu.setText(null);
        txt_TenDichVu.setText(null);
        check_KhongPhucVu.setSelected(false);
        check_PhucVu.setSelected(true);
        edit = false;
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_25px.png"))); // NOI18N
        btn_Sua.setText("Thêm mới");
    }

    private void detail() {
        int SelectedRow = tbl_QuanLyDichVu.getSelectedRow();
        if (SelectedRow >= 0) {
            int idDichVu = (int) tbl_QuanLyDichVu.getValueAt(SelectedRow, 0);
            DichVu dichVu = iDAO_DichVu.findDataById(idDichVu);
            txt_MaDichVu.setText(dichVu.getMaDichVu() + "");
            txt_TenDichVu.setText(dichVu.getTenDichVu());
            txt_GiaDichVu.setText(dichVu.getGiaDichVu() + "");
            check_PhucVu.setSelected(true);
            if (dichVu.getTrangThai() == false) {
                check_KhongPhucVu.setSelected(true);
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
    private javax.swing.JRadioButton check_KhongPhucVu;
    private javax.swing.JRadioButton check_PhucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_QuanLyDichVu;
    private javax.swing.JTextField txt_GiaDichVu;
    private javax.swing.JTextField txt_MaDichVu;
    private javax.swing.JTextField txt_TenDichVu;
    // End of variables declaration//GEN-END:variables
}
