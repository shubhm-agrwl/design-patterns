package com.shubham.structural.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

  private static Map<String, Employee> employeeMap = new HashMap<>();

  public static Employee getEmployee(String type) {
    Employee employee = null;

    if (employeeMap.get(type) != null) {
      employee = employeeMap.get(type);
    } else {
      switch (type) {
        case "Developer":
          System.out.println("Developer Created");
          employee = new Developer();
          break;
        case "Tester":
          System.out.println("Tester Created");
          employee = new Tester();
          break;
        default:
          System.out.println("No such employee");
      }
      employeeMap.put(type, employee);
    }
    return employee;
  }

}
