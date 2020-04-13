package com.shubham.structural.proxyPattern;

public class DatabaseExecutorProxy implements DatabaseExecutor {

  boolean ifAdmin;
  DatabaseExecutorImpl databaseExecutor;

  public DatabaseExecutorProxy(String name, String password) {
    if (name.equals("Admin") && password.equals("Admin@123")) {
      ifAdmin = true;
      databaseExecutor = new DatabaseExecutorImpl();
    }
  }

  @Override
  public void executeDatabase(String query) throws Exception {
    if (ifAdmin) {
      databaseExecutor.executeDatabase(query);
    } else {
      if (query.equals("DELETE")) {
        throw new Exception("Delete not allowed");
      } else {
        databaseExecutor.executeDatabase(query);
      }
    }
  }
}
