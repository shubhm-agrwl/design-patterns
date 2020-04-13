package com.shubham.structural.flyweightPattern;

public class Developer implements Employee {

  private final String job;
  private String skill;

  public Developer() {
    job = "Fix the issue";
  }

  @Override
  public void assignSkill(String skill) {
    this.skill = skill;
  }

  @Override
  public void task() {
    System.out.println("Skill : " + this.skill + ", job :" + job);
  }
}
