package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public  NotificationService(){

    }
    public String notification(){
        return "Id notified you my greetings";
    }
}
