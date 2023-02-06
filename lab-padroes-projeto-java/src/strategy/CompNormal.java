package strategy;

public class CompNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
