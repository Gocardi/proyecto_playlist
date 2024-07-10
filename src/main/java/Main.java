package main.java;

import models.Playlist;
import models.Song;
import controllers.AddSongController;
import controllers.RemoveSongController;
import controllers.ChangeOrderController;
import controllers.ShuffleController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        loadSongsFromCSV("data/songs.csv", playlist);

        AddSongController addController = new AddSongController(playlist);
        RemoveSongController removeController = new RemoveSongController(playlist);
        ChangeOrderController changeOrderController = new ChangeOrderController(playlist);
        ShuffleController shuffleController = new ShuffleController(playlist);

        // Example usage
        playlist.printPlaylist();
        shuffleController.shuffle();
        System.out.println("After shuffle:");
        playlist.printPlaylist();
    }

    private static void loadSongsFromCSV(String filePath, Playlist playlist) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length < 18) continue;
                Song song = new Song(
                    values[0], values[1], values[2], Integer.parseInt(values[3]), Integer.parseInt(values[4]),
                    values[5], Double.parseDouble(values[6]), Double.parseDouble(values[7]), Integer.parseInt(values[8]),
                    Double.parseDouble(values[9]), Integer.parseInt(values[10]), Double.parseDouble(values[11]),
                    Double.parseDouble(values[12]), Double.parseDouble(values[13]), Double.parseDouble(values[14]),
                    Double.parseDouble(values[15]), Double.parseDouble(values[16]), Integer.parseInt(values[17])
                );
                playlist.addSong(song);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
