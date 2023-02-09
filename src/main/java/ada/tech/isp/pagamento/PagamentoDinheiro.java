package ada.tech.isp.pagamento;

public class PagamentoDinheiro implements FormaDePagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando via Dinheiro");
    }

}
