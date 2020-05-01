package com.example.resteventhandler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestEventHandlerApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() {
        ResponseEntity<String> response1 = restTemplate.postForEntity("/entityOne", new EntityOne(), String.class);
        assertEquals(HttpStatus.CREATED, response1.getStatusCode());

        ResponseEntity<String> response2 = restTemplate.postForEntity("/entityTwo", new EntityTwo(), String.class);
        assertEquals(HttpStatus.CREATED, response2.getStatusCode());
    }
}
