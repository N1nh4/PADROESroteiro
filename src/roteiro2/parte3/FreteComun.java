package roteiro2.parte3;

public class FreteComun implements FreteBehavior {

    @Override
    public void calculaFrete( Double valor) {
        System.out.println("Escolhido Frete Comun: " + (valor * 0.05));
    }
} 
