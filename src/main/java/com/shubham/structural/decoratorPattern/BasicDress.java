package com.shubham.structural.decoratorPattern;

public class BasicDress implements Dress {

  @Override
  public void assemble() {
    System.out.println("Basic Dress features");
  }
}
