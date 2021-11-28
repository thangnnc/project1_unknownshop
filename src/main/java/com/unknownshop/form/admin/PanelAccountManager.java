package com.unknownshop.form.admin;

import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.UserDAO;
import com.unknownshop.entity.Users;
import com.unknownshop.swing.table.RowTableAccount;
import com.unknownshop.util.Auth;
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

public class PanelAccountManager extends javax.swing.JPanel {

    UserDAO dao = new UserDAO();
    List<Users> listUser = new ArrayList<>();
    List<Users> listUserDeleted = new ArrayList<>();
    int row = -1;
    byte[] userImg;
    
    public PanelAccountManager() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlTabButton = new javax.swing.JPanel();
        btnDanhSachTK = new javax.swing.JButton();
        btnTKDaXoa = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        pnlCard = new javax.swing.JPanel();
        pnlDanhSachTK = new javax.swing.JPanel();
        cboChucVu = new javax.swing.JComboBox<>();
        lblChucVu = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDanhSachTK = new com.unknownshop.swing.table.Table();
        pnlTKDaXoa = new javax.swing.JPanel();
        cboChucVu1 = new javax.swing.JComboBox<>();
        lblChucVu1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTKDaXoa = new com.unknownshop.swing.table.Table();
        pnlTaiKhoan = new javax.swing.JPanel();
        pnlForm = new javax.swing.JPanel();
        pnlImage = new javax.swing.JPanel();
        btnImage = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        lblIconUsername = new javax.swing.JLabel();
        lblErrorUsername = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblIconPassword = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        lblIconRePassword = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        lblIconFullname = new javax.swing.JLabel();
        lblErrorRePassword = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblIconEmail = new javax.swing.JLabel();
        lblErrorFullname = new javax.swing.JLabel();
        lblErrorEmail = new javax.swing.JLabel();
        lblIconEmail1 = new javax.swing.JLabel();
        rdoKhachHang = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        rdoQuanLy = new javax.swing.JRadioButton();
        pnlControl = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTabButton.setBackground(new java.awt.Color(0, 102, 204));

