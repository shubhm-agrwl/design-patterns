package com.shubham.behavioral.templatePattern;

public class Football extends Game {

  @Override
  void initialize() {
    System.out.println("Football game initialized");
  }

  @Override
  void startPlay() {
    System.out.println("Football game started");
  }

  @Override
  void endPlay() {
    System.out.println("Football game finished");
  }
}
