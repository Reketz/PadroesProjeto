package estruturais.bridge.model;

public class Sim {
    public void mostrarBalao(String necessidade) {
        System.out.println("Balão de " + necessidade);
    }

    public void mostrarAviso(String necessidade) {
        System.out.println("Popup de aviso: " + necessidade);
    }

    public void atualizarBarra(String necessidade) {
        System.out.println("Atualizar barra: " + necessidade);
    }
}
