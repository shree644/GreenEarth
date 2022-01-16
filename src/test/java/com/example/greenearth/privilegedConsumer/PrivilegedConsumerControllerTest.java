package com.example.greenearth.privilegedConsumer;

import com.example.greenearth.PrivilegedConsumer.PrivilegedConsumerController;
import com.example.greenearth.PrivilegedConsumer.PrivilegedConsumerService;
import com.example.greenearth.PrivilegedConsumer.models.NewConsumer;
import com.example.greenearth.PrivilegedConsumer.models.PrivilegedConsumer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

@WebMvcTest(PrivilegedConsumerController.class)
public class PrivilegedConsumerControllerTest {
    @MockBean
    private PrivilegedConsumerService privilegedConsumerService;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    private PrivilegedConsumer privilegedConsumer;
    
//    @BeforeAll
//    void TestSetup() throws IOException {
//       privilegedConsumer =  objectMapper.readValue(Paths.get("privilegedConsumerData").toFile(), PrivilegedConsumer.class);
//
//    }
    @Test
    void shouldCreatePrivilegedConsumer() throws Exception {
//
        privilegedConsumer =  objectMapper.readValue(Paths.get("src/test/java/com/example/greenearth/privilegedConsumer/privilegedConsumerData.json").toFile(), PrivilegedConsumer.class);
        when(privilegedConsumerService.Create(privilegedConsumer)).thenReturn(1);
        mockMvc.perform(post("/privileged")
                .content(objectMapper.writeValueAsString(privilegedConsumer))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
        verify(privilegedConsumerService).Create(Mockito.any());
    }
    @Test
    void shouldNotCreatePrivilegedConsumerAndReturn400() throws Exception {
        privilegedConsumer =  new PrivilegedConsumer();
        when(privilegedConsumerService.Create(privilegedConsumer)).thenReturn(1);
        mockMvc.perform(post("/privileged")
                        .content(objectMapper.writeValueAsString(null))
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

    @Test
    void shouldGetPrivilegedConsumerById() throws Exception {
        privilegedConsumer =  objectMapper.readValue(Paths.get("src/test/java/com/example/greenearth/privilegedConsumer/privilegedConsumerData.json").toFile(), PrivilegedConsumer.class);
        when(privilegedConsumerService.getPrivilegedConsumer(5434)).thenReturn(privilegedConsumer);
        mockMvc.perform(get("/privileged/{id}",5434)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
