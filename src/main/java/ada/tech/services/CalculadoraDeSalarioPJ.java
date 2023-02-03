package ada.tech.services;


// ADERENTE AO S DO SOLID - SINGLE RESPONSABILITY
public class CalculadoraDeSalarioPJ implements ada.tech.services.CalculadoraDeSalario<ada.tech.model.funcionario.FuncionarioPJ> {

    private final ada.tech.services.CalculadoraDeImpostoPJ calculadoraDeImposto = new CalculadoraDeImpostoPJ();

    public Double calcularSalarioDoDia(ada.tech.model.funcionario.FuncionarioPJ funcionarioPJ) {
        Double salarioBruto = funcionarioPJ.getHorasNormais() * funcionarioPJ.getValorHora();
        return salarioBruto - calculadoraDeImposto.calcularImpostoTotal(salarioBruto);
    }

}
