
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
    public BSTNode<BSTWordData> searchRecursiveNode(BSTNode<BSTWordData> node, BSTWordData data) {
    if (node == null || node.getData().isEquals(data) == 0) {
        return node;
    }

    if (data.isEquals(node.getData()) < 0) {
        return searchRecursiveNode(node.getLeft(), data);
    } else {
        return searchRecursiveNode(node.getRight(), data);
    }
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


    public String inOrder(BSTNode<T> node) {
    StringBuilder result = new StringBuilder();
    inOrderTraversal(node, result);
    return result.toString().trim();
}

private void inOrderTraversal(BSTNode<T> node, StringBuilder result) {
    if (node != null) {
        inOrderTraversal(node.getLeft(), result);
        result.append(node.getData().toString()).append(" ");
        inOrderTraversal(node.getRight(), result);
    }
}

public String postOrder(BSTNode<T> node) {
    StringBuilder result = new StringBuilder();
    postOrderTraversal(node, result);
    return result.toString().trim();
}

private void postOrderTraversal(BSTNode<T> node, StringBuilder result) {
    if (node != null) {
        postOrderTraversal(node.getLeft(), result);
        postOrderTraversal(node.getRight(), result);
        result.append(node.getData().toString()).append(" ");
    }
}

public String preOrder(BSTNode<T> node) {
    StringBuilder result = new StringBuilder();
    preOrderTraversal(node, result);
    return result.toString().trim();
}

private void preOrderTraversal(BSTNode<T> node, StringBuilder result) {
    if (node != null) {
        result.append(node.getData().toString()).append(" ");
        preOrderTraversal(node.getLeft(), result);
        preOrderTraversal(node.getRight(), result);
    }
}
}