package ada.tech;

public interface CalculadoraDeSalario<T extends Funcionario> {

    Double calcularSalarioDoDia(T funcionario);

}
