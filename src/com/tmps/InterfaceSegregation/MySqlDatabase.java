package com.tmps.InterfaceSegregation;

public class MySqlDatabase extends NoSqlDatabase {
  public void dropTable(){
    System.out.println("drop table...");
  }

}
