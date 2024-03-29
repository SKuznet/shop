package com.shop.model;

import javax.annotation.PreDestroy;

public class Cat {
    private String name;
    private String description;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @PreDestroy
    public void cleanUp(){

    }
}
