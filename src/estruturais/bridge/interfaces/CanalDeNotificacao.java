package estruturais.bridge.interfaces;

import estruturais.bridge.model.Sim;

public interface CanalDeNotificacao {
    void notificar(Sim sim, String necessidade);
}
