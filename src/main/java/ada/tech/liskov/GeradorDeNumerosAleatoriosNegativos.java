package ada.tech.liskov;

public class GeradorDeNumerosAleatoriosNegativos extends GeradorDeNumerosAleatorios {


    // Devolve um numero negativo entre 0
    public Double generate() {
        return Math.random() * (-10);
    }

}
