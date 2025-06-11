package roteiro8.parte6;

import dominio.SistemaContabil;

public class SistemaContabilAdapterDELL extends SistemaContabilAdapter {
 
    public SistemaContabilAdapterDELL() {
        this.sistemaContabil = new SistemaContabil("DELL");
    }

}
