package structural_patterns.template;

public class MultiplyProcessor extends FileProcessor {

    public MultiplyProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int line) {
        return result * line;
    }
}
