package org.axteel.lab4_module_abstractfac;

interface Factory<T, I extends Enum> {
    T create(I type);
}

public class BookFactory implements Factory<Book, BookGenre> {
    @Override
    public Book create(BookGenre type) {
        System.out.println("Creating " + type);
        switch (type) {
            case NOVEL: return new Novel();
            case SCIENCE_FICTION: return new ScienceFiction();
            default: return null;
        }
    }
}
