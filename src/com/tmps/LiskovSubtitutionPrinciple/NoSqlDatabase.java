package com.tmps.LiskovSubtitutionPrinciple;

public class NoSqlDatabase extends Database{
  public void createIndex(){
    System.out.println("create index...");
  }
}
