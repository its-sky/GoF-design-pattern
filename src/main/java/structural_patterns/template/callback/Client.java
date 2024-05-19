package structural_patterns.template.callback;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int total = fileProcessor.process((result, line) -> result += line);
        System.out.println("total = " + total);
    }

}
