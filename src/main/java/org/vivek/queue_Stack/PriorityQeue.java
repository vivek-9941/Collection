package org.vivek.queue_Stack;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQeue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//this is min heap
        pq.add(20);
        pq.add(5);
        pq.add(15);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());

        }
        System.out.println("\n");

        PriorityQueue <Integer> pqmax = new PriorityQueue<>(Collections.reverseOrder());// Max-Heap using Comparator.; Custom Comparator
        pqmax.add(20);
        pqmax.add(5);
        pqmax.add(15);
        while(!pqmax.isEmpty()){
            System.out.println(pqmax.poll());

        }
    }
}
