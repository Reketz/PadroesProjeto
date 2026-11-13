package estruturais.decorator.upgrades;

import estruturais.decorator.abstracts.UpgradeDecorator;
import estruturais.decorator.interfaces.Veiculo;

public class Limitador extends UpgradeDecorator {

    public Limitador(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public int velocidade() {
        if(super.velocidade() > 200) {
            return 200;
        }
        return super.velocidade();
    }
}
