package com.shubham.structural.bridgePattern;

/*
@Author Shubham Agrawal
 */
public class BridgePatternExampleMain {

  public static void main(String[] args) {

    TV sonyOldRemote = new Sony(new OldRemote());
    sonyOldRemote.on();
    sonyOldRemote.off();
    System.out.println();

    TV philipsNewRemote = new Philips(new NewRemote());
    philipsNewRemote.on();
    philipsNewRemote.off();
    System.out.println();
  }

}
