package controllers;

import models.Playlist;

public class RemoveSongController {
    private Playlist playlist;

    public RemoveSongController(Playlist playlist) {
        this.playlist = playlist;
    }

    public void removeSong(String trackId) {
        playlist.removeSong(trackId);
    }
}
