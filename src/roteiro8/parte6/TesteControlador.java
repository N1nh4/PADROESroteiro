package roteiro8.parte6;

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

        System.out.println("Teste de Integração do Controlador Controlador COntabil - Sistema Contabil SAP");
        controladorContabil.criarSistemaContabilAdapter("SAP");	
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

        System.out.println("Teste de Integração do Controlador Controlador Estoque - Sistema Estoque SAP");
        controladorEstoque.criarSistemaEstoqueAdapter("SAP");
        controladorEstoque.aumentarQuantidadeItem();
    }

    public static void testeControladorRegistradora(){
        System.out.println("Criando o Controlador Registradora");
        ControladorRegistradora controladorRegistradora = new ControladorRegistradora();

        System.out.println("Teste de Integração do Controlador Controlador Registradora - Sistema Estoque DELL");
        controladorRegistradora.criarSistemaEstoqueAdapter("DELL");
        controladorRegistradora.diminuirQuantidadeItem();

        System.out.println("Teste de Integração do Controlador Controlador Registradora - Sistema Estoque IBM");
        controladorRegistradora.criarSistemaEstoqueAdapter("IBM");
        controladorRegistradora.diminuirQuantidadeItem();

        System.out.println("Teste de Integração do Controlador Controlador Registradora - Sistema Estoque SAP");
        controladorRegistradora.criarSistemaEstoqueAdapter("SAP");
        controladorRegistradora.diminuirQuantidadeItem();

        System.out.println("Teste de Integração do Controlador Controlador Registradora - Sistema Contabil SAP");
        controladorRegistradora.criarSistemaContabilAdapter("SAP");
        controladorRegistradora.registrarVendaSistemaContabil();

        System.out.println("Teste de Integração do Controlador Controlador Registradora - Sistema Contabil DELL");
        controladorRegistradora.criarSistemaContabilAdapter("DELL");
        controladorRegistradora.registrarVendaSistemaContabil();

        System.out.println("Teste de Integração do Controlador Controlador Registradora - Sistema Contabil IBM");
        controladorRegistradora.criarSistemaContabilAdapter("IBM");
        controladorRegistradora.registrarVendaSistemaContabil();
    }


}