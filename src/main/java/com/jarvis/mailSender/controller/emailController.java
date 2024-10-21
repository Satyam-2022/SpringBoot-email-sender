package com.jarvis.mailSender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jarvis.mailSender.services.emailServices;
import com.jarvis.mailSender.entity.Details;

@RestController
public class emailController {

    @Autowired
    private emailServices emailServices;

    @PostMapping("/sendMail")
    public void sendMail(@RequestBody Details details){
        emailServices.sendMail(details);
    }

    @PostMapping("/sendMailAttachment")
    public void sendMailWithAttch(@RequestBody Details details){
        emailServices.sendMailAttachment(details);
    }

}
