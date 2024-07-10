package tests;

import models.Song;
import models.structures.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private LinkedList list;
    private Song song1;
    private Song song2;

    @BeforeEach
    void setUp() {
        list = new LinkedList();
        song1 = new Song("Artist1", "Track1", "1", 50, 2020, "Genre1", 0.5, 0.6, 1, -5.0, 1, 0.05, 0.2, 0.0, 0.3, 0.5, 120.0, 180000, 4);
        song2 = new Song("Artist2", "Track2", "2", 70, 2021, "Genre2", 0.6, 0.7, 2, -6.0, 0, 0.06, 0.3, 0.1, 0.4, 0.6, 130.0, 200000, 4);
    }

    @Test
    void testAddSong() {
        list.addSong(song1);
        assertNotNull(list.getHead());
        assertEquals(song1, list.getHead().getSong());
    }

    @Test
    void testRemoveSong() {
        list.addSong(song1);
        list.addSong(song2);
        list.removeSong("1");
        assertEquals(song2, list.getHead().getSong());
        list.removeSong("2");
        assertNull(list.getHead());
    }

    @Test
    void testChangeOrder() {
        list.addSong(song1);
        list.addSong(song2);
        list.changeOrder(0, 1);
        assertEquals(song2, list.getHead().getSong());
        assertEquals(song1, list.getHead().getNext().getSong());
    }
}
