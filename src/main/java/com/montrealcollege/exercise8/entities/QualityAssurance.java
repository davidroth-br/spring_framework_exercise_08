package com.montrealcollege.exercise8.entities;

import org.springframework.stereotype.Component;

@Component
public class QualityAssurance implements Department{

    private String name = "Quality Assurance";

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
        return "QualityAssurance{" +
                "name='" + name + '\'' +
                '}';
    }
}
