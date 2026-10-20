package com.banco.servicioweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicioWebAplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicioWebAplication.class, args);
        System.out.println("=== Servidor Web (Servicio REST) iniciado en el puerto 8080 ===");
    }
}