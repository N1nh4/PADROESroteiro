package roteiro7.parte2;

public abstract class Boleto {
    protected double valor;
    protected double juros;
    protected double desconto;
    protected double multa;

    public Boleto( double valor ) {
        this.valor = valor;
    }

    public double calcJurus() {
        return this.valor * this.juros;
    }

    public double calcDesconto() {
        return this.valor * this.desconto;
    }

    public double calcMulta() {
        return this.valor * this.multa;
    }
}
