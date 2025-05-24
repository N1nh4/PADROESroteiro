package roteiro5.parte2;

public class ControladorAereo {
    private boolean permitidoAterrisar;
    private boolean permitidoDecolar;
    // primeiro requisito para o padrão Singleton, uma variável (atributo) static que vai garantir uma instância unica; instance
    private static ControladorAereo instance = new ControladorAereo();

    // terceiro requisito, um construtor privado para impedir que mais de uma instância seja criada

    private ControladorAereo(){
        this.permitidoAterrisar = false;
        this.permitidoDecolar = true;
    }

    // segundo requisto, um método estático para acesso a esta variável, getInstance

    public static ControladorAereo getInstance(){
        return instance;
    }

    public void solicitarAterrisagem(){
        if (this.permitidoAterrisar){
            System.out.println("Permissão para aterrisagem concedida ");
            this.permitidoAterrisar = false;
            this.permitidoDecolar = true;
        } else {
            System.out.println("Permissão para aterrisagem negada ");
        }
    }

    public void solicitarDecolagem(){
        if (this.permitidoDecolar){
            System.out.println("Permissão para decolagem concedida ");
            this.permitidoDecolar = false;
            this.permitidoAterrisar = true;
        } else {
            System.out.println("Permissão para decolagem negada ");
        }
    }
}
