package roteiro9.parte2;

public class CaixaCalculosFactory implements CalculosFactory{
    @Override
    public Desconto criarDesconto() {
        return new CaixaDesconto();
    }

    @Override
    public Juros criarJuros() {
        return new CaixaJuros();
    }

    @Override
    public Multa criarMulta() {
        return new CaixaMulta();
    }
}
