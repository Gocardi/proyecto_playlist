package models.structures;

import models.Song;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private BSTNode root;

    public void insert(Song song) {
        root = insertRec(root, song);
    }

    private BSTNode insertRec(BSTNode root, Song song) {
        if (root == null) {
            root = new BSTNode(song);
            return root;
        }
        if (song.getPopularity() < root.song.getPopularity()) {
            root.left = insertRec(root.left, song);
        } else if (song.getPopularity() > root.song.getPopularity()) {
            root.right = insertRec(root.right, song);
        }
        return root;
    }

    public List<Song> inOrderTraversal() {
        List<Song> result = new ArrayList<>();
        inOrderRec(root, result);
        return result;
    }

    private void inOrderRec(BSTNode root, List<Song> result) {
        if (root != null) {
            inOrderRec(root.left, result);
            result.add(root.song);
            inOrderRec(root.right, result);
        }
    }

    public Song searchByPopularity(int popularity) {
        return searchRec(root, popularity);
    }

    private Song searchRec(BSTNode root, int popularity) {
        if (root == null || root.song.getPopularity() == popularity) {
            return root != null ? root.song : null;
        }
        if (root.song.getPopularity() > popularity) {
            return searchRec(root.left, popularity);
        }
        return searchRec(root.right, popularity);
    }
}
