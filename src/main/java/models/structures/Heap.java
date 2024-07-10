package models.structures;

import models.Song;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Song> heap;

    public Heap() {
        heap = new ArrayList<>();
    }

    public void insert(Song song) {
        heap.add(song);
        heapifyUp(heap.size() - 1);
    }

    public Song extractMin() {
        if (heap.size() == 0) return null;
        Song min = heap.get(0);
        Song last = heap.remove(heap.size() - 1);
        if (heap.size() > 0) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return min;
    }

    public Song extractMax() {
        if (heap.size() == 0) return null;
        Song max = heap.get(0);
        Song last = heap.remove(heap.size() - 1);
        if (heap.size() > 0) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return max;
    }

    private void heapifyUp(int index) {
        Song temp = heap.get(index);
        while (index > 0 && temp.getPopularity() < heap.get(parent(index)).getPopularity()) {
            heap.set(index, heap.get(parent(index)));
            index = parent(index);
        }
        heap.set(index, temp);
    }

    private void heapifyDown(int index) {
        int leftChild = leftChild(index);
        int rightChild = rightChild(index);
        int smallest = index;

        if (leftChild < heap.size() && heap.get(leftChild).getPopularity() < heap.get(smallest).getPopularity()) {
            smallest = leftChild;
        }
        if (rightChild < heap.size() && heap.get(rightChild).getPopularity() < heap.get(smallest).getPopularity()) {
            smallest = rightChild;
        }
        if (smallest != index) {
            Song temp = heap.get(index);
            heap.set(index, heap.get(smallest));
            heap.set(smallest, temp);
            heapifyDown(smallest);
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }
}
