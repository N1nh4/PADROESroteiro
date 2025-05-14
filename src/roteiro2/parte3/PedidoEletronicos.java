package roteiro2.parte3;

public class PedidoEletronicos extends Pedido {
    private String setor;

    public PedidoEletronicos(Double valor, String setor, FreteBehavior freteBehavior) {
        super(valor, freteBehavior);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void calculaFreteComun() {
        System.out.println("Valor: " + super.getValor() + " Frete Comun: " + (getValor() * 0.05));
    }

    @Override
    public void calculaFreteExpresso() {
        System.out.println( "Valor: " + super.getValor() + " Frete Expresso: " + (getValor() * 0.10));
    }

    @Override
    protected void validarPedido() {
        System.out.println("Validando pedido de eletrônicos no setor: " + this.setor);
    }


    
}
