package roteiro7.parte3;

public class TesteBoleto {
    public static void main(String[] args) {
        BancoCaixa bancoCaixa = new BancoCaixa();
        BancoBrasil bancoBrasil = new BancoBrasil();
        
        System.out.println("=== Banco Caixa ===");
        try {
            bancoCaixa.gerarBoleto(10, 100);
            bancoCaixa.gerarBoleto(30, 100);
            bancoCaixa.gerarBoleto(60, 100);
            bancoCaixa.gerarBoleto(90, 100); // Este deve lançar uma exceção
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("\n=== Banco Brasil ===");
        try {
            bancoBrasil.gerarBoleto(10, 100);
            bancoBrasil.gerarBoleto(30, 100);
            bancoBrasil.gerarBoleto(60, 100);
            bancoBrasil.gerarBoleto(90, 100); // Este deve lançar uma exceção
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
