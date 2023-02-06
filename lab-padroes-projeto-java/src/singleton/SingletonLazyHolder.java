package singleton;

public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instancia;
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return Holder.instancia;
    }
}
