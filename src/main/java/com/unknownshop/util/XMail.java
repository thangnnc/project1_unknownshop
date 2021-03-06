package com.unknownshop.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class XMail {

   public static void sendOTP(String toEmail, int OTP){
        try{
                Properties p = new Properties();
                p.put("mail.smtp.auth", "true");
                p.put("mail.smtp.starttls.enable", "true");
                p.put("mail.smtp.host", "smtp.gmail.com");
                p.put("mail.smtp.port", 587);

                final String user = "thangnncps14579@gmail.com";
                final String pass ="ThangThang123";

                Session s = Session.getInstance(p,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(user, pass);
                        }
                    });
                String from = "phannguyendangtruongprovip@gmail.com";
                String to = toEmail;
                String subject = "Ma khoi phuc mat khau cua ban";
                String body = String.valueOf("Day la ma khoi phuc mat khau cua ban.\nLuu y khong chia se ma voi nguoi khac duoi moi hinh thuc!\nOTP : "+OTP);
                Message msg = new MimeMessage(s);
                msg.setFrom(new InternetAddress(from));
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                msg.setSubject(subject);
                msg.setText(body);
                MimeBodyPart contentPart = new MimeBodyPart();
                contentPart.setContent("","text/html; charset = utf-8");
                Transport.send(msg);
            }catch(Exception e){
                    e.printStackTrace();

            }
    }

    public static void sendQRCode(String email) {
        try {
            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", 587);

            final String user = "thangnncps14579@gmail.com";
            final String pass = "ThangThang123";

            Session s = Session.getInstance(p,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(user, pass);
                }
            });

            String from = user;
            String to = email;
            String subject = "Unknown shop";
            Message msg = new MimeMessage(s);
            // phan 3 chua tap tin image
            MimeBodyPart messageBodyPart = new MimeBodyPart();

            BodyPart body = new MimeBodyPart();
            body.setText("Ma QR Code cua ban la  : ");
            // Duong dan den file cua ban
            String imagePath = "./icons/qr_code.png";
            DataSource source2 = new FileDataSource(imagePath);
            messageBodyPart.setDataHandler(new DataHandler(source2));
            messageBodyPart.setFileName(imagePath);
            //
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(body);
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(messageBodyPart);

            msg.setFrom(new InternetAddress(from));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject(subject);
            msg.setContent(multipart);

            MimeBodyPart contentPart = new MimeBodyPart();
            contentPart.setContent("", "text/html; charset = utf-8");
            Transport.send(msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createQR(String user, String pass) {
        try {
            String data = user + "+" + pass;
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
//            BitMatrix matrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, 200, 200);
//            String outputFile = "./qr_code.png";
//            Path path = (Path) FileSystems.getDefault().getPath(outputFile);
//            MatrixToImageWriter.writeToPath(matrix, "PNG", (java.nio.file.Path) path);
            //
            BitMatrix matrix;
            matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 400, 400);
//            MatrixToImageWriter.writeToPath(bitMatrix, "jpg", Paths.get(outputFile));
            MatrixToImageConfig imageConfig = new MatrixToImageConfig(MatrixToImageConfig.BLACK, MatrixToImageConfig.WHITE);
            BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(matrix, imageConfig);
            BufferedImage logoImage = ImageIO.read(new File("./icons/logo.png"));
            int finalImageHeight = qrImage.getHeight() - logoImage.getHeight();
            int finalImageWidth = qrImage.getWidth() - logoImage.getWidth();
            Color mainColor = new Color(51, 102, 153);
            BufferedImage finalImage = new BufferedImage(qrImage.getHeight(), qrImage.getWidth(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D graphics = (Graphics2D) finalImage.getGraphics();
            graphics.drawImage(qrImage, 0, 0, null);
            graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
            graphics.drawImage(logoImage, (int) Math.round(finalImageWidth / 2), (int) Math.round(finalImageHeight / 2), null);
            graphics.setColor(mainColor);
            ImageIO.write(finalImage, "png", new File("./icons/qr_code.png"));
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }

}
