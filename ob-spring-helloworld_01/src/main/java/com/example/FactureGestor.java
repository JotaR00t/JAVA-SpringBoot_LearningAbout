package com.example;

public class FactureGestor {

    //1. attributes
    CalculatorService calculatorService;
    String nombre;

    //2. constructors
    public FactureGestor(CalculatorService calculator, String nombre){
        System.out.println("Ejecutando constructor FactureGestor");
        this.calculatorService = calculator;
        this.nombre = nombre;

    }
    //3. methods
}
