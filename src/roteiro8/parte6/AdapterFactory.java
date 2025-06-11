package roteiro8.parte6;

public class AdapterFactory {
    private SistemaEstoqueAdapter sistemaEstoqueAdapter;
    private SistemaContabilAdapter sistemaContabilAdapter;

    private static AdapterFactory instance = new AdapterFactory();

    private AdapterFactory() {

    }

    public static AdapterFactory getInstance() {
        return instance;
    }

    public SistemaContabilAdapter criarSistemaContabilAdapter(String nome) {
        if (nome.equals("IBM"))
            this.sistemaContabilAdapter = new SistemaContabilAdapterIBM();
        else if (nome.equals("DELL"))
            this.sistemaContabilAdapter = new SistemaContabilAdapterDELL();
        else if (nome.equals("SAP"))
            this.sistemaContabilAdapter = new SistemaContabilAdapterSAP();
        return this.sistemaContabilAdapter;
    }

    public SistemaEstoqueAdapter criarSistemaEstoqueAdapter(String nome) {
        if (nome.equals("DELL"))
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
        else if (nome.equals("IBM"))
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
        else if (nome.equals("SAP"))
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterSAP();
        return this.sistemaEstoqueAdapter;
    }
}
