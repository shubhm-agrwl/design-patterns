package com.shubham.behavioral.statePattern;

public class StartState implements State {

  @Override
  public void doAction(Context context) {
    System.out.println("Start State");
    context.setState(this);
  }

  public String toString() {
    return "Starting state";
  }
}
