package com.example.greenearth.ConsumerProfile;

import com.example.greenearth.ConsumerProfile.models.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class ConsumerController {

    private ConsumerService _consumerService;

    @Autowired
    public ConsumerController(ConsumerService consumerService) {
        _consumerService = consumerService;
    }


    @GetMapping("/consumer/{id}")
    Consumer getConsumer(@PathVariable String id) throws Exception {
        return _consumerService.GetConsumer(id);
    }

    @PostMapping("/consumer")
    @ResponseStatus(HttpStatus.CREATED)
    Consumer create(@RequestBody Consumer  consumer) throws Exception{
           Consumer consumerCreated = _consumerService.Create(consumer);
      return consumerCreated;
    }

    @PutMapping("/consumer")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    Consumer update1(@RequestBody Consumer consumer)
    {
         return _consumerService.update(consumer);
    }

}
