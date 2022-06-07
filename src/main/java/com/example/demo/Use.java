package com.example.demo;

import com.example.demo.service.User;

public class Use {

    public Use(User user) {
        final Object name = user.get("name");
        if (name == null) {
            throw new RuntimeException("xxx");
        }else {
            System.out.println(name);
        }
    }
}
