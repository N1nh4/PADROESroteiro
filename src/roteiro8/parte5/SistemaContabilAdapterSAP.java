package roteiro8.parte5;

import dominio.SistemaContabil;

public class SistemaContabilAdapterSAP extends SistemaContabilAdapter {

    public SistemaContabilAdapterSAP() {
        this.sistemaContabil = new SistemaContabil("SAP");
    }
    
}
