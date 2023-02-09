package ada.tech.isp.pagamento;

import java.util.ArrayList;
import java.util.List;

public class SistemaDePagamentos implements GatewayDePagamento {
    private final SeletorDeFormaDePagamento seletorDeFormaDePagamento;
    private final GerenciadoDeFormasDePagamento gerenciadoDeFormasDePagamento;

    public SistemaDePagamentos(SeletorDeFormaDePagamento seletorDeFormaDePagamento, GerenciadoDeFormasDePagamento gerenciadoDeFormasDePagamento) {
        this.seletorDeFormaDePagamento = seletorDeFormaDePagamento;
        this.gerenciadoDeFormasDePagamento = gerenciadoDeFormasDePagamento;
    }

    public void pagar() {
        List<FormaDePagamento> formasDePagamento = gerenciadoDeFormasDePagamento.getFormasDePagamento();
        FormaDePagamento formaDePagamento = seletorDeFormaDePagamento.selecionarMeioDePagamento(formasDePagamento);
        formaDePagamento.pagar();
    }

}
