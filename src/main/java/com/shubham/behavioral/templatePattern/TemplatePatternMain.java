package com.shubham.behavioral.templatePattern;

/*
@Author Shubham Agrawal
 */
public class TemplatePatternMain {

  public static void main(String[] args) {
    Game game = new Cricket();
    game.play();
    System.out.println();

    game = new Football();
    game.play();
  }

}
