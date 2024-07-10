package controllers;

import models.Playlist;
import models.Song;

public class AddSongController {
    private Playlist playlist;

    public AddSongController(Playlist playlist) {
        this.playlist = playlist;
    }

    public void addSong(Song song) {
        playlist.addSong(song);
    }
}
