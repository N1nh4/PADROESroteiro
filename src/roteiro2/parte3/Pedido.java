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

    public abstract void calculaFreteComun();

    public abstract void calculaFreteExpresso();
}
