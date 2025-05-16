package roteiro3.parte5;

public class TesteNotificacao {

    public static void main(String[] args) {
        // Criando o Painel de Controle
        PainelControle painel = new PainelControle();

        // Criando Observadores
        AlertaTemperatura alertaTemperatura = new AlertaTemperatura();
        AlertaPressao alertaPressao = new AlertaPressao();
        AlertaUmidade alertaUmidade = new AlertaUmidade();

        // Registrando Observadores no Painel
        painel.adicionarObserver(alertaTemperatura);
        painel.adicionarObserver(alertaPressao);
        painel.adicionarObserver(alertaUmidade);

        // Simulando valores com tipo de dado
        System.out.println("Testando Temperatura:");
        painel.notificar("TEMPERATURA", 35.0); // Sem alerta
        painel.notificar("TEMPERATURA", 42.0); // Alerta de temperatura

        System.out.println("\nTestando Pressão:");
        painel.notificar("PRESSAO", 90.0); // Sem alerta
        painel.notificar("PRESSAO", 120.0); // Alerta de pressão

        System.out.println("\nTestando Umidade:");
        painel.notificar("UMIDADE", 40.0); // Sem alerta
        painel.notificar("UMIDADE", 25.0); // Alerta de umidade
    }
}
