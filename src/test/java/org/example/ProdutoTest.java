package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    Produto produto;

    @BeforeEach
    void setup() {
        produto = new Produto("Camiseta", 100.0, 10);
    }

    @Test
    @DisplayName("Deve aplicar desconto corretamente")
    void deveAplicarDescontoCorretamente() {
        produto.aplicaDesconto(10);
        assertEquals(90.0, produto.getPreco(), 0.01);
    }

    @Test
    @DisplayName("Não deve aplicar desconto inválido")
    void naoDeveAplicarDescontoInvalido() {
        produto.aplicaDesconto(0);
        assertEquals(100.0, produto.getPreco(), 0.01);

        produto.aplicaDesconto(-5);
        assertEquals(100.0, produto.getPreco(), 0.01);

        produto.aplicaDesconto(150);
        assertEquals(100.0, produto.getPreco(), 0.01);
    }

    @Test
    @DisplayName("Deve indicar que não precisa de reposição")
    void deveIndicarQueNaoPrecisaReposicao() {
        assertFalse(produto.precisaReposicao());
    }

    @Test
    @DisplayName("Deve indicar que precisa de reposição")
    void deveIndicarQuePrecisaReposicao() {
        Produto p = new Produto("Caneta", 2.0, 3);
        assertTrue(p.precisaReposicao());
    }

    @Test
    @DisplayName("Deve retornar quantidade correta")
    void deveRetornarQuantidadeCorreta() {
        assertEquals(10, produto.getQuantidade());
    }
}