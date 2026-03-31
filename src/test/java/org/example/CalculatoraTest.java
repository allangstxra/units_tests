package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Soma de dois números positivos")
    void deveSomarNumerosPositivos() {
        assertEquals(10, calculadora.soma(7, 3), "7 + 3 deve ser 10");
    }

    @Test
    @DisplayName("Soma envolvendo números negativos")
    void deveSomarNumerosNegativos() {
        assertEquals(-5, calculadora.soma(-2, -3), "-2 + -3 deve ser -5");
        assertEquals(2, calculadora.soma(5, -3), "5 + -3 deve ser 2");
    }

    @Test
    @DisplayName("Soma com zero")
    void deveSomarComZero() {
        assertEquals(5, calculadora.soma(5, 0), "Qualquer número somado a 0 deve ser ele mesmo");
    }

    @Test
    @DisplayName("Soma resultando em zero")
    void deveSomarEOResultadoSerZero() {
        assertEquals(0, calculadora.soma(-5, 5), "Soma de opostos deve ser zero");
    }

    @Test
    @DisplayName("Soma de números ímpares resultando em par")
    void somaDeImparesDeveSerPar() {
        int resultado = calculadora.soma(3, 7);
        assertEquals(0, resultado % 2, "A soma de dois ímpares deve ser par");
    }
}