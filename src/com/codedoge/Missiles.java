package com.codedoge;

public class Missiles extends ShipDecorator {
  String name = "missles";
  int missles = 4;

  public Missiles(Ship s) {
    super(s);
    this.setDecoratorName(name);
    System.out.println("Adding missiles.");
    s.attach(this);
  }

  public int getMissleCount() {
    return this.missles;
  }

  public String getDecoratorName() {
    return this.name;
  }
}
