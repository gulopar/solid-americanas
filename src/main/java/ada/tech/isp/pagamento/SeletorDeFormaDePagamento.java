package ada.tech.isp.pagamento;

import java.util.List;

public interface SeletorDeFormaDePagamento {

    FormaDePagamento selecionarMeioDePagamento(List<FormaDePagamento> pagamentos);

}
