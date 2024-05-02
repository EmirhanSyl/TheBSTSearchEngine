/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thebst.thebstsearchengine.LinkedList;

/**
 *
 * @author Lenovo
 */
public class LLNode<T> {
    
     private LLNode<T> next;
    private T data;

    public LLNode(T data) {
        this.data = data;
        this.next = null;
    }

    public LLNode<T> getNext() {
        return next;
    }

    public void setNext(LLNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
}
