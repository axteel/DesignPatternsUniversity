package org.axteel.lab4;

public class Book {
    private Long id;
    private String title;
    private String author;
    private BookGenre bookGenre;

    public Book(Long id, String title, String author, BookGenre bookGenre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.bookGenre = bookGenre;
    }

    static class Builder {
        private Long id;
        private String title;
        private String author;
        private BookGenre bookGenre;

        public Builder setId(Long id) {
            this.id = id;

            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;

            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;

            return this;
        }

        public Builder setBookGenre(BookGenre bookGenre) {
            this.bookGenre = bookGenre;

            return this;
        }

        public Book build() {
            return new Book(id, title, author, bookGenre);
        }
    }
}
