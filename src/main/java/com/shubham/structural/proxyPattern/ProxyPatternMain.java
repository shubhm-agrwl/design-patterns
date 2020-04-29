package com.shubham.structural.proxyPattern;

/*
@Author Shubham Agrawal
 */
public class ProxyPatternMain {

  public static void main(String[] args) throws Exception {

    DatabaseExecutor adminExecutor = new DatabaseExecutorProxy("Admin", "Admin@123");
    adminExecutor.executeDatabase("DELETE");

    DatabaseExecutor nonAdminExecutor = new DatabaseExecutorProxy("nonAdmin", "Admin@123");
    nonAdminExecutor.executeDatabase("DELETE");
  }

}
