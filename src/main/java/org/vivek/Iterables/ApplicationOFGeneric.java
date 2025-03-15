package org.vivek.Iterables;

import java.util.Iterator;

public class ApplicationOFGeneric {
    public static void main(String[] args) {
        OurGenericList <Integer> list  = new OurGenericList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        for(int X : list) System.out.println(X)
//        this works the same !!;

        //note : msp is not an iterable
        //all collectiosn are iterables
        //collection implements iterables
        //1.lsit 2.queue 3.set are intergace implements collection
        //all can use for each loop for the iteration


    }
}
