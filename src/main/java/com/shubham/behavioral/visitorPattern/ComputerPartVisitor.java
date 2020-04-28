package com.shubham.behavioral.visitorPattern;

public interface ComputerPartVisitor {

  void visit(Keyboard keyboard);

  void visit(Monitor monitor);

  void visit(Mouse mouse);

  void visit(Computer computer);
}
