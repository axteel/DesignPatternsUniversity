package org.axteel.lab4;

import java.util.List;


/**
 * At the same time, the creation of Student and Pupil should be controlled
 * using the Factory Method pattern.
 * Thats why we need abstract People
 * */

public abstract class User {
    private String username;
    private List<Book> borrowedBooks;
    private Boolean membership;

    public User(String username, List<Book> borrowedBooks, Boolean membership) {
        this.username = username;
        this.borrowedBooks = borrowedBooks;
        this.membership = membership;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public Boolean getMembership() {
        return membership;
    }

    public void setMembership(Boolean membership) {
        this.membership = membership;
    }

    public void borrow() { }

    public double calculate() {
        return 0;
    }

    @Override
    public String toString() {
        return "User {" +
                ", username='" + username + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                ", membership=" + membership +
                '}';
    }
}
