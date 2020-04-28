package com.shubham.behavioral.visitorPattern;

public class VisitorPatternMain {

  public static void main(String[] args) {
    ComputerPart computerPart = new Computer();
    computerPart.accept(new ComputerPartDisplayVisitor());
  }

}
