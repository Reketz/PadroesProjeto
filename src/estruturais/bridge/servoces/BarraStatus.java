package estruturais.bridge.servoces;

import estruturais.bridge.interfaces.CanalDeNotificacao;
import estruturais.bridge.model.Sim;

public class BarraStatus implements CanalDeNotificacao {
    @Override
    public void notificar(Sim sim, String necessidade) {
        sim.atualizarBarra(necessidade);
    }
}
