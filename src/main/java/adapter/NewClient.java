package adapter;

//Composition
public class NewClient {
    public static void main(String[] args) {
        Chief chief = new NewChiefAdapter();
        Object dish = chief.makeDinner();
        System.out.println(dish);
    }
}
