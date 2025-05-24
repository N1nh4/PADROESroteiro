package roteiro5.parte1;

public class ControladorAereo {
    private boolean permitidoAterrisar;
    private boolean permitidoDecolar;

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
