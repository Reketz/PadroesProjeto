package estruturais.decorator;

import estruturais.decorator.interfaces.Veiculo;
import estruturais.decorator.model.Carro;
import estruturais.decorator.upgrades.Blindagem;
import estruturais.decorator.upgrades.Limitador;
import estruturais.decorator.upgrades.Turbo;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro();
        carro = new Turbo(carro);
        carro = new Turbo(carro);
        carro = new Blindagem(carro);

        carro = new Limitador(carro);
        System.out.println(carro.velocidade());
        System.out.println(carro.preco());


    }
}
