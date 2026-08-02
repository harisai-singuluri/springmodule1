package com.harisai.springmodule1.service.impl;

import com.harisai.springmodule1.service.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SmsNotificationService  implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent.");
    }
}
