package com.tmps.OpenClosedPrinciple;

public class PlayerOpenClosed {

  public static void main(String[] args) {
    Weapon sword = new Sword(14,2);
    Character character = new Character("Jhonny",sword);
    character.attack();

    Weapon crossbow = new Crossbow(56,45);
    character.changeWeapon(crossbow);
    character.attack();

    Weapon shutgun = new Makarov(12, 455);
    character.changeWeapon(shutgun);
    character.attack();

  }
}
