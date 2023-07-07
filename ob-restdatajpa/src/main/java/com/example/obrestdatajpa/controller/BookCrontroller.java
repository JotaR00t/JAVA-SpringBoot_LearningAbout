package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.IBookRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//RestController PERMITE TRABAJAR CON JSON json es con lo que se comunican los microservicios

//Controller Permite cargar vistas en html
//ResponseBody creo que da el contenido del html
//RESTCONTROLLER es una combinación de los dos

@RestController
public class BookCrontroller {

    // attributes
    private IBookRepository bookRepository;
    //constructors

    public BookCrontroller(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    // CRUD sobre la entidad Book

    // buscar todos los libros

    @GetMapping("/api/books")
    public List<Book> findAll(){
        // recuperar y devolver los libros de base de datos
        return bookRepository.findAll();
        //return repository.findAll();
    }
/*
    * Request
    * Response
    * @param id
    * @return
 */
    // buscar un solo libro en la base de datos segun su id
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findOneById(@PathVariable Long id){

       Optional<Book> bookOpt = bookRepository.findById(id);
       // opcion 1
        /*
       if(bookOpt.isPresent())
           return bookOpt.get();
       else
           return null;
       */

       // opcion 2 reemplazo con holdmouse a una sola linea
       // return bookOpt.orElse(null);

        //opcion 3 para ResponseEntity, osea ayuda a indicar 404 en el status del objeto
         if(bookOpt.isPresent())
           return ResponseEntity.ok(bookOpt.get());
        else
           return ResponseEntity.notFound().build();

        // opcion 4 holdmouse del 3
        // return bookOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/api/books") //la url no interfiere con GET porque POST son metodos http diferentes
    public Book create(@RequestBody Book book, @RequestHeader HttpHeaders headers){ //@dame el interior de la petición y mete la info en obj book.
        System.out.println(headers.get("User-Agent"));
            // guardar el libro recibido por parametro en la base de datos
        return bookRepository.save(book);
    }

    // crear un nuevo libro en base de datos

    // actualizar libro existente en base de datos

    // borrar libro en base de datos

}
