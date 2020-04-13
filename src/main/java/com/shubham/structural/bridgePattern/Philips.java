package com.shubham.structural.bridgePattern;

public class Philips extends TV {

  Remote remote;

  Philips(Remote remote) {
    super(remote);
    this.remote = remote;
  }

  @Override
  void on() {
    System.out.println("Philips TV ON");
    remote.on();

  }

  @Override
  void off() {
    System.out.println("Philips TV OFF");
    remote.off();
  }
}
