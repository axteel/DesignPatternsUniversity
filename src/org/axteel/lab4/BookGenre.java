package org.axteel.lab4;

public enum BookGenre {
    NOVEL("Novel"),
    SCIENCE_FICTION("Science Fiction"),
    OTHER("Other");

    private String genre;

    BookGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
