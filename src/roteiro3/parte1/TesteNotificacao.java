package roteiro3.parte1;

public class TesteNotificacao {
    public static void main(String[] args) {
        // Criação da newsletter
        Newsletter newsletter = new Newsletter();

        // Criação de clientes
        Cliente cliente1 = new Cliente("João", "ZKc3o@example.com");
        Cliente cliente2 = new Cliente("Maria", "1pEoV@example.com");

        // Adicionando clientes à newsletter
        newsletter.adicionarCliente(cliente1);
        newsletter.adicionarCliente(cliente2);

        // Envia mensagem para todos os clientes
        newsletter.enviarMensagem("Oferta Especial !");
    }
}