package roteiro5.parte3;

public class TesteSingleton {
    public static void main(String[] args) {
        InocenteSigleton n1 = InocenteSigleton.getInstance();
        InocenteSigleton n2 = InocenteSigleton.getInstance();

        // era pra ser instancias iguais uma vez que era para o padrão singleton garantir apenas uma instancia da classe exista durante a execução do programa
        System.out.println(n1 == n2 ? "Instâncias iguais" : "Instâncias diferentes");

        LazySingleton n3 = LazySingleton.getInstance();
        LazySingleton n4 = LazySingleton.getInstance();

        System.out.println(n3 == n4 ? "Instâncias iguais" : "Instâncias diferentes");

        EagerSingleton n5 = EagerSingleton.getInstance();
        EagerSingleton n6 = EagerSingleton.getInstance();

        System.out.println(n5 == n6 ? "Instâncias iguais" : "Instâncias diferentes");

        StaticSingleton n7 = StaticSingleton.instance;
        StaticSingleton n8 = StaticSingleton.instance;

        System.out.println(n7 == n8 ? "Instâncias iguais" : "Instâncias diferentes");
    }
}