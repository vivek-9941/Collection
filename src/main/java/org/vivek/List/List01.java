package org.vivek.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//
public class List01 {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println( arr);//toString is implemented in arraylist
//        for(int i =0 ;  i < arr.size(); i++) System.out.print(arr.get(i));
        arr.set(1, 10);
        System.out.println("changed array : " + arr);


        //copying one arraylist into another
        List<Integer> arr2 = new ArrayList<>(arr);//using contructor you can pass any collection(stack,queue,etc) which implements collection
        System.out.println("arr2 : " + arr2);
        //using addAll()
        arr2.addAll(arr);
        Collections.sort(arr2);
        Collections.reverse(arr2);
        System.out.println(arr2);


        //to print the element at particular index
        System.out.println("element at particular index"+arr.indexOf(10));

        //get the sublist of a list
        List<Integer> sublist = arr.subList(0,3);
        System.out.println("sublist:"+sublist);
        //this sublist elements are by reference so any changes in sublist aslo affects in main one

    }


}
//Implementation |	Description                                                     |	Key Points
//ArrayList      |	Resizable array implementation	  50% +                         |Fast for searching, slow for insert/delete in middle.
//LinkedList     |	Doubly linked list implementation                               |Fast for insert/delete anywhere, slower access by index.
//Vector         |	Legacy synchronized resizable array(arraylist is used mostly)|	Thread-safe but slower than
//arraylist vs linkedlist
//in arraylist you can access  the element in constant time
//in linkedlist you need to traverse you dont have indices o(n)
//frequent  insertion and deletion ---> use the linkelist o(1)
