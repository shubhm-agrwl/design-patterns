package com.shubham.creational.prototypePattern;

/*
@Author Shubham Agrawal
 */

public class PrototypeMain {

  public static void main(String[] args) throws CloneNotSupportedException {

    BookShop bookShop = new BookShop();
    bookShop.setShopName("PrototypePatternMain");
    bookShop.loadData();
    System.out.println(bookShop);

    BookShop bookShop1 = bookShop.clone();
    bookShop1.setShopName("PrototypePatternMain 2");
    System.out.println(bookShop1);

  }

}
