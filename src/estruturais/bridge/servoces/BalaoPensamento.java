package estruturais.bridge.servoces;

import estruturais.bridge.interfaces.CanalDeNotificacao;
import estruturais.bridge.model.Sim;

public class BalaoPensamento implements CanalDeNotificacao {
    @Override
    public void notificar(Sim sim, String necessidade) {
        sim.mostrarBalao(necessidade);
    }
}
