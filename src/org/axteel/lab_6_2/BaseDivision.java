package org.axteel.lab_6_2;

public abstract class BaseDivision implements Division {
    protected String name;

    public BaseDivision(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}
