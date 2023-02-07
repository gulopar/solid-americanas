package ada.tech.liskov;

public class TestaCalculadora {

    public static void main(String[] args) {

        CalculadoraSimples calculadora = new CalculadoraRestrita();



        System.out.println(calculadora.multiplicar(3.00, 5.00));

    }


}
