package roteiro9.parte2;

public class TesteBoleto {
    public static void main(String[] args) {
		Banco banco = new Banco();

		System.out.println("\n=== Banco CAIXA - 10 DIAS ===");
		banco.gerarBoleto(100, new CaixaCalculos10DiasFactory());

		System.out.println("\n=== Banco CAIXA - 30 DIAS ===");
		banco.gerarBoleto(100, new CaixaCalculos30DiasFactory());

		System.out.println("\n=== Banco CAIXA - 60 DIAS ===");
		banco.gerarBoleto(100, new CaixaCalculos60DiasFactory());

		System.out.println("\n=== Banco BB - 10 DIAS ===");
		banco.gerarBoleto(100, new BBCalculos10DiasFactory());

		System.out.println("\n=== Banco BB - 30 DIAS ===");
		banco.gerarBoleto(100, new BBCalculos30DiasFactory());

		System.out.println("\n=== Banco BB - 60 DIAS ===");
		banco.gerarBoleto(100, new BBCalculos60DiasFactory());
	}
}
