package com.tmps.OpenClosedPrinciple;

public class Knife {
  private float damage;

  public Knife(float damage){
    this.damage = damage;
  }

  public void Attack(){
    System.out.println("Attack with damage " + damage);
  }
}
