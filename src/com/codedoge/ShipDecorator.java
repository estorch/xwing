package com.codedoge;

abstract class ShipDecorator implements Ship {
  protected Ship ship;
  String name = "ShipDecorator";

  public ShipDecorator(Ship s) {
    this.ship = s;
  }

  public void attach(ShipDecorator s) {
    this.ship.attach(s);
  }

  public void outputAttachments() {
    this.ship.outputAttachments();
  }

  public void setDecoratorName(String n) {
    this.name = n;
  }

  public String getDecoratorName() {
    return this.name;
  }
}
