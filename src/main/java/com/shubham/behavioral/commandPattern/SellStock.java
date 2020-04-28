package com.shubham.behavioral.commandPattern;

public class SellStock implements Order {

  private Stock abcStock;

  public SellStock(Stock stock) {
    this.abcStock = stock;
  }

  @Override
  public void execute() {
    abcStock.sell();
  }
}
