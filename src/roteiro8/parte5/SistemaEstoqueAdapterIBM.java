package roteiro8.parte5;

import servico.SistemaEstoque;
public class SistemaEstoqueAdapterIBM extends SistemaEstoqueAdapter{

    public SistemaEstoqueAdapterIBM() {
        this.sistemaEstoque = new SistemaEstoque("IBM");
    }

}
