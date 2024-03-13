package structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFlyweightFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        }
        String[] fontInfo = font.split(":");
        Font newFont = new Font(fontInfo[0], Integer.parseInt(fontInfo[1]));
        cache.put(font, newFont);
        return newFont;
    }

}
