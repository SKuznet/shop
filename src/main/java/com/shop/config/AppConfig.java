package com.shop.config;

import com.shop.model.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Cat cat() {
        // custom logic
        Cat cat = new Cat();
        cat.setDescription("asdasdasd");
        // logic
        cat.setName("asdadad");
        return cat;
    }
}
