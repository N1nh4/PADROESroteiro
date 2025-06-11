package roteiro8.parte6;

import servico.SistemaEstoque;
public class SistemaEstoqueAdapterSAP extends SistemaEstoqueAdapter {

    public SistemaEstoqueAdapterSAP() {
        this.sistemaEstoque = new SistemaEstoque("SAP");
    }
    
    
}
