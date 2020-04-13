package com.shubham.behavioral.observerPattern;

public interface Subject {

  void register(Subscriber subscriber);

  void deregister(Subscriber subscriber);

  void notifyObserver();

  void upload(String title);

}
