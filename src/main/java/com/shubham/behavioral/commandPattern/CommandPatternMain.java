package com.shubham.behavioral.commandPattern;

public class CommandPatternMain {

  public static void main(String[] args) {
    Stock abcStock = new Stock();

    BuyStock buyStock = new BuyStock(abcStock);
    SellStock sellStock = new SellStock(abcStock);

    Broker broker = new Broker();
    broker.takeOrder(buyStock);
    broker.takeOrder(sellStock);
    broker.placeOrders();
  }

}
