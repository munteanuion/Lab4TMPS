package com.tmps.OpenClosedPrinciple;

public class Character {
  String name;
  Weapon weapon;

  public Character(String name, Weapon weapon) {
    this.name = name;
    this.weapon = weapon;
  }

  public void changeWeapon(Weapon newWeapon){
    this.weapon = newWeapon;
  }

  public void attack(){
    weapon.attack();
  }
}
