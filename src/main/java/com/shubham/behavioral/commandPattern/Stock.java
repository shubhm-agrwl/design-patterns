package com.shubham.behavioral.commandPattern;

public class Stock {

  private String name = "ABC";
  private int quantity = 10;

  public void buy(){
    System.out.println("Bought");
  }

  public void sell(){
    System.out.println("Sold");
  }

}
