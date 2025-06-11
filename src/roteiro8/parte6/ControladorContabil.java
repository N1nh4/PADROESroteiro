package roteiro8.parte6;

public class ControladorContabil  {
    
    private SistemaContabilAdapter sistemacontabilAdapter;
    private AdapterFactory factory;

    public ControladorContabil() {
        System.out.println("Controlador de Sistema Contabil Criado");
        this.factory = AdapterFactory.getInstance();
    }

    public void criarSistemaContabilAdapter(String nome){
       this.sistemacontabilAdapter = this.factory.criarSistemaContabilAdapter(nome);
    }

    public void calcularImposto(){
        this.sistemacontabilAdapter.registrarImposto();
    }
}
