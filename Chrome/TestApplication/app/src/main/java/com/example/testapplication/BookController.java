package com.example.testapplication;

public class BookController {
    private MainActivity main;
    public void BookController(MainActivity main){
        this.main=main;
    }
    public void findBook(){
        Books books=new Books(main);
        books.findBook();
    }
}
