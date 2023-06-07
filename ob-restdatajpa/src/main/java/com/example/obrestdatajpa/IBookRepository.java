package com.example.obrestdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//extends JpaRepository add CRUD methods<Class , primitiveDataType>
@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {


}
