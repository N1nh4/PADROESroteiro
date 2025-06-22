package roteiro9.parte2;

public class BBCalculos10DiasFactory implements CalculosFactory {
	public Juros criarJuros() {
		return new BBJuros10Dias();
	}

	public Desconto criarDesconto() {
		return new BBDesconto10Dias();
	}

	public Multa criarMulta() {
		return new BBMulta10Dias();
	}
}