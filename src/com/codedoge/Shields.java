package com.codedoge;

public class Shields extends ShipDecorator {
  String name = "shields";
  int shields = 5;

  public Shields(Ship s) {
    super(s);
    this.setDecoratorName(name);
    System.out.println("Adding shields.");
    s.attach(this);
  }

  public String getDecoratorName() {
    return this.name;
  }

}
