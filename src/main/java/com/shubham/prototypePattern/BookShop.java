package com.shubham.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

  private String shopName;
  List<Book> books = new ArrayList<>();

  @Override
  public String toString() {
    return "BookShop{" +
        "shopName='" + shopName + '\'' +
        ", books=" + books +
        '}';
  }

  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public void loadData() {
    for (int i = 0; i < 10; i++) {
      Book b = new Book();
      b.setId(i);
      b.setName("book" + i);
      getBooks().add(b);
    }
  }

  @Override
  protected BookShop clone() throws CloneNotSupportedException {
    BookShop bookShop = new BookShop();

    for (Book b : this.getBooks()){
      bookShop.getBooks().add(b);
    }

    return bookShop;
  }
}
