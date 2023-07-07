package com.example.obrestdatajpa.repository;

import com.example.obrestdatajpa.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//extends JpaRepository add CRUD methods<Class , primitiveDataType>
@Repository // MARCA a una clase como un componente de acceso a datos dandole x ejemp ".save"
public interface IBookRepository extends JpaRepository<Book, Long> {


}
