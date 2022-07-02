import java.util.Iterator;

public class ControleEstoque {

    public static Integer quantidadeProdutosDisponiveis(Loja loja) {
        int contador = 0;

        for (Produto produto : loja)
            if (produto.isDisponivel()) contador++;

        return contador;
    }

    public static Integer quantidadeProdutosIndisponiveis(Loja loja) {
        int contador = 0;

        for (Produto produto : loja)
            if (!produto.isDisponivel()) contador++;

        return contador;
    }

    public static Integer quantidadeTotalProdutos(Loja loja) {
        int contador = 0;

        for (Iterator produto = loja.iterator(); produto.hasNext(); ) {
            contador++;
            produto.next();
        }
        return contador;
    }
}
