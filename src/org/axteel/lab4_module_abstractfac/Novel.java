package org.axteel.lab4_module_abstractfac;

public class Novel implements Book {
    private String author;
    private String text;

    public Novel() {
        this.author = "Null author";
        this.text = "Null text";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public String getGenre() {
        return BookGenre.NOVEL.getGenre();
    }
}