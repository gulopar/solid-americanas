package ada.tech.liskov;

public class TestaGeradorDeNumerosAleatorios {


    public static void main(String[] args) {

        // pre condicao = entrada
        // pos condicao = saida

        GeradorDeNumerosAleatorios geradorDeNumerosAleatorios = new GeradorDeNumerosAleatoriosNegativos();
        Double randomNumber = geradorDeNumerosAleatorios.generate();

        if (randomNumber < 5) {
            System.out.println("Sem sorte hoje -> " + randomNumber);
        } else if (randomNumber < 8) {
            System.out.println("Voce esta com sorte -> " + randomNumber);
        } else if (randomNumber <= 10) {
            System.out.println("Uau que sorte -> " + randomNumber);
        }

        System.out.println("");

    }

}
