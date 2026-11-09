package estruturais.bridge;

import estruturais.bridge.model.Geladeira;
import estruturais.bridge.model.Sim;
import estruturais.bridge.servoces.AlertaTela;
import estruturais.bridge.servoces.BalaoPensamento;
import estruturais.bridge.servoces.BarraStatus;
import estruturais.bridge.servoces.Celular;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim();

        Geladeira geladeira = new Geladeira(new Celular());
        geladeira.verificar(sim);

        geladeira.trocarCanal(new BarraStatus());
        geladeira.verificar(sim);
    }
}
