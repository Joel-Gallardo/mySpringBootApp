package com.joel.mySpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joel.mySpringBootApp.model.Conexion;

@SpringBootApplication
public class MySpringBootAppApplication implements CommandLineRunner {
	@Autowired
	@Qualifier("beanConexion")
	private Conexion conexion;

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(conexion.getDb());
	}

}
