package org.axteel.lab4;

import java.util.List;

public final class PupilBuilder {
    private String username;
    private List<Book> borrowedBooks;
    private Boolean membership;

    private PupilBuilder() {
    }

    public static PupilBuilder aPupil() {
        return new PupilBuilder();
    }

    public PupilBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public PupilBuilder withBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
        return this;
    }

    public PupilBuilder withMembership(Boolean membership) {
        this.membership = membership;
        return this;
    }

    public Pupil build() {
        return new Pupil(username, borrowedBooks, membership);
    }
}
