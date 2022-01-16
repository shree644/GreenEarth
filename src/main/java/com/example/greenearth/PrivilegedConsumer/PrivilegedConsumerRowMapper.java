package com.example.greenearth.PrivilegedConsumer;

import com.example.greenearth.PrivilegedConsumer.models.NewConsumer;
import com.example.greenearth.PrivilegedConsumer.models.PrivilegedConsumer;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrivilegedConsumerRowMapper implements RowMapper<PrivilegedConsumer> {


    @SneakyThrows
    @Override
    public PrivilegedConsumer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        ObjectMapper objectMapper = new ObjectMapper();
       NewConsumer c =  objectMapper.readValue(resultSet.getString("data"),NewConsumer.class);
        PrivilegedConsumer privilegedConsumer = new PrivilegedConsumer(resultSet.getInt("id"),c);
        return privilegedConsumer;
    }
}
