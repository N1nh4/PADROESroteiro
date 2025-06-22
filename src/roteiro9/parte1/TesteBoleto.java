package roteiro9.parte1;

public class TesteBoleto {
    public static void main(String[] args) {
        Banco banco = new Banco();

        System.out.println("=== Banco Caixa ===");

        CalculosFactory caixCalculosFactory = new CaixaCalculosFactory();
        try {
            banco.gerarBoleto(100, caixCalculosFactory);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=== Banco BB ===");

        CalculosFactory bbCalculosFactory = new BBCalculosFactory();
        try {
            banco.gerarBoleto(100, bbCalculosFactory);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      
    }
}
