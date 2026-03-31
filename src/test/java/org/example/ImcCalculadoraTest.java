package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImcCalculadoraTest {

    private final ImcCalculadora calculadora = new ImcCalculadora();

    @Test
    @DisplayName("Deve calcular o IMC corretamente")
    void deveCalcularImcCorretamente() {
        double resultado = calculadora.calcular(80.0, 1.80);
        assertEquals(24.69, resultado, 0.01);
    }

    @Test
    @DisplayName("Deve retornar 0 se a altura for inválida")
    void deveRetornarZeroSeAlturaInvalida() {
        assertEquals(0, calculadora.calcular(70.0, 0));
    }

    @Test
    @DisplayName("Deve classificar como Peso Normal")
    void deveClassificarComoPesoNormal() {
        String label = calculadora.classificacao(22.0);
        assertEquals("Peso normal", label);
    }

    @Test
    @DisplayName("Deve classificar como Obesidade")
    void deveClassificarComoObesidade() {
        String label = calculadora.classificacao(35.0);
        assertEquals("Obesidade", label);
    }

    @Test
    @DisplayName("Deve classificar como Abaixo do peso")
    void deveClassificarComoAbaixoDoPeso() {
        assertEquals("Abaixo do peso", calculadora.classificacao(17.0));
    }
}