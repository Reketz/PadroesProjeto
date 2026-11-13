package estruturais.decorator.upgrades;

import estruturais.decorator.abstracts.UpgradeDecorator;
import estruturais.decorator.interfaces.Veiculo;

public class Blindagem extends UpgradeDecorator {
    public Blindagem(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public int velocidade() {
        return super.velocidade() - 50;
    }

    @Override
    public double preco() {
        return super.preco() + 10000;
    }
}
