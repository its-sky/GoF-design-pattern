package creational_patterns.factory_method.java;

import creational_patterns.factory_method.Blackship;
import creational_patterns.factory_method.Whiteship;

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
