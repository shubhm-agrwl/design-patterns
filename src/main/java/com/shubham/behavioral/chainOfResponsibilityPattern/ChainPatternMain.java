package com.shubham.behavioral.chainOfResponsibilityPattern;

/*
@Author Shubham Agrawal
 */
public class ChainPatternMain {

  private static AbstractLogger getChainOfLoggers() {
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);
    return errorLogger;
  }

  public static void main(String[] args) {
    AbstractLogger loggerChain = getChainOfLoggers();
    loggerChain.logMessage(AbstractLogger.INFO, "Information");
    System.out.println();
    loggerChain.logMessage(AbstractLogger.DEBUG, "Debug Information");
    System.out.println();
    loggerChain.logMessage(AbstractLogger.ERROR, "Error Information");
  }

}
