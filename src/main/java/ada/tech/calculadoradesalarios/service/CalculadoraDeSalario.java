package ada.tech.calculadoradesalarios.service;


import ada.tech.calculadoradesalarios.model.funcionario.Funcionario;

public interface CalculadoraDeSalario<T extends Funcionario> {

    Double calcularSalarioDoDia(T funcionario);

}
