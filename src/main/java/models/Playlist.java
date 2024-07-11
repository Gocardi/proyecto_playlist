package models;

import models.structures.LinkedList;
import models.structures.Node;

import java.util.Random;

public class Playlist {
    private LinkedList songs;

    public Playlist() {
        this.songs = new LinkedList();
    }

    public void addSong(Song song) {
        songs.addSong(song);
    }

    public void removeSong(String trackId) {
        songs.removeSong(trackId);
    }

    public void changeOrder(int currentPos, int newPos) {
        songs.changeOrder(currentPos, newPos);
    }

    public void shuffle() {
        // Convert LinkedList to array for easier shuffling
        Song[] songArray = toArray();
        Random random = new Random();
        for (int i = songArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Song temp = songArray[index];
            songArray[index] = songArray[i];
            songArray[i] = temp;
        }
        // Convert array back to LinkedList
        songs = new LinkedList();
        for (Song song : songArray) {
            addSong(song);
        }
    }

    public void printPlaylist() {
        Node current = songs.getHead();
        while (current != null) {
            System.out.println(current.getSong());
            current = current.getNext();
        }
    }

    private Song[] toArray() {
        int size = getSize();
        Song[] array = new Song[size];
        Node current = songs.getHead();
        int index = 0;
        while (current != null) {
            array[index++] = current.getSong();
            current = current.getNext();
        }
        return array;
    }

    private int getSize() {
        int size = 0;
        Node current = songs.getHead();
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
    public Node getHead() {
      return songs.getHead();
    }
}
