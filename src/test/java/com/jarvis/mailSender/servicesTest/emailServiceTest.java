package com.jarvis.mailSender.servicesTest;

import com.jarvis.mailSender.entity.Details;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.jarvis.mailSender.services.emailServices;


@SpringBootTest
public class emailServiceTest {

    @Autowired
    private emailServices emailServices;
   // private Details details1;



    @Test
    void TestSendmail(){
     // emailServices.sendMail(new Details
     //         ("youremail@gmail.com","Offical","Welcome!"));
    }
}
