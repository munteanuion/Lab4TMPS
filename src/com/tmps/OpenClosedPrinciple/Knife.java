package com.tmps.OpenClosedPrinciple;

public class Knife extends Weapon{

  public Knife( int damage, int range) {
    super( damage, range);
  }

  @Override
  public void attack(){
    System.out.println("Attack knife with damage " + damage);
  }
}
