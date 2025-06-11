package roteiro8.parte6;

public class ControladorEstoque {
    private SistemaEstoqueAdapter sistemaestoqueAdapter;
    private AdapterFactory factory;

    public ControladorEstoque() {
        System.out.println("Controlador de Sistema Estoque Criado");
        this.factory = AdapterFactory.getInstance();
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        this.sistemaestoqueAdapter = this.factory.criarSistemaEstoqueAdapter(nome);
    }

    public void aumentarQuantidadeItem() {
        this.sistemaestoqueAdapter.aumentarQuantidadeItem();
    }

    
}
