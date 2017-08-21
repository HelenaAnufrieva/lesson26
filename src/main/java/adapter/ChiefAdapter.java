package adapter;

//Adapter
public class ChiefAdapter extends MilkChief implements Chief{
    public Object makeBreakfast() {
        return getCheese();
    }

    public Object makeLunch() {
        return getMilk();
    }

    public Object makeDinner() {
        return getMilkPie();
    }
}
