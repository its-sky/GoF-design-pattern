package factorymethod.java;

import factorymethod.Blackship;
import factorymethod.Whiteship;

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
