package com.tmps.LiskovSubtitutionPrinciple;

public class MySqlDatabase extends Database{
  public void dropTable(){
    System.out.println("drop table...");
  }
}
