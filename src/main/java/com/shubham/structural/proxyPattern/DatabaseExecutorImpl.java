package com.shubham.structural.proxyPattern;

public class DatabaseExecutorImpl implements DatabaseExecutor {

  @Override
  public void executeDatabase(String query) throws Exception {
    System.out.println("Query : " + query);
  }
}
