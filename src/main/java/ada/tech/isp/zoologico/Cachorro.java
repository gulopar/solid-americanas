package ada.tech.isp.zoologico;

public class Cachorro implements SabeAndar, SabeNadar {

    @Override
    public void nadar() {
        System.out.println("Cachorro nadando");
    }

    @Override
    public void andar() {
        System.out.println("Cachorro andando");
    }

}
