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
import java.util.Scanner;

public class App {
    private static Playlist playlist;
    private static AddSongController addController;
    private static RemoveSongController removeController;
    private static ChangeOrderController changeOrderController;
    private static ShuffleController shuffleController;

    public static void main(String[] args) {
        playlist = new Playlist();
        addController = new AddSongController(playlist);
        removeController = new RemoveSongController(playlist);
        changeOrderController = new ChangeOrderController(playlist);
        shuffleController = new ShuffleController(playlist);

        loadSongsFromCSV("data/songs.csv", playlist);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    printPlaylist();
                    break;
                case 2:
                    addSong(scanner);
                    break;
                case 3:
                    removeSong(scanner);
                    break;
                case 4:
                    changeOrder(scanner);
                    break;
                case 5:
                    shufflePlaylist();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nPlaylist Menu:");
        System.out.println("1. Print Playlist");
        System.out.println("2. Add Song");
        System.out.println("3. Remove Song");
        System.out.println("4. Change Order of Songs");
        System.out.println("5. Shuffle Playlist");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void printPlaylist() {
        playlist.printPlaylist();
    }

    private static void addSong(Scanner scanner) {
        System.out.println("Enter song details:");
        System.out.print("Artist Name: ");
        String artistName = scanner.nextLine();
        System.out.print("Track Name: ");
        String trackName = scanner.nextLine();
        System.out.print("Track ID: ");
        String trackId = scanner.nextLine();
        System.out.print("Popularity: ");
        int popularity = scanner.nextInt();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Danceability: ");
        double danceability = scanner.nextDouble();
        System.out.print("Energy: ");
        double energy = scanner.nextDouble();
        System.out.print("Key: ");
        int key = scanner.nextInt();
        System.out.print("Loudness: ");
        double loudness = scanner.nextDouble();
        System.out.print("Mode: ");
        int mode = scanner.nextInt();
        System.out.print("Speechiness: ");
        double speechiness = scanner.nextDouble();
        System.out.print("Acousticness: ");
        double acousticness = scanner.nextDouble();
        System.out.print("Instrumentalness: ");
        double instrumentalness = scanner.nextDouble();
        System.out.print("Liveness: ");
        double liveness = scanner.nextDouble();
        System.out.print("Valence: ");
        double valence = scanner.nextDouble();
        System.out.print("Tempo: ");
        double tempo = scanner.nextDouble();
        System.out.print("Duration (ms): ");
        int durationMs = scanner.nextInt();
        System.out.print("Time Signature: ");
        int timeSignature = scanner.nextInt();

        Song song = new Song(artistName, trackName, trackId, popularity, year, genre,
                danceability, energy, key, loudness, mode, speechiness, acousticness,
                instrumentalness, liveness, valence, tempo, durationMs, timeSignature);
        addController.addSong(song);
        System.out.println("Song added successfully.");
    }

    private static void removeSong(Scanner scanner) {
        System.out.print("Enter Track ID to remove: ");
        String trackId = scanner.nextLine();
        removeController.removeSong(trackId);
        System.out.println("Song removed successfully.");
    }

    private static void changeOrder(Scanner scanner) {
        System.out.print("Enter current position of the song: ");
        int currentPos = scanner.nextInt();
        System.out.print("Enter new position of the song: ");
        int newPos = scanner.nextInt();
        changeOrderController.changeOrder(currentPos, newPos);
        System.out.println("Song order changed successfully.");
    }

    private static void shufflePlaylist() {
        shuffleController.shuffle();
        System.out.println("Playlist shuffled successfully.");
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
