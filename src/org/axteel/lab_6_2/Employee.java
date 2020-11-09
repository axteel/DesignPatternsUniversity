package org.axteel.lab_6_2;

public class Employee extends BaseDivision {
    private final String position;

    public Employee(String name, String position) {
        super(name);
        this.position = position;
    }

    @Override
    public void display() {
        System.out.println("Employee: " + super.name + "\n" + "Position: " + position);
    }
}
