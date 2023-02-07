package ada.tech.liskov;

public class GeradorDeNumerosAleatoriosGrandes extends GeradorDeNumerosAleatorios {


    // Devolve um numero entre 1 e 100
    public Double generate() {
        return Math.random() * 100;
    }

}
