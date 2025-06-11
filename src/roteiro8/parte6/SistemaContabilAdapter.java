package roteiro8.parte6;

import dominio.SistemaContabil;

public abstract class SistemaContabilAdapter {
    protected SistemaContabil sistemaContabil;

    public void finalizarVenda() {
        this.sistemaContabil.registrarVenda();
    }

    public void registrarImposto() {
        this.sistemaContabil.calcularImposto();
    }
}
