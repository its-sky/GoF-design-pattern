package behavioral_patterns.interpreter;

import java.util.regex.Pattern;

public class InterpreterInJava {

    public static void main(String[] args) {
        System.out.println(Pattern.matches(".pr...", "spring"));
        System.out.println(Pattern.matches("[a-z]{6}", "spring"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "a"));
    }

}
