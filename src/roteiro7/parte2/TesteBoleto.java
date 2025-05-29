package roteiro7.parte2;

public class TesteBoleto {
    public static void main(String[] args) {
        BoletoSimpleFactory boletoSimpleFactory = new BoletoSimpleFactory();
        BancoCaixa banco = new BancoCaixa(boletoSimpleFactory);
        
        try {
            banco.gerarBoleto(10, 100);
            banco.gerarBoleto(30, 100);
            banco.gerarBoleto(60, 100);
            banco.gerarBoleto(90, 100); // Este deve lançar uma exceção
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
