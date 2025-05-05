package roteiro1.parte5;

public class FreteComun implements FreteBehavior {

    @Override
    public void calculaFrete( Double valor) {
        System.out.println("Escolhido Frete Comun: " + (valor * 0.05));
    }
} 
