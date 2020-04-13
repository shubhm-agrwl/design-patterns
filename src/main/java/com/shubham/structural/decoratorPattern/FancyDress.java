package com.shubham.structural.decoratorPattern;

public class FancyDress extends DressDecorator {

  public FancyDress(Dress dress) {
    super(dress);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Fancy Dress Features");
  }

}
