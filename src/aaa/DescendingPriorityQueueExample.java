package aaa;

import java.util.PriorityQueue;
import java.util.Comparator;

public class DescendingPriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue with a custom comparator for descending order
        PriorityQueue<Integer> descendingQueue = new PriorityQueue<>(Comparator.reverseOrder());
        
        int k=3;
        // Example elements
        descendingQueue.add(3);
        descendingQueue.add(1);
        descendingQueue.add(4);
        descendingQueue.add(1);
        descendingQueue.add(5);
        descendingQueue.add(9);
        descendingQueue.add(2);
        descendingQueue.add(6);
        descendingQueue.add(5);
        descendingQueue.add(3);
        descendingQueue.add(5);
        

        // Poll elements from the queue (in descending order)
        while (!descendingQueue.isEmpty()) {
            Integer element = descendingQueue.poll();
            System.out.println(element);
        }
        while (!descendingQueue.isEmpty() && k>0) {
            Integer element = descendingQueue.poll();
            element--;k--;
            descendingQueue.add(element);
            
        }
        while (!descendingQueue.isEmpty()) {
            Integer element = descendingQueue.poll();
            System.out.println(element);
        }
    }
}

