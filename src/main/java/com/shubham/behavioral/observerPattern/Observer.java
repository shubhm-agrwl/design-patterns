package com.shubham.behavioral.observerPattern;

public interface Observer {

  void update();

  void observeSubject(Channel channel);

}
