// TreeController.java
// This class acts as the Controller in the MVC architecture.
// It mediates interactions between the Model (BinaryTree) and the View (TreeView).
// The controller handles requests to modify the tree and updates the view accordingly.

package controller;

import model.BinaryTree;
import model.Node;
import view.TreeView;

public class TreeController {

    private BinaryTree treeModel;  // The Model: Binary Search Tree data and operations
    private TreeView treeView;     // The View: Responsible for displaying the tree

    // Constructor initializes the controller with the given model and view
    public TreeController(BinaryTree treeModel, TreeView treeView) {
        this.treeModel = treeModel;
        this.treeView = treeView;
    }

    // Method to insert a node into the BST via the Model
    public void insertNode(int key) {
        treeModel.root = treeModel.insert(treeModel.root, key);
    }

    // Method to delete a node from the BST via the Model
    public void deleteNode(int key) {
        treeModel.root = treeModel.delete(treeModel.root, key);
    }

    // Method to display the in-order traversal before deletions by invoking the View
    public void displayBeforeDeletion() {
        treeView.displayInOrderBefore(treeModel.root);
    }

    // Method to display the in-order traversal after deletions by invoking the View
    public void displayAfterDeletion() {
        treeView.displayInOrderAfter(treeModel.root);
    }
}
