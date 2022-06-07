package com.example.demo.service;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.stereotype.Component;

@Component
@AutoConfigureBefore(
        value = {ConfigPro.class},
        name = {"com.example.demo.service.ConfigPro"}
)
public class BUser extends AUser implements User {

    public BUser(ConfigPro configPro) {
        super.put("name", configPro.getName());
    }
}
