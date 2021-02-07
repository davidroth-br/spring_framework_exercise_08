package com.montrealcollege.exercise8;

import com.montrealcollege.exercise8.config.AppConfig;
import com.montrealcollege.exercise8.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp1 = context.getBean("employee1", Employee.class);
        Employee emp2 = context.getBean("employee2", Employee.class);
        Employee emp3 = context.getBean("employee3", Employee.class);
        Employee emp4 = context.getBean("employee4", Employee.class);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
    }
}
