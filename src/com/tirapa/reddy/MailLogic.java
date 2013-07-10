package com.tirapa.reddy;

import org.springframework.mail.MailSender;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import com.sun.mail.smtp.SMTPTransport;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.SimpleMailMessage;

public class MailLogic {

	   private MailSender mail;
	   private SimpleMailMessage message;

	   
	   public void setMail(MailSender mail)
	   {
		   this.mail = mail;
	   }
	   
	   public void setMessage(SimpleMailMessage message)
	   {
		   this.message = message;
	   }

	   public void sendM(String from, String to, String subject, String msg1)throws Exception
	   {
		   
			
			
			message.setFrom(from);
			message.setTo(to);
			message.setSubject(subject);
			message.setText(msg1);
			
			mail.send(message);
			
			
			System.out.println("Mail Sent Successfully...!");
			String username = "tondaputirapareddy@gmail.com";
		    String password = "tirapasravani";
		    //String recipient = "tondaputirapareddy@gmail.com";
		    String recipient = "tirapareddy.tondapu@eidiko.com";
			String recipient1 = "seetharamireddy.kistipati@eidiko.com";

		    Properties props = new Properties();

		    props.put("mail.smtp.host", "smtp.gmail.com");
		    props.put("mail.from", "tondaputirapareddy@gmail.com");
		    props.put("mail.smtp.starttls.enable", "true");
		    props.put("mail.smtp.port", "587");
		    props.setProperty("mail.debug", "true");

		    Session session = Session.getInstance(props, null);
		    MimeMessage msg = new MimeMessage(session);

		    msg.setRecipients(javax.mail.Message.RecipientType.TO, recipient + "," + recipient );
		    msg.setSubject("JavaMail hello world example");
		    msg.setSentDate(new Date());
		    msg.setText("Hello, world!\n Hi bayya how r u '%s' \n \t\t\t\t I'm sending this mail using java program");

		    Transport transport = session.getTransport("smtp");

		    //transport.connect(username, password);
		    transport.connect("smtp.gmail.com", 587, username, password);
			SMTPTransport dd=(SMTPTransport)transport;
		        
		        System.out.println("############################################");
		        System.out.println(dd.getURLName());
		        System.out.println(dd.getAuthorizationId());
		        System.out.println(dd.getLastServerResponse());
		        System.out.println(dd.getLocalHost());
		        System.out.println(dd.getReportSuccess());
		        System.out.println(msg.getDisposition());
		        System.out.println(recipient + "," + recipient1);
				
		        
		        
		        
		        
		     System.out.println("#############################################");
		    transport.sendMessage(msg, msg.getAllRecipients());
		    transport.close();
		}

	}

