package com.example.greenearth.PrivilegedConsumer;

import com.example.greenearth.PrivilegedConsumer.models.PrivilegedConsumer;
import com.fasterxml.jackson.core.JsonProcessingException;


import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class PrivilegedConsumerController {

    @Autowired
    PrivilegedConsumerService privilegedConsumerService;
    @Autowired
    private Validator validator;

    @PostMapping("/privileged")
    @ResponseBody
    @Validated
    public int create(@RequestBody PrivilegedConsumer privilegedConsumer) throws JsonProcessingException {
        return privilegedConsumerService.Create(privilegedConsumer);
    }

    @GetMapping ("/privileged/{id}")
    @ResponseBody
    @Validated
    public PrivilegedConsumer get(@PathVariable int id) {
        return privilegedConsumerService.getPrivilegedConsumer(id);
    }
}
