package com.goodreads.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "work")
@XmlAccessorType(XmlAccessType.FIELD)
public class Work {
    private int id;
    @XmlElement(name = "books_count")
    private int bookCount;

    @XmlElement(name = "ratings_count")
    private int ratingsCount;

    @XmlElement(name="text_reviews_count")
    private int textReviewsCount;

    @XmlElement(name="original_publication_year")
    private int yearOfOriginalPublication;

    @XmlElement(name="original_publication_month")
    private int monthOfOriginalPublication;

    @XmlElement(name="original_publication_day")
    private int dayOfOriginalPublication;


    @XmlElement(name="average_rating")
    private Double averageRating;

    @XmlElement(name="best_book" , type = Book.class)
    private Book book;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public int getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(int ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public int getTextReviewsCount() {
        return textReviewsCount;
    }

    public void setTextReviewsCount(int textReviewsCount) {
        this.textReviewsCount = textReviewsCount;
    }

    public int getYearOfOriginalPublication() {
        return yearOfOriginalPublication;
    }

    public void setYearOfOriginalPublication(int yearOfOriginalPublication) {
        this.yearOfOriginalPublication = yearOfOriginalPublication;
    }

    public int getMonthOfOriginalPublication() {
        return monthOfOriginalPublication;
    }

    public void setMonthOfOriginalPublication(int monthOfOriginalPublication) {
        this.monthOfOriginalPublication = monthOfOriginalPublication;
    }

    public int getDayOfOriginalPublication() {
        return dayOfOriginalPublication;
    }

    public void setDayOfOriginalPublication(int dayOfOriginalPublication) {
        this.dayOfOriginalPublication = dayOfOriginalPublication;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
