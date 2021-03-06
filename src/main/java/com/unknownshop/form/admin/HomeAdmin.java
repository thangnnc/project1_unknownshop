package com.unknownshop.form.admin;

import com.unknownshop.constant.XConstant;
import com.unknownshop.form.PanelAccount;
import com.unknownshop.util.Auth;
import com.unknownshop.util.XPanel;
import java.awt.Component;
import java.awt.event.ActionListener;

public class HomeAdmin extends javax.swing.JPanel {

    public HomeAdmin() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCard = new javax.swing.JPanel();
        pnlTKChung = new javax.swing.JPanel();
        pnlTaiKhoan = new javax.swing.JPanel();
        pnlQLTaiKhoan = new javax.swing.JPanel();
        pnlQLSanPham = new javax.swing.JPanel();
        pnlQLHoaDon = new javax.swing.JPanel();
        pnlTKChiTiet = new javax.swing.JPanel();
        pnlFooter = new com.unknownshop.fragment.footer.Footer();
        pnlHeader = new com.unknownshop.fragment.header.Header();

        setBackground(new java.awt.Color(250, 250, 250));

        pnlCard.setOpaque(false);
        pnlCard.setLayout(new java.awt.CardLayout());

        pnlTKChung.setBackground(new java.awt.Color(204, 0, 0));
        pnlTKChung.setOpaque(false);
        pnlTKChung.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlTKChung, "TKChung");

        pnlTaiKhoan.setOpaque(false);
        pnlTaiKhoan.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlTaiKhoan, "TaiKhoan");

        pnlQLTaiKhoan.setBackground(new java.awt.Color(0, 204, 204));
        pnlQLTaiKhoan.setOpaque(false);
        pnlQLTaiKhoan.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlQLTaiKhoan, "QLTaiKhoan");

        pnlQLSanPham.setOpaque(false);
        pnlQLSanPham.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlQLSanPham, "QLSanPham");

        pnlQLHoaDon.setOpaque(false);
        pnlQLHoaDon.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlQLHoaDon, "QLHoaDon");

        pnlTKChiTiet.setOpaque(false);
        pnlTKChiTiet.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlTKChiTiet, "TKChiTiet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCard, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlCard;
    private com.unknownshop.fragment.footer.Footer pnlFooter;
    private com.unknownshop.fragment.header.Header pnlHeader;
    private javax.swing.JPanel pnlQLHoaDon;
    private javax.swing.JPanel pnlQLSanPham;
    private javax.swing.JPanel pnlQLTaiKhoan;
    private javax.swing.JPanel pnlTKChiTiet;
    private javax.swing.JPanel pnlTKChung;
    private javax.swing.JPanel pnlTaiKhoan;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Ph????ng th???c khai b??o gi?? tr??? tr??n form">    
    private void init(){
        // G??n panel v??o l???p ti???n ??ch
        XPanel.panelCardAdmin = pnlCard;
        XPanel.panelTaiKhoan = pnlTaiKhoan;
        XPanel.panelHeader = pnlHeader;
        XPanel.panelHeader.setSign();
        XPanel.nameCard = "TKChung";
        // Th??m c??c panel v??o form
        addPanelIntoFrame();
    } 
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Ph????ng th???c th??m panel v??o form">    
    private void addPanelIntoFrame(){
        // Th??m v??o panel danh s??ch ??o
        pnlTaiKhoan.add(new PanelAccount());
        pnlQLSanPham.add(new PanelProductManager());
        pnlQLHoaDon.add(new PanelBillManager());
        pnlTKChung.add(new PanelStatistic());
        pnlTKChiTiet.add(new PanelStatisticDetails());
        if(Auth.user.getRole().equals(XConstant.STAFF)){
            pnlQLTaiKhoan.add(new PanelSecurityLarge());
        }else{
            pnlQLTaiKhoan.add(new PanelAccountManager());
        }
    } 
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Ph????ng th???c th??m s??? ki???n menu"> 
    public void addEventMenu(ActionListener event) {
        pnlHeader.addEventMenu(event);
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Ph????ng th???c x??a v?? th??m panel m???i"> 
    public void show(Component com) {
        pnlCard.removeAll();
        pnlCard.add(com);
        pnlCard.repaint();
        pnlCard.revalidate();
    }
    // </editor-fold> 

// ----------------------  End Method  ----------------------
}
