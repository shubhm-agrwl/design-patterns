package com.shubham.behavioral.visitorPattern;

public class Computer implements ComputerPart {

  ComputerPart[] computerParts;

  public Computer() {
    computerParts = new ComputerPart[]{new Mouse(), new Monitor(), new Keyboard()};
  }

  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    for (int i = 0; i < computerParts.length; i++) {
      computerParts[i].accept(computerPartVisitor);
    }
    computerPartVisitor.visit(this);
  }
}
