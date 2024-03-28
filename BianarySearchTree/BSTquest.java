package BianarySearchTree;

import java.util.ArrayList;

public class BSTquest {
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

    // inorder
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // isValidBST
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    // createMirror
    public static Node createMirror(Node root) {
        if (root == null)
            return null;
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    // sorted Array to balanced BST
    public static Node creaeBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = creaeBST(arr, start, mid - 1);
        root.right = creaeBST(arr, mid + 1, end);
        return root;
    }

    // convert BST to balanced BST
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null)
            return;
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node balanceBST(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        root = creaeBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    // Largest BST in BT
    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;

        }
    }

    static int maxBst = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(Math.min(leftInfo.min, rightInfo.min), root.data);
        int max = Math.max(Math.max(leftInfo.max, rightInfo.max), root.data);

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }
        if (leftInfo.isBST && rightInfo.isBST) {

            maxBst = Math.max(maxBst, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        // int values[]={8,5,3,1,4,6,10,9,11,14};
        // Node root=null;
        // for(int i=0;i<values.length;i++) {
        // root=insert(root, values[i]);
        // }
        // System.out.println(root.data);
        // System.out.println(isValidBST(root, null, null));
        // preorder(root);
        // System.out.println();
        // root = createMirror(root);
        // preorder(root);
        // int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
        // root = creaeBST(arr, 0, arr.length - 1);

        // Node root = new Node(8);
        // root.left = new Node(6);
        // root.left.left = new Node(5);
        // root.left.left.left = new Node(3);

        // root.right = new Node(10);
        // root.right.right = new Node(11);
        // root.right.right.right = new Node(12);
        // preorder(root);
        // System.out.println();
        // root = balanceBST(root);
        // preorder(root);

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        root.right.left = new Node(45);
        root.right.right.left = new Node(65);

        preorder(root);
        System.out.println();
        Info info = largestBST(root);
        System.out.println(maxBst);

    }
}
