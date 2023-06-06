package com.example;


import org.springframework.stereotype.Component;

@Component
public class FactureGestor {

    //1. attributes
    CalculatorService calculatorService;


    //2. constructors
    public FactureGestor(CalculatorService calculator){
        System.out.println("Ejecutando constructor FactureGestor");
        this.calculatorService = calculator;

    }
    //3. methods
}
