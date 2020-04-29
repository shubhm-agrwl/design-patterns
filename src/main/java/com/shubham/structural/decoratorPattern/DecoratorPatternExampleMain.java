package com.shubham.structural.decoratorPattern;

/*
@Author Shubham Agrawal
 */
public class DecoratorPatternExampleMain {

  public static void main(String[] args) {

    Dress sportyDress = new SportyDress(new BasicDress());
    sportyDress.assemble();
    System.out.println();

    Dress fancyDress = new FancyDress(new BasicDress());
    fancyDress.assemble();
    System.out.println();

    Dress casualSportyDress = new CasualDress(new FancyDress(new BasicDress()));
    casualSportyDress.assemble();
    System.out.println();

  }

}
