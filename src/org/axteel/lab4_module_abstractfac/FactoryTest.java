package org.axteel.lab4_module_abstractfac;

public class FactoryTest {
    public static void main(String[] args) {
        Book book = new BookFactory().create(BookGenre.NOVEL);
        System.out.println("This is a " + book.getGenre());
    }
}
