package org.axteel.lab4;

import java.util.ArrayList;
import java.util.List;

/**
 * Assignment 4 - Simple Library System
 * The User class is an abstract and is inherited by the Student and Pupil classes. Moreover, each
 * of them may or may not have a membership. We need to make sure that Student and Pupil are created
 * using the Builder pattern. At the same time, the creation of Student and Pupil should be controlled
 * using the Factory Method pattern.
 * The Library class should only be in one instance. Implement it using the Singleton pattern.
 *
 * We have a lot of books, and they are of different genres.
 * And even more, books of even one genre can have an age limit.
 * Implement the creation of books using the Abstract Factory pattern.
 * You must have at least two specific factories.
 *
 * User class (Create an User class using Builder Pattern)
 *
 * Fields:
 *
 * id: int,
 *
 * username: String,
 *
 * borrowedBooks: List<Book>
 *
 * membership: Boolean (optional)
 *
 * Methods:
 *
 * borrow(): void
 *
 * calculate(): double
 *
 * Pupil class (extends User) - Create this object using Factory Method Pattern
 *
 * Student class (extends User) - Create this object using Factory Method Pattern
 *
 * Library class (Singleton class) - has list of books
 *
 * Book class - multiple types of books (different genres, eg. historical books, textbooks, etc.)
*
* */

public class SimpleLibrarySystem {
    private static Library library = Library.getInstance();


    public static void main(String[] args) {
        initData();
    }

    public static void initData() {
        ArrayList<Book> bookCollection = new ArrayList<>(){{
            add(new Book.Builder()
                    .setId(1L)
                    .setTitle("War & Peace")
                    .setAuthor("Leo Tolstoy")
                    .build()
            );
            add(new Book.Builder()
                    .setId(2L)
                    .setTitle("The Hanger Games")
                    .setAuthor("Suzanne Collins")
                    .build()
            );
            add(new Book.Builder()
                    .setId(3L)
                    .setTitle("To Kill a Mockingbird")
                    .setAuthor("Harper Lee")
                    .build()
            );
            add(new Book.Builder()
                    .setId(4L)
                    .setTitle("Under the Pyramids")
                    .setAuthor("Howard Phillips Lovecraft")
                    .build())
            ;
        }};

        String[] names = new String[]{"Andrey", "Bolat", "Jessica", "Altinay"};
        String[] types = new String[]{"student", "pupil", "student", "undefined demo"};

        ArrayList<User> users = new ArrayList<>();

        UserStore store = new UserStore();

        for (int i = 0; i < names.length; i++) {
            User u = null;
            try {
                u = store.createUser(types[i]);
                u.setUsername(names[i]);
                u.setMembership(true);
                users.add(u);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        library.setUsers(users);
        library.setBookList(bookCollection);

        System.out.println("Primary data was initialized successfully");
    }
}
