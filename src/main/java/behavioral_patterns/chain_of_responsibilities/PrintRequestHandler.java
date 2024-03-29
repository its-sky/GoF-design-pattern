package behavioral_patterns.chain_of_responsibilities;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
