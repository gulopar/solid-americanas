package ada.tech.isp.zoologico;

public class Papagaio implements SabeAndar, SabeVoar {



    @Override
    public void andar() {
        System.out.println("Papagaio andando");
    }

    @Override
    public void voar() {
        System.out.println("Papagaio voando");
    }

}
