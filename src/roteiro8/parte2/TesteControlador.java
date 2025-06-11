package roteiro8.parte2;

public class TesteControlador {
    public static void main(String[] args) {
        testeControladorContabil();
        testeControladorEstoque();
    }

    public static void testeControladorContabil(){
        System.out.println("Criando o Controlador Contabil");
        ControladorContabil controladorContabil = new ControladorContabil();

        System.out.println("Teste de Integração do Controlador Controlador COntabil - Sistema Contabil DELL");
        controladorContabil.criarSistemaContabilAdapter("DELL");
        controladorContabil.calcularImposto();

        System.out.println("Teste de Integração do Controlador Controlador COntabil - Sistema Contabil IBM");
        controladorContabil.criarSistemaContabilAdapter("IBM");
        controladorContabil.calcularImposto();
    }

    public static void testeControladorEstoque(){
        System.out.println("Criando o Controlador Estoque");
        ControladorEstoque controladorEstoque = new ControladorEstoque();

        System.out.println("Teste de Integração do Controlador Controlador Estoque - Sistema Estoque DELL");
        controladorEstoque.criarSistemaEstoqueAdapter("DELL");
        controladorEstoque.aumentarQuantidadeItem();

        System.out.println("Teste de Integração do Controlador Controlador Estoque - Sistema Estoque IBM");
        controladorEstoque.criarSistemaEstoqueAdapter("IBM");
        controladorEstoque.aumentarQuantidadeItem();
    }
}