package com.shubham.creational.factoryPattern;

public class OperatingSystemFactory {

  public OS getInstance(String str) {

    switch (str) {
      case "Android":
        return new Android();
      case "IOS":
        return new IOS();
      default:
        return new Others();
    }
  }

}
