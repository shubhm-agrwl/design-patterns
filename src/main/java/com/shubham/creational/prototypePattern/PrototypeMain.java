package com.shubham.creational.prototypePattern;

/*
@Author Shubham Agrawal
 */

public class PrototypeMain {

  public static void main(String[] args) throws CloneNotSupportedException {

    BookShop bookShop = new BookShop();
    bookShop.setShopName("Book ShopMain Name");
    bookShop.loadData();
    System.out.println(bookShop);

    BookShop bookShop1 = bookShop.clone();
    bookShop1.setShopName("ShopMain 2");
    System.out.println(bookShop1);

  }

}
