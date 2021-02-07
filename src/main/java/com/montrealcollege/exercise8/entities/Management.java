package com.montrealcollege.exercise8.entities;

import org.springframework.stereotype.Component;

@Component
public class Management implements Department{

    private String name = "Management";

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
        return "Management{" +
                "name='" + name + '\'' +
                '}';
    }
}
