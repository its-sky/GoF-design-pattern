package behavioral_patterns.chain_of_responsibilities;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
