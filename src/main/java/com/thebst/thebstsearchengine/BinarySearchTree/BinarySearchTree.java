
package com.thebst.thebstsearchengine.BinarySearchTree;

/**
 *
 * @author emirs & asimtarik
 * @param <T>
 */
public class BinarySearchTree<T extends IComparable> {

    private BSTNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public BSTNode<T> getRoot() {
        return root;
    }

    public void setRoot(BSTNode<T> root) {
        this.root = root;
    }

    public void add(T data) {
        root = addRecursive(root, data);
    }

    private BSTNode<T> addRecursive(BSTNode<T> node, T data) {
        if (node == null) {
            return new BSTNode<>(data);
        }

        if (data.isEquals(node.getData()) < 0) {
            node.setLeft(addRecursive(node.getLeft(), data));
        } else if (data.isEquals(node.getData()) > 0) {
            node.setRight(addRecursive(node.getRight(), data));
        } else {
            node.getData().updateData();
        }

        return node;
    }

    public boolean search(T data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(BSTNode<T> node, T data) {
        if (node == null) {
            return false;
        }

        int compareResult = data.isEquals(node.getData());
        if (compareResult == 0) {
            return true; // Found the data
        } else if (compareResult < 0) {
            return searchRecursive(node.getLeft(), data);
        } else {
            return searchRecursive(node.getRight(), data);
        }
    }


    public void inOrder(BSTNode<T> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getData().toString() + " ");
            inOrder(node.getRight());
        }
    }

    public void postOrder(BSTNode<T> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData().toString() + " ");
        }
    }

    public void preOrder(BSTNode<T> node) {
        if (node != null) {
            System.out.println(node.getData().toString() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }
}