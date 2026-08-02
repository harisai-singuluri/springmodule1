package com.harisai.springmodule1;

import com.harisai.springmodule1.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springmodule1Application {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(Springmodule1Application.class, args);

        UserService userService =
                context.getBean(UserService.class);

        userService.registerUser();

    }

}