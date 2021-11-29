package com.unknownshop.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

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
}
