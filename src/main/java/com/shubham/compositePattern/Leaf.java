package com.shubham.compositePattern;

public class Leaf implements Component {

  public Leaf(String name, int price) {
    this.name = name;
    this.price = price;
  }

  String name;
  int price;

  @Override
  public void showPrice() {
    System.out.println(name + " : " + price);
  }
}
