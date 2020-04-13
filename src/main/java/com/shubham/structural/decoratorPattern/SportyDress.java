package com.shubham.structural.decoratorPattern;

public class SportyDress extends DressDecorator {

  public SportyDress(Dress dress) {
    super(dress);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Sporty Dress Features");
  }

}
