package ada.tech.isp.pagamento;

public class PagamentoCartaoDeCredito implements FormaDePagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando via Cartão de Crédito");
    }
}
