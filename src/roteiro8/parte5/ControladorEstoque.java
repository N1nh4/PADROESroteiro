package roteiro8.parte5;

public class ControladorEstoque {
    private SistemaEstoqueAdapter sistemaestoqueAdapter;

    public ControladorEstoque() {
        System.out.println("Controlador de Sistema Estoque Criado");
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        if (nome.equals("DELL")) {
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterDELL();
        } else if (nome.equals("IBM")) {
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterIBM();
        } else if (nome.equals("SAP")) {
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterSAP();
        }
    }

    public void aumentarQuantidadeItem() {
        this.sistemaestoqueAdapter.aumentarQuantidadeItem();
    }

    
}
