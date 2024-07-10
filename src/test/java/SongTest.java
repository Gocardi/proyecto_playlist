package tests;

import models.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {
    private Song song;

    @BeforeEach
    void setUp() {
        song = new Song("Artist", "Track", "1", 50, 2020, "Genre", 0.5, 0.6, 1, -5.0, 1, 0.05, 0.2, 0.0, 0.3, 0.5, 120.0, 180000, 4);
    }

    @Test
    void testGetters() {
        assertEquals("Artist", song.getArtistName());
        assertEquals("Track", song.getTrackName());
        assertEquals("1", song.getTrackId());
        assertEquals(50, song.getPopularity());
        assertEquals(2020, song.getYear());
        assertEquals("Genre", song.getGenre());
        assertEquals(0.5, song.getDanceability());
        assertEquals(0.6, song.getEnergy());
        assertEquals(1, song.getKey());
        assertEquals(-5.0, song.getLoudness());
        assertEquals(1, song.getMode());
        assertEquals(0.05, song.getSpeechiness());
        assertEquals(0.2, song.getAcousticness());
        assertEquals(0.0, song.getInstrumentalness());
        assertEquals(0.3, song.getLiveness());
        assertEquals(0.5, song.getValence());
        assertEquals(120.0, song.getTempo());
        assertEquals(180000, song.getDurationMs());
        assertEquals(4, song.getTimeSignature());
    }
}
