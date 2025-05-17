package model;

// BinaryTree.java
// This class represents the Binary Search Tree (BST) logic
// It handles insertion, deletion, and in-order traversal operations

public class BinaryTree {

    Node root;  // Root node of the binary tree

    // Constructor to initialize an empty tree
    public BinaryTree() {
        root = null;
    }

    // -------------------------------
    // Method to insert a new key into the BST
    // -------------------------------
    public Node insert(Node root, int key) {
        // If the tree is empty, create a new node as root
        if (root == null) {
            return new Node(key);
        }

        // If key is less, insert into left subtree
        if (key < root.key) {
            root.left = insert(root.left, key);
        }
        // If key is greater, insert into right subtree
        else if (key > root.key) {
            root.right = insert(root.right, key);
        }

        // Return unchanged node pointer
        return root;
    }

    // -------------------------------
    // Method to print the BST in in-order traversal (Left, Root, Right)
    // -------------------------------
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);              // Visit left subtree
            System.out.print(root.key + " "); // Print root
            inorder(root.right);             // Visit right subtree
        }
    }

    // -------------------------------
    // Method to delete a node from the BST
    // -------------------------------
    public Node delete(Node root, int key) {
        // Base case: If the tree is empty
        if (root == null) {
            return root;
        }

        // Recur down the tree to find the node
        if (key < root.key) {
            // Delete the node in left subtree
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            // Delete the node in right subtree
            root.right = delete(root.right, key);
        } else {
            // Node to be deleted found

            // Case 1: Node has no children (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Node has only one child
            if (root.left == null) {
                return root.right; // Replace with right child
            } else if (root.right == null) {
                return root.left;  // Replace with left child
            } else {
                // Case 3: Node has two children
                // Get the inorder successor (smallest in the right subtree)
                Node temp = minValueNode(root.right);

                // Replace the node's key with the inorder successor's key
                root.key = temp.key;

                // Delete the inorder successor
                root.right = delete(root.right, temp.key);
            }
        }
        return root;
    }

    // -------------------------------
    // Helper method to find the minimum value node in a subtree
    // Used for finding in-order successor
    // -------------------------------
    public Node minValueNode(Node root) {
        Node current = root;

        // Loop to find the leftmost leaf
        while (current.left != null) {
            current = current.left;
        }

        return current;
    }
}
