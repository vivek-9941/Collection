package org.vivek.Iterables;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T> {

    private T[] items;
    private int size;
    private int count ;
    public OurGenericList(int size){
        items=  (T[]) new Object[size];
        this.size = size;
        count  =0;

    }
    public void add(T item){
        items[count++] = item;

    }
    public T get(int index){
        return items[index];
    }


     @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }
    private class OurGenericListIterator implements Iterator<T>{

            private OurGenericList<T> lsit;
            private int index;
            public OurGenericListIterator(OurGenericList<T> lsit){
                this.lsit = lsit;
            }
        @Override
        public boolean hasNext() {
            return index < lsit.size;

        }

        @Override
        public T next() {
            return lsit.items[index++];
        }
    }
}
