/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the hjccahasdkhdash
 */
/**
 *
 * @author Namvipzoom
 */
package main.app;

import javax.swing.JFrame;

public class Hotel_DB3 extends javax.swing.JFrame {

    /**
     * Creates new form Hotel_DB3
     */
    public Hotel_DB3() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dsk_Main = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_DatPhong = new javax.swing.JMenu();
        menu_HoaDon = new javax.swing.JMenu();
        menu_QuanLy = new javax.swing.JMenu();
        menu_DanhMuc = new javax.swing.JMenuItem();
        menu_Phong = new javax.swing.JMenuItem();
        menu_DichVu = new javax.swing.JMenuItem();
        menu_KhuyenMai = new javax.swing.JMenuItem();
        menu_KhachHang = new javax.swing.JMenuItem();
        menu_NhanVien = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTEL ĐB3");

        dsk_Main.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout dsk_MainLayout = new javax.swing.GroupLayout(dsk_Main);
        dsk_Main.setLayout(dsk_MainLayout);
        dsk_MainLayout.setHorizontalGroup(
            dsk_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1018, Short.MAX_VALUE)
        );
        dsk_MainLayout.setVerticalGroup(
            dsk_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );

        menu_DatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new_copy_25px.png"))); // NOI18N
        menu_DatPhong.setText("Đặt Phòng");
        menu_DatPhong.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        menu_DatPhong.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                menu_DatPhongStateChanged(evt);
            }
        });
        menu_DatPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_DatPhongMouseClicked(evt);
            }
        });
        menu_DatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DatPhongActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_DatPhong);

        menu_HoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/list_25px.png"))); // NOI18N
        menu_HoaDon.setText("Hóa đơn");
        menu_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        menu_HoaDon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                menu_HoaDonStateChanged(evt);
            }
        });
        menu_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_HoaDonMouseClicked(evt);
            }
        });
        menu_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_HoaDonActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_HoaDon);

        menu_QuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin_settings_male_25px.png"))); // NOI18N
        menu_QuanLy.setText("Quản Lý");
        menu_QuanLy.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        menu_DanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/category_25px.png"))); // NOI18N
        menu_DanhMuc.setText("Danh mục");
        menu_DanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DanhMucActionPerformed(evt);
            }
        });
        menu_QuanLy.add(menu_DanhMuc);

        menu_Phong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sleeping_in_bed_25px.png"))); // NOI18N
        menu_Phong.setText("Phòng");
        menu_Phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_PhongActionPerformed(evt);
            }
        });
        menu_QuanLy.add(menu_Phong);

        menu_DichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/food_service_25px.png"))); // NOI18N
        menu_DichVu.setText("Dịch vụ");
        menu_DichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DichVuActionPerformed(evt);
            }
        });
        menu_QuanLy.add(menu_DichVu);

        menu_KhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sale_price_tag_25px.png"))); // NOI18N
        menu_KhuyenMai.setText("Khuyến mãi");
        menu_KhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_KhuyenMaiActionPerformed(evt);
            }
        });
        menu_QuanLy.add(menu_KhuyenMai);

        menu_KhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/team_25px.png"))); // NOI18N
        menu_KhachHang.setText("Khách hàng");
        menu_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_KhachHangActionPerformed(evt);
            }
        });
        menu_QuanLy.add(menu_KhachHang);

        menu_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nurse_25px.png"))); // NOI18N
        menu_NhanVien.setText("Nhân viên");
        menu_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_NhanVienActionPerformed(evt);
            }
        });
        menu_QuanLy.add(menu_NhanVien);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ingredients_25px.png"))); // NOI18N
        jMenuItem1.setText("Thiết bị");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_QuanLy.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/list_25px.png"))); // NOI18N
        jMenuItem2.setText("Phiếu thiết bị");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu_QuanLy.add(jMenuItem2);

        jMenuBar1.add(menu_QuanLy);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dsk_Main)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dsk_Main)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_DanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DanhMucActionPerformed
        QL_DanhMucPhong ql_DanhMucPhong = new QL_DanhMucPhong();
        this.dsk_Main.add(ql_DanhMucPhong);
        ql_DanhMucPhong.setVisible(true);
    }//GEN-LAST:event_menu_DanhMucActionPerformed

    private void menu_PhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_PhongActionPerformed
        QL_Phong ql_Phong = new QL_Phong();
        this.dsk_Main.add(ql_Phong);
        ql_Phong.setVisible(true);
    }//GEN-LAST:event_menu_PhongActionPerformed

    private void menu_DichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DichVuActionPerformed
        QL_DichVu ql_DichVu = new QL_DichVu();
        this.dsk_Main.add(ql_DichVu);
        ql_DichVu.setVisible(true);
    }//GEN-LAST:event_menu_DichVuActionPerformed

    private void menu_KhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_KhuyenMaiActionPerformed
        QL_KhuyenMai ql_KhuyenMai = new QL_KhuyenMai();
        this.dsk_Main.add(ql_KhuyenMai);
        ql_KhuyenMai.setVisible(true);
    }//GEN-LAST:event_menu_KhuyenMaiActionPerformed

    private void menu_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_KhachHangActionPerformed
        QL_KhachHang ql_KhachHang = new QL_KhachHang();
        this.dsk_Main.add(ql_KhachHang);
        ql_KhachHang.setVisible(true);
    }//GEN-LAST:event_menu_KhachHangActionPerformed

    private void menu_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_NhanVienActionPerformed
        QL_NhanVien ql_NhanVien = new QL_NhanVien();
        this.dsk_Main.add(ql_NhanVien);
        ql_NhanVien.setVisible(true);
    }//GEN-LAST:event_menu_NhanVienActionPerformed

    private void menu_DatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DatPhongActionPerformed

    }//GEN-LAST:event_menu_DatPhongActionPerformed

    private void menu_DatPhongStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_menu_DatPhongStateChanged

    }//GEN-LAST:event_menu_DatPhongStateChanged

    private void menu_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_HoaDonActionPerformed
        QL_HoaDon hoaDon = new QL_HoaDon();
        this.dsk_Main.add(hoaDon);
        hoaDon.setVisible(true);
    }//GEN-LAST:event_menu_HoaDonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        QL_ThietBi thietBi = new QL_ThietBi();
        this.dsk_Main.add(thietBi);
        thietBi.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        QL_PhieuThietBi phieuThietBi = new QL_PhieuThietBi();
        this.dsk_Main.add(phieuThietBi);
        phieuThietBi.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menu_HoaDonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_menu_HoaDonStateChanged

    }//GEN-LAST:event_menu_HoaDonStateChanged

    private void menu_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_HoaDonMouseClicked
        QL_HoaDon hoaDon = new QL_HoaDon();
        this.dsk_Main.add(hoaDon);
        hoaDon.setVisible(true);
    }//GEN-LAST:event_menu_HoaDonMouseClicked

    private void menu_DatPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_DatPhongMouseClicked
        QL_DatPhong datPhong = new QL_DatPhong();
        this.dsk_Main.add(datPhong);
        datPhong.setVisible(true);
    }//GEN-LAST:event_menu_DatPhongMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel_DB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Hotel_DB3().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dsk_Main;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem menu_DanhMuc;
    private javax.swing.JMenu menu_DatPhong;
    private javax.swing.JMenuItem menu_DichVu;
    private javax.swing.JMenu menu_HoaDon;
    private javax.swing.JMenuItem menu_KhachHang;
    private javax.swing.JMenuItem menu_KhuyenMai;
    private javax.swing.JMenuItem menu_NhanVien;
    private javax.swing.JMenuItem menu_Phong;
    private javax.swing.JMenu menu_QuanLy;
    // End of variables declaration//GEN-END:variables

}
