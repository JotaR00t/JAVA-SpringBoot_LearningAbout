package com.pbcomponentes.laptop_shop;

import com.pbcomponentes.laptop_shop.controller.HelloController;
import com.pbcomponentes.laptop_shop.entities.Laptop;
import com.pbcomponentes.laptop_shop.repository.ILaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class LaptopShopApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LaptopShopApplication.class, args);

		HelloController hello = context.getBean(HelloController.class);

		System.out.println(hello.HelloWorld());

		ILaptopRepository laptop_repository = context.getBean(ILaptopRepository.class);

		//CRUD
		//Create laptop
		Laptop laptop1 = new Laptop(null, 1000.0, "Intel i5", "512GB SSD", "NVIDIA GTX 1650", "IPS", "Modelo 1");
		Laptop laptop2 = new Laptop(null, 1200.0, "AMD Ryzen 7", "1TB HDD", "AMD Radeon RX 5600M", "TN", "Modelo 2");
		Laptop laptop3 = new Laptop(null, 1500.0, "Intel i7", "256GB SSD", "NVIDIA RTX 3070", "IPS", "Modelo 3");
		Laptop laptop4 = new Laptop(null, 800.0, "AMD Ryzen 5", "512GB SSD", "AMD Radeon RX 5500M", "IPS", "Modelo 4");
		Laptop laptop5 = new Laptop(null, 2000.0, "Intel i9", "1TB SSD", "NVIDIA RTX 3080", "OLED", "Modelo 5");
		Laptop laptop6 = new Laptop(null, 1300.0, "AMD Ryzen 7", "1TB HDD", "NVIDIA GTX 1660 Ti", "IPS", "Modelo 6");
		Laptop laptop7 = new Laptop(null, 900.0, "Intel i5", "256GB SSD", "NVIDIA MX350", "TN", "Modelo 7");
		Laptop laptop8 = new Laptop(null, 1800.0, "AMD Ryzen 9", "2TB SSD", "AMD Radeon RX 6800M", "IPS", "Modelo 8");
		Laptop laptop9 = new Laptop(null, 1100.0, "Intel i7", "512GB SSD", "NVIDIA RTX 3060", "IPS", "Modelo 9");
		Laptop laptop10 = new Laptop(null, 1600.0, "AMD Ryzen 7", "1TB SSD", "NVIDIA RTX 3070", "IPS", "Modelo 10");

		System.out.println(laptop_repository.findAll().size());
		laptop_repository.save(laptop1);
		laptop_repository.save(laptop2);
		laptop_repository.save(laptop3);
		laptop_repository.save(laptop4);
		laptop_repository.save(laptop5);
		laptop_repository.save(laptop6);
		laptop_repository.save(laptop7);
		laptop_repository.save(laptop8);
		laptop_repository.save(laptop9);
		laptop_repository.save(laptop10);




	}



}
