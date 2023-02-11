package ada.tech.isp.pagamento;

import ada.tech.utils.ReflectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GerenciadorDeFormasDePagamentoImpl implements GerenciadoDeFormasDePagamento {

    private final List<FormaDePagamento> formasDePagamento;

    public GerenciadorDeFormasDePagamentoImpl() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Set<Class<? extends FormaDePagamento>> subtypesOf = ReflectionUtils.getSubtypesOf(FormaDePagamento.class);

        List<FormaDePagamento> formasDePagamento = new ArrayList<>();

        for (Class<? extends FormaDePagamento> clazz : subtypesOf) {

            FormaDePagamento formaDePagamento = clazz.getDeclaredConstructor().newInstance();
            formasDePagamento.add(formaDePagamento);

        }


        this.formasDePagamento = formasDePagamento;
    }

    public List<FormaDePagamento> getFormasDePagamento() {
        return new ArrayList<>(formasDePagamento);
    }

}
