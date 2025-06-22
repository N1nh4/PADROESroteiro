package roteiro9.parte2;

public class CaixaCalculos10DiasFactory implements CalculosFactory {
	public Juros criarJuros() {
		return new CaixaJuros10Dias();
	}

	public Desconto criarDesconto() {
		return new CaixaDesconto10Dias();
	}

	public Multa criarMulta() {
		return new CaixaMulta10Dias();
	}
}