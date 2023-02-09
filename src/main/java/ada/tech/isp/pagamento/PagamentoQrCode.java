package ada.tech.isp.pagamento;

public class PagamentoQrCode implements FormaDePagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando via QR Code");
    }

}
