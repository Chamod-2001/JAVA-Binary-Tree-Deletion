package model;

// Node class to represent each node in the Binary Search Tree (BST)
public class Node {
    int key;           // This is the value stored in the node (the key)
    Node left, right;  // References to the left and right children of the node

    // Constructor to create a new node with the given key
    public Node(int item) {
        key = item;    // Assign the passed value to the key of the node
        left = right = null;  // Initially, the left and right child nodes are set to null (no children)
    }
}
