package tests;

import models.Playlist;
import models.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {
    private Playlist playlist;
    private Song song1;
    private Song song2;
    private Song song3;

    @BeforeEach
    void setUp() {
        playlist = new Playlist();
        song1 = new Song("Artist1", "Track1", "1", 50, 2020, "Genre1", 0.5, 0.6, 1, -5.0, 1, 0.05, 0.2, 0.0, 0.3, 0.5, 120.0, 180000, 4);
        song2 = new Song("Artist2", "Track2", "2", 70, 2021, "Genre2", 0.6, 0.7, 2, -6.0, 0, 0.06, 0.3, 0.1, 0.4, 0.6, 130.0, 200000, 4);
        song3 = new Song("Artist3", "Track3", "3", 80, 2022, "Genre3", 0.7, 0.8, 3, -7.0, 1, 0.07, 0.4, 0.2, 0.5, 0.7, 140.0, 220000, 4);
    }

    @Test
    void testAddSong() {
        playlist.addSong(song1);
        assertEquals(1, getPlaylistSize());
        playlist.addSong(song2);
        assertEquals(2, getPlaylistSize());
    }

    @Test
    void testRemoveSong() {
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.removeSong("1");
        assertEquals(1, getPlaylistSize());
        playlist.removeSong("2");
        assertEquals(0, getPlaylistSize());
    }

    @Test
    void testChangeOrder() {
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.changeOrder(0, 2);
        assertEquals(song2, playlist.getHead().getSong());
        assertEquals(song3, playlist.getHead().getNext().getSong());
        assertEquals(song1, playlist.getHead().getNext().getNext().getSong());
    }

    @Test
    void testShuffle() {
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.shuffle();
        assertEquals(3, getPlaylistSize());
    }

    private int getPlaylistSize() {
        int size = 0;
        var current = playlist.getHead();
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
