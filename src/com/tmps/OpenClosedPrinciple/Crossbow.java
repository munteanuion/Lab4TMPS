package com.tmps.OpenClosedPrinciple;

public class Crossbow extends Weapon{
  public Crossbow(int damage, int range) {
    super(damage, range);
  }

  @Override
  public void attack(){
    System.out.println("Attack crossbow with damage " + damage);
  }
}
