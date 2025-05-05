package roteiro1.parte5;

public class TestePedido {
    public static void main(String[] args) {

        FreteComun freteComun = new FreteComun();
        FreteExpresso freteExpresso = new FreteExpresso();

        System.out.println("Detalhes do Pedido Eletrônicos");
        PedidoEletronicos pedidoEletronicos = new PedidoEletronicos(1000.0, "Setor Eletrônicos", freteComun);
        pedidoEletronicos.calculaFreteComun();
        pedidoEletronicos.calculaFreteExpresso();
        pedidoEletronicos.calculaFrete();
        System.out.println("******************");

        System.out.println("Detalhes do Pedido Moveis");
        PedidoMoveis pedidoMoveis = new PedidoMoveis(2000.0, "Setor Moveis", freteExpresso);
        pedidoMoveis.calculaFreteComun();
        pedidoMoveis.calculaFreteExpresso();
        pedidoMoveis.calculaFrete();
        System.out.println("******************");

    
    }
}