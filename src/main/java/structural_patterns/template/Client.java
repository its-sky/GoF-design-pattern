package structural_patterns.template;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new MultiplyProcessor("number.txt");
        int result = fileProcessor.process();
        System.out.println("result = " + result);
    }

}
