package com.codedoge;

public class Lasers extends ShipDecorator {
  String name = "lasers";
  int cannons = 4;

  public Lasers(Ship s) {
    super(s);
    this.setDecoratorName(name);
    System.out.println("Adding lasers.");
    s.attach(this);
  }

  public int getLaserCount() {
    return this.cannons;
  }

  public String getDecoratorName() {
    return this.name;
  }
}
