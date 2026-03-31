package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudanteTest {

    @Test
    @DisplayName("Deve aprovar aluno com nota maior que 6")
    void estudanteAprovado() {
        Estudante estudante = new Estudante();
        estudante.nota = 7.5;
        assertTrue(estudante.isApproved(), "7.5 deve ser aprovado");
        ;
    }


    @Test
    @DisplayName("Deve reprovar aluno com nota menor que 6")
    void estudanteReprovado() {
        Estudante estudante = new Estudante();
        estudante.nota = 5.9;
        assertFalse(estudante.isApproved(), "5.9 deve ser reprovado");
    }

    @Test
    @DisplayName("Não deve aprovar aluno com nota igual a 6")
    void estudanteNotaLimite() {
        Estudante estudante = new Estudante();
        estudante.nota = 6.0;
        assertFalse(estudante.isApproved(), "6.0 não deve ser aprovado");
    }
}