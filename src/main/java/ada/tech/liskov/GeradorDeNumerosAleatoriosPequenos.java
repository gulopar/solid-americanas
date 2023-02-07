package ada.tech.liskov;

public class GeradorDeNumerosAleatoriosPequenos extends GeradorDeNumerosAleatorios {


    // Devolve um numero entre 1 e 5
    public Double generate() {
        return Math.random() * 5;
    }

}
