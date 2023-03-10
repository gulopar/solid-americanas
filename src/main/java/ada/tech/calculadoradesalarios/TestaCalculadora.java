package ada.tech.calculadoradesalarios;

import ada.tech.calculadoradesalarios.model.funcionario.Funcionario;
import ada.tech.calculadoradesalarios.model.funcionario.FuncionarioCLT;
import ada.tech.calculadoradesalarios.model.funcionario.FuncionarioPJ;
import ada.tech.calculadoradesalarios.service.CalculadoraDeSalario;
import ada.tech.calculadoradesalarios.service.CalculadoraDeSalarioPF;
import ada.tech.calculadoradesalarios.service.CalculadoraDeSalarioPJ;
import ada.tech.utils.ReflectionUtils;

import java.util.Set;

public class TestaCalculadora {

    public static void main(String[] args) {

        Set<Class<? extends Funcionario>> subtypesOf = ReflectionUtils.getSubtypesOf(Funcionario.class);

        for (Class<? extends Funcionario> clazz : subtypesOf) {
            System.out.println(clazz);
        }

    }

    public static void main2(String[] args) {


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
