package com.shubham.structural.decoratorPattern;

public class CasualDress extends DressDecorator {

  public CasualDress(Dress dress) {
    super(dress);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Casual Dress Features");
  }
}
