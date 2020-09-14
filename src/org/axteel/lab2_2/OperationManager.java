package org.axteel.lab2_2;

public interface OperationManager<T> {
    T withdraw(double amount);
    T deposit(double amount);
}
