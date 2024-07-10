package models.structures;

import models.Song;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addSong(Song song) {
        Node newNode = new Node(song);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeSong(String trackId) {
        if (head == null) return;

        if (head.song.getTrackId().equals(trackId)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.song.getTrackId().equals(trackId)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void changeOrder(int currentPos, int newPos) {
        if (head == null || currentPos == newPos) return;

        Node prevCurrent = null, current = head;
        for (int i = 0; current != null && i < currentPos; i++) {
            prevCurrent = current;
            current = current.next;
        }

        if (current == null) return;

        Node prevNew = null, newNode = head;
        for (int i = 0; newNode != null && i < newPos; i++) {
            prevNew = newNode;
            newNode = newNode.next;
        }

        if (newNode == null) return;

        if (prevCurrent != null) {
            prevCurrent.next = current.next;
        } else {
            head = current.next;
        }

        if (prevNew != null) {
            current.next = newNode.next;
            newNode.next = current;
        } else {
            current.next = head;
            head = current;
        }
    }
}
