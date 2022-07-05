package desafios.lambda;

import java.text.DecimalFormat;
import java.util.function.*;

public class ProdutoAVenda {
    private boolean temImpostoMunicipal(Double preco) {
        return preco >= 2500;
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public String getPrecoFinalFormatado() {
        return precoFinalFormatado;
    }

    private String precoFinalFormatado;

    public ProdutoAVenda(Produto produto) {
        this.precoFinalFormatado = getPrecoComDesconto
                .andThen(addImpostoMunicipal)
                .andThen(addFrete)
                .andThen(arredondaPreco)
                .andThen(formataSaida)
                .apply(produto);
    }

    private final Function<Produto, Double> getPrecoComDesconto =
        produto -> produto.getValue() * (1 - produto.getDesconto());

    private final Function<Double, Double> addImpostoMunicipal =
            preco -> temImpostoMunicipal(preco)
                ? preco * (1 + 0.085) : preco;

    private final Function<Double, Double> addFrete =
            preco -> (preco >= 3000) ?(preco + 100) :(preco + 50);

    private final Function<Double,String> arredondaPreco = df::format;

    private final UnaryOperator<String> formataSaida =
            precoStr -> "R$" + precoStr.replace(".",",");
}