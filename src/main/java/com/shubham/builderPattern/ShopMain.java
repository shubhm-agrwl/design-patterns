package com.shubham.builderPattern;

/*
@Author Shubham Agrawal
 */

public class ShopMain {

  public static void main(String[] args) {

    Phone phone = new PhoneBuilder().setOs("IOS").setRam(6).getPhone();
    //Phone phone = new Phone("Android", 2, "qualcomm", 5.5, 3500);
    System.out.println(phone);
  }

}
