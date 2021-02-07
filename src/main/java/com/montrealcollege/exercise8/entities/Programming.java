package com.montrealcollege.exercise8.entities;

import org.springframework.stereotype.Component;

@Component
public class Programming implements Department {

    private String name = "Programming";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Programming{" +
                "name='" + name + '\'' +
                '}';
    }
}
