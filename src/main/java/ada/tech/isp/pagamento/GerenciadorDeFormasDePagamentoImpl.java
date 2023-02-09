package ada.tech.isp.pagamento;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeFormasDePagamentoImpl implements GerenciadoDeFormasDePagamento {

    private final List<FormaDePagamento> formasDePagamento;

    public GerenciadorDeFormasDePagamentoImpl(List<FormaDePagamento> formasDePagamento) {
        this.formasDePagamento = formasDePagamento;
    }

    public List<FormaDePagamento> getFormasDePagamento() {
        return new ArrayList<>(formasDePagamento);
    }

}
