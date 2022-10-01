package practice11;

public interface Queue<E>{
    E element();
    E remove();
    E peek();
    E poll();
    void add(E element);
    boolean isEmpty();
    int size();

}
