package one.digitalinnovation.gof;

import facade.Facade;
import singleton.SingletonEagler;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.*;

public class Teste {
    public static void main(String[] args) {

        // testes ref ao Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        SingletonEagler eagler = SingletonEagler.getInstance();
        System.out.println(eagler);

        //testes ref Strategy
        Comportamento normal = new CompNormal();
        Comportamento defensivo = new CompDefensivo();
        Comportamento agressivo = new CompAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();

        //testes ref Facade
        Facade facade = new Facade();
        facade.migrarCliente("Nathan", "12345678");


    }
}
