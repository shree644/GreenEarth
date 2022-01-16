package com.example.greenearth.ConsumerProfile;

import com.example.greenearth.ConsumerProfile.models.Consumer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ConsumerServiceTest {


    @Autowired
    private ConsumerRepository consumerRepository;
    @Autowired
    ConsumerService consumerService;

    @AfterEach
    void tearDown() {
        consumerRepository.deleteAll();
    }

    @Test
    void shouldGetConsumerById()
    {
        String id = "12345";
        consumerRepository.save(new Consumer("12345","Shree"));
        Consumer consumer = consumerService.GetConsumer(id);
        assertEquals("12345",consumer.getId());
        assertEquals("Shree",consumer.getName());
    }
    @Test
    void shouldCreateConsumerProfile()
    {
        Consumer consumer = new Consumer("123456","TestUser");
        Consumer consumerCreated = consumerService.Create(consumer);
        assertEquals("123456",consumerCreated.getId());
        assertEquals("TestUser",consumerCreated.getName());
    }

}
