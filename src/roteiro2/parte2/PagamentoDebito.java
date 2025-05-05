package roteiro2.parte2;

public class PagamentoDebito extends Pagamento{
    private double valor;
    private Gateway gateway;

    public PagamentoDebito(double valor, Gateway gateway){
        super(valor, gateway);
    }

    public double calcularTaxa(){
        return 4;
    }

    @Override
    public double calcularDesconto(){
        return this.valor*0.05;
    }

    
}
