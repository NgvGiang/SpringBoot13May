package org.example.springboot13may;

import org.example.springboot13may.model.GirlFriend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot13MayApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBoot13MayApplication.class, args);
        GirlFriend gf = context.getBean(GirlFriend.class);
        gf.display();
    }

}
