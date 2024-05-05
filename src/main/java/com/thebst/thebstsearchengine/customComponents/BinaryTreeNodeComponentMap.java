package com.thebst.thebstsearchengine.customComponents;

import com.thebst.thebstsearchengine.BinarySearchTree.BSTNode;

/**
 *
 * @author emirs & asimtarik
 */
class BinaryTreeNodeComponentMap {
    private java.util.Map<BSTNode, SplitRectangleNode> map;

    public BinaryTreeNodeComponentMap() {
        this.map = new java.util.HashMap<>();
    }

    public void put(BSTNode node, SplitRectangleNode nodeComponent) {
        map.put(node, nodeComponent);
    }

    public SplitRectangleNode get(BSTNode node) {
        return map.get(node);
    }
}
