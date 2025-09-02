package com.wipro.productmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.wipro.productmgmt")

public class ProductmgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductmgmtApplication.class, args);
	}

}
