package structural_patterns.composite;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력포션", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(healPotion);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}
