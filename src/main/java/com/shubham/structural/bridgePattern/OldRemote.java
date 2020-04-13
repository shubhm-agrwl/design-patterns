package com.shubham.structural.bridgePattern;

public class OldRemote implements Remote {

  @Override
  public void on() {
    System.out.println("ON with Old Remote");
  }

  @Override
  public void off() {
    System.out.println("OFF with Old Remote");
  }
}
