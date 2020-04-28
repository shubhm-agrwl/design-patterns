package com.shubham.behavioral.iteratorPattern;

public class NameRepository implements Container {

  public String names[] = {"Shubham", "Akash", "John", "Robert"};

  @Override
  public Iterator getIterator() {
    return new NameIterator();
  }

  public class NameIterator implements Iterator {

    int index = 0;

    @Override
    public boolean hasNext() {
      if (index < names.length) {
        return true;
      }
      return false;
    }

    @Override
    public Object next() {
      if (this.hasNext()) {
        return names[index++];
      }
      return null;
    }
  }
}
