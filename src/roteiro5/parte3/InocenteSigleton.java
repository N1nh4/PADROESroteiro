package roteiro5.parte3;

public class InocenteSigleton {
    private InocenteSigleton(){

    }

    public static InocenteSigleton getInstance(){
        return new InocenteSigleton();
    }
}
