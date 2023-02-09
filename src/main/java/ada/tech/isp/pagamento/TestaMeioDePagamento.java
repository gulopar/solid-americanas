package ada.tech.isp.pagamento;


import java.util.Arrays;

public class TestaMeioDePagamento {

    public static void main(String[] args) {

        ExibidorDeFormaDePagamentosImpl exibidorDeFormaDePagamentos = new ExibidorDeFormaDePagamentosImpl();
        SeletorDeFormaDePagamentoImpl seletorDeFormaDePagamento = new SeletorDeFormaDePagamentoImpl();


        GerenciadoDeFormasDePagamento gerenciadorQrCode = new GerenciadorDeFormasDePagamentoImpl(Arrays.asList(new PagamentoQrCode(), new PagamentoDinheiro()));
        GerenciadoDeFormasDePagamento gerenciadorCartoes = new GerenciadorDeFormasDePagamentoImpl(Arrays.asList(new PagamentoCartaoDeCredito(), new PagamentoCartaoDeDebito()));

        GatewayDePagamento gatewayDePagamento = new SistemaDePagamentos(seletorDeFormaDePagamento, gerenciadorCartoes);

        gatewayDePagamento.pagar();

        System.out.println();

        exibidorDeFormaDePagamentos.exibirMeiosDePagamento(gerenciadorQrCode.getFormasDePagamento());

    }


}
