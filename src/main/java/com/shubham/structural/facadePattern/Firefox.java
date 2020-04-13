package com.shubham.structural.facadePattern;

import java.sql.Driver;

public class Firefox {

  public static Driver getFirefoxDriver() {
    return null;
  }

  public static void generateHTMLReport(String test, Driver driver) {
    System.out.println("Generating HTML Report for firefox Driver");
  }

  public static void generateJUnitReport(String test, Driver driver) {
    System.out.println("Generating JUnit Report for firefox Driver");
  }

}
