package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String ISBN;
    private String author;
    private double price;

    public Book() {

    }

    public Book(String title, String ISBN, String author, double price) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
