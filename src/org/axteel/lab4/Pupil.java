package org.axteel.lab4;

import java.util.List;

public class Pupil extends User {
    public final Boolean isPupil = true;

    public Pupil(String username, List<Book> borrowedBooks, Boolean membership) {
        super(username, borrowedBooks, membership);
    }
}
