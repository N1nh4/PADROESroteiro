package roteiro8.parte2;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterDELL implements ISistemaEstoqueAdapter{

    private SistemaEstoque sistemaEstoque;

    public SistemaEstoqueAdapterDELL() {
        this.sistemaEstoque = new SistemaEstoque("DELL");
    }

    @Override
    public void diminuirQuantidadeItem() {
        this.sistemaEstoque.removerItemEstoque();
    }

    @Override
    public void aumentarQuantidadeItem() {
        this.sistemaEstoque.adicionarItemEstoque();
    }
    
}
