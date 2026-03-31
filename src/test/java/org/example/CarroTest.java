package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarroTest {

    Carro carro;

    @BeforeEach
    void setup() {
        carro = new Carro();
    }

    @Test
    @DisplayName("Validar todos os dados do carro")
    void deveValidarTodosOsDadosDoCarro() {
        carro.modelo = "Peugeot 208";
        carro.placa = "HB505";
        carro.ano = 2026;
        assertEquals("Peugeot 208", carro.modelo);
        assertEquals("HB505", carro.placa);
        assertEquals(2026, carro.ano);
    }

    @Test
    @DisplayName("Validar modelo do carro")
    void deveValidarModeloDoCarro() {
        carro.modelo = "Peugeot 208";
        assertEquals("Peugeot 208", carro.modelo);
    }

    @Test
    @DisplayName("Validar placa do carro")
    void deveValidarPlacaDoCarro() {
        carro.placa = "HB505";
        assertEquals("HB505", carro.placa);
    }

    @Test
    @DisplayName("Validar ano do carro")
    void deveValidarAnoDoCarro() {
        carro.ano = 2026;
        assertEquals(2026, carro.ano);
    }
}