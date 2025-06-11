package roteiro8.parte5;

import servico.SistemaEstoque;

public abstract class SistemaEstoqueAdapter {
    protected SistemaEstoque sistemaEstoque;

    public void diminuirQuantidadeItem() {
        this.sistemaEstoque.removerItemEstoque();
    }

    public void aumentarQuantidadeItem() {
        this.sistemaEstoque.adicionarItemEstoque();
    }
}
