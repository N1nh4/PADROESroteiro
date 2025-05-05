package roteiro1.parte4;

public class CardPlayer extends Player {
    public CardPlayer(String nome, RunBehavior habilidadeCorrer) {
        super(nome, habilidadeCorrer);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " É um jogador muito calmo !");
    }

    @Override
    public void correr() {
        System.out.println(super.nome + " Não Corre  ! Ele pensa !");
    }
}
