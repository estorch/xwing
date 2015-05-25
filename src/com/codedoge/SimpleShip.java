package com.codedoge;

import java.util.ArrayList;

public class SimpleShip implements Ship {
  String name = "SimpleShip";
  ArrayList<ShipDecorator> attached = new ArrayList<ShipDecorator>();

  @Override
  public void attach(ShipDecorator s) {
    attached.add(s);
  }

  @Override
  public void outputAttachments() {
    for(ShipDecorator s : attached) {
      System.out.println(s.getDecoratorName());
    }
  }

}
