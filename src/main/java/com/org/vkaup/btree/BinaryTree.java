package com.org.vkaup.btree;

public class BinaryTree {

    private Node root;

    

}


class Node {
    private int value;
    private Node right;
    private Node left;

    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}