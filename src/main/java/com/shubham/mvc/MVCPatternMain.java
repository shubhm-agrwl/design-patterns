package com.shubham.mvc;

public class MVCPatternMain {

  public static void main(String[] args) {

    Student model = retreiveData();

    StudentView view = new StudentView();

    StudentController controller = new StudentController(model, view);
    controller.updateView();

    System.out.println();

    controller.setStudentName("Akash");
    controller.updateView();
  }

  private static Student retreiveData() {
    Student student = new Student();
    student.setName("Shubham");
    student.setRollNo("3");
    return student;
  }

}
