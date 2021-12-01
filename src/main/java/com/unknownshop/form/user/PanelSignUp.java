package com.unknownshop.form.user;

import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.UserDAO;
import com.unknownshop.entity.Users;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XImage;
import com.unknownshop.util.XMess;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelSignUp extends javax.swing.JPanel {

    byte[] userImg;
    String name;
    JPanel pnlSignInBar;
    UserDAO dao = new UserDAO();
    
    public PanelSignUp() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormDangKy = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        btnDangKy = new javax.swing.JButton();
        lblErrorUsername = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblIconUsername = new javax.swing.JLabel();
        lblIconPassword = new javax.swing.JLabel();
        lblTitleDangKy = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnImage = new javax.swing.JButton();
        lblErrorRePassword = new javax.swing.JLabel();
        lblIconRePassword = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        lblErrorFullname = new javax.swing.JLabel();
        lblIconFullname = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblErrorEmail = new javax.swing.JLabel();
        lblIconEmail = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtRePassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);

        pnlFormDangKy.setBackground(new java.awt.Color(51, 51, 51));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(240, 240, 240));
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

        btnDangKy.setBackground(new java.awt.Color(0, 102, 204));
        btnDangKy.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDangKy.setForeground(new java.awt.Color(240, 240, 240));
        btnDangKy.setText("Đăng Ký");
        btnDangKy.setContentAreaFilled(false);
        btnDangKy.setOpaque(true);
        btnDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangKyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangKyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDangKyMousePressed(evt);
            }
        });

        lblErrorUsername.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorUsername.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorUsername.setText("Error!");

        lblErrorPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorPassword.setText("Error!");

        lblIconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUsername.png"))); // NOI18N

        lblIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        lblTitleDangKy.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleDangKy.setForeground(new java.awt.Color(240, 240, 240));
        lblTitleDangKy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleDangKy.setText("Đăng Ký Tài Khoản Mới");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnImage.setBackground(new java.awt.Color(51, 51, 51));
        btnImage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnImage.setForeground(new java.awt.Color(240, 240, 240));
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnImageMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblErrorRePassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorRePassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorRePassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorRePassword.setText("Error!");

        lblIconRePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        txtFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFullname.setForeground(new java.awt.Color(240, 240, 240));
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

        lblErrorFullname.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorFullname.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorFullname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorFullname.setText("Error!");

        lblIconFullname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconName.png"))); // NOI18N

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(240, 240, 240));
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

        lblErrorEmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorEmail.setText("Error!");

        lblIconEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconEmail.png"))); // NOI18N

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(240, 240, 240));
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

        txtRePassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRePassword.setForeground(new java.awt.Color(240, 240, 240));
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

        javax.swing.GroupLayout pnlFormDangKyLayout = new javax.swing.GroupLayout(pnlFormDangKy);
        pnlFormDangKy.setLayout(pnlFormDangKyLayout);
        pnlFormDangKyLayout.setHorizontalGroup(
            pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormDangKyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormDangKyLayout.createSequentialGroup()
                        .addComponent(lblTitleDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormDangKyLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlFormDangKyLayout.createSequentialGroup()
                                    .addComponent(lblIconFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFullname))
                                .addGroup(pnlFormDangKyLayout.createSequentialGroup()
                                    .addComponent(lblIconRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlFormDangKyLayout.createSequentialGroup()
                                    .addComponent(lblIconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblErrorUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormDangKyLayout.createSequentialGroup()
                                    .addComponent(lblIconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblErrorPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblErrorRePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblErrorFullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlFormDangKyLayout.createSequentialGroup()
                                    .addComponent(lblIconEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEmail))
                                .addComponent(lblErrorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))))
        );
        pnlFormDangKyLayout.setVerticalGroup(
            pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormDangKyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormDangKyLayout.createSequentialGroup()
                        .addGroup(pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIconRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorRePassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconFullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorFullname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorEmail)
                .addGap(18, 18, 18)
                .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(pnlFormDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(pnlFormDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
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
    // <editor-fold defaultstate="collapsed" desc="Event btnDangKy">
    private void btnDangKyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangKyMousePressed
        this.signUp();
    }//GEN-LAST:event_btnDangKyMousePressed

    private void btnDangKyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangKyMouseEntered
        XHover.enterButton(btnDangKy, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDangKyMouseEntered

    private void btnDangKyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangKyMouseExited
        XHover.exitButton(btnDangKy);
    }//GEN-LAST:event_btnDangKyMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnImage">
    private void btnImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImageMousePressed
        this.getImage();
    }//GEN-LAST:event_btnImageMousePressed

    private void btnImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImageMouseEntered
        XHover.enterButton(btnImage, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnImageMouseEntered

    private void btnImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImageMouseExited
        XHover.exitButton(btnImage);
    }//GEN-LAST:event_btnImageMouseExited

   // </editor-fold>

// ---------------------- End Event ----------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnImage;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorFullname;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorRePassword;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblIconEmail;
    private javax.swing.JLabel lblIconFullname;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblIconRePassword;
    private javax.swing.JLabel lblIconUsername;
    private javax.swing.JLabel lblTitleDangKy;
    private javax.swing.JPanel pnlFormDangKy;
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
        this.clearError();
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đăng ký tài khoản">    
    private void signUp() {
        nonError();
        if(checkError()) return;
        Users u = getForm();
        try{
            int result = dao.insert(u);
            if( result == 0){
                lblErrorUsername.setText("Tài khoản này đã có trong hệ thống!");
            }else if(result == -1){
                lblErrorEmail.setText("Email đã được sử dụng!");
            }else{
                JOptionPane.showMessageDialog(this,"Thêm tài khoản thành công!");
                clearForm();
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(this,"Thêm tài khoản thất bại!");
            ex.printStackTrace();
        }
        
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
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy thông tin trên form"> 
    private Users getForm(){
        Users u = new Users();
        u.setUsername(txtUsername.getText());
        u.setPassword(txtPassword.getText());
        u.setFullname(txtFullname.getText());
        u.setEmail(txtEmail.getText());
        u.setImgUrl(userImg);
        u.setRole(XConstant.CUSTOMER);
        return u;
    }
    // </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa lable lỗi"> 
    private void clearError() {
        lblErrorPassword.setText("  ");
        lblErrorUsername.setText("  ");
        lblErrorEmail.setText("  ");
        lblErrorFullname.setText("  ");
        lblErrorRePassword.setText("  ");
    }
    // </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa textfield"> 
    private void clearForm() {
        txtUsername.setText("Tên tài khoản");
        txtPassword.setText("Mật khẩu");
        txtRePassword.setText("Mật khẩu");
        txtFullname.setText("Họ tên");
        txtEmail.setText("Email");
        btnImage.setIcon(null);
        btnImage.setText("Hình Ảnh");
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
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy ảnh"> 
    private void getImage(){
        JFileChooser fileChooser = new JFileChooser();
        if(fileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            FileInputStream fos = null;
            try {
                File file = fileChooser.getSelectedFile();
                userImg = XImage.convertImageToBytes(file);
                ImageIcon icon = new ImageIcon(new ImageIcon(file.getAbsolutePath()).getImage().
                        getScaledInstance(btnImage.getWidth(), btnImage.getHeight(), Image.SCALE_SMOOTH));
                btnImage.setIcon(icon);
                btnImage.setText("");
            } catch (Exception ex) {
                
            } 
        }
    }
    // </editor-fold>    
     
// ----------------------  End Method  ----------------------

}
