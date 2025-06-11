package roteiro8.parte4;

import servico.SistemaEstoque;
public class SistemaEstoqueAdapterSAP implements ISistemaEstoqueAdapter {
    private SistemaEstoque sistemaEstoque;
    
    public SistemaEstoqueAdapterSAP() {
        this.sistemaEstoque = new SistemaEstoque("SAP");
    }
    
    @Override
    public void aumentarQuantidadeItem() {
        sistemaEstoque.adicionarItemEstoque();
    }
    
    @Override
    public void diminuirQuantidadeItem() {
        sistemaEstoque.removerItemEstoque();
    }
    
}
