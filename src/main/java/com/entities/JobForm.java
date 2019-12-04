package com.entities;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bookstore")
public class JobForm {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "bookauthor")
    private String bookauthor;

    @Column(name = "bookname")
    private String bookname;

    @Column(name = "bookgenre")
    private String bookgenre;

    @Column(name = "booktitle")
    private String booktitle;

    @Column(name = "bookpages")
    private String bookpages;

    @Column(name = "bookprice")
    private String bookprice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookgenre() {
        return bookgenre;
    }

    public void setBookgenre(String bookgenre) {
        this.bookgenre = bookgenre;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getBookpages() {
        return bookpages;
    }

    public void setBookpages(String bookpages) {
        this.bookpages = bookpages;
    }

    public String getBookprice() {
        return bookprice;
    }

    public void setBookprice(String bookprice) {
        this.bookprice = bookprice;
    }

    @Override
    public String toString() {
        return "JobForm{" +
                "id=" + id +
                ", bookauthor='" + bookauthor + '\'' +
                ", bookname='" + bookname + '\'' +
                ", bookgenre='" + bookgenre + '\'' +
                ", booktitle='" + booktitle + '\'' +
                ", bookpages='" + bookpages + '\'' +
                ", bookprice='" + bookprice + '\'' +
                '}';
    }
}
