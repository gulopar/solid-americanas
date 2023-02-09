package ada.tech.isp.pagamento;

public class PagamentoCartaoDeDebito implements FormaDePagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando via Cartão de Débito");
    }
}
