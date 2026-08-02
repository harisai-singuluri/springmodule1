package com.harisai.springmodule1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    @Qualifier("emailNotificationService")
    private NotificationService notificationService;

    public void registerUser() {

        System.out.println("User Registered Successfully");

        notificationService.sendNotification();
    }
}