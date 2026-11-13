package estruturais.decorator.abstracts;

import estruturais.decorator.interfaces.Veiculo;

public abstract class UpgradeDecorator implements Veiculo {

    private final Veiculo veiculo;

    public UpgradeDecorator(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String descricao() {
        return veiculo.descricao();
    }

    @Override
    public int velocidade() {
        return veiculo.velocidade();
    }

    @Override
    public double preco() {
        return veiculo.preco();
    }
}
