package com.unknownshop.form.user;

import com.twilio.Twilio;
import static com.twilio.example.Example.ACCOUNT_SID;
import static com.twilio.example.Example.AUTH_TOKEN;
import com.twilio.rest.api.v2010.account.Message;
import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.OrderDAO;
import com.unknownshop.dao.OrderDetailDAO;
import com.unknownshop.entity.OrderDetails;
import com.unknownshop.entity.Orders;
import com.unknownshop.entity.Products;
import com.unknownshop.fragment.infoCart.InfoCart;
import com.unknownshop.fragment.menu.MenuUser;
import com.unknownshop.swing.table.RowTableCart;
import com.unknownshop.util.Auth;
import com.unknownshop.util.XCart;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XLabel;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XMoney;
import com.unknownshop.util.XPanel;
import com.unknownshop.util.XTable;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelCart extends javax.swing.JPanel {

    private static final String ACCOUNT_SID = "ACb89a1025483a4dcc9a516b52131e21c8";
    private static final String AUTH_TOKEN = "7935ced5ad2d031061150f2c0ca1bcf4";
    Products products;
    OrderDAO dao = new OrderDAO();
    OrderDetailDAO odDAO = new OrderDetailDAO();
    DefaultTableModel model;
    boolean check = false;
    public static int OTP = 0;

    public PanelCart() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart = new com.unknownshop.swing.table.Table();
        btnThanhToan = new javax.swing.JButton();
        btnXoaSP = new javax.swing.JButton();
        lblTongTien = new javax.swing.JLabel();
        lblNameTongTien = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        lblNameSL = new javax.swing.JLabel();
        roundPanel1 = new com.unknownshop.swing.RoundPanel();
        lblThongTinKhachHang = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        pnlInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnXacThuc = new javax.swing.JButton();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconBlackGioHang.png"))); // NOI18N
        jLabel1.setText("Danh Sách Sản Phẩm Đã Mua");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 51)));

        tblCart.setForeground(new java.awt.Color(51, 51, 51));
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ảnh", "Tên Sản Phẩm", "Số lượng", "Giá", "Xóa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblCart.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tblCart);
        if (tblCart.getColumnModel().getColumnCount() > 0) {
            tblCart.getColumnModel().getColumn(0).setResizable(false);
            tblCart.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblCart.getColumnModel().getColumn(1).setResizable(false);
            tblCart.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblCart.getColumnModel().getColumn(2).setResizable(false);
            tblCart.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblCart.getColumnModel().getColumn(3).setResizable(false);
            tblCart.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblCart.getColumnModel().getColumn(4).setResizable(false);
            tblCart.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        btnThanhToan.setBackground(new java.awt.Color(51, 51, 51));
        btnThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.setContentAreaFilled(false);
        btnThanhToan.setOpaque(true);
        btnThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThanhToanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThanhToanMouseExited(evt);
            }
        });
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnXoaSP.setBackground(new java.awt.Color(51, 51, 51));
        btnXoaSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoaSP.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaSP.setText("Xóa Tất Cả");
        btnXoaSP.setContentAreaFilled(false);
        btnXoaSP.setOpaque(true);
        btnXoaSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoaSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXoaSPMouseExited(evt);
            }
        });
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });

        lblTongTien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(51, 51, 51));
        lblTongTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongTien.setText("0 VNĐ");
        lblTongTien.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNameTongTien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNameTongTien.setForeground(new java.awt.Color(51, 51, 51));
        lblNameTongTien.setText("      Tổng tiền:");
        lblNameTongTien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(51, 51, 51)));

        lblSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSoLuong.setForeground(new java.awt.Color(51, 51, 51));
        lblSoLuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoLuong.setText("0");
        lblSoLuong.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNameSL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNameSL.setForeground(new java.awt.Color(51, 51, 51));
        lblNameSL.setText("Số lượng sản phẩm:");

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblThongTinKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongTinKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblThongTinKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTinKhachHang.setText("Thông tin khách hàng");
        lblThongTinKhachHang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        txtSdt.setBackground(new java.awt.Color(51, 51, 51));
        txtSdt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSdt.setForeground(new java.awt.Color(255, 255, 255));
        txtSdt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSdt.setText("Nhập số điện thoại");
        txtSdt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        txtSdt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSdtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSdtFocusLost(evt);
            }
        });

        txtDiaChi.setBackground(new java.awt.Color(51, 51, 51));
        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDiaChi.setForeground(new java.awt.Color(255, 255, 255));
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaChi.setText("Nhập địa chỉ nhận hàng");
        txtDiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        txtDiaChi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaChiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaChiFocusLost(evt);
            }
        });

        pnlInfo.setOpaque(false);
        pnlInfo.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vui lòng đăng nhập để mua hàng");
        pnlInfo.add(jLabel2);

        btnXacThuc.setBackground(new java.awt.Color(51, 51, 51));
        btnXacThuc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXacThuc.setForeground(new java.awt.Color(255, 255, 255));
        btnXacThuc.setText("Xác thực");
        btnXacThuc.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnXacThuc.setContentAreaFilled(false);
        btnXacThuc.setOpaque(true);
        btnXacThuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXacThucMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXacThucMouseExited(evt);
            }
        });
        btnXacThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacThucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThongTinKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXacThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblThongTinKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(btnXacThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNameSL, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblNameTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNameSL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNameTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    // <editor-fold defaultstate="collapsed" desc="Event btnThanhToan"> 
    private void btnThanhToanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseEntered
        XHover.enterButton(btnThanhToan, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnThanhToanMouseEntered

    private void btnThanhToanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseExited
        XHover.exitButton(btnThanhToan);
    }//GEN-LAST:event_btnThanhToanMouseExited

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        this.payment();
    }//GEN-LAST:event_btnThanhToanActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnXoa"> 
    private void btnXoaSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaSPMouseEntered
        XHover.enterButton(btnXoaSP, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnXoaSPMouseEntered

    private void btnXoaSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaSPMouseExited
        XHover.exitButton(btnXoaSP);
    }//GEN-LAST:event_btnXoaSPMouseExited

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        if (XMess.confirm(this, "Bạn có muốn xóa tất cả sản phẩm?")) {
            this.deleteAllPro();
        }
    }//GEN-LAST:event_btnXoaSPActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event bắt lỗi focus txtSdt"> 
    private void txtSdtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSdtFocusGained
        if (txtSdt.getText().trim().equalsIgnoreCase("Nhập số điện thoại")) {
            txtSdt.setText("");
        }
    }//GEN-LAST:event_txtSdtFocusGained

    private void txtSdtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSdtFocusLost
        if (txtSdt.getText().trim().length() == 0) {
            txtSdt.setText("Nhập số điện thoại");
        }
    }//GEN-LAST:event_txtSdtFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event bắt lỗi focus txtDiaChi"> 
    private void txtDiaChiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChiFocusGained
        if (txtDiaChi.getText().trim().equalsIgnoreCase("Nhập địa chỉ nhận hàng")) {
            txtDiaChi.setText("");
        }
    }//GEN-LAST:event_txtDiaChiFocusGained

    private void txtDiaChiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChiFocusLost
        if (txtDiaChi.getText().trim().length() == 0) {
            txtDiaChi.setText("Nhập địa chỉ nhận hàng");
        }
    }//GEN-LAST:event_txtDiaChiFocusLost

    private void btnXacThucMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacThucMouseEntered
       XHover.enterButton(btnXacThuc, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnXacThucMouseEntered

    private void btnXacThucMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacThucMouseExited
        XHover.exitButton(btnXacThuc);
    }//GEN-LAST:event_btnXacThucMouseExited

    private void btnXacThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacThucActionPerformed
        this.sendOTP();
    }//GEN-LAST:event_btnXacThucActionPerformed
    // </editor-fold> 

