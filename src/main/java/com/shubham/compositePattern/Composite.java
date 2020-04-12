package com.shubham.compositePattern;

import java.util.ArrayList;
import java.util.List;

class Composite implements Component {

  public Composite(String name) {
    this.name = name;
  }

  String name;
  List<Component> componentsList = new ArrayList<>();

  public void addComponent(Component components) {
    componentsList.add(components);
  }

  public void showPrice() {
    System.out.println(name);
    for (Component components : componentsList) {
      components.showPrice();
    }
  }
}
