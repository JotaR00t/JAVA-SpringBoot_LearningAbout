package com.example;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public CalculatorService() {
        System.out.println("Ejecutando constructor CalculatorService");
    }


    public String holaJc() {
        return "Hola jc desde CalculatorService!";
    }



}
