package roteiro9.parte2;

public class CaixaCalculos30DiasFactory implements CalculosFactory {
	public Juros criarJuros() {
		return new CaixaJuros30Dias();
	}

	public Desconto criarDesconto() {
		return new CaixaDesconto30Dias();
	}

	public Multa criarMulta() {
		return new CaixaMulta30Dias();
	}
}
