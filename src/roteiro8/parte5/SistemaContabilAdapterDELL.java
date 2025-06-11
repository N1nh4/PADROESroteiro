package roteiro8.parte5;

import dominio.SistemaContabil;

public class SistemaContabilAdapterDELL extends SistemaContabilAdapter {
 
    public SistemaContabilAdapterDELL() {
        this.sistemaContabil = new SistemaContabil("DELL");
    }

}
