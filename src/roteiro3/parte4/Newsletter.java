package roteiro3.parte4;

import java.util.ArrayList;

public class Newsletter {
    private ArrayList<Observer> observers;

    public Newsletter() {
        this.observers = new ArrayList<>();
    }

    public void adicionarObserver(Observer observer) {
        this.observers.add(observer);
    
    }

    public void removerObserver(Observer observers) {
        this.observers.remove(observers);
    }

    public void enviarMensagem(String mensagem) {
        for (Observer observador : observers) {
            observador.update(mensagem);
        }
    }
}
