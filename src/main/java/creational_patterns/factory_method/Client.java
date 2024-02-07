package creational_patterns.factory_method;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "Whiteship", "smc9919@mail.com");
        client.print(new BlackshipFactory(), "Blackship", "smc9919@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
