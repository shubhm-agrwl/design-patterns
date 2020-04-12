package com.shubham.adapterPattern;

public class AssignmentWork {

  public Pen getP() {
    return p;
  }

  public void setP(Pen p) {
    this.p = p;
  }

  private Pen p;

  public void writeAssignment(String str) {
    p.write(str);
  }

}
