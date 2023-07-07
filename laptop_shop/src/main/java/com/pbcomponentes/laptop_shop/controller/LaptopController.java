package com.pbcomponentes.laptop_shop.controller;

import com.pbcomponentes.laptop_shop.entities.Laptop;
import com.pbcomponentes.laptop_shop.repository.ILaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    private ILaptopRepository laptopRepository;

    public LaptopController(ILaptopRepository laptopRepository) {this.laptopRepository = laptopRepository;}

    // CRUD sobre la entidad Laptop

    // buscar todas las laptops
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        // recuperar y devolver todas las laptops
        return laptopRepository.findAll();
    }

    // buscar una sola laptop en la BBDD segun su id
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);
        if(laptopOpt.isPresent())
            return  ResponseEntity.ok(laptopOpt.get());
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        return laptopRepository.save(laptop);
    }
}
