package estruturais.bridge.abstraction;

import estruturais.bridge.interfaces.CanalDeNotificacao;
import estruturais.bridge.model.Sim;

public abstract class ObjetoDaCasa {

    protected CanalDeNotificacao canal;

    public ObjetoDaCasa(CanalDeNotificacao canal) {
        this.canal = canal;
    }

    public void trocarCanal(CanalDeNotificacao novoCanal) {
        this.canal = novoCanal;
    }

    public abstract void verificar(Sim sim);
}
