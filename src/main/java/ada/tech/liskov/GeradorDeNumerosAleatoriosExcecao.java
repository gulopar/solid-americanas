package ada.tech.liskov;

public class GeradorDeNumerosAleatoriosExcecao {


    // pre condição -> pode afrouxar; se aceita 1 a 10... pode aceitar - infinto a mais infinito
    // porem não pode aceitar menos que isso (ENTRADA)

    // Devolve um numero entre 1 e 10
    public Double generate() {
        return Math.random() * 10;
    }

}
