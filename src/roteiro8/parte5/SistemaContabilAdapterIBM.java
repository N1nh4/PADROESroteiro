package roteiro8.parte5;

import dominio.SistemaContabil;

public class SistemaContabilAdapterIBM extends SistemaContabilAdapter {

    public SistemaContabilAdapterIBM() {
        this.sistemaContabil = new SistemaContabil("IBM");
    }
}
