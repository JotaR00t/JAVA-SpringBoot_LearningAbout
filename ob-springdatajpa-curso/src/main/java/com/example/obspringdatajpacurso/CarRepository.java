package com.example.obspringdatajpacurso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//ESTA ES LA INTERFAZ
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
