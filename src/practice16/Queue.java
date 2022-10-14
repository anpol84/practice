package practice16;



import practice12_15.Phone;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Queue {
    private Node head;
    private Node last;
    private int size;
    private class Node {
        private Node prev;
        private Item data;
        private Node next;
        public Node(Node prev,Item data,Node next){
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

    }
    public boolean add(Item data){
        Node temp = this.last;
        Node newNode = new Node(temp,data,null);
        this.last = newNode;
        if(head == null){
            this.head = newNode;
        }else{
            temp.next = newNode;
        }
        this.size++;
        return true;
    }


    public int size(){
        return this.size;
    }

    public boolean removeElement(String item){
        Node p = last;
        while (p.prev != null){
            if (p.data.getName().equals(item)){
                Item elementData = p.data;
                Node prev = p.prev;
                Node next = p.next;
                if(prev == null){
                    this.head = next;
                }else{
                    prev.next = next;
                    p.prev = null;
                }
                if(next == null){
                    this.last = prev;
                }else{
                    next.prev = prev;
                    p.next = null;
                }
                p.data = null;
                this.size--;
                return true;
            }
            p = p.prev;
        }
        return false;
    }
    int countItem(String item){
        int ans = 0;
        Node p = head;
        while(p != null){
            if (p.data.getName().equals(item)){
                ans++;
            }
            p = p.next;
        }
        return ans;
    }
    Item[] getItems(){
        Item[] items = new Item[size];
        Node p = head;
        int i = 0;
        while(p != null){
            items[i] = p.data;
            p = p.next;
            i++;
        }
        return items;
    }
    double getPrice(){
        double price = 0;
        Node p = head;
        int i = 0;
        while(p != null){
            price += p.data.getPrice();
            p = p.next;
        }
        return price;
    }
    String[] getNames(){
        String[] names;
        HashSet<String> hash = new HashSet<>();
        Node p = head;
        while(p != null){
            hash.add(p.data.getName());
            p = p.next;
        }
        names = hash.toArray(new String[0]);
        return names;
    }
    Item[] sort(){
        Item[] items = new Item[size];
        Node p = head;
        int i = 0;
        while(p != null){
            items[i] = p.data;
            p = p.next;
            i++;
        }
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int j = 1; j < size; j++) {
                if (items[j].getPrice() > items[j - 1].getPrice()) {
                    Item tmp = items[j];
                    items[j] = items[j-1];
                    items[j-1] = tmp;
                    needIteration = true;
                }
            }
        }
        return items;
    }

    @Override
    public String toString() {
        String s = "";
        Node p = head;
        while (p != null){
            s += p.data.toString();
            p = p.next;
        }
        return s;
    }
}
