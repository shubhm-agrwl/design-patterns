package com.shubham.behavioral.visitorPattern;

public class Mouse implements ComputerPart {

  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }
}
