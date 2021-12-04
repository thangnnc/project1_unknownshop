package com.unknownshop.form.user;

import com.unknownshop.form.PanelAccount;
import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.UserDAO;
import com.unknownshop.entity.Users;
import com.unknownshop.form.DialogLoading;
import com.unknownshop.util.Auth;
import com.unknownshop.util.XPanel;
import com.unknownshop.util.XHover;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.text.JTextComponent;

public class PanelSignIn extends javax.swing.JPanel {

    private UserDAO dao = new UserDAO();
    
    public PanelSignIn() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormDangNhap = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        lblErrorUsername = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblIconUsername = new javax.swing.JLabel();
        lblIconPassword = new javax.swing.JLabel();
        lblQuenMatKhau = new javax.swing.JLabel();
        lblTitleDangNhap = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);

        pnlFormDangNhap.setBackground(new java.awt.Color(51, 51, 51));
        pnlFormDangNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)));

        txtUsername.setBackground(new java.awt.Color(51, 51, 51));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(240, 240, 240));
        txtUsername.setText("Tên tài khoản");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(240, 240, 240)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(0, 102, 204));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(240, 240, 240));
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.setContentAreaFilled(false);
        btnDangNhap.setOpaque(true);
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseExited(evt);
            }
        });

        lblErrorUsername.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorUsername.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorUsername.setText("Error!");

        lblErrorPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorPassword.setText("Error!");

        lblIconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUsername.png"))); // NOI18N

        lblIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        lblQuenMatKhau.setBackground(new java.awt.Color(51, 51, 51));
        lblQuenMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuenMatKhau.setForeground(new java.awt.Color(240, 240, 240));
        lblQuenMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblQuenMatKhau.setText("Quên mật khẩu?");
        lblQuenMatKhau.setOpaque(true);
        lblQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseExited(evt);
            }
        });

        lblTitleDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleDangNhap.setForeground(new java.awt.Color(240, 240, 240));
        lblTitleDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleDangNhap.setText("Đăng Nhập Vào Tài Khoản Của Bạn");

        txtPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(240, 240, 240));
        txtPassword.setText("Mật khẩu");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(240, 240, 240)));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlFormDangNhapLayout = new javax.swing.GroupLayout(pnlFormDangNhap);
        pnlFormDangNhap.setLayout(pnlFormDangNhapLayout);
        pnlFormDangNhapLayout.setHorizontalGroup(
            pnlFormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormDangNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlFormDangNhapLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(pnlFormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblErrorUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblErrorPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormDangNhapLayout.createSequentialGroup()
                            .addGroup(pnlFormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIconUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblIconPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(pnlFormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(txtPassword)))
                        .addComponent(lblQuenMatKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlFormDangNhapLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormDangNhapLayout.setVerticalGroup(
            pnlFormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormDangNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addGroup(pnlFormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIconUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuenMatKhau)
                .addGap(18, 18, 18)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(pnlFormDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(pnlFormDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi Username">  
    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if (txtUsername.getText().trim().equalsIgnoreCase("Tên tài khoản")) {
            txtUsername.setText("");
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (txtUsername.getText().trim().length() == 0) {
            txtUsername.setText("Tên tài khoản");
            lblErrorUsername.setText("Chưa nhập tên tài khoản!");
        } else {
            lblErrorUsername.setText(" ");
        }
    }//GEN-LAST:event_txtUsernameFocusLost
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event btnDangNhap"> 
    private void btnDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseEntered
        XHover.enterButton(btnDangNhap, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDangNhapMouseEntered

    private void btnDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseExited
        XHover.exitButton(btnDangNhap);
    }//GEN-LAST:event_btnDangNhapMouseExited

    private void btnDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseClicked
        this.signIn();
    }//GEN-LAST:event_btnDangNhapMouseClicked
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi Password"> 
    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (txtPassword.getText().trim().equalsIgnoreCase("Mật khẩu")) {
            txtPassword.setText("");
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (txtPassword.getText().trim().length() == 0) {
            txtPassword.setText("Mật khẩu");
            lblErrorPassword.setText("Chưa nhập mật khẩu!");
        } else {
            lblErrorPassword.setText(" ");
        }
    }//GEN-LAST:event_txtPasswordFocusLost
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event lblQuenMatKhau">
    private void lblQuenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseClicked
        XPanel.mainForm.setEnabled(false);
        new DialogForgotPassword().setVisible(true);
    }//GEN-LAST:event_lblQuenMatKhauMouseClicked

    private void lblQuenMatKhauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseEntered
        lblQuenMatKhau.setBackground(XConstant.WHITE_255);
        lblQuenMatKhau.setForeground(XConstant.BLACK_51);
    }//GEN-LAST:event_lblQuenMatKhauMouseEntered

    private void lblQuenMatKhauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseExited
        lblQuenMatKhau.setBackground(XConstant.BLACK_51);
        lblQuenMatKhau.setForeground(XConstant.WHITE_240);
    }//GEN-LAST:event_lblQuenMatKhauMouseExited
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event giới hạn kí tự textfield">
    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        limitLength(txtUsername, 50, evt);
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        limitLength(txtPassword, 50, evt);
    }//GEN-LAST:event_txtPasswordKeyTyped
    // </editor-fold>
    
// ---------------------- End Event ----------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblIconUsername;
    private javax.swing.JLabel lblQuenMatKhau;
    private javax.swing.JLabel lblTitleDangNhap;
    private javax.swing.JPanel pnlFormDangNhap;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        txtUsername.setBackground(new Color(0, 0, 0, 0));
        txtPassword.setBackground(new Color(0, 0, 0, 0));
        this.clearError();
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa lỗi"> 
    private void clearError() {
        lblErrorPassword.setText("  ");
        lblErrorUsername.setText("  ");
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đăng nhập">    
    private void signIn() {
        nonError();
        if(!(lblErrorUsername.getText().equals(" ") && 
                lblErrorPassword.getText().equals(" "))) return;
        String tk = txtUsername.getText();
        String matKhau = txtPassword.getText();
        Users user = new Users();
        // Tạo luồng và hiện dialog loading
        DialogLoading dlog = new DialogLoading();
        dlog.setVisible(true);
        new Thread(){
            @Override
            public void run(){
                XPanel.mainForm.setEnabled(false);
                // Tải thông tin tài khoản lên form
                int check = dao.signIn(tk, matKhau, user);
                if(check == -1){
                    lblErrorUsername.setText("Tài khoản không tồn tại!");
                    txtUsername.requestFocus();
                }else if(check == 0){
                    lblErrorPassword.setText("Sai mật khẩu!");
                    txtPassword.requestFocus();
                }else{
                    Auth.user = user;
                    XPanel.panelHeader.setSign();
                    XPanel.panelTaiKhoan.removeAll();
                    XPanel.panelTaiKhoan.add(new PanelAccount());
                    if(XPanel.nameCard.equals("GioHang")){
                        XPanel.panelCart.removeAll();
                        XPanel.panelCart.add(new PanelCart());
                        XPanel.panelCart.repaint();
                        XPanel.panelCart.revalidate();
                    }
                    clearError();
                    CardLayout card = (CardLayout) XPanel.panelCardUser.getLayout();
                    card.show(XPanel.panelCardUser, XPanel.nameCard);
                }
                XPanel.mainForm.setEnabled(true);
                dlog.setVisible(false);
            }
        }.start();
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
        
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức giới hạn kí tự nhập vào">
    private void limitLength(JTextComponent txt, int length, KeyEvent evt){
        boolean limited = txt.getText().length() == length;
        if (limited){
            evt.consume();
        }
    }
    // </editor-fold>
    
// ----------------------  End Method  ----------------------
}
