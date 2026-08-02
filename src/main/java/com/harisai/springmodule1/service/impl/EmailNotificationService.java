package com.harisai.springmodule1.service.impl;

import com.harisai.springmodule1.service.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier
@Component
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("📧 Email Notification Sent Successfully");



    }
}
