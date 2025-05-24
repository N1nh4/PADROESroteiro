package roteiro5.parte2;

public class Teste {
    public static void main(String[] args) {
        ControladorAereo c1 = ControladorAereo.getInstance();
        ControladorAereo c2 = ControladorAereo.getInstance();

        c1.solicitarDecolagem();
        c2.solicitarDecolagem();

        System.out.println(" ");

        c1.solicitarAterrisagem();
        c2.solicitarAterrisagem();
    }
}
