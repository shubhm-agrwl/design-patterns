package com.shubham.behavioral.chainOfResponsibilityPattern;

public class FileLogger extends AbstractLogger {

  public FileLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("File logger: " + message);

  }
}
