package com.shubham.creational.abstractFactoryPattern;

public class FactoryProducer {

  public static AbstractFactory getFactory(String choice) {
    switch (choice) {
      case "SHAPE":
        return new ShapeFactory();
      case "COLOR":
        return new ColorFactory();
      default:
        return null;
    }
  }

}
