package estruturais.bridge.servoces;

import estruturais.bridge.interfaces.CanalDeNotificacao;
import estruturais.bridge.model.Sim;

public class Celular implements CanalDeNotificacao {
    @Override
    public void notificar(Sim sim, String necessidade) {
        System.out.println("CELULAR APITANDO....");
    }
}
