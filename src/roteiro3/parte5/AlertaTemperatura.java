package roteiro3.parte5;

public class AlertaTemperatura implements Observer {

    @Override
    public void update(String tipo, double valor) {
        if (tipo.equals("TEMPERATURA") && valor > 40) {
            System.out.println("ALERTA: Temperatura alta! Valor: " + valor + " °C");
        }
    }
}
