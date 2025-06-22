package roteiro9.parte2;

public interface CalculosFactory {
    public Juros criarJuros();
    public Desconto criarDesconto();
    public Multa criarMulta();
}
