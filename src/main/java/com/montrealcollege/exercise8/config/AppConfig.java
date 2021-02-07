package com.montrealcollege.exercise8.config;

import com.montrealcollege.exercise8.entities.Department;
import com.montrealcollege.exercise8.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.montrealcollege")
public class AppConfig {

    @Autowired
    @Qualifier("programming")
    private Department progDept;

    @Autowired
    @Qualifier("qualityAssurance")
    private Department qaDept;

    @Autowired
    @Qualifier("management")
    private Department mgmDept;

    @Bean
    public Employee employee1() {
        return new Employee("Luke Skywalker", progDept);
    }

    @Bean
    public Employee employee2() {
        return new Employee("Anakin Skywalker", mgmDept);
    }

    @Bean
    public Employee employee3() {
        return new Employee("R2 D2", qaDept);
    }

    @Bean
    public Employee employee4() {
        return new Employee("Leah Skywalker", progDept);
    }
}
