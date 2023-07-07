package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService attribute_US;
    public UserService(NotificationService parameter_US){
        attribute_US=parameter_US;
    }
    //Esta clase tiene un atributo, pero no le doy ningun uso más que escanearlo en beans
    //segun el ejercicio.
}
