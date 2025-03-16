package org.vivek.List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListclass {

    public static void main(String[] args) {

    List<Integer> lst = new LinkedList<>();
    //same can be dont wiht LinkedList<Integer>
    lst.add(1);
    lst.add(2);
    lst.add(3);
    //using list iterator which is bidirectional iterator use in linkedlist and set but not in arraylist
        ListIterator<Integer> iterator = lst.listIterator();
        System.out.println(iterator.next());//returns the current element and moves itereator to next
        //next - return items[index++]
        //previous - return items[--index]
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());

        //sometimes in leetcode we need to return an array
        //to convert arraylist to array:
        Integer [] arr = lst.toArray(new Integer[0]); //initialize array with 0 size as convention
        for(int x : arr)System.out.print(x + ",");
    }
}
