package com.shubham.behavioral.mediatorPattern;

/*
@Author Shubham Agrawal
 */
public class MediatorPatternMain {

  public static void main(String[] args) {

    User shubham = new User("Shubham");
    User akash = new User("Akash");
    shubham.sendMessage("Hi! Akash...");
    akash.sendMessage("Hello! Shubham :)");
  }

}
