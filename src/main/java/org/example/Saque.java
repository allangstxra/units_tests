package org.example;

public class Saque {
    public double saldo;

    public boolean retirarDinheiro(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            return true;
        }
        return false;
    }
}