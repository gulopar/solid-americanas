package ada.tech.isp.pagamento;

import java.util.List;

public class ExibidorDeFormaDePagamentosImpl {

    public void exibirMeiosDePagamento(List<FormaDePagamento> pagamentos) {
        for (FormaDePagamento pagamento : pagamentos) {
            System.out.println(pagamento.getClass().getSimpleName());
        }
    }

}
