package ada.tech.calculadoradeprecos.service;

import ada.tech.calculadoradeprecos.model.Produto;

public class CalculadoraDeFreteTransportadora implements CalculadoraDeFrete{

    public Double calcular(Produto produto, Double km) {
        double precoKm = 0.6;
        if (km >= 100.00) {
            precoKm = 0.3;
        }
        return produto.getPeso() * km * precoKm;
    }

}
