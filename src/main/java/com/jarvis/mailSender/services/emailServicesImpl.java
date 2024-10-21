package com.jarvis.mailSender.services;

import com.jarvis.mailSender.entity.Details;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Objects;

@Service
public class emailServicesImpl implements emailServices{

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendMail(Details details) {

        try{
            SimpleMailMessage mail = new SimpleMailMessage();
            mail.setTo(details.getRecipient());
            mail.setSubject(details.getSubject());
            mail.setText(details.getBody());
            javaMailSender.send(mail);
            System.out.println("Email Sent Successfully!");

        }catch (Exception e){
            System.out.println("Exception while sending mail" + e);
        }
    }

    public void sendMailAttachment(Details details) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;

        try {
            // Set the multipart flag to true
            mimeMessageHelper = new MimeMessageHelper(mimeMessage, true); // true for multipart

            mimeMessageHelper.setTo(details.getRecipient());
            mimeMessageHelper.setSubject(details.getSubject());
            mimeMessageHelper.setText(details.getBody());

            // Attach the file
            FileSystemResource file = new FileSystemResource(new File(details.getAttachment()));
            if (file.exists()) {
                mimeMessageHelper.addAttachment(Objects.requireNonNull(file.getFilename()), file);
            } else {
                System.out.println("Attachment file does not exist: " + details.getAttachment());
            }

            // Send the email
            javaMailSender.send(mimeMessage);
            System.out.println("Email Sent Successfully!");

        } catch (Exception e) {
            System.out.println("Exception while sending mail: " + e);
        }
    }
}
