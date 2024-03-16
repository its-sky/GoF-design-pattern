package behavioral_patterns.chain_of_responsibilities;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

public class CoRInJava {
    Filter filter = new Filter() {
        @Override
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                throws IOException, ServletException {
            // TODO 전처리
            chain.doFilter(request, response);
            // TODO 후처리
        }
    };
}
