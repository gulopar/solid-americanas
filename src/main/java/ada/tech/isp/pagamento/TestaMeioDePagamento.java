package ada.tech.isp.pagamento;


import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class TestaMeioDePagamento {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ExibidorDeFormaDePagamentosImpl exibidorDeFormaDePagamentos = new ExibidorDeFormaDePagamentosImpl();
        SeletorDeFormaDePagamentoImpl seletorDeFormaDePagamento = new SeletorDeFormaDePagamentoImpl();

        GerenciadoDeFormasDePagamento gerenciadorDeFormasDePagamento = new GerenciadorDeFormasDePagamentoImpl();

        GatewayDePagamento gatewayDePagamento = new SistemaDePagamentos(seletorDeFormaDePagamento, gerenciadorDeFormasDePagamento);

        gatewayDePagamento.pagar();

        System.out.println();

        exibidorDeFormaDePagamentos.exibirMeiosDePagamento(gerenciadorDeFormasDePagamento.getFormasDePagamento());

    }


}
