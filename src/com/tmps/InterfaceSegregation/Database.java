package com.tmps.InterfaceSegregation;

public class Database {
  public void connect(){
    System.out.println("connect to database...");
  }
  public void read(){
    System.out.println("read from database...");
  }
  public void write(){
    System.out.println("write in database...");
  }
}
