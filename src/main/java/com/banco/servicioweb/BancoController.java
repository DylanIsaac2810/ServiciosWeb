package com.banco.servicioweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/banco")
public class BancoController {
    
    private final CuentaBancaria cuenta = new CuentaBancaria(1000.0);

    // Consulta de saldo (GET)
    @GetMapping("/saldo")
    public double consultarSaldo() {
        System.out.println("Servicio Web -> Solicitud de consulta de saldo recibida.");
        return cuenta.consultarSaldo();
    }

    // Depósito cambiado temporalmente a GET para poder probarlo desde el navegador
    @GetMapping("/depositar")
    public String depositar(@RequestParam double cantidad) {
        System.out.println("Servicio Web -> Solicitud de depósito recibida: $" + cantidad);
        return cuenta.depositar(cantidad);
    }

    // Retiro cambiado temporalmente a GET para poder probarlo desde el navegador
    @GetMapping("/retirar")
    public String retirar(@RequestParam double cantidad) {
        System.out.println("Servicio Web -> Solicitud de retiro recibida: $" + cantidad);
        return cuenta.retirar(cantidad);
    }
}