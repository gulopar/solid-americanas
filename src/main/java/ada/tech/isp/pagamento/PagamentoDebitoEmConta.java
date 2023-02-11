package ada.tech.isp.pagamento;

public class PagamentoDebitoEmConta implements FormaDePagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando via Boleto");
    }
}
