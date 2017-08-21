package adapter;

//Composition
public class NewChiefAdapter implements Chief {

    private MilkChief milkChief = new MilkChief();

    public Object makeBreakfast() {
        return milkChief.getCheese();
    }

    public Object makeLunch() {
        return milkChief.getMilk();
    }

    public Object makeDinner() {
        return milkChief.getMilkPie();
    }
}
