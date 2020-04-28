package com.shubham.behavioral.statePattern;

public class StopState implements State {

  @Override
  public void doAction(Context context) {
    System.out.println("Stop State");
    context.setState(this);
  }

  public String toString() {
    return "Stopping state";
  }

}
