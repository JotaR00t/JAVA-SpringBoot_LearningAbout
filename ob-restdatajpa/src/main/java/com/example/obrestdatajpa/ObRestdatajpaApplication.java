package com.example.obrestdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestdatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestdatajpaApplication.class, args);
		IBookRepository repository = context.getBean(IBookRepository.class);

		//CRUD
		// Create book
		Book book1 = new Book(null, "Homo Deus", "Yuval Noah", 540, 29.99, LocalDate.of(2018,12,1), true);
		Book book2 = new Book(null, "Homo Sapiens", "Yuval Noah", 540, 19.99, LocalDate.of(2013,12,1), true);
		// almacenar book
		System.out.println(repository.findAll().size());
		repository.save(book1);
		repository.save(book2);

		// recuperar book
		System.out.println(repository.findAll().size());
		// Delete book
		repository.deleteById(1L);

		System.out.println(repository.findAll().size());

	}

}
