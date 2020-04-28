package com.shubham.behavioral.visitorPattern;

public interface ComputerPart {

  public void accept(ComputerPartVisitor computerPartVisitor);

}
