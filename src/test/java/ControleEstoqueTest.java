import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleEstoqueTest {

    Loja loja;

    @BeforeEach
    void setUp() {
        loja = new Loja(
                new Produto("Geladeira Inox", 3500.99f, true),
                new Produto("Fogão 4 Bocas", 2800.90f, false),
                new Produto("Armário de Cozinha", 998.50f, true),
                new Produto("Cama King de Casal", 3300.30f, true),
                new Produto("Mesa com 6 cadeira", 1999.00f, false)
        );
    }

    @Test
    void deveRetornarQuantidadeProdutosDisponiveis() {
        assertEquals(3, ControleEstoque.quantidadeProdutosDisponiveis(loja));
    }

    @Test
    void deveRetornarQuantidadeProdutosIndisponiveis() {
        assertEquals(2, ControleEstoque.quantidadeProdutosIndisponiveis(loja));
    }

    @Test
    void deveRetornarQuantidadeTotalProdutos() {
        assertEquals(5, ControleEstoque.quantidadeTotalProdutos(loja));
    }
}