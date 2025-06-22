package roteiro9.parte2;

public class BBCalculos30DiasFactory implements CalculosFactory {
	public Juros criarJuros() {
		return new BBJuros30Dias();
	}

	public Desconto criarDesconto() {
		return new BBDesconto30Dias();
	}

	public Multa criarMulta() {
		return new BBMulta30Dias();
	}
}
