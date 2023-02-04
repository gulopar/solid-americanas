package ada.tech.calculadoradeprecos.service;

import ada.tech.calculadoradeprecos.model.Produto;

public interface CalculadoraDeFrete {

    Double calcular(Produto produto, Double km);

}
