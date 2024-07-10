package controllers;

import models.Playlist;

public class ShuffleController {
    private Playlist playlist;

    public ShuffleController(Playlist playlist) {
        this.playlist = playlist;
    }

    public void shuffle() {
        playlist.shuffle();
    }
}
