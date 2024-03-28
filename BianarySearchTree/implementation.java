package BianarySearchTree;

import java.util.*;

public class implementation {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // insert
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // search
    public static boolean serach(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return serach(root.left, key);
        } else {
            return serach(root.right, key);
        }
    }

    // delete
    public static Node delete(Node root, int key) {

        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else { // root.data==key
            // case1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case3
            Node IS = inorderSuccessor(root.right); // left most node in rightsubTree
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node inorderSuccessor(Node root) {

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // printINrange
    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }

        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if (root.data >= y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    // printRoot2leaf
    public static void printPath(ArrayList<Integer> path) {

        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 9, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // System.out.println(root.data);
        // System.out.println(serach(root, 6));
        // inorder(root);
        // System.out.println();
        // delete(root, 8);
        // inorder(root);
        // printInRange(root, 6, 9);
        // System.out.println();
        printRoot2leaf(root, new ArrayList<>());

    }
}
