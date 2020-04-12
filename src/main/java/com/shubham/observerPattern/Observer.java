package com.shubham.observerPattern;

public interface Observer {

  void update();

  void observeSubject(Channel channel);

}
