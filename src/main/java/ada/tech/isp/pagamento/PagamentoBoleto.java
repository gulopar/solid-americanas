package ada.tech.isp.pagamento;

public class PagamentoBoleto implements FormaDePagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando via Boleto");
    }
}
