package roteiro9.parte2;

public class BBCalculosFactory implements CalculosFactory{
    @Override
    public Juros criarJuros() {
        return new BBJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new BBDesconto();
    }

    @Override
    public Multa criarMulta() {
        return new BBMulta();
    }
}
