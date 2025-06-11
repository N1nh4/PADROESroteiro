package roteiro8.parte3;

import dominio.SistemaContabil;

public class SistemaContabilAdapterIBM implements ISistemaContabilAdapter {
    private SistemaContabil sistemaContabil;
    public SistemaContabilAdapterIBM() {
        this.sistemaContabil = new SistemaContabil("IBM");
    }

    @Override
    public void finalizarVenda() {
        this.sistemaContabil.registrarVenda();
    }

    @Override
    public void registrarImposto() {
        this.sistemaContabil.calcularImposto();
    }
}
