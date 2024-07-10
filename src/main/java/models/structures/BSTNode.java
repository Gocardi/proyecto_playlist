package models.structures;

import models.Song;

public class BSTNode {
    Song song;
    BSTNode left, right;

    public BSTNode(Song song) {
        this.song = song;
        this.left = this.right = null;
    }
}
