package controllers;

import models.Playlist;

public class ChangeOrderController {
    private Playlist playlist;

    public ChangeOrderController(Playlist playlist) {
        this.playlist = playlist;
    }

    public void changeOrder(int currentPos, int newPos) {
        playlist.changeOrder(currentPos, newPos);
    }
}
