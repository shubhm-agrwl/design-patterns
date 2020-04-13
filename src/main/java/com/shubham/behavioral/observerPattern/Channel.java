package com.shubham.behavioral.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

  private List<Subscriber> subscribers = new ArrayList<>();
  public String title;

  public void register(Subscriber subscriber) {
    subscribers.add(subscriber);
  }

  public void deregister(Subscriber subscriber) {
    subscribers.remove(subscriber);
  }

  public void notifyObserver() {
    for (Subscriber subscriber : subscribers) {
      subscriber.update();
    }
  }

  public void upload(String title) {
    this.title = title;
    notifyObserver();
  }

}
