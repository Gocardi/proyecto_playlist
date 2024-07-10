package tests;

import models.Song;
import models.structures.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    private Node node;
    private Song song;

    @BeforeEach
    void setUp() {
        song = new Song("Artist", "Track", "1", 50, 2020, "Genre", 0.5, 0.6, 1, -5.0, 1, 0.05, 0.2, 0.0, 0.3, 0.5, 120.0, 180000, 4);
        node = new Node(song);
    }

    @Test
    void testGetSong() {
        assertEquals(song, node.getSong());
    }

    @Test
    void testGetNext() {
        assertNull(node.getNext());
        Node nextNode = new Node(new Song("Artist2", "Track2", "2", 70, 2021, "Genre2", 0.6, 0.7, 2, -6.0, 0, 0.06, 0.3, 0.1, 0.4, 0.6, 130.0, 200000, 4));
        node.next = nextNode;
        assertEquals(nextNode, node.getNext());
    }
}
