package creational_patterns.builder;

import java.nio.charset.StandardCharsets;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        UriComponents encodedNaverUri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("www.naver.com")
                .path("blog")
                .build().encode(StandardCharsets.UTF_16LE);
        System.out.println("encodedNaverUri = " + encodedNaverUri);
    }

}
