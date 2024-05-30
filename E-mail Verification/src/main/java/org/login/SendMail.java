package org.login;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    //write sender's E-mail;
    private static final String username = "(sender's e-mail address)@gmail.com";
    //password from google;
    private static final String password = "password from google";
    public static boolean sendEmail(String to, String subject, String body){
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP sunucu adresi - server address
        props.put("mail.smtp.port", "587"); // SMTP port numarası - port number
        props.put("mail.smtp.auth", "true"); // SMTP kimlik doğrulama - authentication
        props.put("mail.smtp.starttls.enable", "true"); // TLS desteği - TLS support

        // Session oluşturma- Session creating
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // MimeMessage oluşturma MimeMesagge creating
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);

            // E-posta gönderme - Send E-mail
            Transport.send(message);
            System.out.println(" the verification code was sent successfully...\n" +
                    "enter code");
            return true;
        } catch (MessagingException e) {
            System.out.println("a problem has occurred...\n" +
                    " Please check your e-mail");
            return false;
        }
    }
}
