package roteiro3.parte4;

public interface Observer {
    void update(String mensagem);
    String getTipoObserver();

    // Mudança de estratégia de notificação
    void setNotificacaoStrategy(NotificacaoStrategy novaEstrategiaNotificacao);
}
