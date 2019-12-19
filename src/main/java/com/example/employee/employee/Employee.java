package com.example.employee.employee;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/*
 *@setter annotation is indication of  setter methods
 *@Getter annotation is indication  of   getter methods
 *@ToString annotation is indication of ToString method
 *@componet is indication of component class
 *@value is an interface which is used to set a value
 *
 *
 *
 */

@Getter
@Setter
@ToString

public class Employee {

    private String name;
    private String email;

    public Employee() {
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
