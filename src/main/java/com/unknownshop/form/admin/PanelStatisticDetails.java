package com.unknownshop.form.admin;

import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.OrderDAO;
import com.unknownshop.dao.OrderDetailDAO;
import com.unknownshop.form.DialogLoading;
import com.unknownshop.swing.table.RowTableBill;
import com.unknownshop.swing.table.RowTableBillDetails;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XMoney;
import com.unknownshop.util.XPanel;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;


public class PanelStatisticDetails extends javax.swing.JPanel {

    DefaultTableModel modelCXN;
    DefaultTableModel modelDXN;
    DefaultTableModel modelProduct;
    List<Object[]> listCXN;
    List<Object[]> listDXN;
    List<Object[]> listProduct;
    OrderDAO dao = new OrderDAO();
    OrderDetailDAO daoDetail = new OrderDetailDAO();
    
    public PanelStatisticDetails() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTabButton = new javax.swing.JPanel();
        btnDanhSachHD = new javax.swing.JButton();
        btnHDChiTiet = new javax.swing.JButton();
        btnDSHoaDonXN = new javax.swing.JButton();
        pnlCard = new javax.swing.JPanel();
        DanhSachHD = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachHD = new com.unknownshop.swing.table.Table();
        btnExcel1 = new javax.swing.JButton();
        btnPDF1 = new javax.swing.JButton();
        DSHoaDonXN = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSHoaDonXN = new com.unknownshop.swing.table.Table();
        btnExcel2 = new javax.swing.JButton();
        btnPDF2 = new javax.swing.JButton();
        pnlHDChiTiet = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHDChiTiet = new com.unknownshop.swing.table.Table();
        btnExcel3 = new javax.swing.JButton();
        btnPDF3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);

        pnlTabButton.setBackground(new java.awt.Color(0, 102, 204));

        btnDanhSachHD.setBackground(new java.awt.Color(51, 51, 51));
        btnDanhSachHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDanhSachHD.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachHD.setText("Danh Sách Hóa Đơn Chưa Xác Nhận");
        btnDanhSachHD.setToolTipText("DanhSachHD");
        btnDanhSachHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        btnDanhSachHD.setContentAreaFilled(false);
        btnDanhSachHD.setOpaque(true);
        btnDanhSachHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDanhSachHDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDanhSachHDMouseExited(evt);
            }
        });
        btnDanhSachHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachHDActionPerformed(evt);
            }
        });

        btnHDChiTiet.setBackground(new java.awt.Color(51, 51, 51));
        btnHDChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHDChiTiet.setForeground(new java.awt.Color(51, 51, 51));
        btnHDChiTiet.setText("Chi Tiết Hóa Đơn");
        btnHDChiTiet.setToolTipText("HDChiTiet");
        btnHDChiTiet.setContentAreaFilled(false);
        btnHDChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHDChiTietMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHDChiTietMouseExited(evt);
            }
        });
        btnHDChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDChiTietActionPerformed(evt);
            }
        });

        btnDSHoaDonXN.setBackground(new java.awt.Color(51, 51, 51));
        btnDSHoaDonXN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDSHoaDonXN.setForeground(new java.awt.Color(51, 51, 51));
        btnDSHoaDonXN.setText("Danh Sách Hóa Đơn Đã Xác Nhận");
        btnDSHoaDonXN.setToolTipText("DSHoaDonXN");
        btnDSHoaDonXN.setContentAreaFilled(false);
        btnDSHoaDonXN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDSHoaDonXNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDSHoaDonXNMouseExited(evt);
            }
        });
        btnDSHoaDonXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSHoaDonXNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTabButtonLayout = new javax.swing.GroupLayout(pnlTabButton);
        pnlTabButton.setLayout(pnlTabButtonLayout);
        pnlTabButtonLayout.setHorizontalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addComponent(btnDanhSachHD, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDSHoaDonXN, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHDChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTabButtonLayout.setVerticalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addGroup(pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDanhSachHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnDSHoaDonXN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHDChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCard.setOpaque(false);
        pnlCard.setLayout(new java.awt.CardLayout());

        DanhSachHD.setOpaque(false);

        tblDanhSachHD.setBackground(new java.awt.Color(255, 255, 255));
        tblDanhSachHD.setForeground(new java.awt.Color(51, 51, 51));
        tblDanhSachHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Tài Khoản", "Số Điện Thoại", "Địa Chỉ", "Số Lượng Sản Phẩm", "Giá", "Tùy Chọn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachHD.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblDanhSachHD.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblDanhSachHD);
        if (tblDanhSachHD.getColumnModel().getColumnCount() > 0) {
            tblDanhSachHD.getColumnModel().getColumn(0).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblDanhSachHD.getColumnModel().getColumn(1).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblDanhSachHD.getColumnModel().getColumn(2).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(2).setPreferredWidth(400);
            tblDanhSachHD.getColumnModel().getColumn(3).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblDanhSachHD.getColumnModel().getColumn(4).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblDanhSachHD.getColumnModel().getColumn(5).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        btnExcel1.setBackground(new java.awt.Color(51, 51, 51));
        btnExcel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcel1.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel1.setText("Xuất File Excel");
        btnExcel1.setContentAreaFilled(false);
        btnExcel1.setOpaque(true);
        btnExcel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcel1MouseExited(evt);
            }
        });
        btnExcel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcel1ActionPerformed(evt);
            }
        });

        btnPDF1.setBackground(new java.awt.Color(51, 51, 51));
        btnPDF1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPDF1.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF1.setText("Xuất File PDF");
        btnPDF1.setContentAreaFilled(false);
        btnPDF1.setOpaque(true);
        btnPDF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPDF1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPDF1MouseExited(evt);
            }
        });
        btnPDF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDF1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DanhSachHDLayout = new javax.swing.GroupLayout(DanhSachHD);
        DanhSachHD.setLayout(DanhSachHDLayout);
        DanhSachHDLayout.setHorizontalGroup(
            DanhSachHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DanhSachHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DanhSachHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DanhSachHDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPDF1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        DanhSachHDLayout.setVerticalGroup(
            DanhSachHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DanhSachHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DanhSachHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPDF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCard.add(DanhSachHD, "DanhSachHD");

        DSHoaDonXN.setOpaque(false);

        tblDSHoaDonXN.setBackground(new java.awt.Color(255, 255, 255));
        tblDSHoaDonXN.setForeground(new java.awt.Color(51, 51, 51));
        tblDSHoaDonXN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ Và Tên", "Số Điện Thoại", "Địa Chỉ", "Số Lượng Sản Phẩm", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSHoaDonXN.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblDSHoaDonXN.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblDSHoaDonXN);
        if (tblDSHoaDonXN.getColumnModel().getColumnCount() > 0) {
            tblDSHoaDonXN.getColumnModel().getColumn(0).setResizable(false);
            tblDSHoaDonXN.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblDSHoaDonXN.getColumnModel().getColumn(1).setResizable(false);
            tblDSHoaDonXN.getColumnModel().getColumn(1).setPreferredWidth(350);
            tblDSHoaDonXN.getColumnModel().getColumn(2).setResizable(false);
            tblDSHoaDonXN.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblDSHoaDonXN.getColumnModel().getColumn(3).setResizable(false);
            tblDSHoaDonXN.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblDSHoaDonXN.getColumnModel().getColumn(4).setResizable(false);
            tblDSHoaDonXN.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        btnExcel2.setBackground(new java.awt.Color(51, 51, 51));
        btnExcel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcel2.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel2.setText("Xuất File Excel");
        btnExcel2.setContentAreaFilled(false);
        btnExcel2.setOpaque(true);
        btnExcel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcel2MouseExited(evt);
            }
        });
        btnExcel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcel2ActionPerformed(evt);
            }
        });

        btnPDF2.setBackground(new java.awt.Color(51, 51, 51));
        btnPDF2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPDF2.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF2.setText("Xuất File PDF");
        btnPDF2.setContentAreaFilled(false);
        btnPDF2.setOpaque(true);
        btnPDF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPDF2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPDF2MouseExited(evt);
            }
        });
        btnPDF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDF2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DSHoaDonXNLayout = new javax.swing.GroupLayout(DSHoaDonXN);
        DSHoaDonXN.setLayout(DSHoaDonXNLayout);
        DSHoaDonXNLayout.setHorizontalGroup(
            DSHoaDonXNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DSHoaDonXNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DSHoaDonXNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DSHoaDonXNLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPDF2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        DSHoaDonXNLayout.setVerticalGroup(
            DSHoaDonXNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DSHoaDonXNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DSHoaDonXNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPDF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCard.add(DSHoaDonXN, "DSHoaDonXN");

        pnlHDChiTiet.setOpaque(false);

        tblHDChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        tblHDChiTiet.setForeground(new java.awt.Color(51, 51, 51));
        tblHDChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ảnh", "Tên Sản Phẩm", "Số Lượng", "Đơn Giá", "Tổng Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHDChiTiet.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblHDChiTiet.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tblHDChiTiet);
        if (tblHDChiTiet.getColumnModel().getColumnCount() > 0) {
            tblHDChiTiet.getColumnModel().getColumn(0).setResizable(false);
            tblHDChiTiet.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblHDChiTiet.getColumnModel().getColumn(1).setResizable(false);
            tblHDChiTiet.getColumnModel().getColumn(1).setPreferredWidth(350);
            tblHDChiTiet.getColumnModel().getColumn(2).setResizable(false);
            tblHDChiTiet.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblHDChiTiet.getColumnModel().getColumn(3).setResizable(false);
            tblHDChiTiet.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblHDChiTiet.getColumnModel().getColumn(4).setResizable(false);
            tblHDChiTiet.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        btnExcel3.setBackground(new java.awt.Color(51, 51, 51));
        btnExcel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcel3.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel3.setText("Xuất File Excel");
        btnExcel3.setContentAreaFilled(false);
        btnExcel3.setOpaque(true);
        btnExcel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcel3MouseExited(evt);
            }
        });
        btnExcel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcel3ActionPerformed(evt);
            }
        });

        btnPDF3.setBackground(new java.awt.Color(51, 51, 51));
        btnPDF3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPDF3.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF3.setText("Xuất File PDF");
        btnPDF3.setContentAreaFilled(false);
        btnPDF3.setOpaque(true);
        btnPDF3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPDF3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPDF3MouseExited(evt);
            }
        });
        btnPDF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDF3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHDChiTietLayout = new javax.swing.GroupLayout(pnlHDChiTiet);
        pnlHDChiTiet.setLayout(pnlHDChiTietLayout);
        pnlHDChiTietLayout.setHorizontalGroup(
            pnlHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHDChiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHDChiTietLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPDF3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlHDChiTietLayout.setVerticalGroup(
            pnlHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHDChiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPDF3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCard.add(pnlHDChiTiet, "HDChiTiet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTabButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlTabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnDanhSachHD"> 
    private void btnDanhSachHDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachHDMouseEntered
        XHover.enterTabButton(btnDanhSachHD, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDanhSachHDMouseEntered

    private void btnDanhSachHDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachHDMouseExited
        XHover.exitTabButton(btnDanhSachHD);
    }//GEN-LAST:event_btnDanhSachHDMouseExited

    private void btnDanhSachHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachHDActionPerformed
        pressTabButton(btnDanhSachHD);
    }//GEN-LAST:event_btnDanhSachHDActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnHDChiTiet"> 
    private void btnHDChiTietMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHDChiTietMouseEntered
        XHover.enterTabButton(btnHDChiTiet, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnHDChiTietMouseEntered

    private void btnHDChiTietMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHDChiTietMouseExited
        XHover.exitTabButton(btnHDChiTiet);
    }//GEN-LAST:event_btnHDChiTietMouseExited

    private void btnHDChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDChiTietActionPerformed
        pressTabButton(btnHDChiTiet);
    }//GEN-LAST:event_btnHDChiTietActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnDuyet"> 
    private void btnExcel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel1MouseEntered
        XHover.enterButton(btnExcel1, XConstant.RED_102, XConstant.BLACK_51);
    }//GEN-LAST:event_btnExcel1MouseEntered

    private void btnExcel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel1MouseExited
        XHover.exitButton(btnExcel1);
    }//GEN-LAST:event_btnExcel1MouseExited

    private void btnExcel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcel1ActionPerformed
        
    }//GEN-LAST:event_btnExcel1ActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnHuy"> 
    private void btnPDF1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF1MouseEntered
        XHover.enterButton(btnPDF1, XConstant.RED_102, XConstant.BLACK_51);
    }//GEN-LAST:event_btnPDF1MouseEntered

    private void btnPDF1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF1MouseExited
        XHover.exitButton(btnPDF1);
    }//GEN-LAST:event_btnPDF1MouseExited

    private void btnPDF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDF1ActionPerformed
        
    }//GEN-LAST:event_btnPDF1ActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnDSHoaDOnXN"> 
    private void btnDSHoaDonXNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSHoaDonXNMouseEntered
        XHover.enterTabButton(btnDSHoaDonXN, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDSHoaDonXNMouseEntered

    private void btnDSHoaDonXNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSHoaDonXNMouseExited
        XHover.exitTabButton(btnDSHoaDonXN);
    }//GEN-LAST:event_btnDSHoaDonXNMouseExited

    private void btnDSHoaDonXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSHoaDonXNActionPerformed
        pressTabButton(btnDSHoaDonXN);
    }//GEN-LAST:event_btnDSHoaDonXNActionPerformed

    private void btnExcel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcel2MouseEntered

    private void btnExcel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcel2MouseExited

    private void btnExcel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcel2ActionPerformed

    private void btnPDF2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPDF2MouseEntered

    private void btnPDF2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPDF2MouseExited

    private void btnPDF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPDF2ActionPerformed

    private void btnExcel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcel3MouseEntered

    private void btnExcel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcel3MouseExited

    private void btnExcel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcel3ActionPerformed

    private void btnPDF3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPDF3MouseEntered

    private void btnPDF3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPDF3MouseExited

    private void btnPDF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPDF3ActionPerformed
    // </editor-fold> 
    
