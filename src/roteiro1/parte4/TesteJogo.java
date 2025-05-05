package roteiro1.parte4;

public class TesteJogo {
    public static void main(String[] args) {

        RunFast correRapido = new RunFast();
        RunSlow correDevagar = new RunSlow();
        RunNoWay correNada = new RunNoWay();

        System.out.println("Detalhes do Jogador de Tennis");
        TennisPlayer guga = new TennisPlayer("Gustavo Kuerten", correRapido);
        guga.treinar();
        guga.estiloCompetidor();
        guga.definirTatica();
        guga.correr();
        System.out.println("******************");

        System.out.println("Detalhes do Jogador de Futebol");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldinho Gaucho", correDevagar);
        ronaldo.treinar();
        ronaldo.estiloCompetidor();
        ronaldo.definirTatica();
        ronaldo.correr();
        System.out.println("******************");

        System.out.println("Detalhes do Jogador de Cartas");
        CardPlayer joseCartas = new CardPlayer("Jose das Cartas", correNada);
        joseCartas.treinar();
        joseCartas.estiloCompetidor();
        joseCartas.definirTatica();
        joseCartas.correr();
        System.out.println("******************");

        System.out.println("Detalhes do Jogador de Xadrez");
        ChessPlayer kasparov = new ChessPlayer("Kasparov", correNada);
        kasparov.treinar();
        kasparov.estiloCompetidor();
        kasparov.definirTatica();
        kasparov.correr();
        System.out.println("******************");

        System.out.println("Detalhes do Jogador de Golf");
        GolfPlayer tigerwood = new GolfPlayer("Tiger Woods", correNada);
        tigerwood.treinar();
        tigerwood.estiloCompetidor();
        tigerwood.definirTatica();
        tigerwood.correr();
        System.out.println("******************");
    }
}
