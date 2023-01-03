package SendingEmail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public static void main(String[] args) {
        final String username = "ranamagar.prashant@gmail.com";
        final String password ="yywlvetkbdjsowof";

        String to = "fighterufc2@gmail.com";
        Properties props = new Properties();

        props.put("mail.smtp.auth", "true");
        //set tls
        props.put("mail.smtp.starttls.enable", "true");
        //set mail host
        props.put("mail.smtp.host", "smtp.gmail.com");
        //set mail port
        props.put("mail.smtp.port", "587");

        //get mail session
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator(){
            protected PasswordAuthentication
            getPasswordAuthentication(){
                return new PasswordAuthentication(username, password);
            }
        });
    //Compose the message
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress((username)));
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            //attach file
            message.setSubject("email.jpg");

            message.setContent(
                    "<b>This is text msg</b>",
            "text/html;charset=UTF-8");
            //send message
            Transport.send(message);

            System.out.println("message send success");
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }
}
