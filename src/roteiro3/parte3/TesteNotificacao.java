package roteiro3.parte3;

public class TesteNotificacao {
    public static void main(String[] args) {
        // Criação da newsletter
        Newsletter newsletter = new Newsletter();

        // Criação de clientes
        Observer cliente1 = new Cliente("Cliente João", "ZKc3o@example.com");
        Observer cliente2 = new Cliente("Cliente Maria", "1pEoV@example.com");

        Observer funcionario1 = new Funcionario("Funcionario Carlos", "xk7dH@example.com", "Gerente");

        Observer fornecedor1 = new Fornecedor("Fornecedor Pedro", "aeww2w@example.com", "123.456.789-00");

        // Adicionando observers à newsletter
        newsletter.adicionarObserver(cliente1);
        newsletter.adicionarObserver(cliente2);
        newsletter.adicionarObserver(funcionario1);
        newsletter.adicionarObserver(fornecedor1);

        // Envia mensagem para todos os clientes
        newsletter.enviarMensagem("Oferta Especial !");
    }
}