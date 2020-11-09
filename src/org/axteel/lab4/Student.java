package org.axteel.lab4;


import java.util.List;

public class Student extends User {
    public Boolean isStudent = true;

    public Student(String username, List<Book> borrowedBooks, Boolean membership, Boolean isStudent) {
        super(username, borrowedBooks, membership);
        this.isStudent = isStudent;
    }


}
