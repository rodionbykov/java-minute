package com.rodionbykov;

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree(Integer value) {
        this.root = new Node(value);
    }

    public BinaryTree() {

    }

    public void addValue(Integer value) {
        Node newNode = new Node(value);
        this.root = addNode(this.root, newNode);
    }

    public Node addNode(Node startNode, Node newNode) {

        if (startNode == null) {
            startNode = newNode;
            return startNode;
        }

        if (newNode.value < startNode.value) {
            startNode.left = addNode(startNode.left, newNode);
        }

        if (newNode.value > startNode.value) {
            startNode.right = addNode(startNode.right, newNode);
        }

        if (newNode.value == startNode.value) {
            newNode.left = startNode.left;
            newNode.right = startNode.right;
            startNode = newNode;
        }

        return startNode;
    }
}
