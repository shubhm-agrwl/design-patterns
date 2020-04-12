package com.shubham.adapterPattern;

public class PenAdaptor implements Pen {

  PilotPen pilotPen = new PilotPen();

  public void write(String str) {

    pilotPen.mark(str);

  }
}
