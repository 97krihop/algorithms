package org.pg4200.ex02;

import org.pg4200.les02.list.MyList;

public class MyLinkedList<T> implements MyList <T> {


    private class ListNode {
        T value;
        ListNode next;
    }

    private ListNode head;
    private ListNode tail;

    private int size;


    @Override
    public void delete(int index) {
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            if(head.next != null){
                head = head.next;
            }else{
                head = null;
                tail = null;
            }
        }else{
            ListNode current = head;
            for(int counter = 0 ; counter < index - 1 ; counter++){
                current = current.next;
            }
            if(current.next == tail){
                tail = current;
            }
            current.next = current.next.next;
        }
        size--;

    }

    @Override
    public T get(int index) {

        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        ListNode current = head;
        int counter = 0;
        while(current != null){
            if(counter == index){
                return current.value;
            }
            current = current.next;
            counter++;
        }
        return null;
    }

    @Override
    public void add(int index, T value) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        ListNode node = new ListNode();
        node.value = value;
        if(head == null){
            head = node;
            tail = node;
        }else if(index == 0){
            node.next = head;
            head = node;
        }else if(index == size){
            tail.next = node;
            tail = node;
        } else {
            ListNode previous = head;
            for(int counter = 0 ; counter < index - 1 ; counter++){
                previous = previous.next;
            }
            node.next = previous.next;
            previous.next = node;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }


}
