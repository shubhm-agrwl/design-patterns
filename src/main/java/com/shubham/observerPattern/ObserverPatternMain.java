package com.shubham.observerPattern;

public class ObserverPatternMain {

  public static void main(String[] args) {

    Channel channel = new Channel();

    Subscriber subscriber = new Subscriber("Shubham");
    Subscriber subscriber1 = new Subscriber("Shubham1");
    Subscriber subscriber2 = new Subscriber("Shubham2");
    Subscriber subscriber3 = new Subscriber("Shubham3");

    channel.register(subscriber);
    channel.register(subscriber1);
    channel.register(subscriber2);
    channel.register(subscriber3);

    channel.deregister(subscriber2);

    subscriber.observeSubject(channel);
    subscriber1.observeSubject(channel);
    subscriber2.observeSubject(channel);
    subscriber3.observeSubject(channel);

    channel.upload("uploading");
  }

}
