package com.shubham.creational.singletonPattern;

public class SingletonSynchronized {

  private static SingletonSynchronized instance;

  private SingletonSynchronized() {

  }

  public static synchronized SingletonSynchronized getMethodSynchronizedInstance() {
    if (instance == null) {
      instance = new SingletonSynchronized();
    }
    return instance;
  }

  public static SingletonSynchronized getBlockSynchronizedInstance() {
    if (instance == null) {
      synchronized (SingletonSynchronized.class) {
        if (instance == null) {
          instance = new SingletonSynchronized();
        }
      }
    }
    return instance;
  }

}
