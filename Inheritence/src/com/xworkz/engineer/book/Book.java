package com.xworkz.engineer.book;

public class Book {

    private int bookId;
    private String bookName;
    private double price;
    private String author;


    //accessor-->getter-->getters have return type same name as instance variable name for which variable want to return
    //mutators-->setter-->setters have no return type, with parameter each method hold only one variable or fields

    public void setBookId(int bookId1){
        bookId=bookId1;
    }
    public int getBookId(){
        return bookId;
    }

    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getBookName(){
        return bookName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return this.author;
    }
    public String toString(){
        return "Book = {Book_Id : "+bookId+" bookName :"+bookName+" bookAuthor : "+author+" Book_Price : "+price;
    }
}