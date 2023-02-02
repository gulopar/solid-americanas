package ada.tech;

public class CalculadoraDeImpostoPJ implements CalculadoraDeImpostoInterface{

    @Override
    public Double calcularINSS(Double valor) {
        return valor * 0.1;
    }

    @Override
    public Double calcularISS(Double valor) {
        return valor * 0.05;
    }

    @Override
    public Double calcularImpostoDeRenda(Double valor) {
        return valor * 0.2;
    }

    @Override
    public Double calcularImpostoTotal(Double valor) {
        return calcularINSS(valor) + calcularImpostoDeRenda(valor) + calcularISS(valor);
    }

}