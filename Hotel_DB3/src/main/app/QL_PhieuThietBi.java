/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.app;

import DAO.IDAO_DanhMuc;
import DAO.IDAO_PhieuThietBi;
import DAO.IDAO_ThietBi;
import entities.DanhMuc;
import entities.PhieuThietBi;
import entities.ThietBi;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class QL_PhieuThietBi extends javax.swing.JInternalFrame {

    private final IDAO_DanhMuc iDAO_DanhMuc;
    private final IDAO_ThietBi iDAO_ThietBi;
    private final IDAO_PhieuThietBi iDAO_PhieuThietBi;

    public QL_PhieuThietBi() {
        initComponents();
        btn_ThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add_25px.png"))); // NOI18N
        btn_ThemMoi.setText("Thêm mới");
        iDAO_DanhMuc = new IDAO_DanhMuc();
        iDAO_ThietBi = new IDAO_ThietBi();
        iDAO_PhieuThietBi = new IDAO_PhieuThietBi();
        loadDanhMuc();
        loadThietBi();
        loadPhieuThietBi();
        tbl_PhieuThietBi.getSelectionModel().addListSelectionListener((lse) -> {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        list_DanhMuc = new javax.swing.JComboBox<>();
        list_ThietBi = new javax.swing.JComboBox<>();
        txt_SoLuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_GhiChu = new javax.swing.JTextArea();
        check_Free = new javax.swing.JRadioButton();
        check_MatPhi = new javax.swing.JRadioButton();
        btn_ThemMoi = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_PhieuThietBi = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Phiếu thiết bị");
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PHIẾU THIẾT BỊ MIỄN PHÍ");

        jLabel2.setText("Danh mục:");

        jLabel3.setText("Thiết bị:");

        jLabel4.setText("Số lượng:");

        jLabel5.setText("Ghi chú:");

        jLabel6.setText("Trạng thái:");

        list_ThietBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_ThietBiActionPerformed(evt);
            }
        });

        txt_SoLuong.setText("1");

        txt_GhiChu.setColumns(20);
        txt_GhiChu.setRows(5);
        jScrollPane1.setViewportView(txt_GhiChu);

        check_Free.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(check_Free);
        check_Free.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_Free.setForeground(new java.awt.Color(0, 0, 153));
        check_Free.setSelected(true);
        check_Free.setText("Free");
        check_Free.setEnabled(false);

        check_MatPhi.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(check_MatPhi);
        check_MatPhi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_MatPhi.setForeground(new java.awt.Color(255, 0, 0));
        check_MatPhi.setText("Mất phí");
        check_MatPhi.setEnabled(false);
        check_MatPhi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_MatPhiMouseClicked(evt);
            }
        });
        check_MatPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_MatPhiActionPerformed(evt);
            }
        });

        btn_ThemMoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ThemMoi.setForeground(new java.awt.Color(0, 102, 102));
        btn_ThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add_25px.png"))); // NOI18N
        btn_ThemMoi.setText("Thêm mới");
        btn_ThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemMoiActionPerformed(evt);
            }
        });

        btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search_25px.png"))); // NOI18N
        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/broom_25px.png"))); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete_25px.png"))); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(list_DanhMuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(list_ThietBi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_SoLuong)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(check_Free)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(check_MatPhi)
                                .addGap(27, 27, 27)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_ThemMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_TimKiem)))
                        .addGap(0, 9, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(list_DanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(list_ThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_Free)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(check_MatPhi)))
                .addGap(18, 18, 18)
                .addComponent(btn_ThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Clear)
                    .addComponent(btn_TimKiem))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tbl_PhieuThietBi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Danh mục", "Mã thiết bị", "Thiết bị", "Số lượng", "Giá trị", "Ghi chú", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_PhieuThietBi);
        if (tbl_PhieuThietBi.getColumnModel().getColumnCount() > 0) {
            tbl_PhieuThietBi.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbl_PhieuThietBi.getColumnModel().getColumn(1).setPreferredWidth(0);
            tbl_PhieuThietBi.getColumnModel().getColumn(2).setPreferredWidth(25);
            tbl_PhieuThietBi.getColumnModel().getColumn(3).setPreferredWidth(20);
            tbl_PhieuThietBi.getColumnModel().getColumn(4).setPreferredWidth(30);
            tbl_PhieuThietBi.getColumnModel().getColumn(5).setPreferredWidth(150);
            tbl_PhieuThietBi.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list_ThietBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_ThietBiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_ThietBiActionPerformed

    private void check_MatPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_MatPhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_MatPhiActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        Clear();
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_ThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemMoiActionPerformed
        PhieuThietBi phieuThietBi = new PhieuThietBi();
        phieuThietBi.setMaHoaDon(5);
        DanhMuc dm = (DanhMuc) list_DanhMuc.getSelectedItem();
        phieuThietBi.setMaDanhMuc(dm.getMaDanhMuc());
        ThietBi bi = (ThietBi) list_ThietBi.getSelectedItem();
        phieuThietBi.setMaThietBi(bi.getMaThietBi());
        phieuThietBi.setPhong(0);
        phieuThietBi.setGhiChu(txt_GhiChu.getText());
        phieuThietBi.setSoLuong(Integer.parseInt(txt_SoLuong.getText()));
        phieuThietBi.setTrangThai(check_Free.isSelected());
        if (iDAO_PhieuThietBi.check_TonTai(bi.getMaThietBi(), dm.getMaDanhMuc())) {
            iDAO_PhieuThietBi.insertData(phieuThietBi);
            Clear();
            loadPhieuThietBi();
        } else {
            JOptionPane.showMessageDialog(this, "Phòng này đã có " + txt_SoLuong.getText() + " thiết bị là " + bi.getTenThietBi());
        }

    }//GEN-LAST:event_btn_ThemMoiActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        ThietBi bi = (ThietBi) list_ThietBi.getSelectedItem();
        int id = (int) bi.getMaThietBi();

        int check = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa không?", "Xác nhận xóa!", JOptionPane.OK_CANCEL_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            iDAO_PhieuThietBi.deleteData(id);
        }
        loadPhieuThietBi();
        Clear();
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String timkiem = JOptionPane.showInputDialog(this, "Nhập tên thiết bị hoặc tên danh mục:", "Tìm kiếm...", JOptionPane.INFORMATION_MESSAGE);
        List<PhieuThietBi> listPhieuThietBi = iDAO_PhieuThietBi.listPhieuThietBiByTen(timkiem);
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_PhieuThietBi.getModel();
        defaultTableModel.setRowCount(0);
        listPhieuThietBi.forEach((phieu) -> {
            defaultTableModel.addRow(new Object[]{phieu.getTenDanhMuc(), phieu.getMaThietBi(), phieu.getTenThietBi(), phieu.getSoLuong(), phieu.getGhiChu(), phieu.isTrangThai() ? "Free" : "Mất phí"});
        });
        Clear();
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void check_MatPhiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_MatPhiMouseClicked
        JOptionPane.showMessageDialog(this, "Bạn chỉ được thêm thiết bị miễn phí!", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_check_MatPhiMouseClicked

    private void loadDanhMuc() {
        List<DanhMuc> listDanhMuc = iDAO_DanhMuc.getAllData();
        listDanhMuc.forEach((danhMuc) -> {
            list_DanhMuc.addItem(danhMuc);
        });
    }

    private void detail() {

        int selectRow = tbl_PhieuThietBi.getSelectedRow();
        if (selectRow >= 0) {
            int maThietBi = (int) tbl_PhieuThietBi.getValueAt(selectRow, 1);

            int maDanhMuc = iDAO_DanhMuc.getMaDanhMuc((String) tbl_PhieuThietBi.getValueAt(selectRow, 0));

//            JOptionPane.showMessageDialog(this, maDanhMuc + "-" + maThietBi + tbl_PhieuThietBi.getValueAt(selectRow, 0));

            PhieuThietBi p = (PhieuThietBi) iDAO_PhieuThietBi.finDataToDelete(maThietBi, maDanhMuc);
            txt_SoLuong.setText(p.getSoLuong() + "");
            txt_GhiChu.setText(p.getGhiChu());

            DefaultComboBoxModel cbb = (DefaultComboBoxModel) list_DanhMuc.getModel();
            for (int i = 0; i < cbb.getSize(); i++) {
                if (((DanhMuc) cbb.getElementAt(i)).getMaDanhMuc() == p.getMaDanhMuc()) {
                    list_DanhMuc.setSelectedItem(cbb.getElementAt(i));
                }
            }

            DefaultComboBoxModel cbb2 = (DefaultComboBoxModel) list_ThietBi.getModel();
            for (int i = 0; i < cbb2.getSize(); i++) {
                if (((ThietBi) cbb2.getElementAt(i)).getMaThietBi() == p.getMaThietBi()) {
                    list_ThietBi.setSelectedItem(cbb2.getElementAt(i));
                }
            }
            check_Free.setSelected(true);
            if (p.isTrangThai() == false) {
                check_MatPhi.setSelected(true);
            }
        }
    }

    private void Clear() {
        txt_GhiChu.setText("");
        txt_SoLuong.setText("1");
        check_Free.setSelected(true);
        if (check_MatPhi.isSelected() == true) {
            check_MatPhi.setSelected(true);
        }
        list_DanhMuc.setSelectedIndex(0);
        list_ThietBi.setSelectedIndex(0);

    }

    private void loadThietBi() {
        List<ThietBi> listThietBi = iDAO_ThietBi.getAllData();
        listThietBi.forEach((thietBi) -> {
            list_ThietBi.addItem(thietBi);
        });
    }

    private void loadPhieuThietBi() {
        List<PhieuThietBi> listPhieuThietBi = iDAO_PhieuThietBi.getAllData();

        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_PhieuThietBi.getModel();
        defaultTableModel.setRowCount(0);
        listPhieuThietBi.forEach((phieu) -> {
            ThietBi thietBi = (ThietBi) iDAO_ThietBi.findDataById(phieu.getMaThietBi());
            float giaTri = phieu.getSoLuong() * thietBi.getGiaThietBi();
            defaultTableModel.addRow(new Object[]{phieu.getTenDanhMuc(), phieu.getMaThietBi(), phieu.getTenThietBi(), phieu.getSoLuong(), giaTri, phieu.getGhiChu(), phieu.isTrangThai() ? "Free" : "Mất phí"});
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_ThemMoi;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton check_Free;
    private javax.swing.JRadioButton check_MatPhi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<DanhMuc> list_DanhMuc;
    private javax.swing.JComboBox<ThietBi> list_ThietBi;
    private javax.swing.JTable tbl_PhieuThietBi;
    private javax.swing.JTextArea txt_GhiChu;
    private javax.swing.JTextField txt_SoLuong;
    // End of variables declaration//GEN-END:variables

}
