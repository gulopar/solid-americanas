package ada.tech.isp.pagamento;

import java.util.Collections;
import java.util.List;

public class SeletorDeFormaDePagamentoImpl implements SeletorDeFormaDePagamento {

    public FormaDePagamento selecionarMeioDePagamento(List<FormaDePagamento> pagamentos) {
        Collections.shuffle(pagamentos);
        return pagamentos.get(0);
    }


}
