package singleton;

public class SingletonEagler {
    private static SingletonEagler instancia = new SingletonEagler();

    private SingletonEagler() {
        super();
    }

    public static SingletonEagler getInstance() {
        return instancia;
    }
}
