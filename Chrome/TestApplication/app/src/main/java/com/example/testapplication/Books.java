package com.example.testapplication;

public class Books {
    private MainActivity main;
     private String bookname="android开发者艺术";
     private int price=100;
     public  Books(MainActivity main){
         this.main=main;
     }

     public void findBook(){

     }

     public String toString(){
      return "bookname"+bookname+"price"+price;
     }
}
