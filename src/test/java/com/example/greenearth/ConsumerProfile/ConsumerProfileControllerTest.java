package com.example.greenearth.ConsumerProfile;

import com.example.greenearth.ConsumerProfile.models.Consumer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(ConsumerController.class)
public class ConsumerProfileControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private ConsumerService consumerService;

    @Test
    public void ShouldGetConsumerProfileForConsumerId() throws Exception {
        String Id = "1234";
        Consumer consumer = new Consumer();
        when(consumerService.GetConsumer(Id)).thenReturn(consumer);
        mockMvc.perform(get("/consumer/{id}", Id)
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());
        verify(consumerService, times(1)).GetConsumer("1234");

    }

    @Test
    public void shouldCreateConsumerProfile() throws Exception {
        Consumer consumer = new Consumer("5454", "TestUser");

        when(consumerService.Create(consumer)).thenReturn(consumer);
        mockMvc.perform(post("/consumer")
                .content(objectMapper.writeValueAsString(consumer))
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isCreated());
       // verify(consumerService, times(1)).Create(consumer);
    }

    @Test
    void shouldUpdateConsumerProfile() throws Exception{
        Consumer consumer = new Consumer("5454", "TestUser");

        when(consumerService.update(consumer)).thenReturn(consumer);
        mockMvc.perform(put("/consumer")
                .content(objectMapper.writeValueAsString(consumer))
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isNoContent());
      //  verify(consumerService, times(1)).update(consumer);
    }
}
