package com.banco.servicioweb;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized String depositar(double cantidad) {
        if (cantidad <= 0) {
            return "La cantidad debe ser mayor que cero.";
        }
        this.saldo += cantidad;
        return "Deposito completado. Saldo actual: $" + this.saldo;
    }

    public synchronized String retirar(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return "Retiro completado. Saldo actual: $" + this.saldo;
        } else {
            return "Saldo insuficiente para retirar: $" + cantidad;
        }
    }

    public synchronized double consultarSaldo() {
        return saldo;
    }
}