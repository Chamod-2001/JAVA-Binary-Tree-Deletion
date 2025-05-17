package view;
import model.Node;


// TreeView.java
// This class is responsible for displaying the Binary Search Tree (BST)
// It provides methods to show the in-order traversal of the tree before and after deletions



public class TreeView {

    // Display the in-order traversal before any deletions happen
    public void displayInOrderBefore(Node root) {
        System.out.println("In-order before deletion:");
        inorderTraversal(root); // Call helper method to print the tree in order
    }

    // Display the in-order traversal after deletions have been performed
    public void displayInOrderAfter(Node root) {
        System.out.println("\nIn-order after deletion:");
        inorderTraversal(root); // Reuse helper method to print updated tree
    }

    // Helper method to perform in-order traversal and print keys
    private void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);          // Traverse left subtree
            System.out.print(root.key + " ");    // Print current node's key
            inorderTraversal(root.right);         // Traverse right subtree
        }
    }
}
