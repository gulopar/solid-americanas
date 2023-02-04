package ada.tech.calculadoradeprecos.service;

import ada.tech.calculadoradeprecos.model.Produto;

public class CalculadoraDeFreteCorreios implements CalculadoraDeFrete{

    public Double calcular(Produto produto, Double km) {
        return produto.getPeso() * km * 0.5;
    }

}
