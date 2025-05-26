package roteiro6.parte3;

public class Facade {
    private Database db;
    private Cliente cliente;
    private Produto produto;


    public Facade() {
        this.db = new Database();
    }

    public void registrarCliente(String nome, int id) {
        this.cliente = new Cliente(id, nome);

        this.db.addCliente(this.cliente);
    }

    public void comprar(int productID, int clientID){
        this.cliente = this.db.selectCliente(clientID);
        this.produto = this.db.selectProduto(productID);

        this.cliente.getCarrinho().addProduto(this.produto);
    }

    public void finalizarCompra(int clientID) {
        this.cliente = db.selectCliente(clientID);

        double total = this.cliente.calcularTotal();

        db.processarPagamento(cliente, total);
    }
}