// ---------------------- End Event ----------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnXacThuc;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNameSL;
    private javax.swing.JLabel lblNameTongTien;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblThongTinKhachHang;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JPanel pnlInfo;
    private com.unknownshop.swing.RoundPanel roundPanel1;
    private com.unknownshop.swing.table.Table tblCart;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtSdt;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo form"> 
    private void init() {
        XPanel.pnlCart = this;
        model = (DefaultTableModel) tblCart.getModel();
        // Gán các label vào lớp tiện ích
        XLabel.lblCartTotalQuantity = lblSoLuong;
        XLabel.lblCartTotalPrice = lblTongTien;
        // Định dạng căn giữa cho bảng
        XTable.setCellAlignmentCenter(tblCart, 0);
        // Kiểm tra đăng nhập
        if (Auth.isLogin()) {
            pnlInfo.removeAll();
            pnlInfo.add(new InfoCart());
            pnlInfo.repaint();
            pnlInfo.revalidate();
        }
        fillTable();
        lblSoLuong.setText("" + XCart.totalQuantity);
        lblTongTien.setText(XMoney.convertMoney(XCart.totalPrice) + " VNĐ");

    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Phương thức điền thông tin lên bảng">
    private void fillTable() {
        model.setRowCount(0);
        // Tải bảng sản phẩm
        for (Products product : XCart.listCart.values()) {
            model.addRow(new RowTableCart(product).toRowTable());
        }

    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa hàng trên bảng">
    public void removeRow() {
        int row = tblCart.getSelectedRow();
        XCart.removeProduct(row);
        model.removeRow(row);
        if (model.getRowCount() > row) {
            tblCart.setRowSelectionInterval(row, row);
        } else if (model.getRowCount() > 0) {
            tblCart.setRowSelectionInterval(row - 1, row - 1);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa sản phẩm">
    private void deleteAllPro() {
        XCart.removeAll();
        fillTable();
        lblSoLuong.setText("0");
        lblTongTien.setText("0 VNĐ");
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức gửi mã OTP">
    private void sendOTP() {
        if (!(txtSdt.getText().equalsIgnoreCase("Nhập số điện thoại"))) {
            OTP = (int) Math.round((Math.random() * 9999) + 1000);
            System.out.println(OTP);
            String body = "Mã xác nhận của bạn là : " + OTP + "\nKhông chia sẻ mã với người khác";
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                    new com.twilio.type.PhoneNumber("+84" + txtSdt.getText()),
                    "MG04ff40e2ad2124fbf016684b01f4a54f",
                    body)
                    .create();
            OtpAuthentication otp = new OtpAuthentication();
            otp.setVisible(true);
        } else {
            XMess.alert(this,"Chưa nhập số điện thoại");
        }
    }
// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức thanh toán">
    private void payment() {
        if (OTP == 1) {
            if (checkInfo()) {
                if (XCart.listCart.size() == 0) {
                    XMess.alert(null, "Hãy chọn sản phẩm bạn muốn mua trước khi thanh toán!");
                    return;
                }
                Orders od = getForm();
                try {
                    int orderId = dao.insert(od);
                    for (Products product : XCart.listCart.values()) {
                        OrderDetails ods = new OrderDetails();
                        ods.setOrderId(orderId);
                        ods.setProducId(product.getId());
                        ods.setPrice(product.getPrice());
                        ods.setQuantity(product.getQuantity());
                        odDAO.insert(ods);
                    }
                    XMess.alert(this, "Thanh toán thành công");
                    deleteAllPro();
                } catch (Exception e) {
                    e.printStackTrace();
                    XMess.alert(this, "Thanh toán thất bại");
                }
            }
        } else {
            XMess.alert(this, "Vui lòng xác thực số điện thoại");
        }

    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Phương thức kiểm tra trống form">
    private boolean checkInfo() {
        String mess = "Lỗi: ";
        JTextField txt = null;
        if (Auth.user == null) {
            XMess.alert(this, "Chưa đăng nhập !");
            return false;
        }
        if (txtSdt.getText().equals("Nhập số điện thoại")) {
            mess += "\nChưa nhập số điện thoại!";
            if (txt == null) {
                txt = txtSdt;
            }
        }
        if (txtDiaChi.getText().equals("Nhập địa chỉ nhận hàng")) {
            mess += "\nChưa nhập địa chỉ !";
            if (txt == null) {
                txt = txtDiaChi;
            }
        }
        if (mess.length() == 5) {
            return true;
        } else {
            XMess.alert(null, mess);
            txt.requestFocus();
            return false;
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy thông tin trên form">
    private Orders getForm() {
        Orders od = new Orders();
        od.setAddress(txtDiaChi.getText());
        od.setPhone(txtSdt.getText());
        od.setTotalPrice(XCart.totalPrice);
        od.setUserId(Auth.user.getId());
        return od;
    }
    // </editor-fold>

// ---------------------- End Method ----------------------
}
