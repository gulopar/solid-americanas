package ada.tech.services;

import ada.tech.model.funcionario.Funcionario;

public interface CalculadoraDeSalario<T extends Funcionario> {

    Double calcularSalarioDoDia(T funcionario);

}
