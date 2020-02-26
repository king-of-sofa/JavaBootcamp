package lv.messages;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private int pages;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public String toString() {
        return "[Book]\n" +
                "Author: " + author + "\n" +
                "Title: " + title + "\n" +
                "Pages: " + pages + "\n";
    }

    public Book(String author, String title, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;

    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
