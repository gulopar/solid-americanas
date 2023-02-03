package ada.tech;

import ada.tech.model.funcionario.Funcionario;
import ada.tech.model.funcionario.FuncionarioCLT;
import ada.tech.model.funcionario.FuncionarioPJ;
import ada.tech.services.CalculadoraDeSalario;
import ada.tech.services.CalculadoraDeSalarioPF;
import ada.tech.services.CalculadoraDeSalarioPJ;

public class TestaCalculadora {


    public static void main(String[] args) {


        FuncionarioPJ funcionarioPJ = new FuncionarioPJ();
        funcionarioPJ.setHorasNormais(10);
        funcionarioPJ.setValorHora(100.00);

        FuncionarioCLT funcionarioCLT = new FuncionarioCLT();
        funcionarioCLT.setHorasNormais(8);
        funcionarioCLT.setHorasExtras(2);
        funcionarioCLT.setValorHora(50.00);


        System.out.println(calcularSalario(new CalculadoraDeSalarioPJ(), funcionarioPJ));
        System.out.println(calcularSalario(new CalculadoraDeSalarioPF(), funcionarioCLT));


    }

    public static Double calcularSalario(CalculadoraDeSalario calculadoraDeSalario, Funcionario funcionario) {
        return calculadoraDeSalario.calcularSalarioDoDia(funcionario);
    }

}
