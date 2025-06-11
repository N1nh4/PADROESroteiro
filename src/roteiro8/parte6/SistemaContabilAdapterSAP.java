package roteiro8.parte6;

import dominio.SistemaContabil;

public class SistemaContabilAdapterSAP extends SistemaContabilAdapter {

    public SistemaContabilAdapterSAP() {
        this.sistemaContabil = new SistemaContabil("SAP");
    }
    
}
