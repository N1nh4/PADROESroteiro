package roteiro8.parte3;

import servico.SistemaEstoque;
public class SistemaEstoqueAdapterIBM implements ISistemaEstoqueAdapter{
    private SistemaEstoque sistemaEstoque;
    public SistemaEstoqueAdapterIBM() {
        this.sistemaEstoque = new SistemaEstoque("IBM");
    }

    @Override
    public void aumentarQuantidadeItem() {
        this.sistemaEstoque.adicionarItemEstoque();
    }

    @Override
    public void diminuirQuantidadeItem() {
        this.sistemaEstoque.removerItemEstoque();
    }
    
}
