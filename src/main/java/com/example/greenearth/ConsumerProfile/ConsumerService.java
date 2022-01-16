package com.example.greenearth.ConsumerProfile;

import com.example.greenearth.ConsumerProfile.models.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    public Consumer GetConsumer(String id)
    {
        return consumerRepository.findConsumerById(id);
    }

    public Consumer Create(Consumer consumer) {
       return consumerRepository.save(consumer);
    }

    public Consumer update(Consumer consumer) {
        return consumerRepository.save(consumer);
    }
}
