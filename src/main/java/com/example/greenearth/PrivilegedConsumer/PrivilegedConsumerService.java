package com.example.greenearth.PrivilegedConsumer;

import com.example.greenearth.PrivilegedConsumer.models.PrivilegedConsumer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PrivilegedConsumerService {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    ObjectMapper objectMapper;


    public int Create(PrivilegedConsumer privilegedConsumer) throws JsonProcessingException {
        String jsonData = objectMapper.writeValueAsString(privilegedConsumer.getNewConsumer());
        return jdbcTemplate.update("Insert into PrivilegedConsumer(id,data) values(?,?::jsonb)",privilegedConsumer.getId(),jsonData);
    }

    public PrivilegedConsumer getPrivilegedConsumer(int id) {
        String sqlQuery = "select * from privilegedconsumer where id= ?";
        return jdbcTemplate.queryForObject(sqlQuery,new Object[]{id},new PrivilegedConsumerRowMapper());
       // return  privilegedConsumerRepository.findPrivilegedConsumerById(id);

    }
}
