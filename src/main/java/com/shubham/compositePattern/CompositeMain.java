package com.shubham.compositePattern;

/*
@Author Shubham Agrawal
 */

public class CompositeMain {

  public static void main(String[] args) {

    Component hd = new Leaf("HDD", 4000);
    Component mouse = new Leaf("Mouse", 400);
    Component monitor = new Leaf("Monitor", 8000);
    Component ram = new Leaf("RAM", 6000);
    Component cpu = new Leaf("CPU", 10000);

    Composite ph = new Composite("Peri");
    Composite cabinet = new Composite("Cabinet");
    Composite mb = new Composite("MB");
    Composite computer = new Composite("Computer");

    ph.addComponent(monitor);
    ph.addComponent(mouse);

    mb.addComponent(ram);
    mb.addComponent(cpu);

    cabinet.addComponent(hd);
    cabinet.addComponent(mb);

    computer.addComponent(cabinet);
    computer.addComponent(ph);

    computer.showPrice();
  }

}
