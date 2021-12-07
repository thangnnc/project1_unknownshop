package com.unknownshop.form.user;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.unknownshop.constant.XConstant;
import com.unknownshop.util.XHover;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class GetQR extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private String user;
    private String pass;
    private static final long serialVersionUID = 6441489157408381878L;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    DialogSignIn dialog;

    public GetQR(DialogSignIn dialog, String user, String pass) {
        this.dialog = dialog;
        this.pass = pass;
        this.user = user;
        initComponents();
        init();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(250, 250, 250));
        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 300));

        btnExit.setBackground(new java.awt.Color(0, 102, 204));
        btnExit.setText("EXIT");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        webcam.close();
        this.dispose();
        return;
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
       XHover.enterButton(btnExit, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
       XHover.exitButton(btnExit);
    }//GEN-LAST:event_btnExitMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GetQR(null, null, null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    // -------------------- Start Method --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức hiển thị camera"> 
    private void init() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0); //0 is default webcam
        webcam.setViewSize(size);
        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);
        Panel.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));
        executor.execute(this);
        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(320, 240));
        webcam.open();

    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Chạy luồng"> 
    @Override
    public void run() {
        do {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            Result result = null;
            BufferedImage image = null;
            if (webcam.isOpen()) {
                if ((image = webcam.getImage()) == null) {
                    continue;
                }
            }
            //chuyển đổi hình ảnh sang nguồn bitmap nhị phân
            try {
                try {
                    LuminanceSource source = new BufferedImageLuminanceSource(image);
                    BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                    result = new MultiFormatReader().decode(bitmap);
                } catch (NotFoundException e) {
                }
            } catch (Exception e) {
            }
            if (result != null) {
                String info = result.getText();
                int index = info.indexOf("+");
                pass = info.substring(index + 1);
                user = info.substring(0, index);
                dialog.setInfo(user, pass);
                webcam.close();
                this.dispose();
                return;
            }
        } while (true);
    }
    // </editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="Khởi chạy luồng"> 
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "Webcam");
        t.setDaemon(true);
        return t;
    }
    // </editor-fold> 
    
     // -------------------- End Method --------------------
}
