package ada.tech.liskov;

public class CalculadoraRobusta extends CalculadoraSimples {


    // pré condições, são as validações aplicadas sobre os parametros
    public Double multiplicar(Double n1, Double n2){

        if (n1 < 0 || n2 < 0) {
            throw new RuntimeException("Não calculamos numero negativo");
        }

        if (n1 > 100 || n2 > 100) {
            throw new RuntimeException("Só calculo até 100");
        }

        return n1 * n2;

    }

}
