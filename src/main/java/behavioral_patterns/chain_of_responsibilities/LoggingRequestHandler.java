package behavioral_patterns.chain_of_responsibilities;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("Logging");
        super.handle(request);
    }
}
