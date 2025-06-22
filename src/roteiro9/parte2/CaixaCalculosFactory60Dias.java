package roteiro9.parte2;

public class CaixaCalculosFactory60Dias implements CalculosFactory {
    @Override
    public Juros criarJuros() {
        return new CaixaJuros60Dias();
    }

    @Override
    public Desconto criarDesconto() {
        return new CaixaDesconto60Dias();
    }

    @Override
    public Multa criarMulta() {
        return new CaixaMulta60Dias();
    }
}
