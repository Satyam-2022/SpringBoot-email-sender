package com.jarvis.mailSender.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Details {

    private String recipient;
    private String subject;
    private String body;
    private String attachment;

}
