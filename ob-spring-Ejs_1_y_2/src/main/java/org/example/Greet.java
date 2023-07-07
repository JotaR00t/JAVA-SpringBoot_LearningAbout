package org.example;

import org.springframework.stereotype.Component;

@Component
public class Greet {
    public Greet(){
        //System.out.println("Hello there! I'm JC.");
    }
    public String greeting(){
        return "Hello there! I'm JC.";
    }
}
