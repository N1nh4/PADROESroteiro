package roteiro3.parte4;

public class TesteNotificacao {
    public static void main(String[] args) {
        // Criação da newsletter
        Newsletter newsletter = new Newsletter();

        // Criação de estratégias de notificação
        NotificacaoStrategy email = new NotificacaoEmail();
        NotificacaoStrategy sms = new NotificacaoSMS();
        NotificacaoStrategy whatsapp = new NotificacaoWhatsApp();

        // Criação de clientes
        Observer cliente1 = new Cliente("Cliente João", "ZKc3o@example.com", "71999999999", email);
        Observer cliente2 = new Cliente("Cliente Maria", "1pEoV@example.com", "71988888888", sms);

        // Criação de funcionários
        Observer funcionario1 = new Funcionario("Funcionario Carlos", "xk7dH@example.com", "71977777777", "Gerente", whatsapp);

        // Criação de fornecedores
        Observer fornecedor1 = new Fornecedor("Fornecedor Pedro", "aeww2w@example.com", "123.456.789-00", "71966666666", email);

        // Adicionando "observers" à newsletter
        newsletter.adicionarObserver(cliente1);
        newsletter.adicionarObserver(cliente2);
        newsletter.adicionarObserver(funcionario1);
        newsletter.adicionarObserver(fornecedor1);

        // Envia mensagem para todos os clientes
        newsletter.enviarMensagem("Oferta Especial !\n");

        // Altera a estratégia de notificação do cliente1 para SMS
        cliente1.setNotificacaoStrategy(sms);
        // Envia mensagem para todos os clientes
        newsletter.enviarMensagem("Promoção de Natal !\n");
    }
}