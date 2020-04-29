package com.shubham.structural.flyweightPattern;

import java.util.Random;

/*
@Author Shubham Agrawal
 */
public class FlyweightPatternExampleMain {

  private static String employeeType[] = {"Developer", "Tester"};
  private static String skills[] = {"Java", "C++", "Python", "Scala"};

  public static void main(String[] args) {

    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      Employee employee = EmployeeFactory
          .getEmployee(employeeType[random.nextInt(employeeType.length)]);
      employee.assignSkill(skills[random.nextInt(skills.length)]);
      employee.task();
    }

  }

}
