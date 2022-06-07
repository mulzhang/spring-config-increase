package com.example.demo.service;

import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class AUser implements User {
    private Properties properties;


    public AUser() {
        properties = new Properties();
        this.properties.put("1", 222);
    }

    @Override
    public Object get(String key) {
        return this.properties.get(key);
    }

    @Override
    public Object put(String key, Object o) {
        return properties.put(key, o);
    }
}
