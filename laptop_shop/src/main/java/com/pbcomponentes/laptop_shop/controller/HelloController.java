package com.pbcomponentes.laptop_shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hola")
    public String HelloWorld(){
        return "Hola aqui jc! probando saludo que se muestra en CONSOLA NAVEGADOR Y POSTMAN con url /hola ";
    }
}
