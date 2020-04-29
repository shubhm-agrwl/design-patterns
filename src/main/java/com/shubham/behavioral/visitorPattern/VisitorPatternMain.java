package com.shubham.behavioral.visitorPattern;

/*
@Author Shubham Agrawal
 */
public class VisitorPatternMain {

  public static void main(String[] args) {
    ComputerPart computerPart = new Computer();
    computerPart.accept(new ComputerPartDisplayVisitor());
  }

}
