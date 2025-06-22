package roteiro9.parte2;

public class BBCalculos60DiasFactory implements CalculosFactory {
	public Juros criarJuros() {
		return new BBJuros60Dias();
	}

	public Desconto criarDesconto() {
		return new BBDesconto60Dias();
	}

	public Multa criarMulta() {
		return new BBMulta60Dias();
	}
}