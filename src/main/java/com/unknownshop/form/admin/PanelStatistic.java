package com.unknownshop.form.admin;

import com.unknownshop.chart.ModelChart;
import com.unknownshop.dao.ThongKeDAO;
import com.unknownshop.util.XImage;
import com.unknownshop.util.XPanel;
import java.awt.Color;

public class PanelStatistic extends javax.swing.JPanel {

    ThongKeDAO dao = new ThongKeDAO();
    
    public PanelStatistic() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblThongKeHangNgay = new javax.swing.JLabel();
        card1 = new com.unknownshop.fragment.Card();
        card2 = new com.unknownshop.fragment.Card();
        card3 = new com.unknownshop.fragment.Card();
        lblDoanhThu6Thang = new javax.swing.JLabel();
        chart = new com.unknownshop.chart.Chart();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);

        lblThongKeHangNgay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblThongKeHangNgay.setForeground(new java.awt.Color(51, 51, 51));
        lblThongKeHangNgay.setText("Trạng Thái Cửa Hàng Trong Tháng");
        lblThongKeHangNgay.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        card1.setBackground(new java.awt.Color(0, 51, 102));
        card1.setForeground(new java.awt.Color(255, 255, 255));
        card1.setColorGradient(new java.awt.Color(51, 153, 255));

        card2.setBackground(new java.awt.Color(0, 102, 51));
        card2.setForeground(new java.awt.Color(255, 255, 255));
        card2.setColorGradient(new java.awt.Color(0, 255, 102));

        card3.setBackground(new java.awt.Color(153, 0, 51));
        card3.setForeground(new java.awt.Color(255, 255, 255));
        card3.setColorGradient(new java.awt.Color(255, 102, 102));

        lblDoanhThu6Thang.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDoanhThu6Thang.setForeground(new java.awt.Color(51, 51, 51));
        lblDoanhThu6Thang.setText("Doanh Thu 6 Tháng Gần Nhất");
        lblDoanhThu6Thang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        chart.setBackground(new java.awt.Color(51, 51, 51));
        chart.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDoanhThu6Thang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblThongKeHangNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongKeHangNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDoanhThu6Thang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unknownshop.fragment.Card card1;
    private com.unknownshop.fragment.Card card2;
    private com.unknownshop.fragment.Card card3;
    private com.unknownshop.chart.Chart chart;
    private javax.swing.JLabel lblDoanhThu6Thang;
    private javax.swing.JLabel lblThongKeHangNgay;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        XPanel.panelStatistic = this;
        setChart();
        setInfo();
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền thẻ card">    
    public void setInfo() {
        card1.setData("Hóa đơn chưa xác nhận", 
                dao.getUnConfirmedOrdersThisMonth()+"", XImage.getIconCard("card1"));
        card3.setData("Hóa đơn đã được xác nhận", 
                dao.getConfirmedOrdersThisMonth()+"", XImage.getIconCard("card2"));
        card2.setData("Sản phẩm đã bán đi", 
                dao.getProductsSold()+"", XImage.getIconCard("card3"));
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền thẻ card">    
    public void setChart() {
        chart.addLegend("Sản phẩm bán ra", new Color(12, 84, 175), new Color(0, 108, 247));
        chart.addLegend("Sản phẩm nhập về", new Color(54, 4, 143), new Color(104, 49, 200));
        chart.addLegend("Sản phẩm tồn kho", new Color(5, 125, 0), new Color(95, 209, 69));
        chart.addLegend("Sản phẩm hoàn trả", new Color(186, 37, 37), new Color(241, 100, 120));
        chart.addData(new ModelChart("Tháng 6", new double[]{500, 200, 80, 89}));
        chart.addData(new ModelChart("Tháng 7", new double[]{600, 750, 90, 150}));
        chart.addData(new ModelChart("Tháng 8", new double[]{200, 350, 460, 900}));
        chart.addData(new ModelChart("Tháng 9", new double[]{480, 150, 750, 700}));
        chart.addData(new ModelChart("Tháng 10", new double[]{350, 540, 300, 150}));
        chart.addData(new ModelChart("Tháng 11", new double[]{190, 280, 81, 200}));
        chart.start();
    }
    // </editor-fold>  
    
// ----------------------  End Method  ----------------------
}
