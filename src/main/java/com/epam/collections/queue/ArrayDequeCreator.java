package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
        arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
        arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
        arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(arrayDeque.removeLast());
            arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
            arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
            secondQueue.add(arrayDeque.removeLast());
            arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
            arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
        }
        return arrayDeque;
    }
}
