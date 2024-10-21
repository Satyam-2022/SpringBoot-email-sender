package com.jarvis.mailSender.services;

import com.jarvis.mailSender.entity.Details;

public interface emailServices {

    void sendMail(Details details);
    void sendMailAttachment(Details details);
}
