package org.itstep.helloworldspring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTPResponse {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldPassIfStringMatches(){
        Assertions.assertEquals("Hello World from Spring Boot",
                testRestTemplate.getForObject("http://localhost:"+port+"/",String.class));
    }

    @Test
    public void shouldPassIfStringMatchesBye(){
        Assertions.assertEquals("Hello World from Spring Boot",
                testRestTemplate.getForObject("http://localhost:"+port+"/bye",String.class));
    }
}
