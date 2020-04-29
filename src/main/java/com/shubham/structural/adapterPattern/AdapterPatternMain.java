package com.shubham.structural.adapterPattern;

/*
@Author Shubham Agrawal
 */
public class AdapterPatternMain {

  public static void main(String[] args) {

    Pen pen = new PenAdaptor();
    AssignmentWork assignmentWork = new AssignmentWork();
    assignmentWork.setP(pen);
    assignmentWork.writeAssignment("Assignment Work");

  }

}
