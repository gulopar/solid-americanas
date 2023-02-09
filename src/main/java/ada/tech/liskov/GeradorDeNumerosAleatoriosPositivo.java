package ada.tech.liskov;

public class GeradorDeNumerosAleatoriosPositivo {


    // Devolve um numero entre 1 e 10
    public Double generate() {
        return Math.random() * 10;
    }

}
