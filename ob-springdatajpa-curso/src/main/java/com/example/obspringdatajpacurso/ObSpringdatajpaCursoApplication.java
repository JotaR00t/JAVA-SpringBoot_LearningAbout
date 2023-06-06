package com.example.obspringdatajpacurso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaCursoApplication {

    public static void main(String[] args) {
        //aqui he metido el = > en ApplicationContext context xk lo decia en el vid
      ApplicationContext context = SpringApplication.run(ObSpringdatajpaCursoApplication.class, args);
        //se usa la linea de antes para tener el objeto como util de la bbdd o algo así.. nose
      CarRepository repository = context.getBean(CarRepository.class);
        System.out.println("find");
        System.out.println("El num de coches en base de datos es: " + repository.count());

      // crear y almacenar un coche ne la base de datos
      Car toyota = new Car(null, "Toyota", "Prius", 2010);
      repository.save(toyota);

        System.out.println("El num de coches en base de datos es: " + repository.count());

      // recuperar todos
        System.out.println(repository.findAll());
    }

}
