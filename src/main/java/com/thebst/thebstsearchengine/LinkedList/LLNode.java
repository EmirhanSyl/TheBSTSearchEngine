package com.thebst.thebstsearchengine.LinkedList;

/**
 *
 * @author emirs & asimtarik
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
