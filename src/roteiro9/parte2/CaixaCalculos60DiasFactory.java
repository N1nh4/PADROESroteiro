package roteiro9.parte2;

public class CaixaCalculos60DiasFactory implements CalculosFactory {
	public Juros criarJuros() {
		return new CaixaJuros60Dias();
	}

	public Desconto criarDesconto() {
		return new CaixaDesconto60Dias();
	}

	public Multa criarMulta() {
		return new CaixaMulta60Dias();
	}
}
