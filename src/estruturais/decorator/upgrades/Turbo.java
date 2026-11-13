package estruturais.decorator.upgrades;

import estruturais.decorator.abstracts.UpgradeDecorator;
import estruturais.decorator.interfaces.Veiculo;

public class Turbo extends UpgradeDecorator {
    public Turbo(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public int velocidade() {
        return super.velocidade() + 120;
    }
}
