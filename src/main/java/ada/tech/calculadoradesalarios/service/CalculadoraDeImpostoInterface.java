package ada.tech.calculadoradesalarios.service;

public interface CalculadoraDeImpostoInterface {

    Double calcularINSS(Double valor);
    Double calcularISS(Double valor);
    Double calcularImpostoDeRenda(Double valor);
    Double calcularImpostoTotal(Double valor);

}
