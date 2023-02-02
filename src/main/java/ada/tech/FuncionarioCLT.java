package ada.tech;

public class FuncionarioCLT extends Funcionario {

    private Integer horasExtras;

    public Integer getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Integer horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Double percentualHoraExtra() {
        return 0.3;
    }

}
