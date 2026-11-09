package estruturais.bridge.model;

import estruturais.bridge.abstraction.ObjetoDaCasa;
import estruturais.bridge.interfaces.CanalDeNotificacao;

public class Geladeira extends ObjetoDaCasa {

    public Geladeira(CanalDeNotificacao canal) {
        super(canal);
    }

    @Override
    public void verificar(Sim sim) {
        canal.notificar(sim, "FOME");
    }
}
