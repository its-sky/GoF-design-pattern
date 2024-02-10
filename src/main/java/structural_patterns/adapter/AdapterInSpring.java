package structural_patterns.adapter;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {

    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        RequestMappingHandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();

    }

}
