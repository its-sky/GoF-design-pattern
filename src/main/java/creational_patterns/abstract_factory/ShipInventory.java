package creational_patterns.abstract_factory;

import creational_patterns.factory_method.Ship;
import creational_patterns.factory_method.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory()); // OCP를 지키는게 가능해짐.
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }

}
