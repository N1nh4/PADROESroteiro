package roteiro3.parte4;

public class NotificacaoSMS implements NotificacaoStrategy {
    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("-----------------------------\n");
        System.out.println("Enviando SMS para " + destinatario + ": \n" + mensagem );
    }
    
}
