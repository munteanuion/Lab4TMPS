package com.tmps.DependencyInversion;

public class SpotifyMusicApi implements MusicApi{
  @Override
  public void getTracks() {
    System.out.println("Tracks Spotify music...");
  }
}
