package com.sbt.lesson3;

import java.util.*;

public class RIterator<T> implements Iterator {
    private ListIterator<T> iterator;

    public RIterator(LinkedList<T> src) throws NullPointerException {

        if (src.size() == 0) {
            throw new NullPointerException();
        }

        iterator = src.listIterator(src.size());
    }

    @Override
    public boolean hasNext() {
        return (iterator.hasPrevious());
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw  new NoSuchElementException();
        }
        return iterator.previous();
    }

    public boolean hasPrevious() {
        return (iterator.hasNext());
    }

    public T previous() {
        if (!hasPrevious()) {
            throw  new NoSuchElementException();
        }
        return iterator.next();
    }
}
