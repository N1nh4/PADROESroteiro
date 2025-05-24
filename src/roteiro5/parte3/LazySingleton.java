package roteiro5.parte3;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    // se for em uma situação de multithread, pode usar o synchronized mas pode ter problemas de performaces em ambiente de execução. Não é nosso caso aqui, então poderiamos tirar o synchronized

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
