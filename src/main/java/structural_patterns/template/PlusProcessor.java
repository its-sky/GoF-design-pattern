package structural_patterns.template;

public class PlusProcessor extends FileProcessor {

    public PlusProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int line) {
        return result + line;
    }
}
