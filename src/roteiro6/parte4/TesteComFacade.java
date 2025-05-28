package roteiro6.parte4;

public class TesteComFacade {
    public static void main(String[] args){
        Facade facade = Facade.getInstance();
        facade.registrarCliente("Joao", 222);

        facade.comprar(1, 222);
        facade.comprar(2, 222);
        facade.finalizarCompra(222);
    }
}
