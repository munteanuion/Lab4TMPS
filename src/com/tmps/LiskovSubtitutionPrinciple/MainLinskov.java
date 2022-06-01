package com.tmps.LiskovSubtitutionPrinciple;

public class MainLinskov {
  public static void main(String[] args) {
    MySqlDatabase mySqlDatabase = new MySqlDatabase();
    MongoDatabase mongoDatabase = new MongoDatabase();

    startApp(mongoDatabase);
    startApp(mySqlDatabase);
  }

  public static void startApp(Database db ){
    db.connect();
  }
}
