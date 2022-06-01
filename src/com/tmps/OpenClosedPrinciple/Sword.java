package com.tmps.OpenClosedPrinciple;

public class Sword extends Weapon{

  public Sword( int damage, int range) {
    super( damage, range);
  }

  @Override
  public void attack(){
    System.out.println("Attack sword with damage " + damage);
  }
}
