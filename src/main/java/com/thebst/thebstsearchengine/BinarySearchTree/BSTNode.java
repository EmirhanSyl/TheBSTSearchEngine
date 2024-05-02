package com.thebst.thebstsearchengine.BinarySearchTree;

/**
 *
 * @author emirs & asimtarik
 * @param <T>
 */
public class BSTNode<T extends IComparable> {
    private BSTNode<T> right;
    private BSTNode<T> left;
    private T data;

    public BSTNode(T data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public BSTNode<T> getRight() {
        return right;
    }
    public void setRight(BSTNode<T> right) {
        this.right = right;
    }

    public BSTNode<T> getLeft() {
        return left;
    }
    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
