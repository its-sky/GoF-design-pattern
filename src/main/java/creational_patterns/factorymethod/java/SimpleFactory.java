package creational_patterns.factorymethod.java;

import creational_patterns.factorymethod.Blackship;
import creational_patterns.factorymethod.Whiteship;

public class SimpleFactory {

    // Simple Factory Pattern
    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")) {
            return new Blackship();
        }

        throw new IllegalArgumentException();
    }
}
