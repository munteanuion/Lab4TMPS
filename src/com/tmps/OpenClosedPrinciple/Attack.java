package com.tmps.OpenClosedPrinciple;

public class Attack {
  Sword sword = new Sword(23);
  Knife knife = new Knife(13);

  public void sword(){
    sword.Attack();
  }
  public void knife(){
    knife.Attack();
  }
}
