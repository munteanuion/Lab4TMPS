package com.tmps.OpenClosedPrinciple;

public class Sword {
  private float damage;

  public Sword(float damage){
    this.damage = damage;
  }

  public void Attack(){
    System.out.println("Attack with damage " + damage);
  }
}
