package org.vivek.queue_Stack;

import java.util.*;

//here for    push -> offer
//            pop -> poll
//            top -> peek
//element also used for top but it might throw exception if it is empty peek returns null
public class QueueCLASS {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();// to instantiate a queue(interface) need to use linkedlist (FIFO)
        queue.offer(1);
        System.out.println(queue.offer(2));
        queue.offer(3);
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());//this is method of collection


        Stack<Integer> st = new Stack<>();//stack is an class not an interface
        st.push(1);
        st.push(2);
        st.push(3);
        while (!st.empty()) {
            System.out.println(st.peek());
            st.pop();
        }



        //to implement Deque interface we need to instantiate it using arrayDequeue class;
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerLast(8);
        dq.offerLast(9);
        System.out.println(dq);

        //can usse it as stack using offerfirst and pollfirst;
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);
    }
}
