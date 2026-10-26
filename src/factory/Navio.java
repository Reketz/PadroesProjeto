package factory;

public class Navio implements Transporte {
    @Override
    public void executar() {
        System.out.println("Executando transporte navio...");
    }
}
