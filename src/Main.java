// Main.java
// This is the entry point of the application.
// It demonstrates the usage of the MVC components to insert, delete, and display the Binary Search Tree (BST).

import controller.TreeController;
import model.BinaryTree;
import view.TreeView;

public class Main {

    public static void main(String[] args) {

        // Step 1: Create instances of Model and View
        BinaryTree treeModel = new BinaryTree();  // Model: stores and manages the BST data
        TreeView treeView = new TreeView();       // View: responsible for displaying the BST

        // Step 2: Create the Controller and pass Model and View to it
        TreeController controller = new TreeController(treeModel, treeView);

        // Step 3: Insert nodes into the BST via the controller
        controller.insertNode(50);
        controller.insertNode(30);
        controller.insertNode(20);
        controller.insertNode(40);
        controller.insertNode(70);
        controller.insertNode(60);
        controller.insertNode(80);

        // Step 4: Display the BST in-order before any deletions
        controller.displayBeforeDeletion();

        // Step 5: Perform deletions to demonstrate different cases
        controller.deleteNode(20);  // Case 1: Delete leaf node (no children)
        controller.deleteNode(30);  // Case 2: Delete node with one child
        controller.deleteNode(50);  // Case 3: Delete node with two children

        // Step 6: Display the BST in-order after deletions
        controller.displayAfterDeletion();
    }
}
