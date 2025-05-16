package roteiro3.parte5;

public class AlertaPressao implements Observer {

    @Override
    public void update(String tipo, double valor) {
        if (tipo.equals("PRESSAO") && valor > 100) {
            System.out.println("ALERTA: Pressão alta! Valor: " + valor + " Pa");
        }
    }
}
