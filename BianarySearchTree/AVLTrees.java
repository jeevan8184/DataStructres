package BianarySearchTree;

public class AVLTrees {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null)
            return 0;
        return root.height;
    }

    // Left Rotate
    public static Node leftRotate(Node x) {

        Node y = x.right;
        Node t2 = y.left;
        // update
        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right));
        y.height = Math.max(height(y.left), height(y.right));

        return y;
    }

    // Right Rotate
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node t2 = x.right;
        // update
        x.right = y;
        y.left = t2;

        x.height = Math.max(height(x.left), height(x.right));
        y.height = Math.max(height(y.left), height(y.right));

        return x;
    }

    // getBalance
    public static int getBalance(Node root) {
        if (root == null)
            return 0;
        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int bf = getBalance(root);

        // LL case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }
        // RR case
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }
        // LR case
        if (bf > 1 && key > root.left.data) {
            root = leftRotate(root);
            return rightRotate(root);
        }
        // RL case
        if (bf < -1 && key < root.right.data) {
            root = rightRotate(root);
            return leftRotate(root);
        }
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        // root = insert(root, 25);
        preorder(root);
    }
}
