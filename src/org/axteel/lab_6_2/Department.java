package org.axteel.lab_6_2;

import java.util.List;

public class Department extends BaseDivision {
    protected List<Employee> employees;

    public Department(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Department: " + super.name);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
