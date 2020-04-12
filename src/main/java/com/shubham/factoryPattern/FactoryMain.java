package com.shubham.factoryPattern;

/*
@Author Shubham Agrawal
 */

public class FactoryMain {

  public static void main(String[] args) {

    OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
    OS obj = operatingSystemFactory.getInstance("IOS");
    obj.spec();

  }

}