// ---------------------- End Event ----------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DSHoaDonXN;
    private javax.swing.JPanel DanhSachHD;
    private javax.swing.JButton btnDSHoaDonXN;
    private javax.swing.JButton btnDanhSachHD;
    private javax.swing.JButton btnExcel1;
    private javax.swing.JButton btnExcel2;
    private javax.swing.JButton btnExcel3;
    private javax.swing.JButton btnHDChiTiet;
    private javax.swing.JButton btnPDF1;
    private javax.swing.JButton btnPDF2;
    private javax.swing.JButton btnPDF3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlHDChiTiet;
    private javax.swing.JPanel pnlTabButton;
    private com.unknownshop.swing.table.Table tblDSHoaDonXN;
    private com.unknownshop.swing.table.Table tblDanhSachHD;
    private com.unknownshop.swing.table.Table tblHDChiTiet;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        modelCXN = (DefaultTableModel) tblDanhSachHD.getModel();
        modelDXN = (DefaultTableModel) tblDSHoaDonXN.getModel();
        modelProduct = (DefaultTableModel) tblHDChiTiet.getModel();
        XTable.setCellAlignmentCenter(tblDanhSachHD, 1);
        XTable.setCellAlignmentCenter(tblDSHoaDonXN, 2);
        XTable.setCellAlignmentCenter(tblHDChiTiet, 1);
        fillTabelDS(true);
        fillTabelDSDXN(true);
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
        JButton button[] = {btnDanhSachHD, btnDSHoaDonXN, btnHDChiTiet};
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
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền thông tin lên bảng ds hóa đơn chưa xn">    
    private void fillTabelDS(boolean check){
        modelCXN.setRowCount(0);
        if(check) {
            listCXN = dao.getListUnconfirmOrders();
        }
        for (Object[] obj : listCXN) {
            modelCXN.addRow(new RowTableBill(obj).toRowTable());
        }
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền thông tin lên bảng ds hóa đơn đã xác nhận">    
    private void fillTabelDSDXN(boolean check){
        modelDXN.setRowCount(0);
        if(check) {
            listDXN = dao.getListConfirmOrders();
        }
        for (Object[] obj : listDXN) {
            modelDXN.addRow(new Object[]{
                obj[1], obj[2], obj[3], obj[4],
                XMoney.convertMoney(Float.valueOf(obj[5].toString()))+" VNĐ"
            });
        }
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển thông tin sang hóa đơn chi tiết">
    public void edit() {
        // Tạo luồng và hiện dialog loading
            DialogLoading dlog = new DialogLoading();
            dlog.setVisible(true);
            new Thread(){
                @Override
                public void run(){
                    XPanel.mainForm.setEnabled(false);
                    int row = tblDanhSachHD.getSelectedRow();
                    Object[] obj = listCXN.get(row);
                    listProduct = daoDetail.getListProduct((int) obj[0]);
                    modelProduct.setRowCount(0);
                    for (Object[] obj1 : listProduct) {
                        modelProduct.addRow(new RowTableBillDetails(obj1).toRowTable());
                    }
                    pressTabButton(btnHDChiTiet);
                    XPanel.mainForm.setEnabled(true);
                    dlog.setVisible(false);
                }
            }.start();
        
    }
    // </editor-fold>
    
// ----------------------  End Method  ----------------------
}
