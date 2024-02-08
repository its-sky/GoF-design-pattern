package creational_patterns.abstract_factory;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
