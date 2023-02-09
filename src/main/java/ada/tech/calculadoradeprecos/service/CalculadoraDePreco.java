package ada.tech.calculadoradeprecos.service;

import ada.tech.calculadoradeprecos.model.Produto;

public class CalculadoraDePreco {

    private final CalculadoraDeFrete calculadoraDeFrete;
    private final CalculadoraDeDesconto calculadoraDeDesconto;

    public CalculadoraDePreco(CalculadoraDeFrete calculadoraDeFrete, CalculadoraDeDesconto calculadoraDeDesconto) {
        this.calculadoraDeFrete = calculadoraDeFrete;
        this.calculadoraDeDesconto = calculadoraDeDesconto;
    }

    public Double calcular(Produto produto, Double km) throws MuitoLongeException {
        Double frete = calculadoraDeFrete.calcular(produto, km);
        Double desconto = calculadoraDeDesconto.calcular(produto);
        return produto.getPreco() + frete - desconto;
    }

}
