package com.uday.algo;

public class BinarySearchTree {

  class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }

  Node root;

  public BinarySearchTree() {
    root = null;
  }

  public void insert(int value) {
    root = insertValue(root, value);
  }

  public Node insertValue(Node current, int value) {

    if (current == null) {
      return new Node(value);
    } else if (value < current.value) {
      current.left = insertValue(current.left, value);
    } else if (value > current.value) {
      current.right = insertValue(current.right, value);
    }
    return current;
  }

  // ROOT--> LEFT --> RIGHT
  public void preorderTraversal(Node root) {
    if (root == null) {
      return;
    }
    System.out.println(root.value);
    preorderTraversal(root.left);
    preorderTraversal(root.right);

  }

  // LEFT --> ROOT --> RIGHT
  public void inOrderTraversal(Node root) {
    if (root == null) {
      return;
    }
    inOrderTraversal(root.left);
    System.out.println(root.value);
    inOrderTraversal(root.right);

  }

  // LEFT-->RIGHT-->Root
  public void postOrderTraversal(Node root) {
    if (root == null) {
      return;
    }
    postOrderTraversal(root.left);
    postOrderTraversal(root.right);
    System.out.println(root.value);
  }

  public static Node getMinValNode(Node root) {
    if (root == null) {
      return root;
    }
    while (root.left != null) {
      root = root.left;
    }
    return root;

  }

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(7);
    bst.insert(4);
    bst.insert(10);
    bst.insert(1);
    bst.insert(6);
    bst.insert(6);
    /*
     * bst.preorderTraversal(bst.root); System.out.println("-------");
     * bst.postOrderTraversal(bst.root); System.out.println("-------");
     * bst.inOrderTraversal(bst.root);
     */
    System.out.println(getMinValNode(bst.root).value);

  }

}
