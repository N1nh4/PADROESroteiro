package roteiro8.parte6;

public class ControladorRegistradora {

    private SistemaContabilAdapter sistemacontabilAdapter;
    private SistemaEstoqueAdapter sistemaestoqueAdapter;
    private AdapterFactory factory;

    public ControladorRegistradora() {
        System.out.println("Controlador de Sistema Contabil Criado");
        this.factory = AdapterFactory.getInstance();
    }

    public void criarSistemaContabilAdapter(String nome) {
        this.sistemacontabilAdapter = this.factory.criarSistemaContabilAdapter(nome);
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        this.sistemaestoqueAdapter = this.factory.criarSistemaEstoqueAdapter(nome);
    }

    public void diminuirQuantidadeItem() {
        this.sistemaestoqueAdapter.aumentarQuantidadeItem();
    }
    
    public void registrarVendaSistemaContabil() {
        this.sistemacontabilAdapter.finalizarVenda();
    }
}
