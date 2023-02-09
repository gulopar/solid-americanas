package ada.tech.isp.zoologico;

public class Ornitorrinco implements SabeVoar, SabeNadar, SabeAndar {

    @Override
    public void nadar() {
        System.out.println("Ornitorrinco nadando");
    }

    @Override
    public void andar() {
        System.out.println("Ornitorrinco andando");
    }

    @Override
    public void voar() {
        System.out.println("Ornitorrinco voando");
    }
}
