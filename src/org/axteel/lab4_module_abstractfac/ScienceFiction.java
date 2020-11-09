package org.axteel.lab4_module_abstractfac;

public class ScienceFiction implements Book {
    @Override
    public String getGenre() {
        return "I am a science fiction";
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public String getText() {
        return null;
    }
}
