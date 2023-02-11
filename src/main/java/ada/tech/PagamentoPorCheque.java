package ada.tech;

import ada.tech.isp.pagamento.FormaDePagamento;

public class PagamentoPorCheque implements FormaDePagamento  {
    @Override
    public void pagar() {
        System.out.println("Pagando por cheque");
    }
}
