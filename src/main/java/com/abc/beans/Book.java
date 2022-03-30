package com.abc.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "book")
public class Book {

//    @Value("${isbn}")
    private int isbn;
//    @Value("${author}")
    private String author;
//    @Value("${title}")
    private String title;
//    @Value("${publisherName}")
    private String publisherName;
//    @Value("${version}")
    private int version;
//    @Value("${price}")
    private double price;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", version=" + version +
                ", price=" + price +
                '}';
    }
}
