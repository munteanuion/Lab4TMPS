package com.tmps.DependencyInversion;

public class YandexMusicApi implements MusicApi{
  @Override
  public void getTracks() {
    System.out.println("Tracks yandex music...");
  }
}
