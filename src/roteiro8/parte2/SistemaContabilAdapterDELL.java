package roteiro8.parte2;

import dominio.SistemaContabil;

public class SistemaContabilAdapterDELL implements ISistemaContabilAdapter {

    private SistemaContabil sistemaContabil;
    
    public SistemaContabilAdapterDELL() {
        this.sistemaContabil = new SistemaContabil("DELL");
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
