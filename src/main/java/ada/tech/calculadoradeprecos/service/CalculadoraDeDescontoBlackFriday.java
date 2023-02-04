package ada.tech.calculadoradeprecos.service;

import ada.tech.calculadoradeprecos.model.Produto;

public class CalculadoraDeDescontoBlackFriday implements CalculadoraDeDesconto{

    @Override
    public Double calcular(Produto produto) {
        return produto.getPreco() * 0.8;
    }


}
