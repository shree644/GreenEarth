package com.example.greenearth.ConsumerProfile;
import com.example.greenearth.ConsumerProfile.models.Consumer;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ConsumerRepository extends CrudRepository<Consumer,Long>{
    Consumer findConsumerById(String Id);


}