        btnDanhSachTK.setBackground(new java.awt.Color(51, 51, 51));
        btnDanhSachTK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDanhSachTK.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachTK.setText("Danh Sách Tài Khoản");
        btnDanhSachTK.setToolTipText("DanhSachTK");
        btnDanhSachTK.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        btnDanhSachTK.setContentAreaFilled(false);
        btnDanhSachTK.setOpaque(true);
        btnDanhSachTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDanhSachTKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDanhSachTKMouseExited(evt);
            }
        });
        btnDanhSachTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachTKActionPerformed(evt);
            }
        });

        btnTKDaXoa.setBackground(new java.awt.Color(51, 51, 51));
        btnTKDaXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTKDaXoa.setForeground(new java.awt.Color(51, 51, 51));
        btnTKDaXoa.setText("Danh Sách Tài Khoản Đã Xóa");
        btnTKDaXoa.setToolTipText("TKDaXoa");
        btnTKDaXoa.setContentAreaFilled(false);
        btnTKDaXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTKDaXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTKDaXoaMouseExited(evt);
            }
        });
        btnTKDaXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKDaXoaActionPerformed(evt);
            }
        });

        btnTaiKhoan.setBackground(new java.awt.Color(51, 51, 51));
        btnTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTaiKhoan.setForeground(new java.awt.Color(51, 51, 51));
        btnTaiKhoan.setText("Tài Khoản");
        btnTaiKhoan.setToolTipText("TaiKhoan");
        btnTaiKhoan.setContentAreaFilled(false);
        btnTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTaiKhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTaiKhoanMouseExited(evt);
            }
        });
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTabButtonLayout = new javax.swing.GroupLayout(pnlTabButton);
        pnlTabButton.setLayout(pnlTabButtonLayout);
        pnlTabButtonLayout.setHorizontalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addComponent(btnDanhSachTK, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTKDaXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTabButtonLayout.setVerticalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addGroup(pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTKDaXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDanhSachTK, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnlTabButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1270, 80));

        pnlCard.setOpaque(false);
        pnlCard.setLayout(new java.awt.CardLayout());

        pnlDanhSachTK.setOpaque(false);

        cboChucVu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChucVuActionPerformed(evt);
            }
        });

        lblChucVu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(51, 51, 51));
        lblChucVu.setText("Chức vụ:");

        tblDanhSachTK.setBackground(new java.awt.Color(255, 255, 255));
        tblDanhSachTK.setForeground(new java.awt.Color(51, 51, 51));
        tblDanhSachTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ảnh", "Tên Tài Khoản", "Học Và Tên", "Email", "Vai Trò", "Chỉnh Sửa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachTK.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblDanhSachTK.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tblDanhSachTK);
        if (tblDanhSachTK.getColumnModel().getColumnCount() > 0) {
            tblDanhSachTK.getColumnModel().getColumn(0).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblDanhSachTK.getColumnModel().getColumn(1).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblDanhSachTK.getColumnModel().getColumn(2).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblDanhSachTK.getColumnModel().getColumn(3).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(3).setPreferredWidth(350);
            tblDanhSachTK.getColumnModel().getColumn(4).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblDanhSachTK.getColumnModel().getColumn(5).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        javax.swing.GroupLayout pnlDanhSachTKLayout = new javax.swing.GroupLayout(pnlDanhSachTK);
        pnlDanhSachTK.setLayout(pnlDanhSachTKLayout);
        pnlDanhSachTKLayout.setHorizontalGroup(
            pnlDanhSachTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(pnlDanhSachTKLayout.createSequentialGroup()
                        .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(912, Short.MAX_VALUE))))
        );
        pnlDanhSachTKLayout.setVerticalGroup(
            pnlDanhSachTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachTKLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDanhSachTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChucVu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlCard.add(pnlDanhSachTK, "DanhSachTK");

        pnlTKDaXoa.setOpaque(false);

        cboChucVu1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboChucVu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChucVu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChucVu1ActionPerformed(evt);
            }
        });

        lblChucVu1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblChucVu1.setForeground(new java.awt.Color(51, 51, 51));
        lblChucVu1.setText("Chức vụ:");

        tblTKDaXoa.setBackground(new java.awt.Color(255, 255, 255));
        tblTKDaXoa.setForeground(new java.awt.Color(51, 51, 51));
        tblTKDaXoa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTKDaXoa.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblTKDaXoa.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblTKDaXoa);
        if (tblTKDaXoa.getColumnModel().getColumnCount() > 0) {
            tblTKDaXoa.getColumnModel().getColumn(0).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblTKDaXoa.getColumnModel().getColumn(1).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblTKDaXoa.getColumnModel().getColumn(2).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblTKDaXoa.getColumnModel().getColumn(3).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(3).setPreferredWidth(350);
            tblTKDaXoa.getColumnModel().getColumn(4).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblTKDaXoa.getColumnModel().getColumn(5).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        javax.swing.GroupLayout pnlTKDaXoaLayout = new javax.swing.GroupLayout(pnlTKDaXoa);
        pnlTKDaXoa.setLayout(pnlTKDaXoaLayout);
        pnlTKDaXoaLayout.setHorizontalGroup(
            pnlTKDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKDaXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTKDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                    .addGroup(pnlTKDaXoaLayout.createSequentialGroup()
                        .addComponent(lblChucVu1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboChucVu1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTKDaXoaLayout.setVerticalGroup(
            pnlTKDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTKDaXoaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlTKDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboChucVu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChucVu1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCard.add(pnlTKDaXoa, "TKDaXoa");

        pnlTaiKhoan.setOpaque(false);

        pnlForm.setBackground(new java.awt.Color(51, 51, 51));

        pnlImage.setBackground(new java.awt.Color(51, 51, 51));

        btnImage.setBackground(new java.awt.Color(51, 51, 51));
        btnImage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnImage.setForeground(new java.awt.Color(255, 255, 255));
        btnImage.setText("Hình Ảnh");
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

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setText("Tên tài khoản");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });

        lblIconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUsername.png"))); // NOI18N

        lblErrorUsername.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorUsername.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorUsername.setText("Error!");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("Mật khẩu");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        lblIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        txtRePassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRePassword.setForeground(new java.awt.Color(255, 255, 255));
        txtRePassword.setText("Mật khẩu");
        txtRePassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        txtRePassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRePasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRePasswordFocusLost(evt);
            }
        });

        lblIconRePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        lblErrorPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorPassword.setText("Error!");

        txtFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFullname.setForeground(new java.awt.Color(255, 255, 255));
        txtFullname.setText("Họ tên");
        txtFullname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        txtFullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFullnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFullnameFocusLost(evt);
            }
        });

        lblIconFullname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconName.png"))); // NOI18N

        lblErrorRePassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorRePassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorRePassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorRePassword.setText("Error!");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("Email");
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        lblIconEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconEmail.png"))); // NOI18N

        lblErrorFullname.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorFullname.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorFullname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorFullname.setText("Error!");

        lblErrorEmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorEmail.setText("Error!");

        lblIconEmail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconEmail.png"))); // NOI18N

        buttonGroup1.add(rdoKhachHang);
        rdoKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        rdoKhachHang.setSelected(true);
        rdoKhachHang.setText("Khách hàng");

        buttonGroup1.add(rdoNhanVien);
        rdoNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        rdoNhanVien.setText("Nhân Viên");

        buttonGroup1.add(rdoQuanLy);
        rdoQuanLy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoQuanLy.setForeground(new java.awt.Color(255, 255, 255));
        rdoQuanLy.setText("Quản lý");

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
                                .addComponent(lblIconFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFullname))
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addComponent(lblIconRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addComponent(lblIconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblErrorUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                                .addComponent(lblIconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblErrorPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorRePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorFullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addComponent(lblIconEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail))
                            .addComponent(lblErrorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addComponent(lblIconEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdoKhachHang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoNhanVien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addComponent(pnlControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIconRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorRePassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconFullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorFullname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rdoNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdoKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIconEmail1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdoQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlTaiKhoanLayout = new javax.swing.GroupLayout(pnlTaiKhoan);
        pnlTaiKhoan.setLayout(pnlTaiKhoanLayout);
        pnlTaiKhoanLayout.setHorizontalGroup(
            pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaiKhoanLayout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        pnlTaiKhoanLayout.setVerticalGroup(
            pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTaiKhoanLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pnlCard.add(pnlTaiKhoan, "TaiKhoan");

        add(pnlCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1260, 520));
    }// </editor-fold>//GEN-END:initComponents

// -------------------- Start Event --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnDanhSachTK"> 
    private void btnDanhSachTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachTKActionPerformed
        pressTabButton(btnDanhSachTK);
    }//GEN-LAST:event_btnDanhSachTKActionPerformed

    private void btnDanhSachTKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachTKMouseEntered
        XHover.enterTabButton(btnDanhSachTK, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDanhSachTKMouseEntered

    private void btnDanhSachTKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachTKMouseExited
        XHover.exitTabButton(btnDanhSachTK);
    }//GEN-LAST:event_btnDanhSachTKMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnTKDaXoa"> 
    private void btnTKDaXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKDaXoaActionPerformed
        pressTabButton(btnTKDaXoa);
    }//GEN-LAST:event_btnTKDaXoaActionPerformed

    private void btnTKDaXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKDaXoaMouseEntered
        XHover.enterTabButton(btnTKDaXoa, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnTKDaXoaMouseEntered

    private void btnTKDaXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKDaXoaMouseExited
        XHover.exitTabButton(btnTKDaXoa);
    }//GEN-LAST:event_btnTKDaXoaMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnTaiKhoan">
    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        pressTabButton(btnTaiKhoan);
        clearForm();
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnTaiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiKhoanMouseEntered
        XHover.enterTabButton(btnTaiKhoan, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnTaiKhoanMouseEntered

    private void btnTaiKhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiKhoanMouseExited
        XHover.exitTabButton(btnTaiKhoan);
    }//GEN-LAST:event_btnTaiKhoanMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event cboChucVu(DSTK)">
    private void cboChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChucVuActionPerformed
        selectCombobox();
    }//GEN-LAST:event_cboChucVuActionPerformed

   // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event cboChucVu1(DSTK đã xóa)">
    private void cboChucVu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChucVu1ActionPerformed
        selectCombobox1();
    }//GEN-LAST:event_cboChucVu1ActionPerformed

   // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnImage">
    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        this.getImage();
    }//GEN-LAST:event_btnImageActionPerformed

    private void btnImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImageMouseEntered
        XHover.enterButton(btnImage, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnImageMouseEntered

    private void btnImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImageMouseExited
        XHover.exitButton(btnImage);
    }//GEN-LAST:event_btnImageMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi Username">
    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if(txtUsername.getText().trim().equalsIgnoreCase("Tên tài khoản")){
             txtUsername.setText("");
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if(txtUsername.getText().trim().length()==0){
            txtUsername.setText("Tên tài khoản");
            lblErrorUsername.setText("Chưa nhập tên tài khoản!");
        }else{
            lblErrorUsername.setText(" ");
        }
    }//GEN-LAST:event_txtUsernameFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi Password">
    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if(txtPassword.getText().trim().equals("Mật khẩu")){
             txtPassword.setText("");
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if(txtPassword.getText().trim().length()==0){
            txtPassword.setText("Mật khẩu");
            lblErrorPassword.setText("Chưa nhập mật khẩu!");
        }else{
            lblErrorPassword.setText(" ");
        }
    }//GEN-LAST:event_txtPasswordFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi RePassword">
    private void txtRePasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRePasswordFocusGained
        if(txtRePassword.getText().trim().equals("Mật khẩu")){
             txtRePassword.setText("");
        }
    }//GEN-LAST:event_txtRePasswordFocusGained

    private void txtRePasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRePasswordFocusLost
        if(txtRePassword.getText().trim().length()==0){
            txtRePassword.setText("Mật khẩu");
            lblErrorRePassword.setText("Chưa nhập lại mật khẩu!");
        }else if(!txtRePassword.getText().equals(txtPassword.getText())){
            lblErrorRePassword.setText("Mật khẩu nhập lại không trùng khớp!");
        }else{
             lblErrorRePassword.setText(" ");
        }
    }//GEN-LAST:event_txtRePasswordFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi Fullname">
    private void txtFullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullnameFocusGained
        if(txtFullname.getText().trim().equalsIgnoreCase("Họ tên")){
             txtFullname.setText("");
        }
    }//GEN-LAST:event_txtFullnameFocusGained

    private void txtFullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullnameFocusLost
        String kt = "^([^[!@#$%&*()_+=|<>?{}\\[\\]~-]|^\\d|^\\s]*\\s?)*$";
        if(txtFullname.getText().trim().length()==0){
            txtFullname.setText("Họ tên");
            lblErrorFullname.setText("Chưa nhập họ tên!");
        }else{
            if(txtFullname.getText().matches(kt)==false){
                lblErrorFullname.setText("Tên không được chứa số hoặc ký tự đặc biệt!");
            }else{
                lblErrorFullname.setText(" ");
            }
        }
    }//GEN-LAST:event_txtFullnameFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi Email">
    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if(txtEmail.getText().trim().equalsIgnoreCase("Email")){
             txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        String kt_email = "\\w+\\@\\w+(\\.\\w+)+";
        if(txtEmail.getText().trim().length()==0){
            txtEmail.setText("Email");
            lblErrorEmail.setText("Chưa nhập Email!");
        }else{
           if(txtEmail.getText().matches(kt_email)==false){
                lblErrorEmail.setText("Email không đúng định dạng");
            }else{
                lblErrorEmail.setText(" ");
            }
        }
    }//GEN-LAST:event_txtEmailFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnMoi">
    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clearForm();
        this.clearError();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnMoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoiMouseEntered
        XHover.enterButton(btnMoi, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnMoiMouseEntered

    private void btnMoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoiMouseExited
        XHover.exitButton(btnMoi);
    }//GEN-LAST:event_btnMoiMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnThem">
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        XHover.enterButton(btnThem, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        XHover.exitButton(btnThem);
    }//GEN-LAST:event_btnThemMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnSua">
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseEntered
        XHover.enterButton(btnSua, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnSuaMouseEntered

    private void btnSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseExited
        XHover.exitButton(btnSua);
    }//GEN-LAST:event_btnSuaMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnXoa">
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        XHover.enterButton(btnXoa, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        XHover.exitButton(btnXoa);
    }//GEN-LAST:event_btnXoaMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnFirst">
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnFirstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseEntered
        XHover.enterButton(btnFirst, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnFirstMouseEntered

    private void btnFirstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseExited
        XHover.exitButton(btnFirst);
    }//GEN-LAST:event_btnFirstMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnPrev">
    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
        XHover.enterButton(btnPrev, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
        XHover.exitButton(btnPrev);
    }//GEN-LAST:event_btnPrevMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnNext">
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseEntered
        XHover.enterButton(btnNext, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnNextMouseEntered

    private void btnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseExited
        XHover.exitButton(btnNext);
    }//GEN-LAST:event_btnNextMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnLast">
    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnLastMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastMouseEntered
        XHover.enterButton(btnLast, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnLastMouseEntered

    private void btnLastMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastMouseExited
        XHover.exitButton(btnLast);
    }//GEN-LAST:event_btnLastMouseExited
    // </editor-fold> 
    
    // -------------------- End Event --------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDanhSachTK;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTKDaXoa;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboChucVu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblChucVu1;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorFullname;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorRePassword;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblIconEmail;
    private javax.swing.JLabel lblIconEmail1;
    private javax.swing.JLabel lblIconFullname;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblIconRePassword;
    private javax.swing.JLabel lblIconUsername;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlDanhSachTK;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnlTKDaXoa;
    private javax.swing.JPanel pnlTabButton;
    private javax.swing.JPanel pnlTaiKhoan;
    private javax.swing.JRadioButton rdoKhachHang;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoQuanLy;
    private com.unknownshop.swing.table.Table tblDanhSachTK;
    private com.unknownshop.swing.table.Table tblTKDaXoa;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        txtUsername.setBackground(new Color(0, 0, 0, 0));
        txtPassword.setBackground(new Color(0, 0, 0, 0));
        txtEmail.setBackground(new Color(0, 0, 0, 0));
        txtFullname.setBackground(new Color(0, 0, 0, 0));
        txtRePassword.setBackground(new Color(0, 0, 0, 0));
        XTable.setCellAlignmentCenter(tblDanhSachTK,0);
        XTable.setCellAlignmentCenter(tblTKDaXoa,0);
        this.clearError();
        fillCboChucVu(cboChucVu,cboChucVu1);
        fillTableUser(true);
        fillTableUserDeleted(true);
        XHover.disableButton(btnSua, btnXoa, btnFirst, btnLast, btnNext, btnPrev);
        // gán vào lớp tiện ích
        XPanel.pnlAccManager = this;
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
        JButton button[] = {btnDanhSachTK, btnTKDaXoa, btnTaiKhoan};
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
    
