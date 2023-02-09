package ada.tech.liskov;

public class GeradorDeNumerosAleatoriosPositivoGrandes extends GeradorDeNumerosAleatoriosPositivo {

    // Não respeita
    // Devolve um numero entre 1 e 100
    public Double generate() {
        return Math.random() * 100;
    }

}
