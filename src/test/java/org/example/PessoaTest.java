package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setup() {
        pessoa = new Pessoa();
    }

    @Test
    @DisplayName("Deve validar todos os dados da pessoa")
    void deveValidarTodosOsDadosDaPessoa() {
        pessoa.nome = "Allan Teixeira";
        pessoa.endereco = "Otávio Carneiro, 18";
        pessoa.cpf = "123.456.789-00";
        pessoa.dataNascimento = LocalDate.of(2026, 3, 31);

        assertEquals("Allan Teixeira", pessoa.nome);
        assertEquals("Otávio Carneiro, 18", pessoa.endereco);
        assertEquals("123.456.789-00", pessoa.cpf);
        assertEquals(LocalDate.of(2026, 3, 31), pessoa.dataNascimento);
    }

    @Test
    @DisplayName("Deve validar nome da pessoa")
    void deveValidarNomeDaPessoa() {
        pessoa.nome = "Caroline Costa";
        assertEquals("Caroline Costa", pessoa.nome);
    }

    @Test
    @DisplayName("Deve validar endereço da pessoa")
    void deveValidarEnderecoDaPessoa() {
        pessoa.endereco = "Dias Ferreira, 456";
        assertEquals("Dias Ferreira, 456", pessoa.endereco);
    }

    @Test
    @DisplayName("Deve validar CPF da pessoa")
    void deveValidarCpfDaPessoa() {
        pessoa.cpf = "987.654.321-00";
        assertEquals("987.654.321-00", pessoa.cpf);
    }

    @Test
    @DisplayName("Deve validar data de nascimento da pessoa")
    void deveValidarDataNascimentoDaPessoa() {
        LocalDate data = LocalDate.of(1985, 12, 15);
        pessoa.dataNascimento = data;
        assertEquals(data, pessoa.dataNascimento);
    }
}