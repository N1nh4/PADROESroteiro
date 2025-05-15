package roteiro3.parte4;

public class Cliente implements Observer {
    private String nome;
    private String email;
    private String telefone;
    private NotificacaoStrategy estrategiaNotificacao;

    public Cliente(String nome, String email,  String telefone, NotificacaoStrategy estrategiaNotificacao) {
        this.estrategiaNotificacao = estrategiaNotificacao;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public void update(String mensagem) {
        String destinatario = (estrategiaNotificacao instanceof NotificacaoEmail) ? email : telefone;

        StringBuilder mensagemFormatada = new StringBuilder();
        mensagemFormatada.append("-------NOTIFICAÇÃO " + getTipoObserver() + "--------\n");
        mensagemFormatada.append("Notificação enviado para " + nome + ":  (" + destinatario + ")" + "\n");
        mensagemFormatada.append("Mensagem: " + mensagem + "\n");
        mensagemFormatada.append("-----------------------------\n");

        this.estrategiaNotificacao.enviarMensagem(destinatario, mensagemFormatada.toString());
    }

    @Override
    public String getTipoObserver() {
        return "Cliente";
    }

    // Metodo para alterar estrategia de notificacao
    @Override
    public void setNotificacaoStrategy(NotificacaoStrategy novaEstrategiaNotificacao) {
        this.estrategiaNotificacao = novaEstrategiaNotificacao;
    }
   
}
