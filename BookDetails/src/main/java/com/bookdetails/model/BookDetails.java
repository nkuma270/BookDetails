package com.bookdetails.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="bookdetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookDetails {

    private int book_id;
    private String book_name;
    private String publisher;
    private String author;
    private Double price;

    public BookDetails(){}

    public BookDetails(int book_id, String book_name, String publisher, String author, Double price) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
