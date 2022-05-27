package com.tmps.DependencyInversion;

public class MainDependencyInversion {
  public static void main(String[] args) {
    MusicClient musicClient = new MusicClient(new SpotifyMusicApi());

    musicClient.getTracks();
  }
}
