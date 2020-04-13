package com.shubham.structural.facadePattern;

import java.sql.Driver;

public class Chrome {

  public static Driver getChromeDriver() {
    return null;
  }

  public static void generateHTMLReport(String test, Driver driver) {
    System.out.println("Generating HTML Report for Chrome Driver");
  }

  public static void generateJUnitReport(String test, Driver driver) {
    System.out.println("Generating JUnit Report for Chrome Driver");
  }

}
