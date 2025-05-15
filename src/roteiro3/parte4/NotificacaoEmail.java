package roteiro3.parte4;

public class NotificacaoEmail implements NotificacaoStrategy {
    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("-----------------------------\n");
        System.out.println("Enviando email para " + destinatario + ": \n" + mensagem );
    }
    
}
