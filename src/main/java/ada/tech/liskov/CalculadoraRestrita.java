package ada.tech.liskov;

public class CalculadoraRestrita extends CalculadoraSimples {


    // pré condições, são as validações aplicadas sobre os parametros
    public Double multiplicar(Double n1, Double n2){

        // esta restringindo mais do que o pai -> fere o principio da substituiçã de LISKOV
        if (n1 < 5 || n2 < 5) {
            throw new RuntimeException("Não calculamos numeros menores do que 5");
        }

        if (n1 > 100 || n2 > 100) {
            throw new RuntimeException("Só calculo até 100");
        }

        return n1 * n2;

    }

}
