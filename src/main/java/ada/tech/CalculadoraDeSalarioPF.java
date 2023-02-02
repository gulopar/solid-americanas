package ada.tech;

public class CalculadoraDeSalarioPF implements CalculadoraDeSalario<FuncionarioCLT> {
    private final CalculadoraDeImpostoPF calculadoraDeImposto = new CalculadoraDeImpostoPF();

    public Double calcularSalarioDoDia(FuncionarioCLT funcionarioCLT) {

        Double valorHoraExtra = 0.0;
        Double valorHorasNormais = 0.0;

        int totalDeHoras = funcionarioCLT.getHorasNormais() + funcionarioCLT.getHorasExtras();

        if (totalDeHoras > 8) {
            valorHoraExtra = calcularHoraExtra(funcionarioCLT.getValorHora(), totalDeHoras, funcionarioCLT.percentualHoraExtra());
        } else {
            valorHorasNormais = funcionarioCLT.getHorasNormais() * funcionarioCLT.getValorHora();
        }

        Double salarioBruto =  valorHorasNormais + valorHoraExtra;
        return salarioBruto - calculadoraDeImposto.calcularImpostoTotal(salarioBruto);

    }

    public Double calcularHoraExtra(Double valorHora, Integer horasTrabalhadas, Double percentualHoraExtra) {
        int quantidadeDeHorasExtras = horasTrabalhadas - 8;
        if (quantidadeDeHorasExtras > 0) {
            return ((valorHora * percentualHoraExtra) + valorHora) * quantidadeDeHorasExtras;
        }
        return 0.0;
    }


}
