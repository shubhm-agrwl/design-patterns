package com.shubham.creational.abstractFactoryPattern;

public class AbstractFactoryPatternMain {

  public static void main(String[] args) {

    AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
    Shape shape1 = shapeFactory.getShape("CIRCLE");
    shape1.draw();
    Shape shape2 = shapeFactory.getShape("SQUARE");
    shape2.draw();

    AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
    Color color1 = colorFactory.getColor("BLUE");
    color1.fill();
    Color color2 = colorFactory.getColor("GREEN");
    color2.fill();
  }

}
