package decorator;

public abstract class Decorator implements InterfaceComponent{
    protected InterfaceComponent component;

    public Decorator (InterfaceComponent c)
    {
        component = c;
    }

    public void doOperation() {
        component.doOperation();
    }
    public void newOperation()
    {
        System.out.println("Do Nothing");
    }
}
