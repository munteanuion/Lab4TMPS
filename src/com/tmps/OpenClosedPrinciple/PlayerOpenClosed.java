package com.tmps.OpenClosedPrinciple;

public class PlayerOpenClosed {

  public static void main(String[] args) {
    Attack attack = new Attack();

    attack.knife();
    attack.sword();
  }
}
