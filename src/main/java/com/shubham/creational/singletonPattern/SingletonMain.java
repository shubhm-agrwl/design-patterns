package com.shubham.creational.singletonPattern;

/*
@Author Shubham Agrawal
 */
public class SingletonMain {

  public static void main(String[] args) {

    // Eager Initialization
    SingletonEager singletonEager = SingletonEager.getInstance();
    System.out.println(singletonEager);

    // Lazy Initialization
    Singleton singleton = Singleton.getInstance();
    System.out.println(singleton);

    // Lazy Initialization Synchronized
    SingletonSynchronized singletonMethodSynchronized = SingletonSynchronized
        .getMethodSynchronizedInstance();
    System.out.println(singletonMethodSynchronized);

    SingletonSynchronized singletonBlockSynchronized = SingletonSynchronized
        .getBlockSynchronizedInstance();
    System.out.println(singletonBlockSynchronized);
  }

}
