package models.structures;

import models.Song;

public class Node {
    Song song;
    Node next;

    public Node(Song song) {
        this.song = song;
        this.next = null;
    }

    public Song getSong() {
        return song;
    }

    public Node getNext() {
        return next;
    }
}
