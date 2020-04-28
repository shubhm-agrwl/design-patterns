package com.shubham.creational.abstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

  @Override
  Color getColor(String color) {
    switch (color) {
      case "RED":
        return new Red();
      case "BLUE":
        return new Blue();
      case "GREEN":
        return new Green();
      default:
        return null;
    }
  }

  @Override
  Shape getShape(String shape) {
    return null;
  }
}
