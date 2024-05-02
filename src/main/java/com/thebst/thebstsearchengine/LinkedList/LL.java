/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thebst.thebstsearchengine.LinkedList;

import com.thebst.thebstsearchengine.LinkedList.LL;

/**
 *
 * @author Lenovo
 */
public class LL<T> {
    private int size;
    private LLNode<T> head;

    public LL() {
        size = 0;
        head = null;
    }

  
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LLNode<T> getHead() {
        return head;
    }

    public void setHead(LLNode<T> head) {
        this.head = head;
    }

   
    public void addFirst(T data) {
        LLNode<T> newNode = new LLNode<>(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

   
    public void addLast(T data) {
        LLNode<T> newNode = new LLNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            LLNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        LLNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

   
    public LLNode<T> get(T data) {
        LLNode<T> current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

   
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            LLNode<T> prev = null;
            LLNode<T> current = head;
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.getNext();
            }
            prev.setNext(current.getNext());
        }
        size--;
    }

   
    public boolean contains(T data) {
        LLNode<T> current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}
