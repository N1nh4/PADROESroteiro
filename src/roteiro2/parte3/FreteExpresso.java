package roteiro2.parte3;

public class FreteExpresso implements FreteBehavior {
    
    @Override
    public void calculaFrete( Double valor ) { 
        System.out.println("Escolhido Frete Expresso: " + (valor * 0.10));
    }
}
