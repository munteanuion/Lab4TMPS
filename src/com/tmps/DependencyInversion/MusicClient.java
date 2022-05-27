package com.tmps.DependencyInversion;

public class MusicClient implements MusicApi{
  MusicApi client;
  public MusicClient(MusicApi client){
    this.client = client;
  }

  @Override
  public void getTracks() {
    this.client.getTracks();
  }
}
