package com.shubham.adapterPattern;

public class SchoolMain {

  public static void main(String[] args) {

    Pen pen = new PenAdaptor();
    AssignmentWork assignmentWork = new AssignmentWork();
    assignmentWork.setP(pen);
    assignmentWork.writeAssignment("Assignment Work");

  }

}
