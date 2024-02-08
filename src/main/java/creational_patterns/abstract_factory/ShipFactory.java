package creational_patterns.abstract_factory;

import creational_patterns.factory_method.Ship;
import creational_patterns.factory_method.Whiteship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> { // OCP
    @Override
    public Ship getObject() throws Exception {
        Whiteship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
