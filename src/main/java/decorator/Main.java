package decorator;

public class Main {

    public static void main(String[] args) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation();
        System.out.println();
        c.newOperation();
    }
}
