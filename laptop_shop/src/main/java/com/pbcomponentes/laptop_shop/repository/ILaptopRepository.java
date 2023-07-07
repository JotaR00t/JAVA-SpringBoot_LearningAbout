package com.pbcomponentes.laptop_shop.repository;

import com.pbcomponentes.laptop_shop.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepository extends JpaRepository<Laptop, Long> {
}
