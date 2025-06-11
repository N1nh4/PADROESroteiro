package roteiro8.parte4;

import servico.SistemaEstoque;
public class SistemaEstoqueAdapterSAP implements ISistemaEstoqueAdapter {
    private SistemaEstoque sistemaEstoque;
    
    public SistemaEstoqueAdapterSAP() {
        this.sistemaEstoque = new SistemaEstoque("SAP");
    }
    
    public void aumentarQuantidadeItem() {
        sistemaEstoque.adicionarItemEstoque();
    }
    
    public void diminuirQuantidadeItem() {
        sistemaEstoque.removerItemEstoque();
    }
    
}
