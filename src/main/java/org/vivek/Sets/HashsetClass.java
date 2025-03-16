package org.vivek.Sets;

import java.util.*;

public class HashsetClass {
    //set is collection of unique elements
    //hahsset implements set
    public static void main(String[] args) {

    Set<Integer> st = new HashSet<>();
    st.add(1);
    st.add(2);
    st.add(1);
    st.add(99);
    st.add(44);
    st.add(99);
    st.add(0);
    st.remove(99);
//the thing  is order is not maintained here as per out insertion .it stores based on hash value
        System.out.println("hashset"+st);
//if we want to insert and retrieve in order we need linkedHashSet which in backend uses linkedlist to maintain relative order
        Set<Integer> lnkst = new LinkedHashSet<>();
        lnkst.add(1);
        lnkst.add(2);
        lnkst.add(1);
        lnkst.add(99);
        lnkst.add(44);
        lnkst.add(99);
        lnkst.add(0);
        lnkst.remove(99);
        System.out.println("linked hashset"+lnkst);


        //sorted set implemented using binary sesrch tree
        Set <Integer> st3  = new TreeSet<>();
        st3.add(1);
        st3.add(2);
        st3.add(1);
        st3.add(99);
        st3.add(44);
        st3.add(99);
        st3.add(0);
        System.out.println("sorted set using TreeSet "+st3);
    }

}
