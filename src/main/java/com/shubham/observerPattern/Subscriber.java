package com.shubham.observerPattern;

public class Subscriber implements Observer {

  public Subscriber(String name) {
    this.name = name;
  }

  private String name;
  private Channel channel;

  public void update() {
    System.out.println(name + " : Update : " + channel.title);
  }

  public void observeSubject(Channel channel) {
    this.channel = channel;
  }

}
