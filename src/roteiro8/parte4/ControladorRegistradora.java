package roteiro8.parte4;

public class ControladorRegistradora {

    private ISistemaContabilAdapter sistemacontabilAdapter;
    private ISistemaEstoqueAdapter sistemaestoqueAdapter;

    public ControladorRegistradora() {
        System.out.println("Controlador de Sistema Contabil Criado");
    }

    public void criarSistemaContabilAdapter(String nome) {
        if (nome.equals("IBM")) {
            this.sistemacontabilAdapter = new SistemaContabilAdapterIBM();
        } else if (nome.equals("DELL")) {
            this.sistemacontabilAdapter = new SistemaContabilAdapterDELL();
        } else if (nome.equals("SAP")) {
            this.sistemacontabilAdapter = new SistemaContabilAdapterSAP();
        }
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        if (nome.equals("DELL")) {
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterDELL();
        } else if (nome.equals("IBM")) {
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterIBM();
        }
    }

    public void diminuirQuantidadeItem() {
        this.sistemaestoqueAdapter.aumentarQuantidadeItem();
    }
    
    public void registrarVendaSistemaContabil() {
        this.sistemacontabilAdapter.finalizarVenda();
    }
}
