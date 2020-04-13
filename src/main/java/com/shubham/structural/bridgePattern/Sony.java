package com.shubham.structural.bridgePattern;

public class Sony extends TV {

  Remote remote;

  Sony(Remote remote) {
    super(remote);
    this.remote = remote;
  }

  @Override
  void on() {
    System.out.println("Sony TV ON");
    remote.on();
  }

  @Override
  void off() {
    System.out.println("Sony TV OFF");
    remote.off();
  }
}
