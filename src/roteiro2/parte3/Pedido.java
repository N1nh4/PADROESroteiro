package roteiro2.parte3;

public abstract class Pedido {
    protected Double valor;
    protected FreteBehavior freteBehavior;


    public Pedido(Double valor, FreteBehavior freteBehavior) {
        this.valor = valor;
        this.freteBehavior = freteBehavior;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void calculaFrete( ) {
        this.freteBehavior.calculaFrete(this.valor);

    }

    // Método template
    public void processarPedido() {
        validarPedido();
        calculaFrete();
        emitirNotaFiscal();
    }

    protected void emitirNotaFiscal() {
        System.out.println("Emitindo nota fiscal do pedido sem frete no valor de: " + this.valor);
    }

    protected abstract void validarPedido();

    public abstract void calculaFreteComun();

    public abstract void calculaFreteExpresso();
}
