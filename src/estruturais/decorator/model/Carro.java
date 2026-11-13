package estruturais.decorator.model;

import estruturais.decorator.interfaces.Veiculo;

public class Carro implements Veiculo {
    @Override
    public String descricao() {
        return "Carro esportivo";
    }

    @Override
    public int velocidade() {
        return 180;
    }

    @Override
    public double preco() {
        return 80000;
    }
}
