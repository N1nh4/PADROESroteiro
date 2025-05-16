package roteiro3.parte5;

import java.util.ArrayList;
import java.util.List;

public class PainelControle {
    private List<Observer> observers;

    public PainelControle() {
        this.observers = new ArrayList<>();
    }

    public void adicionarObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notificar(String tipo, double valor) {
        for (Observer observer : observers) {
            observer.update(tipo, valor);
        }
    }
}
