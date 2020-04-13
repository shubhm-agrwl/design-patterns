package com.shubham.structural.facadePattern;

public class FacadePatternExampleMain {

  public static void main(String[] args) {
    String test = "test";

    WebExplorerHelperFacade.generateReports("firefox", "html", test);
    WebExplorerHelperFacade.generateReports("firefox", "junit", test);
    WebExplorerHelperFacade.generateReports("chrome", "html", test);
    WebExplorerHelperFacade.generateReports("chrome", "junit", test);
  }

}
