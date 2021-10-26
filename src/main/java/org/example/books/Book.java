package org.example.books;

public class Book {

    private String title;
    private String author;
    private int year;
    private int pages;
    public Category category;
    public enum Category {
        CHILD, ADULT, NOT_LOANABLE
    }


    public Book() {
        pages = 100;
    }


    public Book(String title, String author,Category Category, int year, int pages) {
        setTitle(title);
        setAuthor(author);
        category = Category;
        setYear(year);
        setPages(pages);
    }

    public Category getCategory(){
        return category;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}