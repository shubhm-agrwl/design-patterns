package com.shubham.structural.flyweightPattern;

public class Tester implements Employee {

  private final String job;
  private String skill;

  public Tester() {
    job = "Test the issue";
  }

  @Override
  public void assignSkill(String skill) {
    this.skill = skill;
  }

  @Override
  public void task() {
    System.out.println("Skill : " + this.skill + ", job : " + job);
  }
}
