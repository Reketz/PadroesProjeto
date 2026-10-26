import factory.*;

public class Main {
    public static void main(String[] args) {
        Transporte transporte = new FactoryCaminhao().create();
        transporte.executar();
    }
}
