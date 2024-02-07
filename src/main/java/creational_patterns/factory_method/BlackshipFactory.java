package creational_patterns.factory_method;

public class BlackshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
