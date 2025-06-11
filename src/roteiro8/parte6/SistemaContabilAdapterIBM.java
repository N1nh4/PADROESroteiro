package roteiro8.parte6;

import dominio.SistemaContabil;

public class SistemaContabilAdapterIBM extends SistemaContabilAdapter {

    public SistemaContabilAdapterIBM() {
        this.sistemaContabil = new SistemaContabil("IBM");
    }
}
