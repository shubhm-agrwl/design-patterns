package com.shubham.creational.abstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

  @Override
  Color getColor(String color) {
    return null;
  }

  @Override
  Shape getShape(String shape) {
    switch (shape) {
      case "CIRCLE":
        return new Circle();
      case "RECTANGLE":
        return new Rectangle();
      case "SQUARE":
        return new Square();
      default:
        return null;
    }
  }
}
