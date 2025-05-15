package roteiro3.parte4;

public class NotificacaoWhatsApp implements NotificacaoStrategy {
    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("-----------------------------\n");
        System.out.println("Enviando WhatsApp para " + destinatario + ": \n" + mensagem );
    }
    
}
