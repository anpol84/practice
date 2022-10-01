package practice11;

import java.util.NoSuchElementException;

public class LinkedQueue<E> extends AbstractQueue<E> implements Queue<E>{

    private Node first;
    private Node last;
    private class Node{
        private E data;
        private Node next;
    }

    public LinkedQueue() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public E element() {
        if (isEmpty()) throw new NoSuchElementException("queue is empty");
        return first.data;
    }

    @Override
    public E remove() {
        if (isEmpty()) throw new NoSuchElementException("queue is emty");
        E element = first.data;
        first = first.next;
        size--;
        if (isEmpty()) last = null;
        return element;
    }

    @Override
    public E peek() {
        if (isEmpty()) return null;
        return first.data;
    }

    @Override
    public E poll() {
        if (isEmpty()) return null;
        E element = first.data;
        first = first.next;
        size--;
        if (isEmpty()) last = null;
        return element;
    }

    @Override
    public void add(E element) {
        Node l = last;
        last = new Node();
        last.data = element;
        last.next = null;
        if (isEmpty()) first = last;
        else l.next = last;
        size++;

    }
    @Override
    public String toString() {
        String s = "";
        for (LinkedQueue.Node iter = first; iter != null; ){
            s += iter.data + " ";
            iter = iter.next;
        }
        return s;
    }

}
