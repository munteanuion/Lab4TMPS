package com.tmps.InterfaceSegregation;

public class MainInterface {
  public static void main(String[] args) {
    MySqlDatabase mySqlDatabase = new MySqlDatabase();
    MongoDatabase mongoDatabase = new MongoDatabase();

    mySqlDatabase.connect();
    mySqlDatabase.dropTable();

    mongoDatabase.connect();
    mongoDatabase.createIndex();
  }
}
