package com.codedoge;

public class Xwing extends ShipDecorator {
  String name = "xwing";

  public Xwing(Ship s) {
    super(s);
    this.setDecoratorName(name);
    System.out.println("Adding Xwing.");
    s.attach(this);
  }

  public String getDecoratorName() {
    return this.name;
  }
}
