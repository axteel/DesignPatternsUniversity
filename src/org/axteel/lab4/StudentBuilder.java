package org.axteel.lab4;

import java.util.List;

public final class StudentBuilder {
    public Boolean isStudent = true;
    private String username;
    private List<Book> borrowedBooks;
    private Boolean membership;

    private StudentBuilder() { }

    public static StudentBuilder aStudent() {
        return new StudentBuilder();
    }

    public StudentBuilder withIsStudent(Boolean isStudent) {
        this.isStudent = isStudent;
        return this;
    }

    public StudentBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public StudentBuilder withBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
        return this;
    }

    public StudentBuilder withMembership(Boolean membership) {
        this.membership = membership;
        return this;
    }

    public Student build() {
        return new Student(username, borrowedBooks, membership, isStudent);
    }
}
