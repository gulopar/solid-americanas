package ada.tech;


// ADERENTE AO S DO SOLID - SINGLE RESPONSABILITY
public class CalculadoraDeSalarioPJ implements CalculadoraDeSalario<FuncionarioPJ> {

    private final CalculadoraDeImpostoPJ calculadoraDeImposto = new CalculadoraDeImpostoPJ();

    public Double calcularSalarioDoDia(FuncionarioPJ funcionarioPJ) {
        Double salarioBruto = funcionarioPJ.getHorasNormais() * funcionarioPJ.getValorHora();
        return salarioBruto - calculadoraDeImposto.calcularImpostoTotal(salarioBruto);
    }

}
