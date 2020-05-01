package com.example.resteventhandler;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RestEventHandlerApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        ResponseEntity<String> response1 = restTemplate.postForEntity("/entityOne", new EntityOne(), String.class);
        assertEquals(HttpStatus.CREATED, response1.getStatusCode());

        ResponseEntity<String> response2 = restTemplate.postForEntity("/entityTwo", new EntityTwo(), String.class);
        assertEquals(HttpStatus.CREATED, response2.getStatusCode());
    }
}
