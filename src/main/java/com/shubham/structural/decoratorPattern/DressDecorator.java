package com.shubham.structural.decoratorPattern;

public class DressDecorator implements Dress {

  protected Dress dress;

  public DressDecorator(Dress dress) {
    this.dress = dress;
  }

  @Override
  public void assemble() {
    this.dress.assemble();
  }
}
