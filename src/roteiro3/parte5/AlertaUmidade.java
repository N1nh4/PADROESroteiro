package roteiro3.parte5;

public class AlertaUmidade implements Observer {

    @Override
    public void update(String tipo, double valor) {
        if (tipo.equals("UMIDADE") && valor < 30) {
            System.out.println("ALERTA: Umidade baixa! Valor: " + valor + " %");
        }
    }
}
