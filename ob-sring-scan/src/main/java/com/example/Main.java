package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //EJEMPLO 1
        //Opcion 1 --- Crear un objeto de forma normal
        //CalculatorService service = new CalculatorService();

        //Opcion 2 --- En vez de crear un objeto normal, Recibir un objeto de Spring
        CalculatorService calculator = (CalculatorService) context.getBean("calculatorService");
        //esto debe mostrar 1 vez "hola jc"
        String texto = calculator.holaJc();
        System.out.println(texto);

        //EJEMPLO 2
        FactureGestor gestor = (FactureGestor) context.getBean("factureGestor");
        //esto debe mostrar por segunda vez "hola jc"
        System.out.println(gestor.calculatorService.holaJc());
    }
}
