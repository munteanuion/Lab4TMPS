package com.tmps.SingleResponsibility;

public class Player {
  public static void main(String[] args) {
    Run run = new Run();
    Sit sit = new Sit();
    Eat eat = new Eat();

    run.run();
    eat.eat();
    sit.sit();
  }
}