// _____________________ DS Tài Khoản _____________________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào combobox chức vụ"> 
    private void fillCboChucVu(JComboBox... combo){
        for (JComboBox cbo : combo) {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
            model.removeAllElements();
            model.addElement("-- Chọn chức vụ --");
            List<Object[]> list = dao.selectRoles();
            for (Object[] us : list) {
                model.addElement(us[0]);
            }
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào bảng tài khoản">
    private void fillTableUser(boolean check) {
        cboChucVu.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) tblDanhSachTK.getModel();
        model.setRowCount(0);
        if(check) {
            listUser = dao.selectUsers(null);
        }
        for (Users us : listUser) {
            model.addRow(new RowTableAccount(us).toRowTable(0));
        }
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn combobox ChucVu">
    private void selectCombobox() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSachTK.getModel();
        model.setRowCount(0);
        String role;
        if(cboChucVu.getSelectedIndex() == 0){
            fillTableUser(false);
        }else{
            role = (String) cboChucVu.getSelectedItem();
            for (Users us : listUser) {
                if(us.getRole().equals(role)){
                    model.addRow(new RowTableAccount(us).toRowTable(0));
                }
            }
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền thông tin lên form">
    private void setForm(Users user){
        // Chuyển lỗi về dạng 1 dấu cách
        lblErrorEmail.setText(" ");
        lblErrorFullname.setText(" ");
        lblErrorPassword.setText(" ");
        lblErrorRePassword.setText(" ");
        lblErrorUsername.setText(" ");
        // Lấy thông tin từ user điền lên form
        txtUsername.setText(user.getUsername());
        txtFullname.setText(user.getFullname());
        txtPassword.setText(user.getPassword());
        txtRePassword.setText(user.getPassword());
        txtEmail.setText(user.getEmail());
        if(user.getRole().equals("Khách hàng")){
            rdoKhachHang.setSelected(true);
        }else if(user.getRole().equals("Nhân viên")){
            rdoNhanVien.setSelected(true);
        }else{
            rdoQuanLy.setSelected(true);
        }
        btnImage.setIcon(new ImageIcon(XImage.convertBytesToImage(user.getImgUrl(), 175, 225)));
        btnImage.setText("");
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đưa thông tin tài khoản lên form">
    public void edit(){
        row = tblDanhSachTK.getSelectedRow();
        System.out.println("123");
        Users user = listUser.get(row);
        setForm(user);
        pressTabButton(btnTaiKhoan);
        XHover.enableButton(btnSua, btnXoa, btnFirst, btnLast, btnNext, btnPrev);
        XHover.disableButton(btnThem);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa hàng được chọn">
    public void removeRow(){
        row = tblDanhSachTK.getSelectedRow();
        Users user = listUser.get(row);
        if(Auth.user.getUsername().equals(user.getUsername())){
            XMess.alert(null, "Bạn không thể xóa bản thân!");
        }else if(XMess.confirm(null, "Bạn có chắc muốn xóa nhan viên này")){
            if(dao.delete(user.getUsername()) == 0){
                XMess.alert(null, "Xóa tài khoản thất bại!");
            }else{
                XMess.alert(null, "Xóa tài khoản thành công");
                listUser.remove(row);
                listUserDeleted.add(user);
                fillTableUser(false);
                fillTableUserDeleted(false);
            }
        }
    }
    // </editor-fold>
    
// _______________________ TK Đã xóa ______________________
      
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào bảng tài khoản đã xóa">
    private void fillTableUserDeleted(boolean check) {
        cboChucVu1.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) tblTKDaXoa.getModel();
        model.setRowCount(0);
        if(check) {
            listUserDeleted = dao.selectUsersDeleted(null);
        }
        for (Users us : listUserDeleted) {
            model.addRow(new RowTableAccount(us).toRowTable(1));
        }
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn combobox ChucVu1">
    private void selectCombobox1() {
        DefaultTableModel model = (DefaultTableModel) tblTKDaXoa.getModel();
        model.setRowCount(0);
        String role;
        if(cboChucVu1.getSelectedIndex() == 0){
            fillTableUser(false);
        }else{
            role = (String) cboChucVu1.getSelectedItem();
            for (Users us : listUserDeleted) {
                if(us.getRole().equals(role)){
                    model.addRow(new RowTableAccount(us).toRowTable(1));
                }
            }
        }
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức phục hồi tài khoản">  
    public void restore(){
        int row1 = tblTKDaXoa.getSelectedRow();
        Users user = listUserDeleted.get(row1);
        if(XMess.confirm(this, "Bạn muốn phục hồi nhân viên này?")){
            if(dao.restoreUser(user.getId()) == 0){
                XMess.alert(this,"Phục hồi tài khoản thất bại!");
            }else{
                XMess.alert(this,"Phục hồi tài khoản thành công!");
                listUserDeleted.remove(row1);
                listUser.add(user);
                fillTableUserDeleted(false);
                fillTableUser(false);
            }
        }
    }
    // </editor-fold>
    
// _____________________ Form Tài Khoản ___________________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa lable lỗi"> 
    private void clearError() {
        lblErrorPassword.setText("  ");
        lblErrorUsername.setText("  ");
        lblErrorEmail.setText("  ");
        lblErrorFullname.setText("  ");
        lblErrorRePassword.setText("  ");
    }
    // </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức bắt lỗi chưa nhập"> 
    private void nonError(){
        if(lblErrorUsername.getText().equals("  ")){
            lblErrorUsername.setText("Chưa nhập tên tài khoản!");
        }  
        if(lblErrorPassword.getText().equals("  ")){
            lblErrorPassword.setText("Chưa nhập mật khẩu!");
        }
        if(lblErrorRePassword.getText().equals("  ")){
            lblErrorRePassword.setText("Chưa nhập lại mật khẩu!");
        }
        if(lblErrorEmail.getText().equals("  ")){
            lblErrorEmail.setText("Chưa nhập email!");
        }
        if(lblErrorFullname.getText().equals("  ")){
            lblErrorFullname.setText("Chưa nhập tên ngươi dùng!");
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy thông tin trên form">  
    private Users getForm(){
        Users user = new Users();
        user.setUsername(txtUsername.getText());
        user.setFullname(txtFullname.getText());
        user.setPassword(txtPassword.getText());
        user.setPassword(txtRePassword.getText());
        user.setEmail(txtEmail.getText());
        user.setImgUrl(userImg);
        if(rdoKhachHang.isSelected()){
            user.setRole("Khách hàng");
        }else if(rdoNhanVien.isSelected()){
            user.setRole("Nhân viên");
        }else{
            user.setRole("Trưởng phòng");
        }
        
        return user;
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa trắng form"> 
    private void clearForm() {
        clearError();
        txtUsername.setText("Tên Tài Khoản");
        txtPassword.setText("Mật khẩu");
        txtRePassword.setText("Mật khẩu");
        txtFullname.setText("Họ tên");
        txtEmail.setText("Email");
        btnImage.setIcon(null);
        btnImage.setText("Hình Ảnh");
        rdoKhachHang.setSelected(true);
        // Điều chỉnh nút
        XHover.enableButton(btnThem);
        XHover.disableButton(btnSua, btnXoa, btnFirst, btnLast, btnNext, btnPrev);
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức kiểm tra lỗi"> 
    private boolean checkError(){
        if(!(lblErrorEmail.getText().equals(" ") &&
                    lblErrorFullname.getText().equals(" ") &&  
                    lblErrorPassword.getText().equals(" ") &&
                    lblErrorRePassword.getText().equals(" ") &&
                    lblErrorUsername.getText().equals(" "))) return true;
        else if(btnImage.getIcon() == null){
            XMess.alert(this, "Bạn chưa chọn ảnh đại diện!");
            return true;
        }
        return false;
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức thêm tài khoản">  
    private void insert(){
        nonError();
        if(checkError()) return;
        Users user = getForm();
        int result = XMess.confirm(this, "Bạn muốn thêm nhân viên này?")
                    ? dao.insert(user) : -2;
        if( result == -2){
            return;
        }else if(result == 0){
            lblErrorUsername.setText("Tài khoản này đã có trong hệ thống!");
        }else if(result == -1){
            lblErrorEmail.setText("Email đã được sử dụng!");
        }else{
            XMess.alert(this,"Thêm tài khoản thành công!");
            fillTableUser(true);
            pressTabButton(btnDanhSachTK);
            clearForm();
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức cập nhập tài khoản">  
    private void update(){
        nonError();
        if(checkError()) return;
        Users user = getForm();
        if(XMess.confirm(this, "Bạn muốn cập nhật nhân viên này?")){
            if(dao.update(user) == 0){
                XMess.alert(this,"Cập nhập tài khoản thất bại!");
            }else{
                XMess.alert(this,"Cập nhập tài khoản thành công!");
                fillTableUser(true);
                pressTabButton(btnDanhSachTK);
                clearForm();
            }
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa tài khoản">  
    private void delete(){
        String username = txtUsername.getText();
        if(username.equals(Auth.user.getUsername())){
            XMess.alert(this, "Bạn không được xóa chính bạn!");
        }
        else if(XMess.confirm(this, "Bạn muốn xóa nhân viên này?")){
            if (dao.delete(username) == 0) {
                XMess.alert(this, "Xóa tài khoản thất bại!");
            } else {
                fillTableUserDeleted(true);
                fillTableUser(true);
                pressTabButton(btnTKDaXoa);
                XMess.alert(this,"Xóa tài khoản thành công!");
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
                userImg = XImage.convertImageToBytes(file);
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
        tblDanhSachTK.setRowSelectionInterval(0, 0);
        edit();
        XHover.disableButton(btnPrev, btnFirst);
    }
    
    private void prev(){
        if(row > 0){
            tblDanhSachTK.setRowSelectionInterval(--row, row);
            edit();
        }
        if(row == 0){
            XHover.disableButton(btnPrev, btnFirst);
        }else if(row == listUser.size()-2){
            XHover.enableButton(btnNext, btnLast);
        }
    }
    
    private void next(){
        if(row < listUser.size()-1){
            tblDanhSachTK.setRowSelectionInterval(++row, row);
            edit();
        }
        if(row == listUser.size()-1){
            XHover.disableButton(btnNext, btnLast);
        }else if(row == 1){
            XHover.enableButton(btnPrev, btnFirst);
        }
    }
    
    private void last(){
        int index = tblDanhSachTK.getRowCount() - 1;
        tblDanhSachTK.setRowSelectionInterval(index, index);
        edit();
        XHover.disableButton(btnNext, btnLast);
    }
    // </editor-fold> 
    
// ---------------------- End Method ----------------------
    
}
