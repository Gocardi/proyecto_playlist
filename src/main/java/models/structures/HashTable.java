package models.structures;

import models.Song;

import java.util.LinkedList;

public class HashTable {
    private LinkedList<Song>[] table;

    public HashTable(int size) {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return key.hashCode() % table.length;
    }

    public void put(String key, Song song) {
        int index = hash(key);
        table[index].add(song);
    }

    public Song get(String key) {
        int index = hash(key);
        for (Song song : table[index]) {
            if (song.getTrackId().equals(key)) {
                return song;
            }
        }
        return null;
    }
}
