package ada.tech.calculadoradeprecos.service;

import ada.tech.calculadoradeprecos.model.Produto;

public class CalculadoraDeDescontoNatal implements CalculadoraDeDesconto {

    public Double calcular(Produto produto) {
        Double preco = produto.getPreco();
        return preco * 0.25;
    }

}
