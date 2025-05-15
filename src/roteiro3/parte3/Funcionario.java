package roteiro3.parte3;

public class Funcionario implements Observer {
    private String nome;
    private String email;
    private String cargo;

    public Funcionario(String nome, String email, String cargo) {
        this.cargo = cargo;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("-------NOTIFICAÇÃO FUNCIONÁRIO-------");
        System.out.println("Email enviado para " + nome + ":  (" + email + ")" );
        System.out.println("Mensagem: " + mensagem);
        System.out.println("-----------------------------");
    }
    
}
