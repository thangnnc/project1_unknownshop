package com.unknownshop.form.admin;

import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.ProductDAO;
import com.unknownshop.dao.ProductTypeDAO;
import com.unknownshop.entity.ProductTypes;
import com.unknownshop.entity.Products;
import com.unknownshop.swing.table.RowTableProduct;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XImage;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XPanel;
import com.unknownshop.util.XTable;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class PanelProductManager extends javax.swing.JPanel {

    ProductDAO proDao = new ProductDAO();
    List<Products> list = new ArrayList<>();
    List<Products> listDeleted = new ArrayList<>();
    ProductTypeDAO proTypeDao = new ProductTypeDAO();
    int row = -1;
    byte[] proImage;
    
    public PanelProductManager() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTabButton = new javax.swing.JPanel();
        btnDanhSachSP = new javax.swing.JButton();
        btnSPDaXoa = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        pnlCard = new javax.swing.JPanel();
        pnlDanhSachSP = new javax.swing.JPanel();
        cboLoai = new javax.swing.JComboBox<>();
        lblLoai = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDanhSachSP = new com.unknownshop.swing.table.Table();
        pnlSPDaXoa = new javax.swing.JPanel();
        cboLoai1 = new javax.swing.JComboBox<>();
        lblLoai1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSPDaXoa = new com.unknownshop.swing.table.Table();
        pnlSanPham = new javax.swing.JPanel();
        pnlForm = new javax.swing.JPanel();
        pnlImage = new javax.swing.JPanel();
        btnImage = new javax.swing.JButton();
        txtTenSP = new javax.swing.JTextField();
        lblIconTenSP = new javax.swing.JLabel();
        lblErrorTenSP = new javax.swing.JLabel();
        lblIconGiaSP = new javax.swing.JLabel();
        lblIconSoLuong = new javax.swing.JLabel();
        lblErrorGiaSP = new javax.swing.JLabel();
        lblErrorSoLuong = new javax.swing.JLabel();
        lblIconLoaiSP = new javax.swing.JLabel();
        lblErrorLoaiSP = new javax.swing.JLabel();
        pnlControl = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtGiaSP = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        cboLoaiSP = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTabButton.setBackground(new java.awt.Color(0, 102, 204));

        btnDanhSachSP.setBackground(new java.awt.Color(51, 51, 51));
        btnDanhSachSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDanhSachSP.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachSP.setText("Danh Sách Sản Phẩm");
        btnDanhSachSP.setToolTipText("DanhSachSP");
        btnDanhSachSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        btnDanhSachSP.setContentAreaFilled(false);
        btnDanhSachSP.setOpaque(true);
        btnDanhSachSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDanhSachSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDanhSachSPMouseExited(evt);
            }
        });
        btnDanhSachSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachSPActionPerformed(evt);
            }
        });

        btnSPDaXoa.setBackground(new java.awt.Color(51, 51, 51));
        btnSPDaXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSPDaXoa.setForeground(new java.awt.Color(51, 51, 51));
        btnSPDaXoa.setText("Danh Sách Sản Phẩm Đã Xóa");
        btnSPDaXoa.setToolTipText("SPDaXoa");
        btnSPDaXoa.setContentAreaFilled(false);
        btnSPDaXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSPDaXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSPDaXoaMouseExited(evt);
            }
        });
        btnSPDaXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPDaXoaActionPerformed(evt);
            }
        });

        btnSanPham.setBackground(new java.awt.Color(51, 51, 51));
        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSanPham.setForeground(new java.awt.Color(51, 51, 51));
        btnSanPham.setText("Sản Phẩm");
        btnSanPham.setToolTipText("SanPham");
        btnSanPham.setContentAreaFilled(false);
        btnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseExited(evt);
            }
        });
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTabButtonLayout = new javax.swing.GroupLayout(pnlTabButton);
        pnlTabButton.setLayout(pnlTabButtonLayout);
        pnlTabButtonLayout.setHorizontalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addComponent(btnDanhSachSP, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSPDaXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTabButtonLayout.setVerticalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addGroup(pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSPDaXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDanhSachSP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnlTabButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1270, 80));

        pnlCard.setOpaque(false);
        pnlCard.setLayout(new java.awt.CardLayout());

        pnlDanhSachSP.setOpaque(false);

        cboLoai.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiActionPerformed(evt);
            }
        });

        lblLoai.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblLoai.setForeground(new java.awt.Color(51, 51, 51));
        lblLoai.setText("Loại:");

        tblDanhSachSP.setBackground(new java.awt.Color(255, 255, 255));
        tblDanhSachSP.setForeground(new java.awt.Color(51, 51, 51));
        tblDanhSachSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ảnh", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Giá", "Chỉnh Sửa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachSP.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblDanhSachSP.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tblDanhSachSP);
        if (tblDanhSachSP.getColumnModel().getColumnCount() > 0) {
            tblDanhSachSP.getColumnModel().getColumn(0).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblDanhSachSP.getColumnModel().getColumn(1).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblDanhSachSP.getColumnModel().getColumn(2).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(2).setPreferredWidth(450);
            tblDanhSachSP.getColumnModel().getColumn(3).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblDanhSachSP.getColumnModel().getColumn(4).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblDanhSachSP.getColumnModel().getColumn(5).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        javax.swing.GroupLayout pnlDanhSachSPLayout = new javax.swing.GroupLayout(pnlDanhSachSP);
        pnlDanhSachSP.setLayout(pnlDanhSachSPLayout);
        pnlDanhSachSPLayout.setHorizontalGroup(
            pnlDanhSachSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(pnlDanhSachSPLayout.createSequentialGroup()
                        .addComponent(lblLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(912, Short.MAX_VALUE))))
        );
        pnlDanhSachSPLayout.setVerticalGroup(
            pnlDanhSachSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachSPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDanhSachSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoai))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlCard.add(pnlDanhSachSP, "DanhSachSP");

        pnlSPDaXoa.setOpaque(false);

        cboLoai1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboLoai1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboLoai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoai1ActionPerformed(evt);
            }
        });

        lblLoai1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblLoai1.setForeground(new java.awt.Color(51, 51, 51));
        lblLoai1.setText("Chức vụ:");

        tblSPDaXoa.setBackground(new java.awt.Color(255, 255, 255));
        tblSPDaXoa.setForeground(new java.awt.Color(51, 51, 51));
        tblSPDaXoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ảnh", "Tên Tài Khoản", "Họ Và Tên", "Email", "Chức Vụ", "Phục Hồi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSPDaXoa.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblSPDaXoa.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblSPDaXoa);
        if (tblSPDaXoa.getColumnModel().getColumnCount() > 0) {
            tblSPDaXoa.getColumnModel().getColumn(0).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblSPDaXoa.getColumnModel().getColumn(1).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblSPDaXoa.getColumnModel().getColumn(2).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblSPDaXoa.getColumnModel().getColumn(3).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(3).setPreferredWidth(350);
            tblSPDaXoa.getColumnModel().getColumn(4).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblSPDaXoa.getColumnModel().getColumn(5).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        javax.swing.GroupLayout pnlSPDaXoaLayout = new javax.swing.GroupLayout(pnlSPDaXoa);
        pnlSPDaXoa.setLayout(pnlSPDaXoaLayout);
        pnlSPDaXoaLayout.setHorizontalGroup(
            pnlSPDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSPDaXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSPDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                    .addGroup(pnlSPDaXoaLayout.createSequentialGroup()
                        .addComponent(lblLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSPDaXoaLayout.setVerticalGroup(
            pnlSPDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSPDaXoaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlSPDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoai1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCard.add(pnlSPDaXoa, "SPDaXoa");

        pnlSanPham.setOpaque(false);

        pnlForm.setBackground(new java.awt.Color(51, 51, 51));
        pnlForm.setForeground(new java.awt.Color(255, 255, 255));

        pnlImage.setBackground(new java.awt.Color(51, 51, 51));

        btnImage.setBackground(new java.awt.Color(51, 51, 51));
        btnImage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnImage.setForeground(new java.awt.Color(255, 255, 255));
        btnImage.setText("Hình ảnh");
        btnImage.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 102, 204)));
        btnImage.setContentAreaFilled(false);
        btnImage.setOpaque(true);
        btnImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImageMouseExited(evt);
            }
        });
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlImageLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        txtTenSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenSP.setForeground(new java.awt.Color(255, 255, 255));
        txtTenSP.setText("Tên Sản Phẩm");
        txtTenSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        txtTenSP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenSPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenSPFocusLost(evt);
            }
        });

        lblIconTenSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUsername.png"))); // NOI18N

        lblErrorTenSP.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorTenSP.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorTenSP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorTenSP.setText("Error!");

        lblIconGiaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        lblIconSoLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        lblErrorGiaSP.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorGiaSP.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorGiaSP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorGiaSP.setText("Error!");

        lblErrorSoLuong.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorSoLuong.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorSoLuong.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorSoLuong.setText("Error!");

        lblIconLoaiSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconEmail.png"))); // NOI18N

        lblErrorLoaiSP.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorLoaiSP.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorLoaiSP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorLoaiSP.setText("Error!");

        pnlControl.setOpaque(false);

        btnXoa.setBackground(new java.awt.Color(0, 102, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(51, 51, 51));
        btnXoa.setText("Xóa");
        btnXoa.setContentAreaFilled(false);
        btnXoa.setOpaque(true);
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXoaMouseExited(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(0, 102, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(51, 51, 51));
        btnSua.setText("Sửa");
        btnSua.setContentAreaFilled(false);
        btnSua.setOpaque(true);
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuaMouseExited(evt);
            }
        });
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(0, 102, 204));
        btnMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMoi.setForeground(new java.awt.Color(51, 51, 51));
        btnMoi.setText("Mới");
        btnMoi.setContentAreaFilled(false);
        btnMoi.setOpaque(true);
        btnMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMoiMouseExited(evt);
            }
        });
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(0, 102, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(51, 51, 51));
        btnThem.setText("Thêm");
        btnThem.setContentAreaFilled(false);
        btnThem.setOpaque(true);
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemMouseExited(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(0, 102, 204));
        btnFirst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(51, 51, 51));
        btnFirst.setText("|<");
        btnFirst.setContentAreaFilled(false);
        btnFirst.setOpaque(true);
        btnFirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFirstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFirstMouseExited(evt);
            }
        });
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setBackground(new java.awt.Color(0, 102, 204));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(51, 51, 51));
        btnPrev.setText("<<");
        btnPrev.setContentAreaFilled(false);
        btnPrev.setOpaque(true);
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrevMouseExited(evt);
            }
        });
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 102, 204));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(51, 51, 51));
        btnNext.setText(">>");
        btnNext.setContentAreaFilled(false);
        btnNext.setOpaque(true);
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextMouseExited(evt);
            }
        });
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(0, 102, 204));
        btnLast.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLast.setForeground(new java.awt.Color(51, 51, 51));
        btnLast.setText(">|");
        btnLast.setContentAreaFilled(false);
        btnLast.setOpaque(true);
        btnLast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLastMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLastMouseExited(evt);
            }
        });
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControlLayout = new javax.swing.GroupLayout(pnlControl);
        pnlControl.setLayout(pnlControlLayout);
        pnlControlLayout.setHorizontalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createSequentialGroup()
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createSequentialGroup()
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlControlLayout.setVerticalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtGiaSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGiaSP.setForeground(new java.awt.Color(255, 255, 255));
        txtGiaSP.setText("Giá Sản Phẩm");
        txtGiaSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        txtGiaSP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGiaSPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGiaSPFocusLost(evt);
            }
        });

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoLuong.setForeground(new java.awt.Color(255, 255, 255));
        txtSoLuong.setText("Số Lượng Nhập Kho");
        txtSoLuong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        txtSoLuong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSoLuongFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoLuongFocusLost(evt);
            }
        });

        cboLoaiSP.setBackground(new java.awt.Color(51, 51, 51));
        cboLoaiSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboLoaiSP.setForeground(new java.awt.Color(255, 255, 255));
        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Chọn loại sản phẩm ---", "Áo", "Quần", "Phụ Kiện", "Giày" }));
        cboLoaiSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        cboLoaiSP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cboLoaiSPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboLoaiSPFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addComponent(pnlImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addComponent(lblIconSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addComponent(lblIconGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblErrorTenSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                                .addComponent(lblIconTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblErrorGiaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addComponent(lblIconLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboLoaiSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblErrorLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addComponent(pnlControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorTenSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorGiaSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIconSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorSoLuong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconLoaiSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorLoaiSP)
                        .addGap(41, 41, 41)))
                .addComponent(pnlControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSanPhamLayout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pnlCard.add(pnlSanPham, "SanPham");

        add(pnlCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1260, 520));
    }// </editor-fold>//GEN-END:initComponents

// -------------------- Start Event --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnDanhSachTK"> 
    private void btnDanhSachSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachSPActionPerformed
        pressTabButton(btnDanhSachSP);
    }//GEN-LAST:event_btnDanhSachSPActionPerformed

    private void btnDanhSachSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachSPMouseEntered
        XHover.enterTabButton(btnDanhSachSP, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDanhSachSPMouseEntered

    private void btnDanhSachSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachSPMouseExited
        XHover.exitTabButton(btnDanhSachSP);
    }//GEN-LAST:event_btnDanhSachSPMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnTKDaXoa"> 
    private void btnSPDaXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPDaXoaActionPerformed
        pressTabButton(btnSPDaXoa);
    }//GEN-LAST:event_btnSPDaXoaActionPerformed

    private void btnSPDaXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSPDaXoaMouseEntered
        XHover.enterTabButton(btnSPDaXoa, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnSPDaXoaMouseEntered

    private void btnSPDaXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSPDaXoaMouseExited
        XHover.exitTabButton(btnSPDaXoa);
    }//GEN-LAST:event_btnSPDaXoaMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnTaiKhoan">
    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        pressTabButton(btnSanPham);
        clearForm();
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseEntered
        XHover.enterTabButton(btnSanPham, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnSanPhamMouseEntered

    private void btnSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseExited
        XHover.exitTabButton(btnSanPham);
    }//GEN-LAST:event_btnSanPhamMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event cboChucVu(DSTK)">
    private void cboLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiActionPerformed
        selectCombobox();
    }//GEN-LAST:event_cboLoaiActionPerformed

   // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event cboChucVu1(DSTK đã xóa)">
    private void cboLoai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoai1ActionPerformed
        selectCombobox1();
    }//GEN-LAST:event_cboLoai1ActionPerformed

    private void btnImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImageMouseEntered
        XHover.enterButton(btnImage, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnImageMouseEntered

    private void btnImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImageMouseExited
        XHover.exitButton(btnImage);
    }//GEN-LAST:event_btnImageMouseExited

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        this.getImage();
    }//GEN-LAST:event_btnImageActionPerformed

    private void txtTenSPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenSPFocusGained
        if (txtTenSP.getText().trim().equalsIgnoreCase("Tên Sản Phẩm")) {
            txtTenSP.setText("");
        }
    }//GEN-LAST:event_txtTenSPFocusGained

    private void txtTenSPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenSPFocusLost
        if (txtTenSP.getText().trim().length() == 0) {
            txtTenSP.setText("Tên Sản Phẩm");
            lblErrorTenSP.setText("Chưa nhập tên sản phẩm!");
        } else {
            lblErrorTenSP.setText(" ");
        }
    }//GEN-LAST:event_txtTenSPFocusLost

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        XHover.enterButton(btnXoa, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        XHover.exitButton(btnXoa);
    }//GEN-LAST:event_btnXoaMouseExited

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseEntered
        XHover.enterButton(btnSua, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnSuaMouseEntered

    private void btnSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseExited
        XHover.exitButton(btnSua);
    }//GEN-LAST:event_btnSuaMouseExited

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoiMouseEntered
        XHover.enterButton(btnMoi, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnMoiMouseEntered

    private void btnMoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoiMouseExited
        XHover.exitButton(btnMoi);
    }//GEN-LAST:event_btnMoiMouseExited

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        XHover.enterButton(btnThem, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        XHover.exitButton(btnThem);
    }//GEN-LAST:event_btnThemMouseExited

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnFirstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseEntered
        XHover.enterButton(btnFirst, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnFirstMouseEntered

    private void btnFirstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseExited
        XHover.exitButton(btnFirst);
    }//GEN-LAST:event_btnFirstMouseExited

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
        XHover.enterButton(btnPrev, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
        XHover.exitButton(btnPrev);
    }//GEN-LAST:event_btnPrevMouseExited

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseEntered
        XHover.enterButton(btnNext, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnNextMouseEntered

    private void btnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseExited
        XHover.exitButton(btnNext);
    }//GEN-LAST:event_btnNextMouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastMouseEntered
        XHover.enterButton(btnLast, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnLastMouseEntered

    private void btnLastMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastMouseExited
        XHover.exitButton(btnLast);
    }//GEN-LAST:event_btnLastMouseExited

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void txtGiaSPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiaSPFocusGained
        if (txtGiaSP.getText().trim().equalsIgnoreCase("Giá Sản Phẩm")) {
            txtGiaSP.setText("");
        }
    }//GEN-LAST:event_txtGiaSPFocusGained

    private void txtGiaSPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiaSPFocusLost
        if (txtGiaSP.getText().trim().length() == 0) {
            txtGiaSP.setText("Giá Sản Phẩm");
            lblErrorGiaSP.setText("Chưa nhập giá sản phẩm!");
        } else {
            lblErrorGiaSP.setText(" ");
        }
    }//GEN-LAST:event_txtGiaSPFocusLost

    private void txtSoLuongFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoLuongFocusGained
        if (txtSoLuong.getText().trim().equalsIgnoreCase("Số Lượng Nhập Kho")) {
            txtSoLuong.setText("");
        }
    }//GEN-LAST:event_txtSoLuongFocusGained

    private void txtSoLuongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoLuongFocusLost
        if (txtSoLuong.getText().trim().length() == 0) {
            txtSoLuong.setText("Số Lượng Nhập Kho");
            lblErrorSoLuong.setText("Chưa nhập số lượng sản phẩm!");
        } else {
            lblErrorSoLuong.setText(" ");
        }
    }//GEN-LAST:event_txtSoLuongFocusLost

    private void cboLoaiSPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboLoaiSPFocusGained
        lblErrorLoaiSP.setText(" ");
    }//GEN-LAST:event_cboLoaiSPFocusGained

    private void cboLoaiSPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboLoaiSPFocusLost
        if (cboLoaiSP.getSelectedIndex() == 0) {
            lblErrorLoaiSP.setText("Chưa chọn loại sản phẩm!");
        }
    }//GEN-LAST:event_cboLoaiSPFocusLost

   // </editor-fold> 
    
    // -------------------- End Event --------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDanhSachSP;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSPDaXoa;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JComboBox<String> cboLoai1;
    private javax.swing.JComboBox<String> cboLoaiSP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblErrorGiaSP;
    private javax.swing.JLabel lblErrorLoaiSP;
    private javax.swing.JLabel lblErrorSoLuong;
    private javax.swing.JLabel lblErrorTenSP;
    private javax.swing.JLabel lblIconGiaSP;
    private javax.swing.JLabel lblIconLoaiSP;
    private javax.swing.JLabel lblIconSoLuong;
    private javax.swing.JLabel lblIconTenSP;
    private javax.swing.JLabel lblLoai;
    private javax.swing.JLabel lblLoai1;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlDanhSachSP;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnlSPDaXoa;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlTabButton;
    private com.unknownshop.swing.table.Table tblDanhSachSP;
    private com.unknownshop.swing.table.Table tblSPDaXoa;
    private javax.swing.JTextField txtGiaSP;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        txtTenSP.setBackground(new Color(0, 0, 0, 0));
        txtGiaSP.setBackground(new Color(0, 0, 0, 0));
        txtSoLuong.setBackground(new Color(0, 0, 0, 0));
        cboLoaiSP.setBackground(new Color(0, 0, 0, 0));
        XTable.setCellAlignmentCenter(tblDanhSachSP,0);
        XTable.setCellAlignmentCenter(tblSPDaXoa,0);
        this.clearError();
        fillCboLoai(cboLoai,cboLoai1);
        fillTableUser(true);
        fillTableUserDeleted(true);
        XHover.disableButton(btnSua, btnXoa, btnFirst, btnLast, btnNext, btnPrev);
        // gán vào lớp tiện ích
        XPanel.panelProManager = this;
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển panel trên form">    
    private void showPanel(String name){
        CardLayout cardLayout = (CardLayout) pnlCard.getLayout();
        cardLayout.show(pnlCard, name);
        
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn nút trên thanh tab">    
    private void pressTabButton(JButton btn){
        JButton button[] = {btnDanhSachSP, btnSPDaXoa, btnSanPham};
        for (int i = 0; i < button.length; i++) {
            button[i].setOpaque(false);
            button[i].setBorder(null);
            button[i].setForeground(XConstant.BLACK_51);
        }
        btn.setOpaque(true);
        btn.setForeground(XConstant.WHITE_255);
        btn.setBorder(BorderFactory.createMatteBorder(0, 0, 6, 0, XConstant.WHITE_255));
        XHover.check = false;
        // Hiện panel tương ứng
        showPanel(btn.getToolTipText());
    } 
    // </editor-fold> 
    
// _____________________ DS Sản Phẩm _____________________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào combobox loại"> 
    private void fillCboLoai(JComboBox... combo){
        for (JComboBox cbo : combo) {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
            model.removeAllElements();
            model.addElement("--- Chọn loại sản phẩm ---");
            List<ProductTypes> list = proTypeDao.getList();
            for (ProductTypes proType : list) {
                model.addElement(proType);
            }
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào bảng sản phẩm">
    private void fillTableUser(boolean check) {
        cboLoai.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) tblDanhSachSP.getModel();
        model.setRowCount(0);
        if(check) {
            list = proDao.selectByIdPro(0);
        }
        for (Products pro : list) {
            model.addRow(new RowTableProduct(pro).toRowTable(0));
        }
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn combobox Loai">
    private void selectCombobox() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSachSP.getModel();
        model.setRowCount(0);
        if(cboLoai.getSelectedIndex() == 0){
            fillTableUser(false);
        }else if (cboLoai.getSelectedIndex() > 0){
            ProductTypes proType = (ProductTypes) cboLoai.getSelectedItem();
            for (Products pro : list) {
                if(pro.getTypeId() == proType.getId()){
                    model.addRow(new RowTableProduct(pro).toRowTable(0));
                }
            }
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền thông tin lên form">
    private void setForm(Products product){
        // Chuyển lỗi về dạng 1 dấu cách
        lblErrorTenSP.setText(" ");
        lblErrorLoaiSP.setText(" ");
        lblErrorSoLuong.setText(" ");
        lblErrorGiaSP.setText(" ");
        // Lấy thông tin từ sản phẩm điền lên form
        txtTenSP.setText(product.getName());
        txtGiaSP.setText(String.valueOf(product.getPrice()));
        txtSoLuong.setText(String.valueOf(product.getQuantity()));
        proImage = product.getImgUrl();
        btnImage.setIcon(new ImageIcon(XImage.convertBytesToImage(proImage, 175, 225)));
        cboLoaiSP.setSelectedIndex(product.getTypeId());
        btnImage.setText("");
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đưa thông tin tài khoản lên form">
    public void edit(){
        row = tblDanhSachSP.getSelectedRow();
        Products pro = list.get(row);
        setForm(pro);
        pressTabButton(btnSanPham);
        XHover.enableButton(btnSua, btnXoa, btnFirst, btnLast, btnNext, btnPrev);
        XHover.disableButton(btnThem);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa hàng được chọn">
    public void removeRow(){
        row = tblDanhSachSP.getSelectedRow();
        Products pro = list.get(row);
        if(XMess.confirm(null, "Bạn có chắc muốn xóa sản phẩm này")){
            if(proDao.delete(pro.getId()) == 0){
                XMess.alert(null, "Xóa sản phẩm thất bại!");
            }else{
                XMess.alert(null, "Xóa sản phẩm thành công");
                list.remove(row);
                fillTableUser(false);
                fillTableUserDeleted(true);
            }
        }
    }
    // </editor-fold>
    
// _______________________ SP Đã xóa ______________________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào bảng sản phẩm đã xóa">
    private void fillTableUserDeleted(boolean check) {
        cboLoai1.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) tblSPDaXoa.getModel();
        model.setRowCount(0);
        if(check) {
            listDeleted = proDao.getListDelete(0);
        }
        for (Products pro : listDeleted) {
            model.addRow(new RowTableProduct(pro).toRowTable(1));
        }
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn combobox ChucVu1">
    private void selectCombobox1() {
        DefaultTableModel model = (DefaultTableModel) tblSPDaXoa.getModel();
        model.setRowCount(0);
        if(cboLoai1.getSelectedIndex() == 0){
            fillTableUser(false);
        }else if (cboLoai1.getSelectedIndex() > 0){
            ProductTypes proType = (ProductTypes) cboLoai1.getSelectedItem();
            for (Products pro : listDeleted) {
                if(pro.getTypeId()== proType.getId()){
                    model.addRow(new RowTableProduct(pro).toRowTable(1));
                }
            }
        }
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức phục hồi sản phẩm">  
    public void restore(){
        int row1 = tblSPDaXoa.getSelectedRow();
        Products pro = listDeleted.get(row1);
        if(XMess.confirm(this, "Bạn muốn phục hồi sản phẩm này?")){
            if(proDao.restore(pro.getId()) == 0){
                XMess.alert(this,"Phục hồi sản phẩm thất bại!");
            }else{
                XMess.alert(this,"Phục hồi sản phẩm thành công!");
                listDeleted.remove(row1);
                fillTableUserDeleted(false);
                fillTableUser(true);
            }
        }
    }
    // </editor-fold>
    
// _____________________ Form Sản Phẩm ___________________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa lable lỗi"> 
    private void clearError() {
        lblErrorGiaSP.setText("  ");
        lblErrorLoaiSP.setText("  ");
        lblErrorSoLuong.setText("  ");
        lblErrorTenSP.setText("  ");
    }
    // </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức bắt lỗi chưa nhập"> 
    private void nonError(){
        if (lblErrorTenSP.getText().equals("  ")) {
            lblErrorTenSP.setText("Chưa nhập tên sản phẩm!");
        }
        if (lblErrorGiaSP.getText().equals("  ")) {
            lblErrorGiaSP.setText("Chưa nhập giá sản phẩm!");
        }
        if (lblErrorSoLuong.getText().equals("  ")) {
            lblErrorSoLuong.setText("Chưa nhập số lượng sản phẩm!");
        }
        if (lblErrorLoaiSP.getText().equals("  ")) {
            lblErrorLoaiSP.setText("Chưa chọn loại sản phẩm!");
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy thông tin trên form">  
    private Products getForm(){
        Products product = new Products();
        product.setName(txtTenSP.getText());
        product.setPrice(Float.parseFloat(txtGiaSP.getText()));
        product.setQuantity(Integer.valueOf(txtSoLuong.getText()));
        product.setImgUrl(proImage);
        Integer typeId = (Integer) cboLoaiSP.getSelectedIndex();
        product.setTypeId(typeId);
        return product;
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa trắng form"> 
    private void clearForm() {
        clearError();
        txtGiaSP.setText("Giá Sản Phẩm");
        txtSoLuong.setText("Số Lượng Nhập Kho");
        txtTenSP.setText("Tên Sản Phẩm");
        cboLoaiSP.setSelectedIndex(0);
        btnImage.setIcon(null);
        btnImage.setText("Hình ảnh");
        XHover.disableButton(btnSua, btnXoa, btnFirst, btnLast, btnNext, btnPrev);
        XHover.enableButton(btnThem);
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức kiểm tra lỗi"> 
    private boolean checkError(){
        if(!(lblErrorGiaSP.getText().equals(" ")
                && lblErrorLoaiSP.getText().equals(" ")
                && lblErrorSoLuong.getText().equals(" ")
                && lblErrorTenSP.getText().equals(" "))) return true;
        else if(btnImage.getIcon() == null){
            XMess.alert(this, "Bạn chưa chọn ảnh sản phẩm!");
            return true;
        }
        return false;
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức thêm sản phẩm">  
    private void insert(){
        nonError();
        if(checkError()) return;
        Products product = getForm();
        int result = XMess.confirm(this, "Bạn muốn thêm sản phẩm này?")
                    ? proDao.insert(product) : -2;
        if( result == -2){
            return;
        }else if(result == 0){
            XMess.alert(this,"Thêm sản phẩm thành công!");
        }else{
            XMess.alert(this,"Thêm sản phẩm thành công!");
            fillTableUser(true);
            pressTabButton(btnDanhSachSP);
            clearForm();
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức cập nhập sản phẩm">  
    private void update(){
        nonError();
        if(checkError()) return;
        Products product = getForm();
        if(XMess.confirm(this, "Bạn muốn cập nhật sản phẩm này?")){
            if(proDao.update(product) == 0){
                XMess.alert(this,"Cập nhập sản phẩm thất bại!");
            }else{
                XMess.alert(this,"Cập nhập sản phẩm thành công!");
                fillTableUser(true);
                pressTabButton(btnDanhSachSP);
                clearForm();
            }
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa sản phẩm">  
    private void delete(){
        Products pro = list.get(row);
        if(XMess.confirm(this, "Bạn muốn xóa sản phẩm này?")){
            if (proDao.delete(pro.getId()) == 0) {
                XMess.alert(this, "Xóa sản phẩm thất bại!");
            } else {
                fillTableUserDeleted(true);
                fillTableUser(true);
                pressTabButton(btnSPDaXoa);
                XMess.alert(this,"Xóa sản phẩm thành công!");
                clearForm();
            }
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy ảnh"> 
    private void getImage(){
        JFileChooser fileChooser = new JFileChooser();
        if(fileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            try {
                File file = fileChooser.getSelectedFile();
                proImage = XImage.convertImageToBytes(file);
                ImageIcon icon = new ImageIcon(new ImageIcon(file.getAbsolutePath()).getImage().
                        getScaledInstance(btnImage.getWidth(), btnImage.getHeight(), Image.SCALE_SMOOTH));
                btnImage.setIcon(icon);
            } catch (Exception ex) {
                
            } 
        }
    }
    // </editor-fold>  
    
// _____________ Điều khiển _____________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức các nút điều khiển"> 
    private void first(){
        tblDanhSachSP.setRowSelectionInterval(0, 0);
        edit();
        XHover.disableButton(btnPrev, btnFirst);
    }
    
    private void prev(){
        if(row > 0){
            tblDanhSachSP.setRowSelectionInterval(--row, row);
            edit();
        }
        if(row == 0){
            XHover.disableButton(btnPrev, btnFirst);
        }else if(row == list.size()-2){
            XHover.enableButton(btnNext, btnLast);
        }
    }
    
    private void next(){
        if(row < list.size()-1){
            tblDanhSachSP.setRowSelectionInterval(++row, row);
            edit();
        }
        if(row == list.size()-1){
            XHover.disableButton(btnNext, btnLast);
        }else if(row == 1){
            XHover.enableButton(btnPrev, btnFirst);
        }
    }
    
    private void last(){
        int index = tblDanhSachSP.getRowCount() - 1;
        tblDanhSachSP.setRowSelectionInterval(index, index);
        edit();
        XHover.disableButton(btnNext, btnLast);
    }
    // </editor-fold> 
    
// ---------------------- End Method ----------------------
    
}
