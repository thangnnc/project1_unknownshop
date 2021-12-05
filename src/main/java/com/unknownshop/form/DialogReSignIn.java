package com.unknownshop.form;

import com.unknownshop.constant.XConstant;
import com.unknownshop.util.Auth;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XPanel;

public class DialogReSignIn extends javax.swing.JFrame {

    public DialogReSignIn() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new com.unknownshop.swing.textfield.TextField();
        txtPassword = new com.unknownshop.swing.textfield.PasswordField();
        lblErrorPassword = new javax.swing.JLabel();
        lblErrorUsername = new javax.swing.JLabel();
        lblIconUsername = new javax.swing.JLabel();
        lblIconPassword = new javax.swing.JLabel();
        btnXacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnClose.setBackground(new java.awt.Color(255, 0, 51));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Xác Nhận Đăng Nhập");

        txtUsername.setEditable(false);
        txtUsername.setBackground(new java.awt.Color(51, 51, 51));
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsername.setLabelText("Tên Tài Khoản");

        txtPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setLabelText("Mật Khẩu");
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        lblErrorPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorPassword.setText("Error!");

        lblErrorUsername.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorUsername.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorUsername.setText("Error!");

        lblIconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUsername.png"))); // NOI18N

        lblIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        btnXacNhan.setBackground(new java.awt.Color(0, 102, 204));
        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(51, 51, 51));
        btnXacNhan.setText("Xác Nhận");
        btnXacNhan.setContentAreaFilled(false);
        btnXacNhan.setOpaque(true);
        btnXacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXacNhanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXacNhanMouseExited(evt);
            }
        });
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblErrorUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblIconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblIconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorPassword)
                .addGap(18, 18, 18)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// -------------------- Start Event --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnClose">
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        XPanel.mainForm.setEnabled(true);
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus Password">
    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if(txtPassword.getText().trim().length()==0){
            lblErrorPassword.setText("Chưa nhập mật khẩu!");
        }else{
            lblErrorPassword.setText(" ");
        }
    }//GEN-LAST:event_txtPasswordFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnXacNhan">
    private void btnXacNhanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacNhanMouseEntered
        XHover.enterButton(btnXacNhan, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnXacNhanMouseEntered

    private void btnXacNhanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacNhanMouseExited
        XHover.exitButton(btnXacNhan);
    }//GEN-LAST:event_btnXacNhanMouseExited

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        confirm();
    }//GEN-LAST:event_btnXacNhanActionPerformed
    // </editor-fold> 
    
// -------------------- End Event --------------------
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogReSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblIconUsername;
    private com.unknownshop.swing.textfield.PasswordField txtPassword;
    private com.unknownshop.swing.textfield.TextField txtUsername;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        lblErrorUsername.setText("  ");
        lblErrorPassword.setText("  ");
        txtUsername.setText(Auth.user.getUsername());
        
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức bắt lỗi chưa nhập"> 
    private void nonError(){
        if(lblErrorPassword.getText().equals("  ")){
            lblErrorPassword.setText("Chưa nhập mật khẩu!");
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức bắt lỗi chưa nhập"> 
    private void confirm(){
        nonError();
        if(!lblErrorPassword.getText().equals(" ")) return;
        String matKhau = txtPassword.getText();
        if(!matKhau.equals(Auth.user.getPassword())){
            lblErrorPassword.setText("Sai mật khẩu!");
            txtPassword.requestFocus();
        }else{
            new DialogChangeAccount().setVisible(true);
            dispose();
        }
    }
    // </editor-fold>
    
// ---------------------- End Method ----------------------
}
