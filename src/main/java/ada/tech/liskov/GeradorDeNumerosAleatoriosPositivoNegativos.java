package ada.tech.liskov;

public class GeradorDeNumerosAleatoriosPositivoNegativos extends GeradorDeNumerosAleatoriosPositivo {


    // Não respeita
    // Devolve um numero negativo entre 0
    public Double generate() {
        return Math.random() * (-10);
    }

}
