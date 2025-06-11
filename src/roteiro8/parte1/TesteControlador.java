package roteiro8.parte1;

public class TesteControlador {
    public static void main(String[] args) {
        testeControladorContabil();
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
}