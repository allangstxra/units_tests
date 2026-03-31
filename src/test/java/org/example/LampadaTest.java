package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LampadaTest {

    Lampada lampada;

    @BeforeEach
    void setup() {
        lampada = new Lampada();
    }

    @Test
    @DisplayName("Deve iniciar desligada")
    void deveIniciarDesligada() {
        assertFalse(lampada.isOn(), "A lâmpada deve começar desligada");
    }

    @Test
    @DisplayName("Deve ligar a lâmpada")
    void deveLigarLampada() {
        lampada.turnOn();
        assertTrue(lampada.isOn(), "A lâmpada deve estar ligada após chamar turnOn()");
    }

    @Test
    @DisplayName("Deve desligar a lâmpada")
    void deveDesligarLampada() {
        lampada.turnOn();
        lampada.turnOff();
        assertFalse(lampada.isOn(), "A lâmpada deve estar desligada após chamar turnOff()");
    }
}