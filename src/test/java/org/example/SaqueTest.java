package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaqueTest {

    Saque saque;

    @BeforeEach
    void setup() {
        saque = new Saque();
        saque.saldo = 100.0;
    }

    @Test
    @DisplayName("Deve realizar saque com saldo suficiente")
    void deveRealizarSaqueComSaldoSuficiente() {
        boolean resultado = saque.retirarDinheiro(50.0);
        assertTrue(resultado);
        assertEquals(50.0, saque.saldo, 0.01);
    }

    @Test
    @DisplayName("Não deve realizar saque com saldo insuficiente")
    void naoDeveRealizarSaqueComSaldoInsuficiente() {
        boolean resultado = saque.retirarDinheiro(150.0);
        assertFalse(resultado);
        assertEquals(100.0, saque.saldo, 0.01);
    }

    @Test
    @DisplayName("Não deve realizar saque com valor negativo")
    void naoDeveRealizarSaqueComValorNegativo() {
        boolean resultado = saque.retirarDinheiro(-10.0);
        assertFalse(resultado);
        assertEquals(100.0, saque.saldo, 0.01);
    }

    @Test
    @DisplayName("Não deve realizar saque com valor zero")
    void naoDeveRealizarSaqueComValorZero() {
        boolean resultado = saque.retirarDinheiro(0.0);
        assertFalse(resultado);
        assertEquals(100.0, saque.saldo, 0.01);
    }

    @Test
    @DisplayName("Deve realizar saque de todo o saldo")
    void deveRealizarSaqueDeTodoSaldo() {
        boolean resultado = saque.retirarDinheiro(100.0);
        assertTrue(resultado);
        assertEquals(0.0, saque.saldo, 0.01);
    }
}